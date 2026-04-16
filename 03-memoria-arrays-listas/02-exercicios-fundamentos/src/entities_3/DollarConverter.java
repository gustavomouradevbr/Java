package entities_3;

/**
 * Utilitario para conversao de dolar para real com IOF fixo do exercicio.
 */
public final class DollarConverter {

    private static final double IOF_RATE = 1.06;

    private DollarConverter() {
    }

    /**
     * Evita estado global mutavel para deixar a conta previsivel durante a depuracao.
     */
    public static double currencyConverter(double dollarPrice, double dollarsToBuy) {
        return (dollarPrice * dollarsToBuy) * IOF_RATE;
    }
}
