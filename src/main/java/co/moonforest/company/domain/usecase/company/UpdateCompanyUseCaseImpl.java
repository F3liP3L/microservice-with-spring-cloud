package co.moonforest.company.domain.usecase.company;

import co.moonforest.company.domain.entities.CompanyEntity;
import co.moonforest.company.repository.CompanyRepository;
import jakarta.transaction.Transactional;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
@Transactional
public class UpdateCompanyUseCaseImpl implements UpdateCompanyUseCase{
    private final CompanyRepository companyRepository;

    public UpdateCompanyUseCaseImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public void execute(CompanyEntity data) {
        companyRepository.save(data);
    }
}
