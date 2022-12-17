package com.apicafeteria.infrastructure.repositories.postgresql.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categorias")
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "categoria")
    private String categoria;

    @OneToMany(mappedBy = "categoria")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Set<ProductoEntity> productos = new HashSet<>();

}
