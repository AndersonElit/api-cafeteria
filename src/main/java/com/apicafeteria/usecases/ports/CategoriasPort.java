package com.apicafeteria.usecases.ports;

import com.apicafeteria.core.producto.model.Categoria;
import com.apicafeteria.core.producto.requests.CategoriaRequest;

import java.util.List;

public interface CategoriasPort {

    void crearCategoria(CategoriaRequest request);
    List<Categoria> listarCategorias();

}
