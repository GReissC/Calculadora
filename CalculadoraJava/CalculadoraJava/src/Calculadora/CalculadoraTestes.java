//Pacote onde a classe Main está localizada;
package Calculadora;

// @author Guilherme Reis Carvalho, RA 224176

//Classe Main;
public class CalculadoraTestes {
    public static void main(String[] args)
    {
        //Nova variável para fazer os cálculos e testes;
        Calculadora calc = new Calculadora();
        
        // Teste com os valores 10 e 5;
        double resultadoSoma1 = calc.somar(10, 5);
        System.out.println("Resultado da soma 1: " + resultadoSoma1);
        double resultadoSubtracao1 = calc.subtrair(10, 5);
        System.out.println("Resultado da subtracao 1: " + resultadoSubtracao1);
        double resultadoMultiplicacao1 = calc.multiplicar(10, 5);
        System.out.println("Resultado da multiplicacao 1: " + resultadoMultiplicacao1);
        double resultadoDivisao1 = calc.dividir(10, 5);
        System.out.println("Resultado da divisao 1: " + resultadoDivisao1);
        
        // Teste com os valores 6 e 3;
        double resultadoSoma2 = calc.somar(6, 3);
        System.out.println("Resultado da soma 2: " + resultadoSoma2);
        double resultadoSubtracao2 = calc.subtrair(6, 3);
        System.out.println("Resultado da subtracao 2: " + resultadoSubtracao2);
        double resultadoMultiplicacao2 = calc.multiplicar(6, 3);
        System.out.println("Resultado da multiplicacao 2: " + resultadoMultiplicacao2);
        double resultadoDivisao2 = calc.dividir(6, 3);
        System.out.println("Resultado da divisao 2: " + resultadoDivisao2);
        
        // Teste com os valores 3 e 0;
        double resultadoSoma3 = calc.somar(3, 0);
        System.out.println("Resultado da soma 3: " + resultadoSoma3);
        double resultadoSubtracao3 = calc.subtrair(3, 0);
        System.out.println("Resultado da subtracao 3: " + resultadoSubtracao3);
        double resultadoMultiplicacao3 = calc.multiplicar(3, 0);
        System.out.println("Resultado da multiplicacao 3: " + resultadoMultiplicacao3);
        double resultadoDivisao3 = calc.dividir(3, 0);
        System.out.println("Resultado da divisao 3: " + resultadoDivisao3);
        
        // Teste com os valores 7 e 12;
        double resultadoSoma4 = calc.somar(7, 12);
        System.out.println("Resultado da soma 4: " + resultadoSoma4);
        double resultadoSubtracao4 = calc.subtrair(7, 12);
        System.out.println("Resultado da subtracao 4: " + resultadoSubtracao4);
        double resultadoMultiplicacao4 = calc.multiplicar(7, 12);
        System.out.println("Resultado da multiplicacao 4: " + resultadoMultiplicacao4);
        double resultadoDivisao4 = calc.dividir(7, 12);
        System.out.println("Resultado da divisao 4: " + resultadoDivisao4);
        
        // Teste com os valores 80 e 9;
        double resultadoSoma5 = calc.somar(80, 9);
        System.out.println("Resultado da soma 5: " + resultadoSoma5);
        double resultadoSubtracao5= calc.subtrair(80, 9);
        System.out.println("Resultado da subtracao 5: " + resultadoSubtracao5);
        double resultadoMultiplicacao5= calc.multiplicar(80, 9);
        System.out.println("Resultado da multiplicacao 5: " + resultadoMultiplicacao5);
        double resultadoDivisao5 = calc.dividir(80, 9);
        System.out.println("Resultado da divisao 5: " + resultadoDivisao5);
        
        // Teste com os valores 100 e 100;
        double resultadoSoma6 = calc.somar(100, 100);
        System.out.println("Resultado da soma 6: " + resultadoSoma6);
        double resultadoSubtracao6 = calc.subtrair(100, 100);
        System.out.println("Resultado da subtracao 6: " + resultadoSubtracao6);
        double resultadoMultiplicacao6 = calc.multiplicar(100, 100);
        System.out.println("Resultado da multiplicacao 6: " + resultadoMultiplicacao6);
        double resultadoDivisao6 = calc.dividir(100, 100);
        System.out.println("Resultado da divisao 6: " + resultadoDivisao6);
        
        // Teste com os valores 13 e 28;
        double resultadoSoma7 = calc.somar(13, 28);
        System.out.println("Resultado da soma 7: " + resultadoSoma7);
        double resultadoSubtracao7 = calc.subtrair(13, 28);
        System.out.println("Resultado da subtracao 7: " + resultadoSubtracao7);
        double resultadoMultiplicacao7 = calc.multiplicar(13, 28);
        System.out.println("Resultado da multiplicacao 7: " + resultadoMultiplicacao7);
        double resultadoDivisao7 = calc.dividir(13, 28);
        System.out.println("Resultado da divisao 7: " + resultadoDivisao7);
        
        // Teste com os valores 3.5 e 8;
        double resultadoSoma8 = calc.somar(3.5, 8);
        System.out.println("Resultado da soma 8: " + resultadoSoma8);
        double resultadoSubtracao8 = calc.subtrair(3.5, 8);
        System.out.println("Resultado da subtracao 8: " + resultadoSubtracao8);
        double resultadoMultiplicacao8 = calc.multiplicar(3.5, 8);
        System.out.println("Resultado da multiplicacao 8: " + resultadoMultiplicacao8);
        double resultadoDivisao8 = calc.dividir(3.5, 8);
        System.out.println("Resultado da divisao 8: " + resultadoDivisao8);
        
        // Teste com os valores 0.75 e 0.75;
        double resultadoSoma9 = calc.somar(0.75, 0.75);
        System.out.println("Resultado da soma 9: " + resultadoSoma9);
        double resultadoSubtracao9 = calc.subtrair(0.75, 0.75);
        System.out.println("Resultado da subtracao 9: " + resultadoSubtracao9);
        double resultadoMultiplicacao9 = calc.multiplicar(0.75, 0.75);
        System.out.println("Resultado da multiplicacao 9: " + resultadoMultiplicacao9);
        double resultadoDivisao9 = calc.dividir(0.75, 0.75);
        System.out.println("Resultado da divisao 9: " + resultadoDivisao9);
        
        // Teste com os valores 11 e 33.
        double resultadoSoma10 = calc.somar(11, 33);
        System.out.println("Resultado da soma 10: " + resultadoSoma10);
        double resultadoSubtracao10 = calc.subtrair(11, 33);
        System.out.println("Resultado da subtracao 10: " + resultadoSubtracao10);
        double resultadoMultiplicacao10 = calc.multiplicar(11, 33);
        System.out.println("Resultado da multiplicacao 10: " + resultadoMultiplicacao10);
        double resultadoDivisao10 = calc.dividir(11, 33);
        System.out.println("Resultado da divisao 10: " + resultadoDivisao10);
    }
    
}