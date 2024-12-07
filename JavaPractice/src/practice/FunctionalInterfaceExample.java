package practice;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathOperation add=(a,b)->a+b;
		MathOperation subtract=(a,b) ->a-b;
		System.out.println("Addition: "+ Calculate(5,6,add));
		System.out.println("Subtraction: "+ Calculate(10,6,subtract));
	

	}


	private static int Calculate(int i, int j, MathOperation operation) {
		return operation.operate(i, j);
	}
	
	

}
