package com.apicafeteria.infrastructure.repositories.postgresql.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class VentasIdEntity implements Serializable {

    private String orden;
    //private Integer idProducto;
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private ProductoEntity producto;

}
