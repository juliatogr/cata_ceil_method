package cata;

public class MainClass {
	//Programar función ceil
	
	public static void main(String[] args) {
		//Comprovar con 5.0d (5), 5.4d (6) y -5.4d (-5)
		
		System.out.println(ceil(5.0));
		System.out.println(ceil(5.4));
		System.out.println(ceil(-5.4));
	}
	
	public static int ceil(double num) {
		int c = -1;
		
		String numStr = String.valueOf(num);
		
		int dotPos = numStr.indexOf(".");
		
		int strSize = numStr.length();
		
		int intPart = Integer.parseInt(numStr.substring(0, dotPos));
		
		double decimal = Double.parseDouble(numStr.substring(dotPos + 1, strSize));
		
		if (intPart < 0) {
			c = intPart;
		} else if (decimal != 0) {
			c = intPart+1;
		} else if (decimal == 0 ){
			c = intPart;
		} 
		
		return c;
	}

}
