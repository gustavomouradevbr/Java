package entities;

import java.time.LocalDate;

/**
 * Entidade de cliente usada no pedido.
 *
 * <p>Separar cliente em uma classe propria facilita depuracao, pois os dados
 * pessoais ficam desacoplados dos itens e do status do pedido.</p>
 */
public class Client {

	private String name;

	private String email;

	private LocalDate birthDate;

	public Client() {
	}

	public Client(String name, String email, LocalDate birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return name + " (" + email + ")";
	}

}

