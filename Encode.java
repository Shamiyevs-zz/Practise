class Encode {
	public static void main (String args[]) {
		String encode = "", decode = "";
		String msg = "This is a test";
		int key = 88;
		
		System.out.println("The current message");
		System.out.println(msg);
		
		//Encoding message
		for (int i = 0; i < msg.length(); i++)
			encode = encode + (char) (msg.charAt(i) ^ key);
		System.out.println("Encoded message: ");
		System.out.println(encode);
		
		for (int i = 0; i < msg.length(); i++)
			decode = decode + (char) (encode.charAt(i) ^ key);
		System.out.println("Decoded message: ");
		System.out.println(decode);
	}
}