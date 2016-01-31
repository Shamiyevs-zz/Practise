/**
 * Created by Shamiyevs on 07-Jan-16.
 */
import java.util.Scanner;

class MultiConvertor{
	
	public static void main(String[] args)
	throws java.io.IOException {
		
		char cs;
		
		Scanner kebrd = new Scanner(System.in);
		System.out.println("This is a multi-convertor program ");
		System.out.println("What do you want to convert:");
		System.out.println("1. Volume Convertion");
		System.out.println("2. Temperature Convertion");

  
		  
		  switch(kebrd.nextInt();){
			case 1 :
			   System.out.println("1. Gallon to Litres" + "\n" +
			   "2. Litres to Gallon");
			   sw = kebrd.nextInt();
			   switch (sw){
			      case 1 :
				    do {
				      double lit, gal;
			          System.out.println("Enter Gallon");
					  while (!kebrd.hasNextDouble()){ //if input isn't number cycle won't stop
						  System.out.println("Wrong input");
						//  lit = kebrd.nextDouble();
						  kebrd.next(); //next read
					  }
		              gal = kebrd.nextDouble(); //Right Input Starts here
                      lit = 3.7854 * gal;
                      System.out.println(lit + " liters");
					  System.out.println("Would you like to continune?");
					  System.out.println("Press Y or N");
					  cs = (char) System.in.read();
					} while(cs !='n' & cs !='N');
				  break;
				  case 2 :
				    do {
					  double lit, gal;
			          System.out.println("Enter litres");
                     // lit = kebrd.nextDouble();
					  while (!kebrd.hasNextDouble()){ //if input isn't number cycle won't stop
						  System.out.println("Wrong input");
						//  lit = kebrd.nextDouble();
						  kebrd.next(); //next read
					  }
					  lit = kebrd.nextDouble();
					  gal = lit / 3.7854;
                      System.out.println(gal + " gallons");                      
					  System.out.println("Would you like to continune?");
					  System.out.println("Press Y or N");
					  cs = (char) System.in.read();
				    } while(cs !='n' & cs !='N');
				  break;
			    }
				 
			    break;
		
		    }
        }
	}
}