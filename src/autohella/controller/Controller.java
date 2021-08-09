package autohella.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import autohella.model.Estante;
import autohella.model.Producto;
import autohella.persistence.Archivo;
import autohella.persistence.EstanteDAO;
import autohella.view.VentanaPrincipal;

public class Controller implements ActionListener {

	private ArrayList<Estante> alEstante;

	private Producto producto;
	private Estante estante;
	private File fileEstante;
	private Archivo archivo;
	private EstanteDAO estanteDAO;
	private VentanaPrincipal ventanaPrincipal;
	private UIManager UI = new UIManager();
	private int verificar = 0;

	public Controller() throws Exception {

		ventanaPrincipal = new VentanaPrincipal();
		alEstante = new ArrayList<Estante>();
		estante = new Estante();
		producto = new Producto();
		fileEstante = new File("datos\\estante.dat");
		archivo = new Archivo(fileEstante);
		estanteDAO = new EstanteDAO(archivo);
		alEstante = archivo.leerArchivo(fileEstante);
		asignarOyentes();
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
		ventanaPrincipal.getPanelAlmacen().getBtnInicio().addActionListener(this);

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
		ventanaPrincipal.getPanelEntrada().getBtnInicio().addActionListener(this);

		ventanaPrincipal.getPanelVista().getBtnCerrar().addActionListener(this);
		ventanaPrincipal.getPanelVista().getBtnMinimizar().addActionListener(this);
		ventanaPrincipal.getPanelVista().getBtnInicio().addActionListener(this);

		ventanaPrincipal.getPanelinicio().getBtnCerrar().addActionListener(this);
		ventanaPrincipal.getPanelinicio().getBtnMinimizar().addActionListener(this);
		ventanaPrincipal.getPanelinicio().getBtnRegistro().addActionListener(this);
		ventanaPrincipal.getPanelinicio().getBtnBuscar().addActionListener(this);
		ventanaPrincipal.getPanelinicio().getBtnHome().addActionListener(this);

		ventanaPrincipal.getPanelRegistro().getBtnCerrar().addActionListener(this);
		ventanaPrincipal.getPanelRegistro().getBtnMinimizar().addActionListener(this);
		ventanaPrincipal.getPanelRegistro().getBtnRegistro().addActionListener(this);
		ventanaPrincipal.getPanelRegistro().getBtnEditar().addActionListener(this);
		ventanaPrincipal.getPanelRegistro().getBtnInicio().addActionListener(this);

		ventanaPrincipal.getPanelPuestos().getBtnCerrar().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnMinimizar().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnInicio().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnLugar1().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnLugar2().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnLugar3().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnLugar4().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnLugar5().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnLugar6().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnLugar7().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnLugar8().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnLugar9().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon1().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon2().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon3().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon4().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon5().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon6().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon7().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon8().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon9().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon10().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon21().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon22().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon23().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon24().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon25().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon26().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon27().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon28().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon29().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon30().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon31().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon32().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon33().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon34().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon35().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon36().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon37().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon38().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon39().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon40().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon41().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon42().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon43().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon44().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon45().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon46().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon47().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon48().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon49().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon50().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon51().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon52().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon53().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon54().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon55().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon56().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon57().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon58().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon59().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon60().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon61().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon62().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon63().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon64().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon65().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon66().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon67().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon68().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon69().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon70().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon71().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon72().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon73().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon74().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon75().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon76().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon77().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon78().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon79().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon80().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon81().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon82().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon83().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon84().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon85().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon86().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon87().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon88().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon89().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon90().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon91().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon92().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon93().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon94().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon95().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon96().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon97().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon98().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon99().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon100().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon101().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon102().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon103().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon104().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon105().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon106().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon107().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon108().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon109().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon110().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon111().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon112().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon113().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon114().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon115().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon116().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon117().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon118().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon119().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon110().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon111().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon112().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon113().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon114().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon115().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon116().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon117().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon118().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon119().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon120().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon121().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon122().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon123().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon124().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon125().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon126().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon127().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon128().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon129().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon130().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon131().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon132().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon133().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon134().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon135().addActionListener(this);
		ventanaPrincipal.getPanelPuestos().getBtnCajon136().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String comando = e.getActionCommand();

		if (comando.equals("MINIMIZARVENTANA")) {
			ventanaPrincipal.setExtendedState(JFrame.ICONIFIED);

		} else if (comando.equals("CERRARVENTANA")) {
			System.exit(0);
		}

		if (comando.equals("Inicio")) {
			ventanaPrincipal.getPanelinicio().setVisible(true);
			ventanaPrincipal.getPanelAlmacen().setVisible(false);
			ventanaPrincipal.getPanelEntrada().setVisible(false);
			ventanaPrincipal.getPanelRegistro().setVisible(false);
			ventanaPrincipal.getPanelVista().setVisible(false);
		}

//------------------------------------------Panel Principal-------------------------------------

		if (comando.equals("Home")) {

			ventanaPrincipal.getPanelEntrada().setVisible(true);
			ventanaPrincipal.getPanelinicio().setVisible(false);
		}

		if (comando.equals("Buscar")) {

			ventanaPrincipal.getPanelVista().setVisible(true);
			ventanaPrincipal.getPanelVista().getPanelTabla()
					.actualizarTabla(estante.generarTablaApostador(estanteDAO.NumeroProducto(alEstante), alEstante));
			ventanaPrincipal.getPanelinicio().setVisible(false);
		}

		if (comando.equals("Registro")) {

			ventanaPrincipal.getPanelRegistro().getTxtReferencia().setText("");
			ventanaPrincipal.getPanelRegistro().getTxtNombre().setText("");
			ventanaPrincipal.getPanelRegistro().getTxtMarca().setText("");
			ventanaPrincipal.getPanelRegistro().getTxtDescripcion().setText("");
			ventanaPrincipal.getPanelRegistro().getTxtPrecio().setText("");
			ventanaPrincipal.getPanelRegistro().getTxtCantidad().setText("");

			ventanaPrincipal.getPanelRegistro().setVisible(true);
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

//------------------------------------------Panel Registro-------------------------------------

		if (comando.equals("Registrar")) {

			if (!"".equals(ventanaPrincipal.getPanelRegistro().getTxtReferencia().getText())
					&& !"".equals(ventanaPrincipal.getPanelRegistro().getTxtNombre().getText())
					&& !"".equals(ventanaPrincipal.getPanelRegistro().getTxtMarca().getText())
					&& !"".equals(ventanaPrincipal.getPanelRegistro().getTxtDescripcion().getText())
					&& !"".equals(ventanaPrincipal.getPanelRegistro().getTxtPrecio().getText())
					&& !"".equals(ventanaPrincipal.getPanelRegistro().getTxtCantidad().getText())) {

				String pReferencia = ventanaPrincipal.getPanelRegistro().getTxtReferencia().getText();
				String pNombre = ventanaPrincipal.getPanelRegistro().getTxtNombre().getText();
				String pMarca = ventanaPrincipal.getPanelRegistro().getTxtMarca().getText();
				String pDescripcion = ventanaPrincipal.getPanelRegistro().getTxtDescripcion().getText();
				int pPrecio = Integer.parseInt(ventanaPrincipal.getPanelRegistro().getTxtPrecio().getText());
				int pCantidad = Integer.parseInt(ventanaPrincipal.getPanelRegistro().getTxtCantidad().getText());
				
				

//				Producto producto = new Producto(pReferencia, pNombre, pMarca, pDescripcion, pPrecio, pCantidad);
//
//				if (estanteDAO.agregarProducto(producto, pNombre, pCantidad, alEstante, fileEstante)) {
//
//					JOptionPane.showMessageDialog(null, "Registro con éxito", "Información",
//							JOptionPane.INFORMATION_MESSAGE);
//
//					ventanaPrincipal.getPanelRegistro().getTxtReferencia().setText("");
//					ventanaPrincipal.getPanelRegistro().getTxtNombre().setText("");
//					ventanaPrincipal.getPanelRegistro().getTxtMarca().setText("");
//					ventanaPrincipal.getPanelRegistro().getTxtDescripcion().setText("");
//					ventanaPrincipal.getPanelRegistro().getTxtPrecio().setText("");
//					ventanaPrincipal.getPanelRegistro().getTxtCantidad().setText("");
//				} else {
//					
//					JOptionPane.showMessageDialog(null,
//							"Ya existe un producto con esa referencia/nPor favor verifique.", "Error",
//							JOptionPane.ERROR_MESSAGE);
//				}

			} else {
				JOptionPane.showMessageDialog(null, "No puede dejar campos sin llenar", "Error",
						JOptionPane.WARNING_MESSAGE);
			}
		}

		if (comando.equals("Editar")) {

		}

//----------------------------------------------------------------------------------------------

//------------------------------------------Panel Vista(Busqueda)-------------------------------------

//----------------------------------------------------------------------------------------------

	}

}
