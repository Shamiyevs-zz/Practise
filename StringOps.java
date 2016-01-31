import java.util.Scanner;
class StringOps {
	public static void main (String args[]){
		Scanner scan = new Scanner(System.in);
		int result, indx;
		char ch;
		String string1, string2, string3;
		
		System.out.println("This program executes different String opperations");
		System.out.println("Type first string");
		string1 = scan.nextLine();

		string2 = string1;
		System.out.println("Type third string");
		string3 = scan.nextLine();
		
		System.out.println("The first String length is: " + string1.length());
		
		//Otobrozit Stroku posimvolno
		for(int i = 0; i < string1.length(); i++)
			System.out.println(string1.charAt(i));
		System.out.println();
		
		if (string1.equals(string2))
			System.out.println("String1 eqals to string 2");
		else
			System.out.println("String1 isn't equal to String2");
		
		if (string1.equals(string3))
			System.out.println("String1 eqals to string3");
		else
			System.out.println("String1 isn't equal to String3");
		
		result = string1.compareTo(string3);
		if (result == 0)
			System.out.println("String1 and String3 are equal");
		else if(result < 0)
			System.out.println("String1 less than String3");
		else
			System.out.println("String1 more than String2");
		
		string2 = "One Two Three One";		
		indx = string2.indexOf("One");
		System.out.println("The first index of entering One is " + indx);
		indx = string2.lastIndexOf("One");
		System.out.println("The last index of entering One is " + indx);
		
		//---------------------------------------------------------------------
		subStr substr = new subStr();
		
		System.out.println(substr.orgstr());
		System.out.println(substr.substr());
		
	}
}
	
	class subStr {
		String orgstr = "Java is an Internet Driver";
		
		String orgstr(){
			return orgstr;
		}
		
		String substr(){
			String substr = orgstr.substring(11, 26);
			return substr;
		}
	}
