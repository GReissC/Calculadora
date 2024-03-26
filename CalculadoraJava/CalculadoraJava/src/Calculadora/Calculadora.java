//Author: Guilherme Reis Carvalho, RA 224176
//Version: 1.0
//Since: Release 1.0 da aplicação

//Pacote onde a classe está presente;
package Calculadora;


//Classe de calculadora para armazenar as classes de cálculo;
public class Calculadora {
    
    //Classe de divisão;
    public double dividir(double valor1, double valor2)
    {
            if(valor2 == 0)
            {
            System.out.println("ERRO! IMPOSSIVEL DIVIDIR POR ZERO!");
            }

     return valor1 / valor2;

    }
    
     //Classe de multiplicação;
     public double multiplicar(double valor1, double valor2)
    {
        return valor1 * valor2;
    }
    
    //Classe de soma;
    public double somar(double valor1, double valor2)
    {
        return valor1 + valor2;
    }
    
    //Classe de subtração.
     public double subtrair(double valor1, double valor2)
    {
        return valor1 - valor2;
    }
}
