/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dominiobancario;

/**
 *
 * @author bavod
 */
public abstract class Conta {
    private String numero;
    protected double saldo;

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Depositado %.2f na conta %s. Novo saldo: %.2f%n", valor, numero, saldo);
    }

    public abstract void sacar(double valor);

    public abstract void transferir(Conta destino, double valor);
}
