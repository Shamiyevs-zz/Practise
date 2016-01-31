class ForEachExamp {
	public static void main(String args[]){
		ForEach foreach = new ForEach();
		ForEach2 foreach2 = new ForEach2();
		Search search = new Search();
		
		System.out.println("Final Sum equals to " + foreach.foreach());
		System.out.println("\n");
		System.out.println("//-------------------------------------------------//");
		System.out.println("\n");
		System.out.println("Final Sum equals to " + foreach2.foreach2());
		System.out.println("\n");
		System.out.println("//-------------------------------------------------//");
		System.out.println("\n");
		System.out.println("Search is " + search.search());
	}
}

class ForEach{
	int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int sum = 0;
	
	int foreach(){
		System.out.println("Starting ForEachPractise");
		for (int x: nums){  /**  here could be for(int i=0; i<10; i++){sum +=nums[i]} **/
			sum += x;
			System.out.println("x equals to /" + x + "/ Sum to " + sum);
		}
		return sum;
	}
}

class ForEach2{
	int nums[][] = new int[3][5];
	int sum=0;
	
	int foreach2(){
		System.out.println("Starting ForEach Practise 2");

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 5; j++)
				nums[i][j] = (i + 1) * (j + 1);
		
		for (int x[]: nums)
			for (int y : x){
				System.out.println("Znacenie " + y);
				sum += y;
			}
		return sum;
	}
}

class Search{
	int nums[] = {2,5,1,3,6,8,9,6};
	int val = 4;
	boolean i;
	
	boolean search(){
		for (int x:nums){
			if (x == val){
				System.out.println("Search is true 4 is found");
				i = true;
			}
			else 
			  i = false; 
		}
		return i;
	}
}

