package autohella.view;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PanelVista extends JPanel {

	private ImageIcon fondo, recFondo, img, recImg;
	private JLabel lblImagenFondo;
	private JButton btnMinimizar, btnCerrar;
	private Font fuente1;
	private JTextField txtReferencia, txtNombre, txtMarca, txtDescripcion, txtPrecio, txtCantidad;
	private Boton btnEditar, btnEliminar, btnAlmacen;
	private Boton btnInicio;

	private PanelTabla panelTabla;

	public PanelVista() {

		setLayout(null);
		setVisible(false);
		setSize(1200, 700);
		inicializarComponentes();
	}

	public void inicializarComponentes() {

		img = new ImageIcon("recursos/minimizar.png");
		recImg = new ImageIcon(img.getImage().getScaledInstance(37, 37, Image.SCALE_DEFAULT));
		btnMinimizar = new JButton();
		btnMinimizar.setBounds(1085, 1, 70, 70);
		btnMinimizar.setBorderPainted(false);
		btnMinimizar.setContentAreaFilled(false);
		btnMinimizar.setFocusPainted(false);
		btnMinimizar.setIcon(recImg);
		btnMinimizar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnMinimizar.setActionCommand("MINIMIZARVENTANA");
		add(btnMinimizar);

		img = new ImageIcon("recursos/cerrar.png");
		recImg = new ImageIcon(img.getImage().getScaledInstance(37, 37, Image.SCALE_DEFAULT));
		btnCerrar = new JButton();
		btnCerrar.setBounds(1130, 1, 70, 70);
		btnCerrar.setBorderPainted(false);
		btnCerrar.setContentAreaFilled(false);
		btnCerrar.setFocusPainted(false);
		btnCerrar.setIcon(recImg);
		btnCerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCerrar.setActionCommand("CERRARVENTANA");
		add(btnCerrar);

		img = new ImageIcon("recursos/btnMostrarAlmacen.png");
		recImg = new ImageIcon(img.getImage().getScaledInstance(400, 72, Image.SCALE_DEFAULT));
		btnAlmacen = new Boton();
		btnAlmacen.setBounds(20, 450, 417, 72);
		btnAlmacen.setBorderPainted(false);
		btnAlmacen.setContentAreaFilled(false);
		btnAlmacen.setFocusPainted(false);
		btnAlmacen.setIcon(recImg);
		btnAlmacen.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnAlmacen.setActionCommand("INGRESARUSUARIO");
		add(btnAlmacen);

		img = new ImageIcon("recursos/btnEditarProducto.png");
		recImg = new ImageIcon(img.getImage().getScaledInstance(353, 72, Image.SCALE_DEFAULT));
		btnEditar = new Boton();
		btnEditar.setBounds(445, 550, 353, 72);
		btnEditar.setBorderPainted(false);
		btnEditar.setContentAreaFilled(false);
		btnEditar.setFocusPainted(false);
		btnEditar.setIcon(recImg);
		btnEditar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEditar.setActionCommand("INGRESARUSUARIO");
		add(btnEditar);

		img = new ImageIcon("recursos/btnEliminarProducto.png");
		recImg = new ImageIcon(img.getImage().getScaledInstance(388, 72, Image.SCALE_DEFAULT));
		btnEliminar = new Boton();
		btnEliminar.setBounds(806, 550, 388, 72);
		btnEliminar.setBorderPainted(false);
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setFocusPainted(false);
		btnEliminar.setIcon(recImg);
		btnEliminar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEliminar.setActionCommand("INGRESARUSUARIO");
		add(btnEliminar);

		fuente1 = new Font("Arial", Font.ITALIC, 15);

		txtReferencia = new JTextField();
		txtReferencia.setBounds(210, 145, 250, 35);
		txtReferencia.setFont(fuente1);
		add(txtReferencia);

		txtNombre = new JTextField();
		txtNombre.setBounds(210, 187, 250, 35);
		txtNombre.setFont(fuente1);
		add(txtNombre);

		txtMarca = new JTextField();
		txtMarca.setBounds(210, 228, 250, 35);
		txtMarca.setFont(fuente1);
		add(txtMarca);

		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(210, 273, 250, 35);
		txtDescripcion.setFont(fuente1);
		add(txtDescripcion);

		txtPrecio = new JTextField();
		txtPrecio.setBounds(210, 315, 250, 35);
		txtPrecio.setFont(fuente1);
		add(txtPrecio);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(210, 360, 250, 35);
		txtCantidad.setFont(fuente1);
		add(txtCantidad);

		img = new ImageIcon("recursos/inicio.png");
		recImg = new ImageIcon(img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		btnInicio = new Boton();
		btnInicio.setBounds(13, 590, 100, 100);
		btnInicio.setBorderPainted(false);
		btnInicio.setContentAreaFilled(false);
		btnInicio.setFocusPainted(false);
		btnInicio.setIcon(recImg);
		btnInicio.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnInicio.setActionCommand("Inicio");
		add(btnInicio);

		panelTabla = new PanelTabla();
		panelTabla.setBounds(480, 145, 700, 300);
		add(panelTabla);

		fondo = new ImageIcon(getClass().getResource("/imagenes/fondoVintage.jpg"));
		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(1200, 700, Image.SCALE_SMOOTH));
		lblImagenFondo = new JLabel(recFondo);
		lblImagenFondo.setSize(1200, 700);
		add(lblImagenFondo);

	}

	public ImageIcon getFondo() {
		return fondo;
	}

	public void setFondo(ImageIcon fondo) {
		this.fondo = fondo;
	}

	public ImageIcon getRecFondo() {
		return recFondo;
	}

	public void setRecFondo(ImageIcon recFondo) {
		this.recFondo = recFondo;
	}

	public ImageIcon getImg() {
		return img;
	}

	public void setImg(ImageIcon img) {
		this.img = img;
	}

	public ImageIcon getRecImg() {
		return recImg;
	}

	public void setRecImg(ImageIcon recImg) {
		this.recImg = recImg;
	}

	public JLabel getLblImagenFondo() {
		return lblImagenFondo;
	}

	public void setLblImagenFondo(JLabel lblImagenFondo) {
		this.lblImagenFondo = lblImagenFondo;
	}

	public JButton getBtnMinimizar() {
		return btnMinimizar;
	}

	public void setBtnMinimizar(JButton btnMinimizar) {
		this.btnMinimizar = btnMinimizar;
	}

	public JButton getBtnCerrar() {
		return btnCerrar;
	}

	public void setBtnCerrar(JButton btnCerrar) {
		this.btnCerrar = btnCerrar;
	}

	public Font getFuente1() {
		return fuente1;
	}

	public void setFuente1(Font fuente1) {
		this.fuente1 = fuente1;
	}

	public JTextField getTxtReferencia() {
		return txtReferencia;
	}

	public void setTxtReferencia(JTextField txtReferencia) {
		this.txtReferencia = txtReferencia;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtMarca() {
		return txtMarca;
	}

	public void setTxtMarca(JTextField txtMarca) {
		this.txtMarca = txtMarca;
	}

	public JTextField getTxtDescripcion() {
		return txtDescripcion;
	}

	public void setTxtDescripcion(JTextField txtDescripcion) {
		this.txtDescripcion = txtDescripcion;
	}

	public JTextField getTxtPrecio() {
		return txtPrecio;
	}

	public void setTxtPrecio(JTextField txtPrecio) {
		this.txtPrecio = txtPrecio;
	}

	public JTextField getTxtCantidad() {
		return txtCantidad;
	}

	public void setTxtCantidad(JTextField txtCantidad) {
		this.txtCantidad = txtCantidad;
	}

	public Boton getBtnEditar() {
		return btnEditar;
	}

	public void setBtnEditar(Boton btnEditar) {
		this.btnEditar = btnEditar;
	}

	public Boton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(Boton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public Boton getBtnAlmacen() {
		return btnAlmacen;
	}

	public void setBtnAlmacen(Boton btnAlmacen) {
		this.btnAlmacen = btnAlmacen;
	}

	public Boton getBtnInicio() {
		return btnInicio;
	}

	public void setBtnInicio(Boton btnInicio) {
		this.btnInicio = btnInicio;
	}

	public PanelTabla getPanelTabla() {
		return panelTabla;
	}

	public void setPanelTabla(PanelTabla panelTabla) {
		this.panelTabla = panelTabla;
	}

}
