package com.sacola.sacola.service;

import com.sacola.sacola.controller.dto.ItemDto;
import com.sacola.sacola.enumeration.FormaPagamento;
import com.sacola.sacola.models.Item;
import com.sacola.sacola.models.Sacola;
import com.sacola.sacola.repository.ProdutoRepository;
import com.sacola.sacola.repository.SacolaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SacolaServiceImpl implements SacolaService{
    private final SacolaRepository repository;
    private final ProdutoRepository produtoRepository;
    @Override
    public Sacola verSacola(Long id) {
        return repository.findById(id).orElseThrow(
                ()->{
throw new RuntimeException("Sacola não encontrada!");
                }
        )
    ;}


    @Override
    public Sacola fecharSacola(Long id, int numeroFormaPagamento) {
        Sacola sacola = verSacola(id);
        if (sacola.getItens().isEmpty()) {

            throw new RuntimeException("Inclua itens na sacola!");
        }
        FormaPagamento formaPagamento = numeroFormaPagamento == 0 ? FormaPagamento.DINHEIRO :
                FormaPagamento.MAQUININHA;
        sacola.setFormaPagamento(formaPagamento);
        sacola.setFechada(true);
        return repository.save(sacola);
    }

    @Override
    public Item incluirItemNaSacola(ItemDto itemDto) {
        Sacola sacola = verSacola(itemDto.getSacolaId());

        if(sacola.isFechada()){
            throw new RuntimeException(("Esta sacola está fechada"));
        }
        Item.builder()
                .quantidade(itemDto.getQuantidade())
                .sacola(sacola)
                .produto(produtoRepository.findById(itemDto.getProdutoId())
                        .orElseThrow(
                                ()-> {
                                    throw new RuntimeException("Este produto não existe!");
                                }
                        ))
                .build();

    }
}
