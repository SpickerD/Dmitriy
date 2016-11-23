/**
* Calculator.
*/
package ru.dspicker;

/**
 * Конструктор, вывод строки в консоль.
 * @param arg - value.
 * @author dspicker
 * @since 23.11.2016
 * @version 1
 */
public class Calculate {
	public String echo(String value) {
		return String.format("%s %s %s", value, value, value);
	}
	
	public static void main(String[] args) {
		Calculate calc = new Calculate();
		System.out.println(calc.echo("aah"));
	}
}