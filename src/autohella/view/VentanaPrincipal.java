package autohella.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

	private PanelEntrada panelEntrada;
	private PanelAlmacen panelAlmacen;
	private PanelInicio panelinicio;
//	private PanelJuego panelJuego;
//	private PanelFinal panelFinal;

	public VentanaPrincipal() {

		setTitle("Inventario - Auto Hella");
		setSize(1200, 700);
		setUndecorated(true);
		setIconImage(new ImageIcon("recursos/autoHellaLogo.jpg").getImage());
		inicializarComponentes();
		setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public void inicializarComponentes() {

		panelEntrada = new PanelEntrada();
		getContentPane().add(panelEntrada);

		panelAlmacen = new PanelAlmacen();
		getContentPane().add(panelAlmacen);

		panelinicio = new PanelInicio();
		getContentPane().add(panelinicio);

//		panelJuego = new PanelJuego();
//		getContentPane().add(panelJuego);
//
//		panelFinal = new PanelFinal();
//		getContentPane().add(panelFinal);

	}

	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}

	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.panelEntrada = panelEntrada;
	}

	public PanelAlmacen getPanelAlmacen() {
		return panelAlmacen;
	}

	public void setPanelAlmacen(PanelAlmacen panelAlmacen) {
		this.panelAlmacen = panelAlmacen;
	}

	public PanelInicio getPanelinicio() {
		return panelinicio;
	}

	public void setPanelinicio(PanelInicio panelinicio) {
		this.panelinicio = panelinicio;
	}

}
