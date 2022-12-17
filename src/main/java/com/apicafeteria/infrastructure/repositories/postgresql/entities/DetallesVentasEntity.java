package com.apicafeteria.infrastructure.repositories.postgresql.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "productos")
public class DetallesVentasEntity {

    @Id
    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "idVenta", column = @Column(name = "id_venta")),
            @AttributeOverride( name = "idProducto", column = @Column(name = "id_producto"))
    })
    private DetallesVentasIdEntity id;

    @Column(name = "unidades_vendidas")
    private Integer unidadesVendidas;

}
