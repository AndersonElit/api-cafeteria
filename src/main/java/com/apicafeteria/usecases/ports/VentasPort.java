package com.apicafeteria.usecases.ports;

import com.apicafeteria.core.venta.model.Venta;

import java.util.List;

public interface VentasPort {

    void registrarOrden(List<Venta> productos);

}
