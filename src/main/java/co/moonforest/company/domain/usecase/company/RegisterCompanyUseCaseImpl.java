package co.moonforest.company.domain.usecase.company;

import co.moonforest.company.domain.entities.CompanyEntity;
import co.moonforest.company.repository.CompanyRepository;
import jakarta.transaction.Transactional;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Scope("singleton")
@Transactional
public class RegisterCompanyUseCaseImpl implements RegisterCompanyUseCase {
    private final CompanyRepository companyRepository;

    public RegisterCompanyUseCaseImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public void execute(CompanyEntity data) {
        data.setId(UUID.randomUUID());
        companyRepository.save(data);
    }
}
