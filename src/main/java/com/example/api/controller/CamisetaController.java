package com.example.api.controller;


import com.example.api.exceptions.ApiException;
import com.example.api.model.CamisetaModel;
import com.example.api.service.CamisetaService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CamisetaController {

    private CamisetaService camisetaService;

    public CamisetaController(CamisetaService camisetaService) {
        this.camisetaService = camisetaService;
    }

    @PostMapping("/camisetas")
    public ResponseEntity<CamisetaModel> postCamiseta(@RequestBody CamisetaModel camisetaModel) throws ApiException {
        var camiseta = camisetaService.processCamiseta(camisetaModel);

        return new ResponseEntity<CamisetaModel>(camiseta, HttpStatus.CREATED);
    }

    @GetMapping("/camisetas/{id}")
    public ResponseEntity<CamisetaModel> getCamiseta(@PathVariable Integer id) throws ApiException {
        var camiseta = camisetaService.getCamisetaByIndex(id);

        return new ResponseEntity<>(camiseta, HttpStatus.OK);
    }

    @GetMapping("/camisetas")
    public ResponseEntity<List<CamisetaModel>> getAllCamiseta() throws ApiException {
        var camisetas = camisetaService.getCamisetas();

        return new ResponseEntity<>(camisetas, HttpStatus.OK);
    }

    @PutMapping("/camisetas/{id}")
    public ResponseEntity<CamisetaModel> putCamiseta(@PathVariable Integer id, @RequestBody CamisetaModel camisetaModel) throws ApiException {
        var camiseta = camisetaService.updateCamiseta(id, camisetaModel);

        return new ResponseEntity<>(camiseta, HttpStatus.OK);
    }

    @DeleteMapping("/camisetas/{id}")
    public ResponseEntity<Void> deleteCamiseta(@PathVariable Integer id) throws ApiException {
        camisetaService.deleteCamiseta(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
