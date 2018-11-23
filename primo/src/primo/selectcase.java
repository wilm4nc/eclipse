package primo;

import java.io.*;
public class selectcase {
	
	 static BufferedReader teclado=new 
			   BufferedReader(new InputStreamReader(System.in));
			   
			   
			   static int n1=0;
			   static int n2=0;
			   static int R=0;
			   static int operacion;
			   

	public static void main(String[] args)throws Exception{
		
				   	  System.out.println("DIGUITE EL PRIMER NUMERO ");
				   	  n1=Integer.parseInt(teclado.readLine());
				   	  System.out.println("DIGUITE EL SEGUNDO NUMERO ");
				   	  n2=Integer.parseInt(teclado.readLine());
				   	  System.out.println("Dijite la operacion a realizar");
				   	  System.out.println("1 Suma");
				   	  System.out.println("2 Resta");
				   	  System.out.println("3 Multiplicacion");
				   	  System.out.println("4 Division");
				   	  operacion=Integer.parseInt(teclado.readLine());
				   	  
				   	  switch(operacion)
				   	  {
				   	  	case 1:
				   	  	R=n1+n2;
				   	    System.out.println("LA SUMA ES "+ R);
				   	    break;
				   	    
				   	    case 2:
				   	    R=n1-n2;
				   	    System.out.println("LA RESTA ES "+ R);
				   	    break;
				   	    
				   	    case 3:
				   	    R=n1*n2;
				   	    System.out.println("LA MULTIPLICACION ES "+ R);
				   	    break;
				   	    
				   	    case 4:
				   	    R=n1/n2;
				   	    System.out.println("LA DIVISION ES "+ R);
				   	    break;
				   	    
				   	    default:
				   	    System.out.println("Error al introducir la operacion");
				   	    break;
				   	  }
				 	 
				    }
		
		
	

}
