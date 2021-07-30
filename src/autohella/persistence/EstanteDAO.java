package autohella.persistence;

import java.io.*;
import java.util.*;

import autohella.model.Estante;
import autohella.model.Producto;

public class EstanteDAO {

	private Archivo archivo;

	public EstanteDAO(Archivo archivo) {

		this.archivo = archivo;
		verificarInvariante();
	}

	public EstanteDAO() {

	}

	public String buscarProducto(String pReferencia, ArrayList<Estante> alEstante) {

		String encontrado = "";

		for (int i = 0; i < alEstante.size(); i++) {
			for (int j = 0; j < alEstante.get(i).getEstante().size(); j++) {
				for (int k = 0; k < alEstante.get(i).getEstante().get(j).size(); k++) {
					if (alEstante.get(i).getEstante().get(j).get(k).getReferencia().equals(pReferencia)) {
						encontrado = "" + i + j + k;
					}
				}
			}
		}
		return encontrado;
	}
	
	public int NumeroProducto(ArrayList<Estante> alEstante) {

		int encontrado = 0;

		for (int i = 0; i < alEstante.size(); i++) {
			for (int j = 0; j < alEstante.get(i).getEstante().size(); j++) {
				for (int k = 0; k < alEstante.get(i).getEstante().get(j).size(); k++) {
					encontrado++;
				}
			}
		}
		return encontrado;
	}

	public void agregarEstantes(File file, ArrayList<Estante> alEstante) {

		List<List<Producto>> estante = new ArrayList<List<Producto>>();

		List<Producto> uno = new ArrayList<Producto>();
		List<Producto> dos = new ArrayList<Producto>();
		List<Producto> tres = new ArrayList<Producto>();
		List<Producto> cuatro = new ArrayList<Producto>();
		List<Producto> cinco = new ArrayList<Producto>();
		List<Producto> seis = new ArrayList<Producto>();
		List<Producto> siete = new ArrayList<Producto>();
		List<Producto> ocho = new ArrayList<Producto>();
		List<Producto> nueve = new ArrayList<Producto>();
		List<Producto> diez = new ArrayList<Producto>();
		List<Producto> once = new ArrayList<Producto>();

		estante.add(uno);
		estante.add(dos);
		estante.add(tres);
		estante.add(cuatro);
		estante.add(cinco);
		estante.add(seis);
		estante.add(siete);
		estante.add(ocho);

		Estante vitrinaDerecha = new Estante("Vitrina Derecha", estante);
		alEstante.add(vitrinaDerecha);

		estante.clear();
		estante.add(uno);
		estante.add(dos);
		estante.add(tres);
		estante.add(cuatro);

		Estante vitrinaCentralDerecha = new Estante("Vitrina Central Derecha", estante);
		alEstante.add(vitrinaCentralDerecha);
		Estante vitrinaCentralIzquierda = new Estante("Vitrina Central Izquierda", estante);
		alEstante.add(vitrinaCentralIzquierda);

		estante.clear();
		estante.add(uno);
		estante.add(dos);
		estante.add(tres);
		estante.add(cuatro);
		estante.add(cinco);
		estante.add(seis);
		estante.add(siete);
		estante.add(ocho);
		estante.add(nueve);

		Estante vitrinaIzquierda = new Estante("Vitrina Izquierda", estante);
		alEstante.add(vitrinaIzquierda);

		estante.clear();
		estante.add(uno);
		estante.add(dos);
		estante.add(tres);
		estante.add(cuatro);
		estante.add(cinco);
		estante.add(seis);

		Estante baterias = new Estante("Baterias", estante);
		alEstante.add(baterias);

		estante.clear();
		estante.add(uno);
		estante.add(dos);
		estante.add(tres);

		Estante vitrinaAtras = new Estante("Vitrina Trasera", estante);
		alEstante.add(vitrinaAtras);

		estante.clear();
		estante.add(uno);
		estante.add(dos);
		estante.add(tres);
		estante.add(cuatro);
		estante.add(cinco);
		estante.add(seis);
		estante.add(siete);
		estante.add(ocho);
		estante.add(nueve);

		Estante correasDerivados = new Estante("Correas y Derivados", estante);
		alEstante.add(correasDerivados);

		estante.clear();
		estante.add(uno);
		estante.add(dos);
		estante.add(tres);
		estante.add(cuatro);
		estante.add(cinco);
		estante.add(seis);
		estante.add(siete);

		Estante estanteUno = new Estante("Estante N°1", estante);
		alEstante.add(estanteUno);

		estante.clear();
		estante.add(uno);
		estante.add(dos);
		estante.add(tres);
		estante.add(cuatro);
		estante.add(cinco);
		estante.add(seis);
		estante.add(siete);

		Estante estanteDos = new Estante("Estante N°2", estante);
		alEstante.add(estanteDos);

		estante.clear();
		estante.add(uno);
		estante.add(dos);
		estante.add(tres);
		estante.add(cuatro);
		estante.add(cinco);
		estante.add(seis);
		estante.add(siete);
		estante.add(ocho);

		Estante estanteTres = new Estante("Estante N°3", estante);
		alEstante.add(estanteTres);

		estante.clear();
		estante.add(uno);
		estante.add(dos);
		estante.add(tres);
		estante.add(cuatro);
		estante.add(cinco);
		estante.add(seis);
		estante.add(siete);
		estante.add(ocho);

		Estante estanteCuatro = new Estante("Estante N°4", estante);
		alEstante.add(estanteCuatro);

		estante.clear();
		estante.add(uno);
		estante.add(dos);
		estante.add(tres);
		estante.add(cuatro);
		estante.add(cinco);
		estante.add(seis);
		estante.add(siete);
		estante.add(ocho);

		Estante estanteCinco = new Estante("Estante N°5", estante);
		alEstante.add(estanteCinco);

		estante.clear();
		estante.add(uno);
		estante.add(dos);
		estante.add(tres);
		estante.add(cuatro);
		estante.add(cinco);
		estante.add(seis);

		Estante estanteSeis = new Estante("Estante N°6", estante);
		alEstante.add(estanteSeis);

		estante.clear();
		estante.add(uno);
		estante.add(dos);
		estante.add(tres);
		estante.add(cuatro);
		estante.add(cinco);

		Estante estanteSiete = new Estante("Estante N°7", estante);
		alEstante.add(estanteSiete);

		estante.clear();
		estante.add(uno);
		estante.add(dos);
		estante.add(tres);
		estante.add(cuatro);
		estante.add(cinco);

		Estante estanteOcho = new Estante("Estante N°8", estante);
		alEstante.add(estanteOcho);

		estante.clear();
		estante.add(uno);
		estante.add(dos);
		estante.add(tres);
		estante.add(cuatro);
		estante.add(cinco);
		estante.add(seis);

		Estante estanteNueve = new Estante("Estante N°9", estante);
		alEstante.add(estanteNueve);

		estante.clear();
		estante.add(uno);
		estante.add(dos);
		estante.add(tres);
		estante.add(cuatro);
		estante.add(cinco);
		estante.add(seis);
		estante.add(siete);
		estante.add(ocho);

		Estante estanteDiez = new Estante("Estante N°10", estante);
		alEstante.add(estanteDiez);

		estante.clear();
		estante.add(uno);
		estante.add(dos);
		estante.add(tres);
		estante.add(cuatro);
		estante.add(cinco);
		estante.add(seis);

		Estante estanteOnce = new Estante("Estante N°11", estante);
		alEstante.add(estanteOnce);

		estante.clear();
		estante.add(uno);
		estante.add(dos);
		estante.add(tres);
		estante.add(cuatro);
		estante.add(cinco);
		estante.add(seis);
		estante.add(siete);
		estante.add(ocho);
		estante.add(nueve);
		estante.add(diez);
		estante.add(once);

		Estante Cajonero = new Estante("Cajonero", estante);
		alEstante.add(Cajonero);

		archivo.escribirEnArchivo(alEstante, file);

	}

	public boolean agregarProducto(Producto producto, String nombre, int posicion, ArrayList<Estante> alEstante,
			File file) {

		boolean encontrado = false;

		for (int i = 0; i < alEstante.size(); i++) {

			if (alEstante.get(i).getNombre().equals(nombre)) {

				alEstante.get(i).getEstante().get(posicion).add(producto);
				file.delete();
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				archivo.escribirEnArchivo(alEstante, file);
				encontrado = true;
				break;
			} else {
				encontrado = false;
			}
		}
		return encontrado;
	}

	public boolean editarProducto(Producto producto, String referencia, String nombre, int posicion,
			ArrayList<Estante> alEstante, File file) {

		boolean encontrado = false;

		for (int i = 0; i < alEstante.size(); i++) {
			if (alEstante.get(i).getNombre().equals(nombre)) {
				for (int j = 0; j < alEstante.get(i).getEstante().get(posicion).size(); j++) {
					if (alEstante.get(i).getEstante().get(posicion).get(j).getReferencia().equals(referencia)) {

						alEstante.get(i).getEstante().get(posicion).get(j).setReferencia(producto.getReferencia());
						alEstante.get(i).getEstante().get(posicion).get(j).setNombre(producto.getNombre());
						alEstante.get(i).getEstante().get(posicion).get(j).setMarca(producto.getMarca());
						alEstante.get(i).getEstante().get(posicion).get(j).setDescripcion(producto.getDescripcion());
						alEstante.get(i).getEstante().get(posicion).get(j).setCantidad(producto.getCantidad());
						alEstante.get(i).getEstante().get(posicion).get(j).setPrecio(producto.getPrecio());
					}
				}

				file.delete();
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				archivo.escribirEnArchivo(alEstante, file);
				encontrado = true;
				break;
			} else {
				encontrado = false;
			}
		}
		return encontrado;
	}

	public boolean eliminarApostador(String pReferencia, ArrayList<Estante> alEstante, File file) {

		boolean verificar = false;

		try {

			String eliminar = buscarProducto(pReferencia, alEstante);

			if (eliminar != "") {
				alEstante.get(Integer.parseInt(eliminar.substring(0, 1))).getEstante()
						.get(Integer.parseInt(eliminar.substring(1, 2)))
						.remove(Integer.parseInt(eliminar.substring(2, 3)));
				file.delete();
				file.createNewFile();
				archivo.escribirEnArchivo(alEstante, file);
				verificar = true;
			} else {

				verificar = false;
			}
			return verificar;

		} catch (Exception e) {

		}
		return verificar;

	}

//	public String verApostador(ArrayList<Apostador> alApostador, String pCedula) {
//
//		String texto = "";
//
//		Apostador mostrar = buscarApostador(pCedula, alApostador);
//
//		for (int i = 0; i < alApostador.size(); i++) {
//
//			if (alApostador.get(i).equals(mostrar)) {
//
//				texto = (alApostador.get(i).getNombre() + "\n" + alApostador.get(i).getCedula() + "\n"
//						+ alApostador.get(i).getSede() + "\n" + alApostador.get(i).getDireccion() + "\n"
//						+ alApostador.get(i).getCelular() + "\n" + alApostador.get(i).getGanancias() + "\n"
//						+ "------------------------------" + "\n");
//			}
//		}
//
//		return texto;
//
//	}
//
//	public String verApostadorTotal(ArrayList<Apostador> alApostador) {
//
//		String texto = "";
//
//		for (int i = 0; i < alApostador.size(); i++) {
//
//			texto = (alApostador.get(i).getNombre() + "\n" + alApostador.get(i).getCedula() + "\n"
//					+ alApostador.get(i).getSede() + "\n" + alApostador.get(i).getDireccion() + "\n"
//					+ alApostador.get(i).getCelular() + "\n" + alApostador.get(i).getGanancias() + "\n"
//					+ "------------------------------" + "\n");
//
//		}
//
//		return texto;
//
//	}

	private void verificarInvariante() {

		assert archivo != null : "El archivo con el que se va ha trabajar no puede ser null";

	}

}
