import java.util.*;

/**
	����� ��� ������� ������������. ������������ ���� ������������.
*/

public class InteractRunner {
	
	public static void main(String[] arg) {
		Scanner reader = new Scanner(System.in);
		reader.useLocale(Locale.US);
		try {
			Calculator calc = new Calculator();
			calc.cleanResult();
			double first;
			String clsClean = "no";
			String exit = "no";
			String arithOperation;
			while (!exit.equals("yes")) {
				if (calc.getResult() == 0) {  //���������, �������� �� ��������� ������������ �����
					System.out.println("Enter first arg : ");
					first = reader.nextDouble();}  //���� �� �������� (�.�. �������� 0), ������ ����� ����������� � ����������
				else {
				first = calc.getResult();}  //���� ��������, �� ������� ����� ������������� �������� ����������
				
				do {
				System.out.println("select the arithmetic operation: +, -, *, /, ^ ");
				arithOperation = reader.next(); //�����������, ���������� ������������� �������������� ��������
				} while (arithOperation == "+" || arithOperation == "-" || arithOperation == "*" || arithOperation == "/" || arithOperation == "^");
				
				System.out.println("Enter second arg : ");
				double second = reader.nextDouble(); //����������� ������ �����
				
				if (arithOperation.equals("+"))
					calc.add(first, second); // ����������� ��������
				if (arithOperation.equals("-"))
					calc.substraction(first, second); //����������� ���������
				if (arithOperation.equals("*"))
					calc.multiplication(first, second);  //����������� ���������
				if (arithOperation.equals("/"))
					calc.division(first, second);  //����������� �������
				if (arithOperation.equals("^"))
					calc.exponentiation(first, second);  //����������� ���������� � �������

					
				System.out.println("Result : " + calc.getResult());
				
				System.out.println("Do you want to clean the Result:  yes/no");
				clsClean = reader.next();  //������������ ��������� �������� ��������� ��� ���
				if (!clsClean.equals("no")) {
				calc.cleanResult();
				System.out.println("Exit : yes/no");
				exit = reader.next();  //������������ ��������� ����� �� �� ���������
				}
			}
		} finally {
			reader.close();
		}
	}
}