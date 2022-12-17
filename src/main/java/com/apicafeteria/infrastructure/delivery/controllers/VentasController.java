package com.apicafeteria.infrastructure.delivery.controllers;

import com.apicafeteria.core.utils.response.Response;
import com.apicafeteria.core.venta.model.Venta;
import com.apicafeteria.infrastructure.delivery.services.VentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/ventas")
public class VentasController {

    @Autowired
    VentasService ventasService;

    @PostMapping("/registrar-orden")
    public ResponseEntity<Response> registrarOrden(@RequestBody List<Venta> productos) {
        Response response = Response.builder().build();
        try {
            this.ventasService.registrarOrden(productos);
            response.setCodigo(HttpStatus.OK.toString());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
