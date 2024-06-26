/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dominiobancario;

/**
 *
 * @author bavod
 */
public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, double limiteChequeEspecial) {
        super(numero);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;
            System.out.printf("Sacado %.2f da conta corrente %s. Novo saldo: %.2f%n", valor, getNumero(), saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void transferir(Conta destino, double valor) {
        if (valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.printf("Transferência de %.2f realizada da conta corrente %s para a conta %s.%n", valor, getNumero(), destino.getNumero());
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }
}


