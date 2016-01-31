class ExampParam{
	public static void main(String args[]){
		Math e = new Math();
		
		if(e.isTrue(10, 2)) System.out.println("True");
		
		if(e.isTrue(10, 11)) System.out.println("False");
	}
}

class Math{
	
	boolean isTrue(int x, int y){
		
		if(x%y==0) return true;
		else return false;
	}
}