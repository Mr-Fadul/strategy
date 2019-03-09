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
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Imposto iss = new ISS();// interface instancia o objeto iss da classe iss
        Imposto icms = new ICMS();

        Orcamento orcamento = new Orcamento(500.0);// instancia orçamento

        CalculadorDeImpostos calculador = new CalculadorDeImpostos();//instancia a classe com calculo

        // Calculando o ISS
        calculador.realizaCalculo(orcamento, iss);// realiza o metodo

        // Calculando o ICMS        
        calculador.realizaCalculo(orcamento, icms);
    }

}
