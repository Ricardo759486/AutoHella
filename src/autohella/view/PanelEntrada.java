package autohella.view;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PanelEntrada extends JPanel {

	private ImageIcon fondo, recFondo, img, recImg;

	private JLabel lblImagenFondo;
	private JTextArea texto;
	private JScrollPane scrool;

	private JButton btnMinimizar, btnCerrar, btnEstanteAlargado, btnVitrina, btnVitrina2, btnVitrina3, btnVitrinaGrande,
			btnCorreas, btnCorreas2, btnBateria, btnEntrar;

	public PanelEntrada() {

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

		img = new ImageIcon("recursos/Vitrina_Alargada.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(220, 420, Image.SCALE_DEFAULT));
		btnEstanteAlargado = new JButton();
		btnEstanteAlargado.setBounds(860, 270, 220, 420);
		btnEstanteAlargado.setBorderPainted(false);
		btnEstanteAlargado.setContentAreaFilled(false);
		btnEstanteAlargado.setFocusPainted(false);
		btnEstanteAlargado.setIcon(recImg);
		btnEstanteAlargado.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEstanteAlargado.setActionCommand("EstanteAlargado");
		add(btnEstanteAlargado);

		img = new ImageIcon("recursos/Vitrina.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
		btnVitrina = new JButton();
		btnVitrina.setBounds(610, 440, 250, 250);
		btnVitrina.setBorderPainted(false);
		btnVitrina.setContentAreaFilled(false);
		btnVitrina.setFocusPainted(false);
		btnVitrina.setIcon(recImg);
		btnVitrina.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnVitrina.setActionCommand("Vitrina");
		add(btnVitrina);

		btnVitrina2 = new JButton();
		btnVitrina2.setBounds(360, 440, 250, 250);
		btnVitrina2.setBorderPainted(false);
		btnVitrina2.setContentAreaFilled(false);
		btnVitrina2.setFocusPainted(false);
		btnVitrina2.setIcon(recImg);
		btnVitrina2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnVitrina2.setActionCommand("Vitrina2");
		add(btnVitrina2);

		img = new ImageIcon("recursos/vitrinaGrande.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(350, 400, Image.SCALE_DEFAULT));
		btnVitrinaGrande = new JButton();
		btnVitrinaGrande.setBounds(10, 290, 350, 400);
		btnVitrinaGrande.setBorderPainted(false);
		btnVitrinaGrande.setContentAreaFilled(false);
		btnVitrinaGrande.setFocusPainted(false);
		btnVitrinaGrande.setIcon(recImg);
		btnVitrinaGrande.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnVitrinaGrande.setActionCommand("VitrinaGrande");
		add(btnVitrinaGrande);

		img = new ImageIcon("recursos/Vitrina.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
		btnVitrina3 = new JButton();
		btnVitrina3.setBounds(10, 20, 150, 150);
		btnVitrina3.setBorderPainted(false);
		btnVitrina3.setContentAreaFilled(false);
		btnVitrina3.setFocusPainted(false);
		btnVitrina3.setIcon(recImg);
		btnVitrina3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnVitrina3.setActionCommand("Vitrina3");
		add(btnVitrina3);

		img = new ImageIcon("recursos/fondoCorrea.jpeg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(330, 100, Image.SCALE_DEFAULT));
		btnCorreas = new JButton();
		btnCorreas.setBounds(158, 20, 330, 100);
		btnCorreas.setBorderPainted(false);
		btnCorreas.setContentAreaFilled(false);
		btnCorreas.setFocusPainted(false);
		btnCorreas.setIcon(recImg);
		btnCorreas.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCorreas.setActionCommand("Correas");
		add(btnCorreas);

		img = new ImageIcon("recursos/fondoCorrea.jpeg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(370, 100, Image.SCALE_DEFAULT));
		btnCorreas2 = new JButton();
		btnCorreas2.setBounds(710, 20, 370, 100);
		btnCorreas2.setBorderPainted(false);
		btnCorreas2.setContentAreaFilled(false);
		btnCorreas2.setFocusPainted(false);
		btnCorreas2.setIcon(recImg);
		btnCorreas2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCorreas2.setActionCommand("Correas2");
		add(btnCorreas2);

		img = new ImageIcon("recursos/bateria.png");
		recImg = new ImageIcon(img.getImage().getScaledInstance(179, 126, Image.SCALE_DEFAULT));
		btnBateria = new JButton();
		btnBateria.setBounds(20, 170, 179, 126);
		btnBateria.setBorderPainted(false);
		btnBateria.setContentAreaFilled(false);
		btnBateria.setFocusPainted(false);
		btnBateria.setIcon(recImg);
		btnBateria.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnBateria.setActionCommand("Bateria");
		add(btnBateria);

		img = new ImageIcon("recursos/entrar.png");
		recImg = new ImageIcon(img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		btnEntrar = new JButton();
		btnEntrar.setBounds(550, 20, 100, 100);
		btnEntrar.setBorderPainted(false);
		btnEntrar.setContentAreaFilled(false);
		btnEntrar.setFocusPainted(false);
		btnEntrar.setIcon(recImg);
		btnEntrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEntrar.setActionCommand("Entrar");
		add(btnEntrar);
		
		texto = new JTextArea("Por favor seleccioné el lugar donde se guardará el repuesto.");
		texto.setEditable(false);
		texto.setLineWrap(true);
		texto.setWrapStyleWord(true);
		texto.setOpaque(false);
		texto.setBackground(null);
		texto.setFont(new Font("Arial", Font.ITALIC, 30));
		scrool = new JScrollPane(texto);
		scrool.setBackground(null);
		scrool.setOpaque(false);
		scrool.getViewport().setOpaque(false);
		scrool.setBounds(440, 220, 320, 150);
		add(scrool);

		fondo = new ImageIcon(getClass().getResource("/imagenes/fondoEntrada.jpg"));
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

	public JButton getBtnEstanteAlargado() {
		return btnEstanteAlargado;
	}

	public void setBtnEstanteAlargado(JButton btnEstanteAlargado) {
		this.btnEstanteAlargado = btnEstanteAlargado;
	}

	public JButton getBtnVitrina() {
		return btnVitrina;
	}

	public void setBtnVitrina(JButton btnVitrina) {
		this.btnVitrina = btnVitrina;
	}

	public JButton getBtnVitrina2() {
		return btnVitrina2;
	}

	public void setBtnVitrina2(JButton btnVitrina2) {
		this.btnVitrina2 = btnVitrina2;
	}

	public JButton getBtnVitrina3() {
		return btnVitrina3;
	}

	public void setBtnVitrina3(JButton btnVitrina3) {
		this.btnVitrina3 = btnVitrina3;
	}

	public JButton getBtnVitrinaGrande() {
		return btnVitrinaGrande;
	}

	public void setBtnVitrinaGrande(JButton btnVitrinaGrande) {
		this.btnVitrinaGrande = btnVitrinaGrande;
	}

	public JButton getBtnCorreas() {
		return btnCorreas;
	}

	public void setBtnCorreas(JButton btnCorreas) {
		this.btnCorreas = btnCorreas;
	}

	public JButton getBtnCorreas2() {
		return btnCorreas2;
	}

	public void setBtnCorreas2(JButton btnCorreas2) {
		this.btnCorreas2 = btnCorreas2;
	}

	public JButton getBtnBateria() {
		return btnBateria;
	}

	public void setBtnBateria(JButton btnBateria) {
		this.btnBateria = btnBateria;
	}

	public JButton getBtnEntrar() {
		return btnEntrar;
	}

	public void setBtnEntrar(JButton btnEntrar) {
		this.btnEntrar = btnEntrar;
	}

}
