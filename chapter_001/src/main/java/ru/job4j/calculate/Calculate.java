package ru.job4j.calculate;

/**
* Calculate
*
* @author glissovskiy (leginBSD@gmail.com)
*/

public class Calculate{
	
	/**
	* Method echo
	* @param value Your for 3x value.
	* @return Echo value 3x.
	*/
	
	public String echo(String value){
		return String.format("%s, %s, %s", value, value, value);
	}
	
	/**
	* Main.
	* @param args - args.
	*/
	public static void main (String[] args){
		Calculate calc = new Calculate();
		System.out.println(calc.echo("aah"));
	}
}