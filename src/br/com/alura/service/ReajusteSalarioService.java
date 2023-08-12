package br.com.alura.service;

import br.com.alura.exception.ValidacaoException;
import br.com.alura.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class ReajusteSalarioService {

    public void reajustar(Funcionario funcionario, BigDecimal aumento){
        BigDecimal percentualReajuste = aumento.divide(funcionario.getSalario(), RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
        funcionario.atualizarSalario(funcionario.getSalario().add(aumento));
    }

}
