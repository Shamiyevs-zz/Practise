/**
 * Created by Shamiyevs on 07-Jan-16.
 */
import java.util.Scanner;

class MultiConvertorX{
	
	public static void main(String args[])
	    throws java.io.IOException {
			char cs;
				
		//-------------------------------------------------------------------------
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This is a multi-convertor program, choose convertion type:");
		System.out.println("1. Volume Convertion");
		System.out.println("2. Temperature Convertion");
		System.out.println("3. Press 0 for exit");
		
		
		while(!keyboard.hasNextInt()){
			System.out.println("Choose according to number order");
			System.out.println("1. Volume Convertion");
		    System.out.println("2. Temperature Convertion");
		    System.out.println("3. Press 0 for exit");
			keyboard.next();
		}
		//----------------------------------- Volume Convertion ------------------------------------

		        System.out.println("1. Gallon to Litres" + "\n" + "2. Litres to Gallon");
				switch(keyboard.nextInt()){
				  case 1:
				      do{
					      GalToLit galtolit = new GalToLit();
					      System.out.println("Enter Gallon");
				          while (!keyboard.hasNextDouble()){ //if input isn't number cycle won't stop
				                System.out.println("Wrong input");
						        //  lit = kebrd.nextDouble();
						        keyboard.next(); //next read
					        }
						  galtolit.gal = keyboard.nextDouble();
					      double Litres = galtolit.Litres();
					      System.out.println(Litres + " liters");
				          System.out.println("Would you like to continune?");
		                  System.out.println("Press Y or N");
				          cs = (char) System.in.read();
			            } while(cs !='n' & cs !='N');
		          break;
				  case 2 :
			          do {
						  LitToGal littogal = new LitToGal();
			              System.out.println("Enter litres");
                          // lit = kebrd.nextDouble();
				          while (!keyboard.hasNextDouble()){ //if input isn't number cycle won't stop
				               System.out.println("Wrong input");
						       //  lit = kebrd.nextDouble();
						       keyboard.next(); //next read
					        }
				          littogal.lit = keyboard.nextDouble();
						  double Gallons = littogal.Gallons();				        
                          System.out.println(Gallons + " gallons");                      
				          System.out.println("Would you like to continune?");
				          System.out.println("Press Y or N");
				          cs = (char) System.in.read();
			            } while(cs !='n' & cs !='N');
		            break;

				} 
    }
}


class GalToLit{
	double lit, gal;
	
    
	double Litres(){
		lit = 3.7854 * gal;
		return lit;
	}
}

class LitToGal{
	double lit, gal;
	
	double Gallons(){
		gal = lit / 3.7854;
		return gal;
	}
}