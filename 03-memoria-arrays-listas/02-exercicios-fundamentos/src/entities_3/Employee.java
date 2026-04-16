package entities_3;

/**
 * Entidade de funcionario para exercicio de salario liquido.
 */
public class Employee {

	private String name;
	private Double grossSalary;
	private Double tax;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public double netSalary() {
		return grossSalary - tax;
	}

    public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}

    @Override
    public String toString() {
    	return name + ", $ " + String.format("%.2f", netSalary());
    }

}

