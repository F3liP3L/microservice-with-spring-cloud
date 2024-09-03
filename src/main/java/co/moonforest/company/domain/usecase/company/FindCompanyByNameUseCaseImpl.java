package co.moonforest.company.domain.usecase.company;

import co.moonforest.company.domain.entities.CompanyEntity;
import co.moonforest.company.repository.CompanyRepository;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Scope("singleton")
public class FindCompanyByNameUseCaseImpl implements FindCompanyByNameUseCase {
    private final CompanyRepository companyRepository;

    public FindCompanyByNameUseCaseImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Optional<CompanyEntity> execute(String param) {
        return companyRepository.findByName(param);
    }
}
