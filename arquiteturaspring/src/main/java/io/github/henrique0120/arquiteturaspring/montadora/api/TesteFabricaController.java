package io.github.henrique0120.arquiteturaspring.montadora.api;

import io.github.henrique0120.arquiteturaspring.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteFabricaController {

    @Autowired
    private Motor motor;

    @PostMapping
    public CarroStatus ligarcarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }

}
