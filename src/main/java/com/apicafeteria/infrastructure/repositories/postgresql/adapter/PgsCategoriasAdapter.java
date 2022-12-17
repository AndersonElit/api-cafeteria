package com.apicafeteria.infrastructure.repositories.postgresql.adapter;

import com.apicafeteria.core.producto.model.Categoria;
import com.apicafeteria.core.producto.repository.CategoriasRepository;
import com.apicafeteria.core.producto.requests.CategoriaRequest;
import com.apicafeteria.core.utils.mapper.Mapper;
import com.apicafeteria.infrastructure.repositories.postgresql.entities.CategoriaEntity;
import com.apicafeteria.infrastructure.repositories.postgresql.dao.PgsCategoriasDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PgsCategoriasAdapter implements CategoriasRepository {

    @Autowired
    PgsCategoriasDao pgsCategoriasDao;

    @Override
    public boolean buscarCategoriaExiste(Integer id) {
        return pgsCategoriasDao.existsById(id);
    }

    @Override
    public void crearCategoria(CategoriaRequest request) {
        this.pgsCategoriasDao.save(Mapper.map(request, CategoriaEntity.class));
    }

    @Override
    public List<Categoria> listarCategorias() {
        return Mapper.mapAll(pgsCategoriasDao.findAll(), Categoria.class);
    }
}
