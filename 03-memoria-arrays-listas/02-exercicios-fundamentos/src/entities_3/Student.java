package entities_3;

/**
 * Modelo de aluno para exercicio de notas e status final.
 */
public class Student {

	private String name;
	private Double firstNote;
	private Double secondNote;
	private Double thirdNote;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getFirstNote() {
		return firstNote;
	}

	public void setFirstNote(Double firstNote) {
		this.firstNote = firstNote;
	}

	public Double getSecondNote() {
		return secondNote;
	}

	public void setSecondNote(Double secondNote) {
		this.secondNote = secondNote;
	}

	public Double getThirdNote() {
		return thirdNote;
	}

	public void setThirdNote(Double thirdNote) {
		this.thirdNote = thirdNote;
	}

	/**
	 * Usa soma simples para destacar o calculo de nota final no exercicio.
	 */
	public Double totalScore() {
		return firstNote + secondNote + thirdNote;
	}

	public void showStatus() {
		double finalNote = totalScore();

		if (finalNote >= 90) {
			System.out.println("FINAL GRADE = " + finalNote);
			System.out.println("PASS");
		}
		else {
			System.out.println("FINAL GRADE = " + finalNote);
			System.out.println("FAILED");
		}
	}
}

