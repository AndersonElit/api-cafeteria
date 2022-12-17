package com.apicafeteria.infrastructure.delivery.controllers;

import com.apicafeteria.core.producto.model.Producto;
import com.apicafeteria.core.producto.requests.ProductoRequest;
import com.apicafeteria.core.utils.response.Response;
import com.apicafeteria.infrastructure.delivery.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping("/lista")
    public ResponseEntity<Response<Object>> listaProductos() {
        Response<Object> response = Response.builder().build();
        try {
            List<Producto> listaProductos = productoService.listarProductos();
            response.setResponse(listaProductos);
            response.setCodigo(HttpStatus.OK.toString());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/crear-producto")
    public ResponseEntity<Response> crearProducto(@RequestBody ProductoRequest request) {
        Response response = Response.builder().build();
        try {
            this.productoService.crearProducto(request);
            response.setCodigo(HttpStatus.OK.toString());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PutMapping("/actualizar-producto")
    public ResponseEntity<Response> actualizarProducto(@RequestBody ProductoRequest request) {
        Response response = Response.builder().build();
        try {
            this.productoService.crearProducto(request);
            response.setCodigo(HttpStatus.OK.toString());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
