package com.apicafeteria.infrastructure.delivery.controllers;

import com.apicafeteria.core.producto.model.Categoria;
import com.apicafeteria.core.producto.requests.CategoriaRequest;
import com.apicafeteria.core.utils.response.Response;
import com.apicafeteria.infrastructure.delivery.services.CategoriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/categorias")
public class CategoriasController {

    @Autowired
    CategoriasService categoriasService;

    @PostMapping("/crear-categoria")
    public ResponseEntity<Response> crearCategoria(@RequestBody CategoriaRequest request) {
        Response response = Response.builder().build();
        try {
            this.categoriasService.crearCategoria(request);
            response.setCodigo(HttpStatus.OK.toString());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @GetMapping("/lista")
    public ResponseEntity<Response<Object>> listarCategorias() {
        Response<Object> response = Response.builder().build();
        try {
            List<Categoria> categorias = categoriasService.listarCategorias();
            response.setResponse(categorias);
            response.setCodigo(HttpStatus.OK.toString());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
