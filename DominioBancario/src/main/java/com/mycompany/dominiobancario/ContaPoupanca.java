/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dominiobancario;

/**
 *
 * @author bavod
 */
public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String numero, double taxaRendimento) {
        super(numero);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.printf("Sacado %.2f da conta poupança %s. Novo saldo: %.2f%n", valor, getNumero(), saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void transferir(Conta destino, double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.printf("Transferência de %.2f realizada da conta poupança %s para a conta %s.%n", valor, getNumero(), destino.getNumero());
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    public void aplicarRendimento() {
        double rendimento = saldo * taxaRendimento / 100;
        saldo += rendimento;
        System.out.printf("Rendimento aplicado na conta poupança %s. Novo saldo: %.2f%n", getNumero(), saldo);
    }
}

