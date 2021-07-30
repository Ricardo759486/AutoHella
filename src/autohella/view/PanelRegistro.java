package autohella.view;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelRegistro extends JPanel {

	private ImageIcon fondo, recFondo, img, recImg;
	private JLabel lblImagenFondo;
	private JButton btnMinimizar, btnCerrar;
	private Font fuente1;
	private JTextField txtReferencia, txtNombre, txtMarca, txtDescripcion, txtPrecio, txtCantidad;
	private Boton btnRegistro, btnEditar;

	public PanelRegistro() {

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

		img = new ImageIcon("recursos/btnAgregar.png");
		recImg = new ImageIcon(img.getImage().getScaledInstance(351, 66, Image.SCALE_DEFAULT));
		btnRegistro = new Boton();
		btnRegistro.setBounds(150, 560, 351, 66);
		btnRegistro.setBorderPainted(false);
		btnRegistro.setContentAreaFilled(false);
		btnRegistro.setFocusPainted(false);
		btnRegistro.setIcon(recImg);
		btnRegistro.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnRegistro.setActionCommand("INGRESARUSUARIO");
		add(btnRegistro);

		img = new ImageIcon("recursos/btnEditar.png");
		recImg = new ImageIcon(img.getImage().getScaledInstance(313, 66, Image.SCALE_DEFAULT));
		btnEditar = new Boton();
		btnEditar.setBounds(630, 560, 313, 66);
		btnEditar.setBorderPainted(false);
		btnEditar.setContentAreaFilled(false);
		btnEditar.setFocusPainted(false);
		btnEditar.setIcon(recImg);
		btnEditar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEditar.setActionCommand("INGRESARUSUARIO");
		add(btnEditar);

		fuente1 = new Font("Arial", Font.ITALIC, 15);

		txtReferencia = new JTextField();
		txtReferencia.setBounds(470, 175, 250, 35);
		txtReferencia.setFont(fuente1);
		add(txtReferencia);

		txtNombre = new JTextField();
		txtNombre.setBounds(470, 227, 250, 35);
		txtNombre.setFont(fuente1);
		add(txtNombre);

		txtMarca = new JTextField();
		txtMarca.setBounds(470, 283, 250, 35);
		txtMarca.setFont(fuente1);
		add(txtMarca);

		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(470, 343, 250, 35);
		txtDescripcion.setFont(fuente1);
		add(txtDescripcion);

		txtPrecio = new JTextField();
		txtPrecio.setBounds(470, 400, 250, 35);
		txtPrecio.setFont(fuente1);
		add(txtPrecio);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(470, 450, 250, 35);
		txtCantidad.setFont(fuente1);
		add(txtCantidad);

		fondo = new ImageIcon(getClass().getResource("/imagenes/fondoRegistro.jpg"));
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

	public Boton getBtnRegistro() {
		return btnRegistro;
	}

	public void setBtnRegistro(Boton btnRegistro) {
		this.btnRegistro = btnRegistro;
	}

	public Boton getBtnEditar() {
		return btnEditar;
	}

	public void setBtnEditar(Boton btnEditar) {
		this.btnEditar = btnEditar;
	}

}
