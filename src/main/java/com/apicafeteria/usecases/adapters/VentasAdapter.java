package com.apicafeteria.usecases.adapters;

import com.apicafeteria.core.producto.repository.ProductoRepository;
import com.apicafeteria.core.venta.model.Venta;
import com.apicafeteria.core.venta.model.VentaId;
import com.apicafeteria.core.venta.repository.VentasRepository;
import com.apicafeteria.usecases.ports.VentasPort;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
public class VentasAdapter implements VentasPort {

    private final ProductoRepository productoRepository;
    private final VentasRepository ventasRepository;

    @Override
    public void registrarOrden(List<Venta> productos) {

        String nuevaOrden = UUID.randomUUID().toString();
        List<Venta> listaConOrden = new ArrayList<>();
        for(Venta producto : productos) {
            listaConOrden.add(
                    Venta.builder()
                            .id(VentaId.builder()
                                    .orden(nuevaOrden)
                                    .idProducto(producto.getId().getIdProducto())
                                    .build())
                            .unidadesVendidas(
                                    actualizarUnidades(producto.getUnidadesVendidas(), producto.getId().getIdProducto()) ?
                                            producto.getUnidadesVendidas() : 0)
                            .build()
            );
        }

        this.ventasRepository.registrarOrden(listaConOrden);

    }

    private Boolean actualizarUnidades(Integer unidadesVendidas, Integer idProducto) {

        Boolean compararUnidades = productoRepository.verificarUnidadesDisponibles(unidadesVendidas, idProducto);

        if(compararUnidades) {
            Integer unidadesExistentes = productoRepository.numeroUnidadesProducto(idProducto);
            Integer unidadesRestantes = unidadesExistentes - unidadesVendidas;
            this.productoRepository.actualizarNumeroUnidades(unidadesRestantes, idProducto);
        } else {
            throw new IllegalArgumentException("No hay unidades suficientes para vender del producto con id: " + idProducto);
        }

        return compararUnidades;
    }
}
