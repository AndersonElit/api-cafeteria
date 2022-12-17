package com.apicafeteria.infrastructure.repositories.postgresql.dao;

import com.apicafeteria.infrastructure.repositories.postgresql.entities.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PgsCategoriasDao extends JpaRepository<CategoriaEntity, Integer> {

    boolean existsById(Integer id);

}
