package com.apicafeteria.core.venta.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Venta {
    private VentaId id;
    private Integer unidadesVendidas;
}
