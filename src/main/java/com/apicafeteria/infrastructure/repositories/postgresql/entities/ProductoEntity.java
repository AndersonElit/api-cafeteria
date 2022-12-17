package com.apicafeteria.infrastructure.repositories.postgresql.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "productos")
public class ProductoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "referencia")
    private String referencia;

    @Column(name = "precio")
    private Integer precio;

    @Column(name = "peso")
    private Integer peso;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;

    //@ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
    //@ManyToOne(cascade = { CascadeType.ALL })
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private CategoriaEntity categoria;

}
