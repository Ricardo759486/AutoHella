package autohella.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.UIManager;
import autohella.model.Estante;
import autohella.model.Producto;
import autohella.view.VentanaPrincipal;

public class Controller implements ActionListener {

	private ArrayList<Estante> alEstante;

	private Producto producto;
	private Estante estante;
	// private Propiedades propiedades;
	// private Properties pDatos;
	private VentanaPrincipal ventanaPrincipal;
	private UIManager UI = new UIManager();

	public Controller() throws Exception {

		ventanaPrincipal = new VentanaPrincipal();

		asignarOyentes();

		alEstante = new ArrayList<Estante>();

		estante = new Estante();
		producto = new Producto();

		// propiedades = new Propiedades();
		// pDatos = new Properties();
		// pDatos = propiedades.leerDatos(new File("data\\preguntas.properties"));
		// alPregunta = propiedades.CargarDatos(pDatos);
		UI.put("OptionPane.background", Color.DARK_GRAY);
		UI.put("Panel.background", Color.DARK_GRAY);

	}

	public void asignarOyentes() {

		ventanaPrincipal.getPanelAlmacen().getBtnCerrar().addActionListener(this);
		ventanaPrincipal.getPanelAlmacen().getBtnMinimizar().addActionListener(this);
		ventanaPrincipal.getPanelAlmacen().getBtnEstante().addActionListener(this);
		ventanaPrincipal.getPanelAlmacen().getBtnEstante2().addActionListener(this);
		ventanaPrincipal.getPanelAlmacen().getBtnEstante3().addActionListener(this);
		ventanaPrincipal.getPanelAlmacen().getBtnEstante4().addActionListener(this);
		ventanaPrincipal.getPanelAlmacen().getBtnEstante5().addActionListener(this);
		ventanaPrincipal.getPanelAlmacen().getBtnEstante6().addActionListener(this);
		ventanaPrincipal.getPanelAlmacen().getBtnEstante7().addActionListener(this);
		ventanaPrincipal.getPanelAlmacen().getBtnEstante8().addActionListener(this);
		ventanaPrincipal.getPanelAlmacen().getBtnEstante9().addActionListener(this);
		ventanaPrincipal.getPanelAlmacen().getBtnEstante10().addActionListener(this);
		ventanaPrincipal.getPanelAlmacen().getBtnEstante11().addActionListener(this);
		ventanaPrincipal.getPanelAlmacen().getBtnCajonero().addActionListener(this);
		ventanaPrincipal.getPanelAlmacen().getBtnSalir().addActionListener(this);

		ventanaPrincipal.getPanelEntrada().getBtnCerrar().addActionListener(this);
		ventanaPrincipal.getPanelEntrada().getBtnMinimizar().addActionListener(this);
		ventanaPrincipal.getPanelEntrada().getBtnEstanteAlargado().addActionListener(this);
		ventanaPrincipal.getPanelEntrada().getBtnVitrina().addActionListener(this);
		ventanaPrincipal.getPanelEntrada().getBtnVitrina2().addActionListener(this);
		ventanaPrincipal.getPanelEntrada().getBtnVitrina3().addActionListener(this);
		ventanaPrincipal.getPanelEntrada().getBtnVitrinaGrande().addActionListener(this);
		ventanaPrincipal.getPanelEntrada().getBtnCorreas().addActionListener(this);
		ventanaPrincipal.getPanelEntrada().getBtnCorreas2().addActionListener(this);
		ventanaPrincipal.getPanelEntrada().getBtnBateria().addActionListener(this);
		ventanaPrincipal.getPanelEntrada().getBtnEntrar().addActionListener(this);

		ventanaPrincipal.getPanelinicio().getBtnCerrar().addActionListener(this);
		ventanaPrincipal.getPanelinicio().getBtnMinimizar().addActionListener(this);
		ventanaPrincipal.getPanelinicio().getBtnRegistro().addActionListener(this);
		ventanaPrincipal.getPanelinicio().getBtnBuscar().addActionListener(this);
		ventanaPrincipal.getPanelinicio().getBtnHome().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String comando = e.getActionCommand();

		if (comando.equals("MINIMIZARVENTANA")) {
			ventanaPrincipal.setExtendedState(JFrame.ICONIFIED);

		} else if (comando.equals("CERRARVENTANA")) {
			System.exit(0);
		}

//------------------------------------------Panel Principal-------------------------------------
		
		if (comando.equals("Home")) {

			ventanaPrincipal.getPanelEntrada().setVisible(true);
			ventanaPrincipal.getPanelinicio().setVisible(false);
		}

//----------------------------------------------------------------------------------------------
		
//------------------------------------------Panel Entrada-------------------------------------

		if (comando.equals("Entrar")) {

			ventanaPrincipal.getPanelAlmacen().setVisible(true);
			ventanaPrincipal.getPanelEntrada().setVisible(false);
		}
//----------------------------------------------------------------------------------------------

//------------------------------------------Panel Almacen-------------------------------------
		
		if (comando.equals("Salir")) {

			ventanaPrincipal.getPanelEntrada().setVisible(true);
			ventanaPrincipal.getPanelAlmacen().setVisible(false);
		}

//----------------------------------------------------------------------------------------------

	}

}
