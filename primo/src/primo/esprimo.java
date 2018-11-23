package primo;

import java.util.Scanner;

public class esprimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double primo=0;
		boolean esprimo=true;
		Scanner valor=new Scanner(System.in);
		
		System.out.println("Digite un valor");
		primo=valor.nextDouble();
		for(int i=2; i<primo; i++) {
					
			if(primo%i==0){
				esprimo=false;
			}
			
		}
		
		System.out.println("El numero digitado "+ primo+" es primo :"+esprimo);
	}

}
