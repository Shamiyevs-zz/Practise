import java.util.Scanner;

class ShowbitsDemo {
	public static void main (String args[]) {
		ShowBits bits = new ShowBits(8);
		Scanner scan = new Scanner(System.in);
		long val;
		
		System.out.println("Enter the decimal nummber which you wannt to conver to binary:");
		val = scan.nextLong();
		bits.show();
		
	}
}

class ShowBits {
	int numbits;
	
	ShowBits (int n) {
		numbits = n;
	}
	
	void show (long val) {
		long mask = 1;
		
		mask <<= numbits-1;
		
		for (; mask!=0; mask>>>=1){
			if ((val&mask)!=0)
				System.out.print("1");
			else
				System.out.print("0");
		}
	}
}