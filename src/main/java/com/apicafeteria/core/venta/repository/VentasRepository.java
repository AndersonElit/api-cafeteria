package com.apicafeteria.core.venta.repository;

import com.apicafeteria.core.venta.model.Venta;

import java.util.List;

public interface VentasRepository {

    void registrarOrden(List<Venta> productos);

}
