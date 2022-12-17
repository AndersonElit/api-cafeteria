package com.apicafeteria.infrastructure.repositories.postgresql.dao;

import com.apicafeteria.infrastructure.repositories.postgresql.entities.VentasEntity;
import com.apicafeteria.infrastructure.repositories.postgresql.entities.VentasIdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PgsVentasDao extends JpaRepository<VentasEntity, VentasIdEntity> {
}
