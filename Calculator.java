import java.util.Scanner;

public class Calculator {

	public static int calc(String input) throws Exception {
	
		String[] OPs = {"+","-","*","/"};
		
		String expr = input.replace(" ","");
		
		int oops = 0;
		String OP = "";
		String iexpr = expr; 
		
		for (String op: OPs){
	    iexpr = expr;
			while (!(iexpr.indexOf(op) == -1)){
				oops += 1;
				OP = op;
				iexpr = iexpr.substring(iexpr.indexOf(op) + 1, iexpr.length());
				
				}
			
		}
		
		if (!(oops == 1)){
			throw new Exception();
		}
		
		int i = iexpr.indexOf(OP);
		
		int a = Integer.parseInt(expr.substring(0, i));
		int b = Integer.parseInt(expr.substring(i + 1, expr.length()));
		
		if (!(a>=1 && a<=10 && b>=1 && b<=10)){
			
			throw new Exception();
			
		}
		
		int result = 0;
		 
		switch (OP) {
			
			case "+" -> result = a + b;
			case "-" -> result = a - b;
			case "*" -> result = a * b;
			case "/" -> result = a / b;
		
		}
		
		return result;
	}
	
	public static void main(String[] args) throws Exception {
	
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int answer = calc(input);
		System.out.print(answer);
	
	}

}