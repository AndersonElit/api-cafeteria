package com.apicafeteria.usecases.adapters;

import com.apicafeteria.core.producto.model.Producto;
import com.apicafeteria.core.producto.repository.CategoriasRepository;
import com.apicafeteria.core.producto.repository.ProductoRepository;
import com.apicafeteria.core.producto.requests.ProductoRequest;
import com.apicafeteria.usecases.ports.ProductoPort;
import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
public class ProductoAdapter implements ProductoPort {

    private final ProductoRepository productoRepository;
    private final CategoriasRepository categoriasRepository;

    @Override
    public List<Producto> listarProductos() {
        return productoRepository.listarProductos();
    }

    @Override
    public void crearProducto(ProductoRequest request) {
        request.setFechaCreacion(LocalDate.now());
        if(categoriasRepository.buscarCategoriaExiste(request.getCategoria().getId())) {
            this.productoRepository.crearProducto(request);
        } else {
            throw new IllegalArgumentException("la categoria no existe");
        }
    }

}
