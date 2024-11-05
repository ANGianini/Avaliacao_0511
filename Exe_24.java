
import java.util.Scanner;

public class Exe_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double CustoFinal = 0;
		
		System.out.print("Informe o custo de fábrica do carro: ");
		double CustoFabrica = sc.nextDouble();
		
		double distribuidor = CustoFabrica * 0.28 + CustoFabrica;
		double impostos = CustoFabrica * 0.45 + CustoFabrica;
		CustoFinal = distribuidor + impostos;
		
		System.out.printf("O valor final é %.2f", CustoFinal);	
		sc.close();
	}

}
