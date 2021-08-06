package autohella.model;

import java.util.List;

public class Cajonero {

	private List<List<List<Producto>>> estante;

	public Cajonero() {
	}

	public Cajonero(List<List<List<Producto>>> estante) {
		super();
		this.estante = estante;
	}

	public List<List<List<Producto>>> getEstante() {
		return estante;
	}

	public void setEstante(List<List<List<Producto>>> estante) {
		this.estante = estante;
	}

}
