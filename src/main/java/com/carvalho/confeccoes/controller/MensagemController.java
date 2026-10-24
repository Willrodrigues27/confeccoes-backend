package com.carvalho.confeccoes.controller;

import com.carvalho.confeccoes.model.Mensagem;
import com.carvalho.confeccoes.repository.MensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mensagens")
@CrossOrigin(origins = "*")
public class MensagemController {

    @Autowired
    private MensagemRepository mensagemRepository;

    @PostMapping
    public Mensagem enviarMensagem(@RequestBody Mensagem mensagem) {
        // Recebe o JSON do Angular, transforma no objeto Mensagem e salva no banco
        return mensagemRepository.save(mensagem);
    }
}