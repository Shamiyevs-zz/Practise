class Phone {
	public static void main (String args[]) {
		String numbers[][] = {
			    {"Shahin", "0552030586"},
				{"Shahla", "0558989101"},
				{"Vahid", "055707993"},
				{"Ayaz", "0709392713"}
		};
		
		int i;
		
		// In order to use program we need to give it ona argument via console
		if (args.length!=1)
			System.out.println("Use: java Phone <name>");
		else {
			for (i=0; i < numbers.length; i++) {
				if (numbers[i][0].equals(args[0])) {
					System.out.println(numbers[i][0] + ": " + numbers[i][1]);
					break;
				}
			}
			if (i == numbers.length)
				System.out.println("No result");
		}
		
		
	}
}