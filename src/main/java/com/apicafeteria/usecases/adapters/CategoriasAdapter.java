package com.apicafeteria.usecases.adapters;

import com.apicafeteria.core.producto.model.Categoria;
import com.apicafeteria.core.producto.repository.CategoriasRepository;
import com.apicafeteria.core.producto.requests.CategoriaRequest;
import com.apicafeteria.usecases.ports.CategoriasPort;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CategoriasAdapter implements CategoriasPort {

    private final CategoriasRepository categoriasRepository;

    @Override
    public void crearCategoria(CategoriaRequest request) {
        this.categoriasRepository.crearCategoria(request);
    }

    @Override
    public List<Categoria> listarCategorias() {
        return categoriasRepository.listarCategorias();
    }

}
