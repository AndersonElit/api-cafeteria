package com.apicafeteria.core.producto.requests;

import com.apicafeteria.core.producto.model.Categoria;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductoRequest {

    private Integer id;
    private String nombre;
    private String referencia;
    private Integer precio;
    private Integer peso;
    private Integer stock;
    private LocalDate fechaCreacion;
    private Categoria categoria;

}
