package br.com.alura.service;

import br.com.alura.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class ReajusteSalarioService {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteSalarioService(List<ValidacaoReajuste> validacoes){
        this.validacoes = validacoes;
    }

    public ReajusteSalarioService() {

    }

    public void reajustar(Funcionario funcionario, BigDecimal aumento){
        this.validacoes.forEach(v-> v.validar(funcionario, aumento));
        funcionario.setDataUltimoReajuste(LocalDate.now());
        funcionario.atualizarSalario(funcionario.getSalario().add(aumento));

        System.out.println(funcionario.getSalario());
    }

}
