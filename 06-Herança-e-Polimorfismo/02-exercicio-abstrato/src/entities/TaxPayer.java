package entities;

/**
 * Classe abstrata que define a estrutura comum de um contribuinte.
 * Força as subclasses a implementarem `tax()` — exemplo clássico de abstração.
 */
public abstract class TaxPayer {
    private String name;

    private Double anualIncome; // mantido nome original para compatibilidade com exemplos

    public abstract double tax();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public TaxPayer() {

    }

    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

}
