public class TemperatureConversion{
	public static void main(String[] args){
		final double TABLE_BEGIN = -50.0;
		final double TABLE_END = 50.0;
		final double TABLE_STEP = 10.0;

		double celsius;
		double fahrenheit;

		System.out.println("TEMPERATURE CONVERSION");
		System.out.println("----------------------");
		System.out.println("Celsius     Fahrenheit");
		for(celsius = TABLE_BEGIN; celsius <= TABLE_END; celsius += TABLE_STEP){
			fahrenheit = celsiusToFahrenheit(celsius);
			System.out.printf("%6.2fC", celsius);
			System.out.printf("%14.2fF\n", fahrenheit);
		}
		System.out.println("-----------------------");
	}

	public static double celsiusToFahrenheit(double c){
		final double MINIMUM_CELCIUS = -273.15;
		if(c < MINIMUM_CELCIUS)
			throw new IllegalArgumentException("Argument " + c + " is too small.");
		return (9.0/5.0) * c + 32;
	}
}
