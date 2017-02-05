import java.util.*;

/**
	класс дл€ запуска калькул€тора. поддерживает ввод пользователя.
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
				if (calc.getResult() == 0) {  //провер€ет, содержит ли результат вещественное число
					System.out.println("Enter first arg : ");
					first = reader.nextDouble();}  //если не содержит (т.е. значение 0), первое число считываетс€ с клавиатуры
				else {
				first = calc.getResult();}  //если содержит, то первому числу присваиваетс€ значение результата
				
				do {
				System.out.println("select the arithmetic operation: +, -, *, /, ^ ");
				arithOperation = reader.next(); //считываетс€, выбираемая пользователем арифметическа€ операци€
				} while (arithOperation == "+" || arithOperation == "-" || arithOperation == "*" || arithOperation == "/" || arithOperation == "^");
				
				System.out.println("Enter second arg : ");
				double second = reader.nextDouble(); //считывается второе число
				
				if (arithOperation.equals("+"))
					calc.add(first, second); // выполняется сложение
				if (arithOperation.equals("-"))
					calc.substraction(first, second); //выполняется вычитание
				if (arithOperation.equals("*"))
					calc.multiplication(first, second);  //выполняется умножение
				if (arithOperation.equals("/"))
					calc.division(first, second);  //выполняется деление
				if (arithOperation.equals("^"))
					calc.exponentiation(first, second);  //выполняется возведение в степень

					
				System.out.println("Result : " + calc.getResult());
				
				System.out.println("Do you want to clean the Result:  yes/no");
				clsClean = reader.next();  //пользователь указывает очистить результат или нет
				if (!clsClean.equals("no")) {
				calc.cleanResult();
				System.out.println("Exit : yes/no");
				exit = reader.next();  //пользователь указывает выйти ли из программы
				}
			}
		} finally {
			reader.close();
		}
	}
}