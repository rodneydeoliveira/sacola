package com.sacola.sacola.controller;

import com.sacola.sacola.controller.dto.ItemDto;
import com.sacola.sacola.enumeration.FormaPagamento;
import com.sacola.sacola.models.Item;
import com.sacola.sacola.models.Sacola;
import com.sacola.sacola.service.SacolaService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;
@RequiredArgsConstructor
@RestController
@RequestMapping("/ifood-devweek/sacolas")

public class SacolaController {
    private final SacolaService sacolaService;


    @PostMapping
    public Item incluirItemNaSacola(@RequestBody ItemDto itemDto){
        return sacolaService.incluirItemNaSacola(itemDto);
    }
    @GetMapping("/{id}")
    public Sacola verSacola(@PathVariable("id") Long id){
    return sacolaService.verSacola(id);
    }
    @PutMapping("/fechar-sacola/{sacolaId}")
    public Sacola fecharSacola(@PathVariable("sacolaId")Long sacolaId,
                               @RequestParam("formaPagmento")int formaPagamento){
        return sacolaService.fecharSacola(sacolaId, formaPagamento);

    }
}
