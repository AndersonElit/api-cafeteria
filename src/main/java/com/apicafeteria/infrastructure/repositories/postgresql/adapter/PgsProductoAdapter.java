package com.apicafeteria.infrastructure.repositories.postgresql.adapter;

import com.apicafeteria.core.producto.model.Producto;
import com.apicafeteria.core.producto.repository.ProductoRepository;
import com.apicafeteria.core.producto.requests.ProductoRequest;
import com.apicafeteria.core.utils.mapper.Mapper;
import com.apicafeteria.infrastructure.repositories.postgresql.entities.ProductoEntity;
import com.apicafeteria.infrastructure.repositories.postgresql.dao.PgsProductoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PgsProductoAdapter implements ProductoRepository {

    @Autowired
    PgsProductoDao pgsProductoDao;

    @Override
    public List<Producto> listarProductos() {
        return Mapper.mapAll(pgsProductoDao.findAll(), Producto.class);
    }

    @Override
    public void crearProducto(ProductoRequest request) {
        this.pgsProductoDao.save(Mapper.map(request, ProductoEntity.class));
    }

}
