package com.sacola.sacola.service;

import com.sacola.sacola.controller.dto.ItemDto;
import com.sacola.sacola.models.Item;
import com.sacola.sacola.models.Sacola;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
public interface SacolaService {
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagamento);
    Item incluirItemNaSacola(ItemDto itemDto);
}
