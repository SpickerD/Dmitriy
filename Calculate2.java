/**
	класс для вычисления суммы, вычитания, умножения, деления, возведения в степень двух чисел
	Числа берутся из входящего массива.
*/

public class Calculate2 {
	
	public static void main(String[] arg){
		
		System.out.println("Calculate...");
		double first = Double.valueOf(arg[0]);
		double second = Double.valueOf(arg[1]);
		
		double summ = first + second;
		double substraction = first - second;
		double multiplication = first * second;
		double division = first / second;
		double exponentiation = Math.pow(first, second);
		System.out.println("Sum " + summ);
		System.out.println("substraction " + substraction);
		System.out.println("multiplication " + multiplication);
		System.out.println("division " + division);
		System.out.println("exponentiation " + exponentiation);
				
	}
}