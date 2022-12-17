package com.apicafeteria.infrastructure.config;

import com.apicafeteria.core.producto.repository.CategoriasRepository;
import com.apicafeteria.core.producto.repository.ProductoRepository;
import com.apicafeteria.usecases.adapters.CategoriasAdapter;
import com.apicafeteria.usecases.adapters.ProductoAdapter;
import com.apicafeteria.usecases.ports.CategoriasPort;
import com.apicafeteria.usecases.ports.ProductoPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appConfig {

    @Bean
    public ProductoPort productoPort(ProductoRepository productoRepository, CategoriasRepository categoriasRepository) {
        return new ProductoAdapter(productoRepository, categoriasRepository);
    }

    @Bean
    public CategoriasPort categoriasPort(CategoriasRepository categoriasRepository) {
        return new CategoriasAdapter(categoriasRepository);
    }

}
