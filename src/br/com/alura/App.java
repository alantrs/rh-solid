package br.com.alura;

import br.com.alura.model.Funcionario;
import br.com.alura.service.ReajusteSalarioService;

import java.math.BigDecimal;

import static br.com.alura.model.Cargo.ESPECIALISTA;

public class App {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Alan", "12345678900", ESPECIALISTA, new BigDecimal("1000"));

        ReajusteSalarioService reajusteSalarioService = new ReajusteSalarioService();

        reajusteSalarioService.reajustar(f1, new BigDecimal("100"));

    }
}
