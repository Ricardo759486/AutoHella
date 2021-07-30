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

public class PanelAlmacen extends JPanel {

	private ImageIcon fondo, recFondo, img, recImg;

	private JLabel lblImagenFondo;
	private JTextArea texto;
	private JScrollPane scrool;

	private JButton btnMinimizar, btnCerrar, btnEstante, btnEstante2, btnEstante3, btnEstante4, btnEstante5,
			btnEstante6, btnEstante7, btnEstante8, btnEstante9, btnEstante10, btnEstante11, btnCajonero, btnSalir;

	public PanelAlmacen() {

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

		img = new ImageIcon("recursos/cajoneroH.jpeg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT));
		btnCajonero = new JButton();
		btnCajonero.setBounds(800, 200, 400, 500);
		btnCajonero.setBorderPainted(false);
		btnCajonero.setContentAreaFilled(false);
		btnCajonero.setFocusPainted(false);
		btnCajonero.setIcon(recImg);
		btnCajonero.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajonero.setActionCommand("Cajonero");
		add(btnCajonero);

		img = new ImageIcon("recursos/estanteAlmacen.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT));
		btnEstante = new JButton();
		btnEstante.setBounds(500, 550, 100, 150);
		btnEstante.setBorderPainted(false);
		btnEstante.setContentAreaFilled(false);
		btnEstante.setFocusPainted(false);
		btnEstante.setIcon(recImg);
		btnEstante.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEstante.setActionCommand("Estante");
		add(btnEstante);

		btnEstante2 = new JButton();
		btnEstante2.setBounds(500, 400, 100, 150);
		btnEstante2.setBorderPainted(false);
		btnEstante2.setContentAreaFilled(false);
		btnEstante2.setFocusPainted(false);
		btnEstante2.setIcon(recImg);
		btnEstante2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEstante2.setActionCommand("Estante2");
		add(btnEstante2);

		btnEstante3 = new JButton();
		btnEstante3.setBounds(250, 550, 100, 150);
		btnEstante3.setBorderPainted(false);
		btnEstante3.setContentAreaFilled(false);
		btnEstante3.setFocusPainted(false);
		btnEstante3.setIcon(recImg);
		btnEstante3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEstante3.setActionCommand("Estante3");
		add(btnEstante3);

		btnEstante4 = new JButton();
		btnEstante4.setBounds(250, 400, 100, 150);
		btnEstante4.setBorderPainted(false);
		btnEstante4.setContentAreaFilled(false);
		btnEstante4.setFocusPainted(false);
		btnEstante4.setIcon(recImg);
		btnEstante4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEstante4.setActionCommand("Estante4");
		add(btnEstante4);

		img = new ImageIcon("recursos/estanteAlmacenHorizontal.PNG");
		recImg = new ImageIcon(img.getImage().getScaledInstance(250, 100, Image.SCALE_DEFAULT));
		btnEstante5 = new JButton();
		btnEstante5.setBounds(0, 300, 250, 100);
		btnEstante5.setBorderPainted(false);
		btnEstante5.setContentAreaFilled(false);
		btnEstante5.setFocusPainted(false);
		btnEstante5.setIcon(recImg);
		btnEstante5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEstante5.setActionCommand("Estante5");
		add(btnEstante5);

		img = new ImageIcon("recursos/estanteAlmacen.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT));
		btnEstante6 = new JButton();
		btnEstante6.setBounds(0, 100, 100, 150);
		btnEstante6.setBorderPainted(false);
		btnEstante6.setContentAreaFilled(false);
		btnEstante6.setFocusPainted(false);
		btnEstante6.setIcon(recImg);
		btnEstante6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEstante6.setActionCommand("Estante6");
		add(btnEstante6);

		img = new ImageIcon("recursos/estanteAlmacenHorizontal.PNG");
		recImg = new ImageIcon(img.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT));
		btnEstante7 = new JButton();
		btnEstante7.setBounds(100, 0, 200, 100);
		btnEstante7.setBorderPainted(false);
		btnEstante7.setContentAreaFilled(false);
		btnEstante7.setFocusPainted(false);
		btnEstante7.setIcon(recImg);
		btnEstante7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEstante7.setActionCommand("Estante7");
		add(btnEstante7);

		btnEstante8 = new JButton();
		btnEstante8.setBounds(300, 0, 200, 100);
		btnEstante8.setBorderPainted(false);
		btnEstante8.setContentAreaFilled(false);
		btnEstante8.setFocusPainted(false);
		btnEstante8.setIcon(recImg);
		btnEstante8.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEstante8.setActionCommand("Estante8");
		add(btnEstante8);

		img = new ImageIcon("recursos/estanteAlmacen.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT));
		btnEstante9 = new JButton();
		btnEstante9.setBounds(500, 150, 100, 150);
		btnEstante9.setBorderPainted(false);
		btnEstante9.setContentAreaFilled(false);
		btnEstante9.setFocusPainted(false);
		btnEstante9.setIcon(recImg);
		btnEstante9.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEstante9.setActionCommand("Estante9");
		add(btnEstante9);

		btnEstante10 = new JButton();
		btnEstante10.setBounds(500, 0, 100, 150);
		btnEstante10.setBorderPainted(false);
		btnEstante10.setContentAreaFilled(false);
		btnEstante10.setFocusPainted(false);
		btnEstante10.setIcon(recImg);
		btnEstante10.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEstante10.setActionCommand("Estante10");
		add(btnEstante10);

		img = new ImageIcon("recursos/estanteAlmacenHorizontal.PNG");
		recImg = new ImageIcon(img.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT));
		btnEstante11 = new JButton();
		btnEstante11.setBounds(600, 0, 200, 100);
		btnEstante11.setBorderPainted(false);
		btnEstante11.setContentAreaFilled(false);
		btnEstante11.setFocusPainted(false);
		btnEstante11.setIcon(recImg);
		btnEstante11.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEstante11.setActionCommand("Estante11");
		add(btnEstante11);

		img = new ImageIcon("recursos/salida.png");
		recImg = new ImageIcon(img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		btnSalir = new JButton();
		btnSalir.setBounds(650, 580, 100, 100);
		btnSalir.setBorderPainted(false);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setFocusPainted(false);
		btnSalir.setIcon(recImg);
		btnSalir.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnSalir.setActionCommand("Salir");
		add(btnSalir);

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
		scrool.setBounds(130, 120, 320, 150);
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

	public JButton getBtnEstante() {
		return btnEstante;
	}

	public void setBtnEstante(JButton btnEstante) {
		this.btnEstante = btnEstante;
	}

	public JButton getBtnEstante2() {
		return btnEstante2;
	}

	public void setBtnEstante2(JButton btnEstante2) {
		this.btnEstante2 = btnEstante2;
	}

	public JButton getBtnEstante3() {
		return btnEstante3;
	}

	public void setBtnEstante3(JButton btnEstante3) {
		this.btnEstante3 = btnEstante3;
	}

	public JButton getBtnEstante4() {
		return btnEstante4;
	}

	public void setBtnEstante4(JButton btnEstante4) {
		this.btnEstante4 = btnEstante4;
	}

	public JButton getBtnEstante5() {
		return btnEstante5;
	}

	public void setBtnEstante5(JButton btnEstante5) {
		this.btnEstante5 = btnEstante5;
	}

	public JButton getBtnEstante6() {
		return btnEstante6;
	}

	public void setBtnEstante6(JButton btnEstante6) {
		this.btnEstante6 = btnEstante6;
	}

	public JButton getBtnEstante7() {
		return btnEstante7;
	}

	public void setBtnEstante7(JButton btnEstante7) {
		this.btnEstante7 = btnEstante7;
	}

	public JButton getBtnEstante8() {
		return btnEstante8;
	}

	public void setBtnEstante8(JButton btnEstante8) {
		this.btnEstante8 = btnEstante8;
	}

	public JButton getBtnEstante9() {
		return btnEstante9;
	}

	public void setBtnEstante9(JButton btnEstante9) {
		this.btnEstante9 = btnEstante9;
	}

	public JButton getBtnEstante10() {
		return btnEstante10;
	}

	public void setBtnEstante10(JButton btnEstante10) {
		this.btnEstante10 = btnEstante10;
	}

	public JButton getBtnEstante11() {
		return btnEstante11;
	}

	public void setBtnEstante11(JButton btnEstante11) {
		this.btnEstante11 = btnEstante11;
	}

	public JButton getBtnCajonero() {
		return btnCajonero;
	}

	public void setBtnCajonero(JButton btnCajonero) {
		this.btnCajonero = btnCajonero;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

}
