package util;

public class CurrencyConverter {

	public static final double IOF = 0.07;

	public static double dollarToReal(double amount, double dollarPrice) {

		return amount * dollarPrice * (1.0 + IOF);

	} // Fim do método estático dollarToReal

} // Fim da classe CurrencyConverter
