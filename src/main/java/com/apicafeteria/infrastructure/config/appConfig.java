package com.apicafeteria.infrastructure.config;

import com.apicafeteria.core.producto.repository.CategoriasRepository;
import com.apicafeteria.core.producto.repository.ProductoRepository;
import com.apicafeteria.core.venta.repository.VentasRepository;
import com.apicafeteria.usecases.adapters.CategoriasAdapter;
import com.apicafeteria.usecases.adapters.ProductoAdapter;
import com.apicafeteria.usecases.adapters.VentasAdapter;
import com.apicafeteria.usecases.ports.CategoriasPort;
import com.apicafeteria.usecases.ports.ProductoPort;
import com.apicafeteria.usecases.ports.VentasPort;
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

    @Bean
    public VentasPort ventasPort(ProductoRepository productoRepository, VentasRepository ventasRepository) {
        return new VentasAdapter(productoRepository, ventasRepository);
    }

}
