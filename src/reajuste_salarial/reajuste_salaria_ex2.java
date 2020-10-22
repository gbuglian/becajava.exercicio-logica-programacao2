package reajuste_salarial;
import java.util.Scanner;

public class reajuste_salaria_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner salario = new Scanner(System.in);
			Scanner aumento = new Scanner(System.in);
		
			System.out.println("Informe o salário: ");
				double recebe_salario = salario.nextDouble();
				
			System.out.println("Infome o porcentual de aumento: ");
				double recebe_aumento = aumento.nextDouble();
				double resultado;
				
			resultado = recebe_salario + (recebe_salario * recebe_aumento) / 100;
			
			System.out.println("Salario reajustado para: " +resultado);
			
	}

}
