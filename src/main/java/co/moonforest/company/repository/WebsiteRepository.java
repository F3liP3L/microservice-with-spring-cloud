package co.moonforest.company.repository;

import co.moonforest.company.domain.entities.WebsiteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WebsiteRepository extends JpaRepository<WebsiteEntity, UUID> {
}