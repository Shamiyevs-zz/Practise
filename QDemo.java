import java.util.Scanner;
class QDemo {
	static int input;
	
	public static void main(String args[]) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		QueueInt bigQI = new QueueInt(20);
		QueueInt smallQI = new QueueInt(4);
		char ch;
		int i;
		int in;
		
	    System.out.println("Please select order type:");
	    System.out.println("1. Char");
	    System.out.println("2. Integer");
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		switch (input){
			case 1:
		       System.out.println("Using order bigQ for saving alphavit");
		       //Put letter simbols in order bigQ
		       for (i=0; i<26; i++) {
			       bigQ.put((char) ('A' + i));
		        }
		
		        //Extracting letter simbols from order bigQ and show
		        System.out.println("bigQ");
		        for (i=0; i<26; i++){
			       ch = bigQ.get();
			       if(ch != (char) 0) System.out.print(ch + ", ");
		        }
		        System.out.println("\n");
		        System.out.println("Using order bigQ for generating errors");
		        for (i=0; i<5; i++){
			       System.out.println("Attempt for saving " + (char) ('Z' - i));
			       smallQ.put((char) ('Z' - i));
			       System.out.println();
		        }
		        System.out.println();
		        System.out.print("Co?ep???oe srnallQ: ");
                for (i=0; i < 5; i++) { 
                   ch = smallQ.get(); 
		           if(ch != (char) 0) System.out.print(ch); 
		        }
			break;
            case 2:
			    System.out.println("Using order bigQ for saving alphavit");
		       //Put letter simbols in order bigQ
		       for (i=0; i<20; i++) {
			       bigQI.put(i);
					System.out.println("q[]=" + bigQI.q[i]);
		        }
		
		        //Extracting letter simbols from order bigQ and show
		        System.out.println("bigQI");
		        for (i=0; i<20; i++){
			       in = bigQI.get();
			       if(in !=  0) System.out.print(in + ", ");
		        }
		        System.out.println("\n");
		        System.out.println("Using order bigQI for generating errors");
		        for (i=0; i<5; i++){
			       System.out.println("Attempt for saving " + i);
			       smallQI.put(i);
			       System.out.println();
		        }
		        System.out.println();
		        System.out.print("Co?ep???oe srnallQ: ");
                for (i=0; i < 5; i++) { 
                   in = smallQI.get(); 
		           if(in !=  0) System.out.print(in); 
		        }
			break;			
		}		
	}
}

class Queue {
	char q[]; // massive for saving data in order
	int putloc, getloc; // indexes for adding and extrating data in order
	
	Queue(int size) {
		q = new char[size ++]; //determine memmory for order
		putloc = getloc = 0;
	}
	
	void put(char ch) {
		if (putloc == q.length-1) {
			System.out.println(" - Order FULL");
			return;
		}
		
		putloc++;
		q[putloc] = ch;
	}
	
	char get() {
		if (getloc == putloc){
			System.out.println(" - The order is empty");
			return (char) 0;
		}
		
		getloc++;
		return q [getloc];
	}
}

class QueueInt {
	int q[];
	int putloc, getloc;
	
	QueueInt(int size){
		q = new int[size + 1];
		putloc = getloc = 0;
	}
	
	void put(int in){
		if (putloc == q.length-1){
			System.out.println(" - Order FULL");
		return;
		}
		
		putloc++;
		q[putloc] = in;
	}
	
	int get() {
		if (getloc == putloc ) {
			System.out.println(" - The order is empty");
			return (char) 0;
		}
		
		getloc++;
		return q [getloc];
	}
}

