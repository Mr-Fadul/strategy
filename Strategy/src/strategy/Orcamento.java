/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author 41713029
 */
public class Orcamento {

    private double valor;
    //overwrite função com mesmo nome da classe
    //recebe valor passado e popula variável
    public Orcamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

}
