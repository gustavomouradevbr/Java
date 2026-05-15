package entities;

/**
 * Empregado terceirizado: estende `Employee` e adiciona `additionalCharge`.
 * Demonstra polimorfismo ao sobrescrever `payment()`.
 */
public class OutsourcedEmployee extends Employee {

    private double additionalCharge;

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        // Reaproveita cálculo base e adiciona um adicional com taxa
        return super.payment() + additionalCharge * 1.1;
    }

}
