package com.apicafeteria.core.producto.repository;

import com.apicafeteria.core.producto.model.Producto;
import com.apicafeteria.core.producto.requests.ProductoRequest;

import java.util.List;

public interface ProductoRepository {

    List<Producto> listarProductos();

    void crearProducto(ProductoRequest request);

}
