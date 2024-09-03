package co.moonforest.company.port.primary;

import co.moonforest.company.domain.entities.CompanyEntity;
import co.moonforest.company.domain.usecase.company.FindCompanyByNameUseCase;
import co.moonforest.company.domain.usecase.company.RegisterCompanyUseCase;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/main")
@Tag(name = "Company", description = "Company API")
public class CompanyController {

    private final RegisterCompanyUseCase registerCompanyUseCase;
    private final FindCompanyByNameUseCase findCompanyByNameUseCase;

    public CompanyController(RegisterCompanyUseCase registerCompanyUseCase, FindCompanyByNameUseCase findCompanyByNameUseCase) {
        this.registerCompanyUseCase = registerCompanyUseCase;
        this.findCompanyByNameUseCase = findCompanyByNameUseCase;
    }

    @Operation(summary = "POST by save a new company")
    @PostMapping()
    private ResponseEntity<CompanyEntity> save(@RequestBody CompanyEntity companyEntity) {
        try {
            registerCompanyUseCase.execute(companyEntity);
        } catch (Exception exception) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(companyEntity);
    }

    @Operation(summary = "GET by find by company specific")
    @GetMapping()
    private ResponseEntity<CompanyEntity> findByName(@RequestParam String name) {
        Optional<CompanyEntity> companyEntity = findCompanyByNameUseCase.execute(name);
        return companyEntity.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
