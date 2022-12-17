package com.apicafeteria.infrastructure.delivery.services;

import com.apicafeteria.core.venta.model.Venta;
import com.apicafeteria.usecases.ports.VentasPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentasService {

    @Autowired
    VentasPort ventasPort;

    public void registrarOrden(List<Venta> productos) {
        this.ventasPort.registrarOrden(productos);
    }

}
