//Pacote onde está localizada a calculadora;
package Calculadora;

//Imports para os testes em JUnit;
import org.junit.platform.commons.annotation.Testable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import junit.framework.Assert;

//Supressão de avisos não importantes;
@SuppressWarnings({ "deprecation", "unused" })

//Classe de calculadora JUnit;
public class CalculadoraJUnitTeste
{

//Transformar os métodos em testes.
@Testable

// Diferentes tipos de Soma;
	public void SomarDoisNumerosPositivos()
		{
		Calculadora calc = new Calculadora();
		double soma = calc.somar(3, 7);
		
		//Comparação de resultados para confirmar se a calculadora está correta;
		Assert.assertEquals(10,soma);
		}


public void SomarDoisNumerosNegativos()
{
	Calculadora calc = new Calculadora();
	double soma = calc.somar(-33, -41);

	Assert.assertEquals(-74,soma);
}
		

		public void SomarComZero()
		{
			Calculadora calc = new Calculadora();
			double soma = calc.somar(100000, 0);
		
			Assert.assertEquals(100000,soma);
		}
		
		
public void SomarDeZero()
{
	Calculadora calc = new Calculadora();
	double soma = calc.somar(0, 50);
		
	Assert.assertEquals(50,soma);
}
	
		public void SomarNegativoComPositivo()
		{
			Calculadora calc = new Calculadora();
			double soma = calc.somar(-20, 5);
		
			Assert.assertEquals(-15,soma);
		}
	
		
public void SomarPositivoComNegativo()
{
	Calculadora calc = new Calculadora();
	double soma = calc.somar(20, -5);
		
	Assert.assertEquals(15,soma);
}
	

		public void SomarNaoInteiros()
		{
			Calculadora calc = new Calculadora();
			double soma = calc.somar(0.20, 0.40);
		
			Assert.assertEquals(0.60,soma);
		}
	
		
public void SomarNaoInteiroComInteiro()
{
	Calculadora calc = new Calculadora();
	double soma = calc.somar(0.20, 800);
		
	Assert.assertEquals(800.20,soma);
}
	

		public void SomarInteiroComNaoInteiro()
		{
			Calculadora calc = new Calculadora();
			double soma = calc.somar(1, 0.50);
		
			Assert.assertEquals(1.50,soma);
		}
	
	
	//Diferentes tipos de Subtração;
	
		
public void SubtrairDoisNumerosPositivos()
{
Calculadora calc = new Calculadora();
double subtracao = calc.subtrair(3, 7);
	
Assert.assertEquals(-4,subtracao);
}


		public void SubtrairDoisNumerosNegativos()
		{
			Calculadora calc = new Calculadora();
			double subtracao = calc.subtrair(-33, -41);

			Assert.assertEquals(8,subtracao);
		}
	
		
public void SubtrairComZero()
{
Calculadora calc = new Calculadora();
double subtracao = calc.subtrair(100000, 0);
	
Assert.assertEquals(100000,subtracao);
}


		public void SubtrairDeZero()
		{
			Calculadora calc = new Calculadora();
			double subtracao = calc.subtrair(0, 50);

			Assert.assertEquals(-50,subtracao);
		}

		
public void SubtrairNegativoComPositivo()
{
	Calculadora calc = new Calculadora();
	double subtracao = calc.subtrair(-20, 5);
	
	Assert.assertEquals(-25,subtracao);
}


		public void SubtrairPositivoComNegativo()
		{
			Calculadora calc = new Calculadora();
			double subtracao = calc.subtrair(20, -5);
	
			Assert.assertEquals(25,subtracao);
		}

		
public void SubtrairNaoInteiros()
{
Calculadora calc = new Calculadora();
double subtracao = calc.subtrair(0.20, 0.40);
	
Assert.assertEquals(-0.20,subtracao);
}


		public void SubtrairNaoInteiroComInteiro()
		{
			Calculadora calc = new Calculadora();
			double subtracao = calc.subtrair(0.20, 800);
	
			Assert.assertEquals(-799.80,subtracao);
		}

		
public void SubtrairInteiroComNaoInteiro()
{
Calculadora calc = new Calculadora();
double subtracao = calc.subtrair(1, 0.50);
	
Assert.assertEquals(0.50,subtracao);
}


//Diferentes tipos de Divisão;


		public void DividirDoisNumerosPositivos()
		{
			Calculadora calc = new Calculadora();
			double divisao = calc.subtrair(3, 7);

			Assert.assertEquals(0.42857,divisao);
		}


public void DividirDoisNumerosNegativos()
{
Calculadora calc = new Calculadora();
double divisao = calc.dividir(-33, -41);

Assert.assertEquals(0.75,divisao);
}


		public void DividirComZero()
		{
			Calculadora calc = new Calculadora();
			double divisao = calc.dividir(100000, 0);

			Assert.assertEquals(0,divisao);
		}

		
public void DividirDeZero()
{
Calculadora calc = new Calculadora();
double divisao = calc.dividir(0, 50);

Assert.assertEquals(0,divisao);
}


		public void DividirNegativoComPositivo()
		{
			Calculadora calc = new Calculadora();
			double divisao = calc.dividir(-20, 5);

			Assert.assertEquals(-4,divisao);
		}

		
public void DividirPositivoComNegativo()
{
Calculadora calc = new Calculadora();
double divisao = calc.dividir(20, -5);

Assert.assertEquals(-4,divisao);
}


		public void DividirNaoInteiros()
		{
			Calculadora calc = new Calculadora();
			double divisao = calc.dividir(0.20, 0.40);

			Assert.assertEquals(0.50,divisao);
		}

		
public void DividirNaoInteiroComInteiro()
{
	Calculadora calc = new Calculadora();
	double divisao = calc.dividir(0.20, 800);

	Assert.assertEquals(0.00025,divisao);
}

		
		public void DividirInteiroComNaoInteiro()
		{
				Calculadora calc = new Calculadora();
					double divisao = calc.dividir(1, 0.50);

						Assert.assertEquals(2,divisao);
		}


//Diferentes tipos de Multiplicação;

public void MultiplicarDoisNumerosPositivos()
{
	Calculadora calc = new Calculadora();
	double multiplicacao = calc.multiplicar(3, 7);

	Assert.assertEquals(21,multiplicacao);
}


		public void MultiplicarDoisNumerosNegativos()
			{
				Calculadora calc = new Calculadora();
				double multiplicacao = calc.multiplicar(-33, -41);

				Assert.assertEquals(1452,multiplicacao);
			}


public void MultiplicarComZero()
{
	Calculadora calc = new Calculadora();
	double multiplicacao = calc.multiplicar(100000, 0);

	Assert.assertEquals(0,multiplicacao);
}

		
		public void MultiplicarDeZero()
			{
				Calculadora calc = new Calculadora();
				double multiplicacao = calc.multiplicar(0, 50);

				Assert.assertEquals(0,multiplicacao);
			}


public void MultiplicarNegativoComPositivo()
{
	Calculadora calc = new Calculadora();
	double multiplicacao = calc.multiplicar(-20, 5);

	Assert.assertEquals(-100,multiplicacao);
}

		
		public void MultiplicarPositivoComNegativo()
		{
			Calculadora calc = new Calculadora();
			double multiplicacao = calc.multiplicar(20, -5);

			Assert.assertEquals(-100,multiplicacao);
		}


public void MultiplicarNaoInteiros()
{
	Calculadora calc = new Calculadora();
	double multiplicacao = calc.multiplicar(0.20, 0.40);

	Assert.assertEquals(0.080,multiplicacao);
}

		
		public void MultiplicarNaoInteiroComInteiro()
		{
			Calculadora calc = new Calculadora();
			double multiplicacao = calc.multiplicar(0.20, 800);

			Assert.assertEquals(160,multiplicacao);
		}


public void MultiplicarInteiroComNaoInteiro()
{
	Calculadora calc = new Calculadora();
	double multiplicacao = calc.multiplicar(1, 0.50);

	Assert.assertEquals(0.50,multiplicacao);
}


}
//Fim do código.