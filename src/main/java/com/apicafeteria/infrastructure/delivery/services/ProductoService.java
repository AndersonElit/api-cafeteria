package com.apicafeteria.infrastructure.delivery.services;

import com.apicafeteria.core.producto.model.Producto;
import com.apicafeteria.core.producto.requests.ProductoRequest;
import com.apicafeteria.usecases.ports.ProductoPort;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    ProductoPort productoPort;

    public List<Producto> listarProductos() {
        return productoPort.listarProductos();
    }

    public void crearProducto(ProductoRequest request) {
        this.productoPort.crearProducto(request);
    }

    public void eliminarProducto(Integer id) {
        this.productoPort.eliminarProducto(id);
    }

}
