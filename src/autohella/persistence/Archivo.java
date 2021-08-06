package autohella.persistence;

import java.io.*;
import java.util.*;

import autohella.model.*;

public class Archivo {

	private ObjectInputStream entrada;
	private ObjectOutputStream salida;

	public Archivo() {

	}

	public Archivo(File archivo) {

		if (archivo.exists()) {

		} else {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void escribirEnArchivo(ArrayList<Estante> alEstante, File archivo) {

		try {
			salida = new ObjectOutputStream(new FileOutputStream(archivo));
			salida.writeObject(alEstante);
			salida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void escribirEnArchivoCajonero(ArrayList<Cajonero> alCajonero, File archivo) {

		try {
			salida = new ObjectOutputStream(new FileOutputStream(archivo));
			salida.writeObject(alCajonero);
			salida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Estante> leerArchivo(File archivo) {

		ArrayList<Estante> alApostador = new ArrayList<Estante>();

		if (archivo.length() != 0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(archivo));
				alApostador = (ArrayList<Estante>) entrada.readObject();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return alApostador;
	}

	public ArrayList<Cajonero> leerArchivoCajonero(File archivo) {

		ArrayList<Cajonero> alCajonero = new ArrayList<Cajonero>();

		if (archivo.length() != 0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(archivo));
				alCajonero = (ArrayList<Cajonero>) entrada.readObject();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return alCajonero;
	}

}
