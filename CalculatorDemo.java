class CalculatorDemo {
  public static void main(String args[]) {

     Calculator c1 = new Calculator();

     System.out.println(c1.square(17));

     int result = c1.square(25);
     System.out.println(result);


    System.out.println("Adding two numbers : "+ (c1.add(7,8)));
	System.out.println("subtraction of two numbers : "+ (c1.sub(9,8)));
	System.out.println("division of  two numbers : "+ (c1.divide(24,8)));
	System.out.println("multiplicatioin of three number : "+ (c1.multiply(7,8,9)));

    

}

}



class Calculator {



	int square(int number){

		return number * number;
	}


	int add(int num1, int num2){

		return num1+num2;
	}

	int sub(int num1, int num2){

	return num1-num2; 
	}
	double divide( double num1, double num2){
	return num1/num2;
	}
	int multiply( int num1, int num2, int num3){
	return num1*num2*num3;
	}}