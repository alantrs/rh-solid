package br.com.alura.service;

import br.com.alura.exception.ValidacaoException;
import br.com.alura.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidade implements ValidacaoReajuste{

    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajuste =  LocalDate.of(2023, 3, 6);
        if(ChronoUnit.MONTHS.between(dataUltimoReajuste, LocalDate.now()) < 6){
            throw new ValidacaoException("Precisa de no minimo 6 meses para outro reajuste");
        }
    }
}
