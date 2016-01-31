class MyClass {
	private int alpha;
	public int beta;
	int gamma;
	
	void setAlpha(int a) {
		alpha = a;		
	}
	
	int getAlpha (){
		return alpha;
	}
}

class AccessDemo {
	public static void main (String args[]) {
		MyClass ob = new MyClass();
		
		ob.setAlpha(-99);
		System.out.println("ob.alpha: " + ob.getAlpha());
		
		// ob.alpha(10); this is mistake because alpha is private there is need special approach as it shown above
		
		ob.beta = 88;
		ob.gamma = 99;
	}
}