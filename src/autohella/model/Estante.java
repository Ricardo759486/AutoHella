package autohella.model;

import java.util.ArrayList;
import java.util.List;

public class Estante {

	private String nombre;

	private List<List<Producto>> estante;

	public Estante() {
	}

	public Estante(String nombre, List<List<Producto>> estante) {
		this.nombre = nombre;
		this.estante = estante;
	}

	public String[][] generarTablaApostador(int numeroProducto, ArrayList<Estante> alEstante) {

		String salida[][] = new String[numeroProducto][6];
		int contador = 0;

		for (int i = 0; i < alEstante.size(); i++) {
			for (int j = 0; j < alEstante.get(i).getEstante().size(); j++) {
				for (int k = 0; k < alEstante.get(i).getEstante().get(j).size(); k++) {
					salida[contador][0] = alEstante.get(i).getEstante().get(j).get(k).getReferencia();
					salida[contador][1] = alEstante.get(i).getEstante().get(j).get(k).getNombre();
					salida[contador][2] = alEstante.get(i).getEstante().get(j).get(k).getMarca();
					salida[contador][3] = alEstante.get(i).getEstante().get(j).get(k).getDescripcion();
					salida[contador][4] = "" + alEstante.get(i).getEstante().get(j).get(k).getCantidad();
					salida[contador][5] = "" + alEstante.get(i).getEstante().get(j).get(k).getPrecio();
					contador++;
				}
			}
		}
		return salida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<List<Producto>> getEstante() {
		return estante;
	}

	public void setEstante(List<List<Producto>> estante) {
		this.estante = estante;
	}

}
