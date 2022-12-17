package com.apicafeteria.core.producto.repository;

import com.apicafeteria.core.producto.model.Producto;
import com.apicafeteria.core.producto.requests.ProductoRequest;

import java.util.List;

public interface ProductoRepository {

    List<Producto> listarProductos();

    void crearProducto(ProductoRequest request);

    void eliminarProducto(Integer id);
    Boolean verificarUnidadesDisponibles(Integer unidadesVendidas, Integer idProducto);
    void actualizarNumeroUnidades(Integer unidadesRestantes, Integer idProducto);
    Integer numeroUnidadesProducto(Integer idProducto);

}
