package com.apicafeteria.infrastructure.delivery.services;

import com.apicafeteria.core.producto.model.Categoria;
import com.apicafeteria.core.producto.requests.CategoriaRequest;
import com.apicafeteria.usecases.ports.CategoriasPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriasService {

    @Autowired
    CategoriasPort categoriasPort;

    public void crearCategoria(CategoriaRequest request) {
        this.categoriasPort.crearCategoria(request);
    }

    public List<Categoria> listarCategorias() {
        return categoriasPort.listarCategorias();
    }

}
