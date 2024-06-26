/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dominiobancario;

/**
 *
 * @author bavod
 */
public class DominioBancario {

    public static void main(String[] args) {
       ContaCorrente cc = new ContaCorrente("001", 1000.0);
        ContaPoupanca cp = new ContaPoupanca("002", 0.5);

        cc.depositar(500.0);
        cc.sacar(200.0);

        cp.depositar(1000.0);
        cp.aplicarRendimento();

        cc.transferir(cp, 300.0);
    }
}
