package com.apicafeteria.infrastructure.delivery.services;

import com.apicafeteria.core.venta.model.Venta;
import com.apicafeteria.usecases.ports.VentasPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
public class VentasService {

    @Autowired
    VentasPort ventasPort;

    @Transactional(rollbackFor = { SQLException.class })
    public void registrarOrden(List<Venta> productos) {
        this.ventasPort.registrarOrden(productos);
    }

}
