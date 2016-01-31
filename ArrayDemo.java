class ArrayDemo{
	public static void main(String args[]){
		int Sample1[] = new int[10];
		int Sample2[] = new int [10];
		int i;
		for (i=0; i<Sample1.length; i++){
			Sample1[i] = i;
			System.out.println("Element1 [ " + i + " ]: " + Sample1[i]);
		}
		System.out.println("//----------------------------------------------------------//");
		for (i=0; i<Sample2.length; i++){
			Sample2[i] = - i;
			System.out.println("Element2 [ " + i + " ]: " + Sample2[i]);
		}
		
		Sample2 = Sample1;
		
		for(i=0; i<Sample2.length; i++)
			System.out.println("Sample2 equals to Sample1 [ " + i + " ]: " + Sample2[i]);
		
	}
}