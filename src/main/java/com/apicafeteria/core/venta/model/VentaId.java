package com.apicafeteria.core.venta.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VentaId {
    private String orden;
    private Integer idProducto;
}
