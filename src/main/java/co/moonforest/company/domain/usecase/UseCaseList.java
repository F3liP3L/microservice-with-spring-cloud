package co.moonforest.company.domain.usecase;

import java.util.List;
import java.util.Optional;

public interface UseCaseList <D>{
    List<D> execute(Optional<D> param);
}