class ShiftDemo {
	public static void main (String args[]) {
		int  numbits = 8;
		long mask = 1;
		long val = 87987, zal;
		char ch;
		System.out.println("val = " + (char) (val & 65503));
		val = val >> 1;
		
		System.out.println("val >> 1 = " + val);
		
		mask <<= numbits - 1;
		
		System.out.println("mask = " + mask);
		
		
		for (; mask!=0; mask>>>=1){
			System.out.println("mask = " + mask);
			if ((mask & val)!=0) System.out.print("1");
			else System.out.print("0");
			zal = mask & val;
			System.out.print("zal = " + zal);
		}
	}
}