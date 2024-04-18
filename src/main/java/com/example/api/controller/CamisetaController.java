package com.example.api.controller;


import com.example.api.model.CamisetaModel;
import com.example.api.service.CamisetaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CamisetaController {

    private CamisetaService camisetaService;

    public CamisetaController(CamisetaService camisetaService) {
        this.camisetaService = camisetaService;
    }

    @PostMapping("/camisetas")
    public CamisetaModel postCamiseta(@RequestBody CamisetaModel camisetaModel) {
        return camisetaService.processCamiseta(camisetaModel);
    }

    @GetMapping("/camisetas/{id}")
    public CamisetaModel getCamiseta(@PathVariable Integer id) {
        return camisetaService.getCamisetaByIndex(id);

    }

    @GetMapping("/camisetas")
    public List<CamisetaModel> getAllCamiseta() {
        return camisetaService.getCamisetas();
    }

    @PutMapping("/camisetas/{id}")
    public CamisetaModel putCamiseta(@PathVariable Integer id, @RequestBody CamisetaModel camisetaModel) {
        return camisetaService.updateCamiseta(id, camisetaModel);
    }

    @DeleteMapping("/camisetas/{id}")
    public void deleteCamiseta(@PathVariable Integer id) throws Exception {
        camisetaService.deleteCamiseta(id);
    }
}
