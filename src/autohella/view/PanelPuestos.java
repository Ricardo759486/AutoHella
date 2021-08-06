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

public class PanelPuestos extends JPanel {

	private ImageIcon fondo, recFondo, img, recImg;

	private JLabel lblImagenFondo, lblVitrinaDerecha, lblVitrinaCentral, lblBaterias, lblVitrinaTrasera, lblCorreas,
			lblEstante5, lblEstante6, lblEstante7, lblEstante8;
	private JTextArea texto;
	private JScrollPane scrool;

	private JButton btnMinimizar, btnCerrar;

	private Boton btnInicio, btnLugar1, btnLugar2, btnLugar3, btnLugar4, btnLugar5, btnLugar6, btnLugar7, btnLugar8,
			btnLugar9;

	public PanelPuestos() {

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

		img = new ImageIcon("recursos/ubicacion.png");
// recImg = new ImageIcon(img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));-----VitrinaDerecha
// recImg = new ImageIcon(img.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));-----VitrinaCentral
// recImg = new ImageIcon(img.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));-----VitrinaIzquierda
// recImg = new ImageIcon(img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));-----Bateria
// recImg = new ImageIcon(img.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));-----VitrinaTracera
// recImg = new ImageIcon(img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));-----Correas
// recImg = new ImageIcon(img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));-----EstanteN°1-2-3-4
// recImg = new ImageIcon(img.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));-----EstanteN°6
// recImg = new ImageIcon(img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));-----EstanteN°7-8
		recImg = new ImageIcon(img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));

		btnLugar1 = new Boton();
// btnLugar1.setBounds(440, 108, 60, 60);-----VitrinaDerecha
// btnLugar1.setBounds(400, 203, 60, 60);-----VitrinaCentral
// btnLugar1.setBounds(415, 165, 35, 35);-----VitrinaIzquierda
// btnLugar1.setBounds(425, 117, 50, 50);-----Baterias
// btnLugar1.setBounds(400, 225, 60, 60);-----VitrinaTracera
// btnLugar1.setBounds(360, 155, 50, 50);-----Correas
// btnLugar1.setBounds(410, 80, 50, 50);-----Estante N° 1-2
// btnLugar1.setBounds(425, 70, 50, 50);-----Estante N° 3-4-5-10
// btnLugar1.setBounds(400, 80, 60, 60);-----Estante N° 6-9-11
// btnLugar1.setBounds(435, 140, 50, 50);-----Estante N° 7-8
		btnLugar1.setBounds(435, 140, 50, 50);
		btnLugar1.setBorderPainted(false);
		btnLugar1.setContentAreaFilled(false);
		btnLugar1.setFocusPainted(false);
		btnLugar1.setIcon(recImg);
		btnLugar1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnLugar1.setActionCommand("lugar1");
		add(btnLugar1);

		btnLugar2 = new Boton();
// btnLugar2.setBounds(440, 163, 60, 60);-----VitrinaDerecha
// btnLugar2.setBounds(400, 300, 60, 60);-----VitrinaCentral
// btnLugar2.setBounds(415, 220, 35, 35);-----VitrinaIzquierda
// btnLugar2.setBounds(425, 195, 50, 50);-----Baterias
// btnLugar2.setBounds(400, 315, 60, 60);-----VitrinaTracera
// btnLugar2.setBounds(360, 215, 50, 50);-----Correas
// btnLugar2.setBounds(410, 160, 50, 50);-----Estante N° 1-2
// btnLugar2.setBounds(425, 143, 50, 50);-----Estante N° 3-4-5-10
// btnLugar2.setBounds(400, 175, 60, 60);-----Estante N° 6-9-11
// btnLugar2.setBounds(435, 233, 50, 50);-----Estante N° 7-8
		btnLugar2.setBounds(435, 233, 50, 50);
		btnLugar2.setBorderPainted(false);
		btnLugar2.setContentAreaFilled(false);
		btnLugar2.setFocusPainted(false);
		btnLugar2.setIcon(recImg);
		btnLugar2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnLugar2.setActionCommand("lugar2");
		add(btnLugar2);

		btnLugar3 = new Boton();
// btnLugar3.setBounds(440, 230, 60, 60);-----VitrinaDerecha
// btnLugar3.setBounds(400, 390, 60, 60);-----VitrinaCentral
// btnLugar3.setBounds(415, 260, 35, 35);-----VitrinaIzquierda
// btnLugar3.setBounds(425, 275, 50, 50);-----Baterias
// btnLugar3.setBounds(400, 410, 60, 60);-----VitrinaTracera
// btnLugar3.setBounds(360, 270, 50, 50);-----Correas
// btnLugar3.setBounds(410, 240, 50, 50);-----Estante N° 1-2
// btnLugar3.setBounds(425, 213, 50, 50);-----Estante N° 3-4-5-10
// btnLugar3.setBounds(400, 268, 60, 60);-----Estante N° 6-9-11
// btnLugar3.setBounds(435, 325, 50, 50);-----Estante N° 7-8
		btnLugar3.setBounds(435, 325, 50, 50);
		btnLugar3.setBorderPainted(false);
		btnLugar3.setContentAreaFilled(false);
		btnLugar3.setFocusPainted(false);
		btnLugar3.setIcon(recImg);
		btnLugar3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnLugar3.setActionCommand("lugar3");
		add(btnLugar3);

		btnLugar4 = new Boton();
// btnLugar4.setBounds(440, 290, 60, 60);-----VitrinaDerecha
// btnLugar4.setBounds(400, 480, 60, 60);-----VitrinaCentral
// btnLugar4.setBounds(415, 305, 35, 35);-----VitrinaIzquierda
// btnLugar4.setBounds(425, 350, 50, 50);-----Baterias
// btnLugar4.setBounds(360, 320, 50, 50);-----Correas
// btnLugar4.setBounds(410, 325, 50, 50);-----Estante N° 1-2
// btnLugar4.setBounds(425, 285, 50, 50);-----Estante N° 3-4-5-10
// btnLugar4.setBounds(400, 363, 60, 60);-----Estante N° 6-9-11
// btnLugar4.setBounds(435, 423, 50, 50);-----Estante N° 7-8
		btnLugar4.setBounds(435, 423, 50, 50);
		btnLugar4.setBorderPainted(false);
		btnLugar4.setContentAreaFilled(false);
		btnLugar4.setFocusPainted(false);
		btnLugar4.setIcon(recImg);
		btnLugar4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnLugar4.setActionCommand("lugar4");
		add(btnLugar4);

		btnLugar5 = new Boton();
// btnLugar5.setBounds(440, 353, 60, 60);-----VitrinaDerecha
// btnLugar5.setBounds(440, 353, 60, 60);-----VitrinaCentral
// btnLugar5.setBounds(415, 350, 35, 35);-----VitrinaIzquierda
// btnLugar5.setBounds(425, 430, 50, 50);-----Baterias
// btnLugar5.setBounds(360, 375, 50, 50);-----Correas
// btnLugar5.setBounds(410, 405, 50, 50);-----Estante N° 1-2
// btnLugar5.setBounds(425, 359, 50, 50);-----Estante N° 3-4-5-10
// btnLugar5.setBounds(400, 459, 60, 60);-----Estante N° 6-9-11
// btnLugar5.setBounds(435, 515, 50, 50);-----Estante N° 7-8
		btnLugar5.setBounds(435, 515, 50, 50);
		btnLugar5.setBorderPainted(false);
		btnLugar5.setContentAreaFilled(false);
		btnLugar5.setFocusPainted(false);
		btnLugar5.setIcon(recImg);
		btnLugar5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnLugar5.setActionCommand("lugar5");
		add(btnLugar5);

//		btnLugar6 = new Boton();
//// btnLugar6.setBounds(440, 415, 60, 60);-----VitrinaDerecha
//// btnLugar6.setBounds(440, 415, 60, 60);-----VitrinaCentral
//// btnLugar6.setBounds(415, 400, 35, 35);-----VitrinaIzquierda
//// btnLugar6.setBounds(425, 510, 50, 50);-----Baterias
//// btnLugar6.setBounds(360, 430, 50, 50);-----Correas
//// btnLugar6.setBounds(410, 485, 50, 50);-----Estante N° 1-2
//// btnLugar6.setBounds(425, 430, 50, 50);-----Estante N° 3-4-5-10
//// btnLugar6.setBounds(400, 555, 60, 60);-----Estante N° 6-9-11
//		btnLugar6.setBounds(400, 555, 60, 60);
//		btnLugar6.setBorderPainted(false);
//		btnLugar6.setContentAreaFilled(false);
//		btnLugar6.setFocusPainted(false);
//		btnLugar6.setIcon(recImg);
//		btnLugar6.setCursor(new Cursor(Cursor.HAND_CURSOR));
//		btnLugar6.setActionCommand("lugar6");
//		add(btnLugar6);

//		btnLugar7 = new Boton();
//// btnLugar7.setBounds(440, 475, 60, 60);-----VitrinaDerecha
//// btnLugar7.setBounds(440, 475, 60, 60);-----VitrinaCentral
//// btnLugar7.setBounds(415, 445, 35, 35);-----VitrinaIzquierda
//// btnLugar7.setBounds(360, 491, 50, 50);-----Correas
//// btnLugar7.setBounds(410, 565, 50, 50);-----Estante N° 1-2
//// btnLugar7.setBounds(425, 505, 50, 50);-----Estante N° 3-4-5-10
//		btnLugar7.setBounds(425, 505, 50, 50);
//		btnLugar7.setBorderPainted(false);
//		btnLugar7.setContentAreaFilled(false);
//		btnLugar7.setFocusPainted(false);
//		btnLugar7.setIcon(recImg);
//		btnLugar7.setCursor(new Cursor(Cursor.HAND_CURSOR));
//		btnLugar7.setActionCommand("lugar7");
//		add(btnLugar7);
//
//		btnLugar8 = new Boton();
//// btnLugar8.setBounds(440, 540, 60, 60);-----VitrinaDerecha
//// btnLugar8.setBounds(440, 540, 60, 60);-----VitrinaCentral
//// btnLugar8.setBounds(415, 495, 35, 35);-----VitrinaIzquierda
//// btnLugar8.setBounds(425, 577, 50, 50);-----Estante N° 3-4-5-10
//		btnLugar8.setBounds(425, 577, 50, 50);
//		btnLugar8.setBorderPainted(false);
//		btnLugar8.setContentAreaFilled(false);
//		btnLugar8.setFocusPainted(false);
//		btnLugar8.setIcon(recImg);
//		btnLugar8.setCursor(new Cursor(Cursor.HAND_CURSOR));
//		btnLugar8.setActionCommand("lugar8");
//		add(btnLugar8);

//		btnLugar9 = new Boton();
//// btnLugar9.setBounds(415, 540, 35, 35);-----VitrinaIzquierda
//		btnLugar9.setBounds(415, 540, 35, 35);
//		btnLugar9.setBorderPainted(false);
//		btnLugar9.setContentAreaFilled(false);
//		btnLugar9.setFocusPainted(false);
//		btnLugar9.setIcon(recImg);
//		btnLugar9.setCursor(new Cursor(Cursor.HAND_CURSOR));
//		btnLugar9.setActionCommand("lugar9");
//		add(btnLugar9);

//----------------------------Entrada----------------------------------------------------------

//		fondo = new ImageIcon(getClass().getResource("/imagenes/VitrinaDerechaPuestos.jpg"));
//		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(338, 579, Image.SCALE_SMOOTH));
//		lblVitrinaDerecha = new JLabel(recFondo);
//		lblVitrinaDerecha.setSize(338, 579);
//		lblVitrinaDerecha.setBounds(300, 60, 338, 579);
//		add(lblVitrinaDerecha);

//		fondo = new ImageIcon(getClass().getResource("/imagenes/VitrinaCentral.jpg"));
//		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(446, 386, Image.SCALE_SMOOTH));
//		lblVitrinaCentral = new JLabel(recFondo);
//		lblVitrinaCentral.setSize(446, 386);
//		lblVitrinaCentral.setBounds(200, 180, 446, 386);
//		add(lblVitrinaCentral);

//		fondo = new ImageIcon(getClass().getResource("/imagenes/VitrinaIzquierdaPuestos.jpg"));
//		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(376, 517, Image.SCALE_SMOOTH));
//		lblVitrinaDerecha = new JLabel(recFondo);
//		lblVitrinaDerecha.setSize(376, 517);
//		lblVitrinaDerecha.setBounds(250, 90, 376, 517);
//		add(lblVitrinaDerecha);

//		fondo = new ImageIcon(getClass().getResource("/imagenes/BateriasPuestos.jpg"));
//		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(291, 517, Image.SCALE_SMOOTH));
//		lblBaterias = new JLabel(recFondo);
//		lblBaterias.setSize(291, 517);
//		lblBaterias.setBounds(300, 90, 291, 517);
//		add(lblBaterias);

//		fondo = new ImageIcon(getClass().getResource("/imagenes/VitrinaTraseraPuestos.jpg"));
//		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(441, 291, Image.SCALE_SMOOTH));
//		lblVitrinaTrasera = new JLabel(recFondo);
//		lblVitrinaTrasera.setSize(441, 291);
//		lblVitrinaTrasera.setBounds(200, 200, 441, 291);
//		add(lblVitrinaTrasera);

//		fondo = new ImageIcon(getClass().getResource("/imagenes/CorreasPuestos.jpg"));
//		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(632, 400, Image.SCALE_SMOOTH));
//		lblCorreas = new JLabel(recFondo);
//		lblCorreas.setSize(632, 400);
//		lblCorreas.setBounds(30, 150, 632, 400);
//		add(lblCorreas);

//		fondo = new ImageIcon(getClass().getResource("/imagenes/Estante7.jpg"));
//		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(367, 617, Image.SCALE_SMOOTH));
//		lblEstante7 = new JLabel(recFondo);
//		lblEstante7.setSize(367, 617);
//		lblEstante7.setBounds(260, 50, 367, 617);
//		add(lblEstante7);

//		fondo = new ImageIcon(getClass().getResource("/imagenes/Estante8.jpg"));
//		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(348, 617, Image.SCALE_SMOOTH));
//		lblEstante8 = new JLabel(recFondo);
//		lblEstante8.setSize(348, 617);
//		lblEstante8.setBounds(280, 50, 348, 617);
//		add(lblEstante8);

//		fondo = new ImageIcon(getClass().getResource("/imagenes/Estante6.jpg"));
//		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(391, 616, Image.SCALE_SMOOTH));
//		lblEstante6 = new JLabel(recFondo);
//		lblEstante6.setSize(391, 616);
//		lblEstante6.setBounds(230, 50, 391, 616);
//		add(lblEstante6);

		fondo = new ImageIcon(getClass().getResource("/imagenes/Estante5.jpg"));
		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(325, 517, Image.SCALE_SMOOTH));
		lblEstante5 = new JLabel(recFondo);
		lblEstante5.setSize(325, 517);
		lblEstante5.setBounds(300, 100, 325, 517);
		add(lblEstante5);

//-----------------------------------------------------------------------------------------------------------

		img = new ImageIcon("recursos/inicio.png");
		recImg = new ImageIcon(img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		btnInicio = new Boton();
		btnInicio.setBounds(1090, 590, 100, 100);
		btnInicio.setBorderPainted(false);
		btnInicio.setContentAreaFilled(false);
		btnInicio.setFocusPainted(false);
		btnInicio.setIcon(recImg);
		btnInicio.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnInicio.setActionCommand("Inicio");
		add(btnInicio);

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
		scrool.setBounds(680, 220, 320, 150);
		add(scrool);

		fondo = new ImageIcon(getClass().getResource("/imagenes/fondoEntrada.jpg"));
		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(1200, 700, Image.SCALE_SMOOTH));
		lblImagenFondo = new JLabel(recFondo);
		lblImagenFondo.setSize(1200, 700);
		add(lblImagenFondo);

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

}
