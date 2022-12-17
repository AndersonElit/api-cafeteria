package com.apicafeteria.core.producto.repository;

import com.apicafeteria.core.producto.model.Categoria;
import com.apicafeteria.core.producto.requests.CategoriaRequest;

import java.util.List;

public interface CategoriasRepository {

    boolean buscarCategoriaExiste(Integer id);
    void crearCategoria(CategoriaRequest request);
    List<Categoria> listarCategorias();

}
