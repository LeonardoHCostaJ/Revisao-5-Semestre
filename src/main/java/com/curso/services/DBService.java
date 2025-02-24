package com.curso.services;

import com.curso.domains.Veiculo;
import com.curso.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class DBService {
    @Autowired
    private VeiculoRepository veiculoRepo;

    public void initDB(){

        Veiculo veiculo01 = new Veiculo(null,"Nissan Sentra",LocalDate.now(),40000.00,"Leonardo","49928418802");
        Veiculo veiculo02 = new Veiculo(null,"Gol bola",LocalDate.now(),12000.00,"Ronaldo","56212421200");
        Veiculo veiculo03 = new Veiculo(null,"Pagani",LocalDate.now(),5300000.00,"Lucas","520120003331");

        veiculoRepo.save(veiculo01);
        veiculoRepo.save(veiculo02);
        veiculoRepo.save(veiculo03);
    }
}
