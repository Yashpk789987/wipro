class Calculator {
	static int powerInt(int num1,int num2) {
		int result = (int) Math.pow((double) num1,(double) num2);
		return result;
	}
	static double powerDouble(double num1,double num2) {
		double result =  Math.pow(num1, num2);
		return result;
	}
}



public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("2 raise to the power 3 is :: "+Calculator.powerInt(2, 3));
        System.out.println("2.5 raise to the power 3.7 is :: "+Calculator.powerDouble(2.5, 3.7));
	}

}
