package co.moonforest.company.domain.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "website")
public class WebsiteEntity implements Serializable {
    @Id
    private UUID id = UUID.randomUUID();
    private String name;
    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    private CategoryEnum category;
    private String description;
}