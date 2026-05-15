package entities;

/**
 * Contribuinte pessoa física — implementa cálculo de imposto específico.
 */
public class Individual extends TaxPayer {
    private double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double basicTax = (getAnualIncome() < 20000.00) ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;

        double taxWithHealth = basicTax - (healthExpenditures * 0.5);

        return (taxWithHealth < 0.0) ? 0.0 : taxWithHealth;
    }

}
