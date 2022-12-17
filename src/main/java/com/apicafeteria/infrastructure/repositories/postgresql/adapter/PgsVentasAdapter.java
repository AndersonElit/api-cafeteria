package com.apicafeteria.infrastructure.repositories.postgresql.adapter;

import com.apicafeteria.core.utils.mapper.Mapper;
import com.apicafeteria.core.venta.model.Venta;
import com.apicafeteria.core.venta.repository.VentasRepository;
import com.apicafeteria.infrastructure.repositories.postgresql.dao.PgsVentasDao;
import com.apicafeteria.infrastructure.repositories.postgresql.entities.VentasEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PgsVentasAdapter implements VentasRepository {

    @Autowired
    PgsVentasDao pgsVentasDao;

    @Override
    public void registrarOrden(List<Venta> productos) {
        this.pgsVentasDao.saveAll(Mapper.mapAll(productos, VentasEntity.class));
    }
}
