package com.apicafeteria.core.producto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    private Integer id;
    private String nombre;
    private String referencia;
    private Integer precio;
    private Integer peso;
    private Integer idCategoria;
    private Integer stock;
    private LocalDate fechaCreacion;
    private Categoria categoria;

}
