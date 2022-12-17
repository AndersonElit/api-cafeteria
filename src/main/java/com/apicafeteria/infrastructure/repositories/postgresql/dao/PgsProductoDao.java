package com.apicafeteria.infrastructure.repositories.postgresql.dao;

import com.apicafeteria.infrastructure.repositories.postgresql.entities.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
public interface PgsProductoDao extends JpaRepository<ProductoEntity, Integer> {

    @Query("SELECT CASE WHEN (pr.stock > ?1) THEN true ELSE false END " +
            "FROM ProductoEntity pr WHERE pr.id = ?2")
    Boolean verificarUnidades(Integer unidadesVendidas, Integer idProducto);

    @Modifying
    @Transactional
    @Query("UPDATE ProductoEntity pr SET pr.stock = ?1 " +
            "WHERE pr.id = ?2")
    void actualizarNumeroUnidades(Integer unidadesRestantes, Integer idProducto);

    @Query("SELECT pr.stock FROM ProductoEntity pr WHERE pr.id = ?1")
    Integer numeroUnidadesProducto(Integer idProducto);

}
