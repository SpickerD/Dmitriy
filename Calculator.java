/**
	Класс реализует калькулятор
*/

public class Calculator {
	/**
		Результат вычисления
	*/
	private double result;
	
	/**
		Суммирует аргументы.
		@param params Аргументы суммирования.
	*/
	public void add(double ... params) {
		for (Double param : params) {
			this.result += param;
		}
	}
	
	public void substraction (double a, double b) {
		this.result = a-b;  //метод для вычитания
	}
	
	public void multiplication (double a, double b) {
		this.result = a*b;  // метод для умножения
	}
	
	public void division (double a, double b) {
		this.result = a/b;  // метод для деления
	}
	
	public void exponentiation (double a, double b) {
		this.result = Math.pow(a, b);  // метод для деления
	}
	
	/**
		Получить результат.
		@return результат вычисления.
	*/
	
	public double getResult() {
		return this.result;
	}
	
	/**
		Очистить результат вычисления.
	*/
	
	public void cleanResult() {
		this.result = 0;
	}
	
}