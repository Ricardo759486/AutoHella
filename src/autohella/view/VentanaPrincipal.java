package autohella.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

	private PanelEntrada panelEntrada;
	private PanelAlmacen panelAlmacen;
	private PanelInicio panelinicio;
	private PanelVista panelVista;
	private PanelRegistro panelRegistro;
	private PanelPuestos panelPuestos;

	public VentanaPrincipal() {

		setTitle("Inventario - Auto Hella");
		setSize(1200, 700);
		//setSize(1350, 700);
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

		panelVista = new PanelVista();
		getContentPane().add(panelVista);

		panelRegistro = new PanelRegistro();
		getContentPane().add(panelRegistro);

		panelPuestos = new PanelPuestos();
		getContentPane().add(panelPuestos);

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

	public PanelVista getPanelVista() {
		return panelVista;
	}

	public void setPanelVista(PanelVista panelVista) {
		this.panelVista = panelVista;
	}

	public PanelRegistro getPanelRegistro() {
		return panelRegistro;
	}

	public void setPanelRegistro(PanelRegistro panelRegistro) {
		this.panelRegistro = panelRegistro;
	}

	public PanelPuestos getPanelPuestos() {
		return panelPuestos;
	}

	public void setPanelPuestos(PanelPuestos panelPuestos) {
		this.panelPuestos = panelPuestos;
	}

}
