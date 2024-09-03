package co.moonforest.company.domain.usecase;

public interface UseCase<D>{
    void execute(D data);
}
