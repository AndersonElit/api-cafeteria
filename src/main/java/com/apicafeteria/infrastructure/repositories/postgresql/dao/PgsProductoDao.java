package com.apicafeteria.infrastructure.repositories.postgresql.dao;

import com.apicafeteria.infrastructure.repositories.postgresql.entities.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PgsProductoDao extends JpaRepository<ProductoEntity, Integer> {
}
