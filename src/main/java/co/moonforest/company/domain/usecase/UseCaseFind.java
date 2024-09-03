package co.moonforest.company.domain.usecase;

import java.util.Optional;

public interface UseCaseFind<D, P>{
    Optional<D> execute(P param);
}
