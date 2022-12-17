package com.apicafeteria.infrastructure.repositories.postgresql.entities;

import lombok.*;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@EqualsAndHashCode
public class VentasIdEntity implements Serializable {

    private String orden;
    private Integer idProducto;

}
