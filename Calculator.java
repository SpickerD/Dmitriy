/**
	����� ��������� �����������
*/

public class Calculator {
	/**
		��������� ����������
	*/
	private double result;
	
	/**
		��������� ���������.
		@param params ��������� ������������.
	*/
	public void add(double ... params) {
		for (Double param : params) {
			this.result += param;
		}
	}
	
	public void substraction (double a, double b) {
		this.result = a-b;  //����� ��� ���������
	}
	
	public void multiplication (double a, double b) {
		this.result = a*b;  // ����� ��� ���������
	}
	
	public void division (double a, double b) {
		this.result = a/b;  // ����� ��� �������
	}
	
	public void exponentiation (double a, double b) {
		this.result = Math.pow(a, b);  // ����� ��� �������
	}
	
	/**
		�������� ���������.
		@return ��������� ����������.
	*/
	
	public double getResult() {
		return this.result;
	}
	
	/**
		�������� ��������� ����������.
	*/
	
	public void cleanResult() {
		this.result = 0;
	}
	
}