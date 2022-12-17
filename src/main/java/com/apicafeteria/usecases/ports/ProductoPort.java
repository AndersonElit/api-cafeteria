package com.apicafeteria.usecases.ports;

import com.apicafeteria.core.producto.model.Producto;
import com.apicafeteria.core.producto.requests.ProductoRequest;

import java.util.List;

public interface ProductoPort {

    List<Producto> listarProductos();

    void crearProducto(ProductoRequest request);
    void eliminarProducto(Integer id);

}
