package autohella.view;

import java.awt.Cursor;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelInicio extends JPanel {

	private ImageIcon fondo, recFondo, img, recImg;

	private JLabel lblImagenFondo;

	private JButton btnMinimizar, btnCerrar, btnBuscar, btnRegistro, btnHome;

	public PanelInicio() {

		setLayout(null);
		setVisible(true);
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

		img = new ImageIcon("recursos/lupa.png");
		recImg = new ImageIcon(img.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		btnBuscar = new JButton();
		btnBuscar.setBounds(800, 270, 130, 130);
		btnBuscar.setBorderPainted(false);
		btnBuscar.setContentAreaFilled(false);
		btnBuscar.setFocusPainted(false);
		btnBuscar.setIcon(recImg);
		btnBuscar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnBuscar.setActionCommand("Buscar");
		add(btnBuscar);

		img = new ImageIcon("recursos/registro.png");
		recImg = new ImageIcon(img.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		btnRegistro = new JButton();
		btnRegistro.setBounds(300, 270, 120, 120);
		btnRegistro.setBorderPainted(false);
		btnRegistro.setContentAreaFilled(false);
		btnRegistro.setFocusPainted(false);
		btnRegistro.setIcon(recImg);
		btnRegistro.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnRegistro.setActionCommand("Registro");
		add(btnRegistro);

		img = new ImageIcon("recursos/inventario.png");
		recImg = new ImageIcon(img.getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT));
		btnHome = new JButton();
		btnHome.setBounds(555, 490, 120, 130);
		btnHome.setBorderPainted(false);
		btnHome.setContentAreaFilled(false);
		btnHome.setFocusPainted(false);
		btnHome.setIcon(recImg);
		btnHome.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnHome.setActionCommand("Home");
		add(btnHome);

		fondo = new ImageIcon(getClass().getResource("/imagenes/fondoPrincipal.jpg"));
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

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public JButton getBtnRegistro() {
		return btnRegistro;
	}

	public void setBtnRegistro(JButton btnRegistro) {
		this.btnRegistro = btnRegistro;
	}

	public JButton getBtnHome() {
		return btnHome;
	}

	public void setBtnHome(JButton btnHome) {
		this.btnHome = btnHome;
	}

}
