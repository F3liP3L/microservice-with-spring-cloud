package co.moonforest.company.domain.usecase.company;

import co.moonforest.company.domain.entities.CompanyEntity;
import co.moonforest.company.domain.usecase.UseCaseFind;

public interface FindCompanyByNameUseCase extends UseCaseFind<CompanyEntity, String> {
}