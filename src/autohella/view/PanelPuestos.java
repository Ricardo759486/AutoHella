package autohella.view;

import java.awt.Color;
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
	private JTextArea texto, cajonero;
	private JScrollPane scrool;

	private JButton btnMinimizar, btnCerrar;

	private Boton btnInicio, btnLugar1, btnLugar2, btnLugar3, btnLugar4, btnLugar5, btnLugar6, btnLugar7, btnLugar8,
			btnLugar9;

	private Boton btnCajon1, btnCajon2, btnCajon3, btnCajon4, btnCajon5, btnCajon6, btnCajon7, btnCajon8, btnCajon9,
			btnCajon10, btnCajon11, btnCajon12, btnCajon13, btnCajon14, btnCajon15, btnCajon16, btnCajon17, btnCajon18,
			btnCajon19, btnCajon20, btnCajon21, btnCajon22, btnCajon23, btnCajon24, btnCajon25, btnCajon26, btnCajon27,
			btnCajon28, btnCajon29, btnCajon30, btnCajon31, btnCajon32, btnCajon33, btnCajon34, btnCajon35, btnCajon36,
			btnCajon37, btnCajon38, btnCajon39, btnCajon40, btnCajon41, btnCajon42, btnCajon43, btnCajon44, btnCajon45,
			btnCajon46, btnCajon47, btnCajon48, btnCajon49, btnCajon50, btnCajon51, btnCajon52, btnCajon53, btnCajon54,
			btnCajon55, btnCajon56, btnCajon57, btnCajon58, btnCajon59, btnCajon60, btnCajon61, btnCajon62, btnCajon63,
			btnCajon64, btnCajon65, btnCajon66, btnCajon67, btnCajon68, btnCajon69, btnCajon70, btnCajon71, btnCajon72,
			btnCajon73, btnCajon74, btnCajon75, btnCajon76, btnCajon77, btnCajon78, btnCajon79, btnCajon80, btnCajon81,
			btnCajon82, btnCajon83, btnCajon84, btnCajon85, btnCajon86, btnCajon87, btnCajon88, btnCajon89, btnCajon90,
			btnCajon91, btnCajon92, btnCajon93, btnCajon94, btnCajon95, btnCajon96, btnCajon97, btnCajon98, btnCajon99,
			btnCajon100, btnCajon101, btnCajon102, btnCajon103, btnCajon104, btnCajon105, btnCajon106, btnCajon107,
			btnCajon108, btnCajon109, btnCajon110, btnCajon111, btnCajon112, btnCajon113, btnCajon114, btnCajon115,
			btnCajon116, btnCajon117, btnCajon118, btnCajon119, btnCajon120, btnCajon121, btnCajon122, btnCajon123,
			btnCajon124, btnCajon125, btnCajon126, btnCajon127, btnCajon128, btnCajon129, btnCajon130, btnCajon131,
			btnCajon132, btnCajon133, btnCajon134, btnCajon135, btnCajon136;

	public PanelPuestos() {

		setLayout(null);
		setVisible(true);
		setSize(1350, 715);
		inicializarComponentes();
	}

	public void inicializarComponentes() {

		img = new ImageIcon("recursos/minimizar.png");
		recImg = new ImageIcon(img.getImage().getScaledInstance(37, 37, Image.SCALE_DEFAULT));
		btnMinimizar = new JButton();
		btnMinimizar.setBounds(1235, 1, 70, 70);
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
		btnCerrar.setBounds(1280, 1, 70, 70);
		btnCerrar.setBorderPainted(false);
		btnCerrar.setContentAreaFilled(false);
		btnCerrar.setFocusPainted(false);
		btnCerrar.setIcon(recImg);
		btnCerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCerrar.setActionCommand("CERRARVENTANA");
		add(btnCerrar);

//------------------------------------Estantes-------------------------------------------------------------------

//		img = new ImageIcon("recursos/ubicacion.png");
//// recImg = new ImageIcon(img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));-----VitrinaDerecha
//// recImg = new ImageIcon(img.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));-----VitrinaCentral
//// recImg = new ImageIcon(img.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));-----VitrinaIzquierda
//// recImg = new ImageIcon(img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));-----Bateria
//// recImg = new ImageIcon(img.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));-----VitrinaTracera
//// recImg = new ImageIcon(img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));-----Correas
//// recImg = new ImageIcon(img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));-----EstanteN°1-2-3-4
//// recImg = new ImageIcon(img.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));-----EstanteN°6
//// recImg = new ImageIcon(img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));-----EstanteN°7-8-9-10-11
//		recImg = new ImageIcon(img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));

//		btnLugar1 = new Boton();
//// btnLugar1.setBounds(440, 108, 60, 60);-----VitrinaDerecha
//// btnLugar1.setBounds(400, 203, 60, 60);-----VitrinaCentral
//// btnLugar1.setBounds(415, 165, 35, 35);-----VitrinaIzquierda
//// btnLugar1.setBounds(425, 117, 50, 50);-----Baterias
//// btnLugar1.setBounds(400, 225, 60, 60);-----VitrinaTracera
//// btnLugar1.setBounds(360, 155, 50, 50);-----Correas
//// btnLugar1.setBounds(410, 80, 50, 50);-----Estante N° 1-2
//// btnLugar1.setBounds(425, 70, 50, 50);-----Estante N° 3-4-5-10
//// btnLugar1.setBounds(400, 80, 60, 60);-----Estante N° 6-9-11
//// btnLugar1.setBounds(435, 140, 50, 50);-----Estante N° 7-8
//		btnLugar1.setBounds(435, 140, 50, 50);
//		btnLugar1.setBorderPainted(false);
//		btnLugar1.setContentAreaFilled(false);
//		btnLugar1.setFocusPainted(false);
//		btnLugar1.setIcon(recImg);
//		btnLugar1.setCursor(new Cursor(Cursor.HAND_CURSOR));
//		btnLugar1.setActionCommand("lugar1");
//		add(btnLugar1);

//		btnLugar2 = new Boton();
//// btnLugar2.setBounds(440, 163, 60, 60);-----VitrinaDerecha
//// btnLugar2.setBounds(400, 300, 60, 60);-----VitrinaCentral
//// btnLugar2.setBounds(415, 220, 35, 35);-----VitrinaIzquierda
//// btnLugar2.setBounds(425, 195, 50, 50);-----Baterias
//// btnLugar2.setBounds(400, 315, 60, 60);-----VitrinaTracera
//// btnLugar2.setBounds(360, 215, 50, 50);-----Correas
//// btnLugar2.setBounds(410, 160, 50, 50);-----Estante N° 1-2
//// btnLugar2.setBounds(425, 143, 50, 50);-----Estante N° 3-4-5-10
//// btnLugar2.setBounds(400, 175, 60, 60);-----Estante N° 6-9-11
//// btnLugar2.setBounds(435, 233, 50, 50);-----Estante N° 7-8
//		btnLugar2.setBounds(435, 233, 50, 50);
//		btnLugar2.setBorderPainted(false);
//		btnLugar2.setContentAreaFilled(false);
//		btnLugar2.setFocusPainted(false);
//		btnLugar2.setIcon(recImg);
//		btnLugar2.setCursor(new Cursor(Cursor.HAND_CURSOR));
//		btnLugar2.setActionCommand("lugar2");
//		add(btnLugar2);

//		btnLugar3 = new Boton();
//// btnLugar3.setBounds(440, 230, 60, 60);-----VitrinaDerecha
//// btnLugar3.setBounds(400, 390, 60, 60);-----VitrinaCentral
//// btnLugar3.setBounds(415, 260, 35, 35);-----VitrinaIzquierda
//// btnLugar3.setBounds(425, 275, 50, 50);-----Baterias
//// btnLugar3.setBounds(400, 410, 60, 60);-----VitrinaTracera
//// btnLugar3.setBounds(360, 270, 50, 50);-----Correas
//// btnLugar3.setBounds(410, 240, 50, 50);-----Estante N° 1-2
//// btnLugar3.setBounds(425, 213, 50, 50);-----Estante N° 3-4-5-10
//// btnLugar3.setBounds(400, 268, 60, 60);-----Estante N° 6-9-11
//// btnLugar3.setBounds(435, 325, 50, 50);-----Estante N° 7-8
//		btnLugar3.setBounds(435, 325, 50, 50);
//		btnLugar3.setBorderPainted(false);
//		btnLugar3.setContentAreaFilled(false);
//		btnLugar3.setFocusPainted(false);
//		btnLugar3.setIcon(recImg);
//		btnLugar3.setCursor(new Cursor(Cursor.HAND_CURSOR));
//		btnLugar3.setActionCommand("lugar3");
//		add(btnLugar3);

//		btnLugar4 = new Boton();
//// btnLugar4.setBounds(440, 290, 60, 60);-----VitrinaDerecha
//// btnLugar4.setBounds(400, 480, 60, 60);-----VitrinaCentral
//// btnLugar4.setBounds(415, 305, 35, 35);-----VitrinaIzquierda
//// btnLugar4.setBounds(425, 350, 50, 50);-----Baterias
//// btnLugar4.setBounds(360, 320, 50, 50);-----Correas
//// btnLugar4.setBounds(410, 325, 50, 50);-----Estante N° 1-2
//// btnLugar4.setBounds(425, 285, 50, 50);-----Estante N° 3-4-5-10
//// btnLugar4.setBounds(400, 363, 60, 60);-----Estante N° 6-9-11
//// btnLugar4.setBounds(435, 423, 50, 50);-----Estante N° 7-8
//		btnLugar4.setBounds(435, 423, 50, 50);
//		btnLugar4.setBorderPainted(false);
//		btnLugar4.setContentAreaFilled(false);
//		btnLugar4.setFocusPainted(false);
//		btnLugar4.setIcon(recImg);
//		btnLugar4.setCursor(new Cursor(Cursor.HAND_CURSOR));
//		btnLugar4.setActionCommand("lugar4");
//		add(btnLugar4);

//		btnLugar5 = new Boton();
//// btnLugar5.setBounds(440, 353, 60, 60);-----VitrinaDerecha
//// btnLugar5.setBounds(440, 353, 60, 60);-----VitrinaCentral
//// btnLugar5.setBounds(415, 350, 35, 35);-----VitrinaIzquierda
//// btnLugar5.setBounds(425, 430, 50, 50);-----Baterias
//// btnLugar5.setBounds(360, 375, 50, 50);-----Correas
//// btnLugar5.setBounds(410, 405, 50, 50);-----Estante N° 1-2
//// btnLugar5.setBounds(425, 359, 50, 50);-----Estante N° 3-4-5-10
//// btnLugar5.setBounds(400, 459, 60, 60);-----Estante N° 6-9-11
//// btnLugar5.setBounds(435, 515, 50, 50);-----Estante N° 7-8
//		btnLugar5.setBounds(435, 515, 50, 50);
//		btnLugar5.setBorderPainted(false);
//		btnLugar5.setContentAreaFilled(false);
//		btnLugar5.setFocusPainted(false);
//		btnLugar5.setIcon(recImg);
//		btnLugar5.setCursor(new Cursor(Cursor.HAND_CURSOR));
//		btnLugar5.setActionCommand("lugar5");
//		add(btnLugar5);

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

//---------------------------------------------------------------------------------------------			
//----------------------------Cajonero----------------------------------------------------------

		// ---------------------------PRIMERA
		// FILA--------------------------------------------

		img = new ImageIcon("recursos/1.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon1 = new Boton();
		btnCajon1.setBounds(20, 30, 119, 45);
		btnCajon1.setBorderPainted(false);
		btnCajon1.setContentAreaFilled(false);
		btnCajon1.setFocusPainted(false);
		btnCajon1.setIcon(recImg);
		btnCajon1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon1.setActionCommand("Cajon1");
		add(btnCajon1);

		img = new ImageIcon("recursos/2.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon2 = new Boton();
		btnCajon2.setBounds(20, 76, 119, 45);
		btnCajon2.setBorderPainted(false);
		btnCajon2.setContentAreaFilled(false);
		btnCajon2.setFocusPainted(false);
		btnCajon2.setIcon(recImg);
		btnCajon2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon2.setActionCommand("Cajon1");
		add(btnCajon2);

		img = new ImageIcon("recursos/3.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon3 = new Boton();
		btnCajon3.setBounds(20, 122, 119, 45);
		btnCajon3.setBorderPainted(false);
		btnCajon3.setContentAreaFilled(false);
		btnCajon3.setFocusPainted(false);
		btnCajon3.setIcon(recImg);
		btnCajon3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon3.setActionCommand("Cajon1");
		add(btnCajon3);

		img = new ImageIcon("recursos/4.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon4 = new Boton();
		btnCajon4.setBounds(20, 168, 119, 45);
		btnCajon4.setBorderPainted(false);
		btnCajon4.setContentAreaFilled(false);
		btnCajon4.setFocusPainted(false);
		btnCajon4.setIcon(recImg);
		btnCajon4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon4.setActionCommand("Cajon1");
		add(btnCajon4);

		img = new ImageIcon("recursos/5.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon5 = new Boton();
		btnCajon5.setBounds(20, 214, 119, 45);
		btnCajon5.setBorderPainted(false);
		btnCajon5.setContentAreaFilled(false);
		btnCajon5.setFocusPainted(false);
		btnCajon5.setIcon(recImg);
		btnCajon5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon5.setActionCommand("Cajon1");
		add(btnCajon5);

		img = new ImageIcon("recursos/6.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon6 = new Boton();
		btnCajon6.setBounds(20, 260, 119, 45);
		btnCajon6.setBorderPainted(false);
		btnCajon6.setContentAreaFilled(false);
		btnCajon6.setFocusPainted(false);
		btnCajon6.setIcon(recImg);
		btnCajon6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon6.setActionCommand("Cajon1");
		add(btnCajon6);

		img = new ImageIcon("recursos/7.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon7 = new Boton();
		btnCajon7.setBounds(20, 306, 119, 45);
		btnCajon7.setBorderPainted(false);
		btnCajon7.setContentAreaFilled(false);
		btnCajon7.setFocusPainted(false);
		btnCajon7.setIcon(recImg);
		btnCajon7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon7.setActionCommand("Cajon1");
		add(btnCajon7);

		img = new ImageIcon("recursos/8.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon8 = new Boton();
		btnCajon8.setBounds(20, 352, 119, 45);
		btnCajon8.setBorderPainted(false);
		btnCajon8.setContentAreaFilled(false);
		btnCajon8.setFocusPainted(false);
		btnCajon8.setIcon(recImg);
		btnCajon8.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon8.setActionCommand("Cajon1");
		add(btnCajon8);

		img = new ImageIcon("recursos/9.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon9 = new Boton();
		btnCajon9.setBounds(20, 398, 119, 45);
		btnCajon9.setBorderPainted(false);
		btnCajon9.setContentAreaFilled(false);
		btnCajon9.setFocusPainted(false);
		btnCajon9.setIcon(recImg);
		btnCajon9.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon9.setActionCommand("Cajon1");
		add(btnCajon9);

		img = new ImageIcon("recursos/10.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon10 = new Boton();
		btnCajon10.setBounds(20, 444, 119, 45);
		btnCajon10.setBorderPainted(false);
		btnCajon10.setContentAreaFilled(false);
		btnCajon10.setFocusPainted(false);
		btnCajon10.setIcon(recImg);
		btnCajon10.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon10.setActionCommand("Cajon1");
		add(btnCajon10);

		img = new ImageIcon("recursos/11.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon11 = new Boton();
		btnCajon11.setBounds(20, 490, 119, 45);
		btnCajon11.setBorderPainted(false);
		btnCajon11.setContentAreaFilled(false);
		btnCajon11.setFocusPainted(false);
		btnCajon11.setIcon(recImg);
		btnCajon11.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon11.setActionCommand("Cajon1");
		add(btnCajon11);

		img = new ImageIcon("recursos/12.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon12 = new Boton();
		btnCajon12.setBounds(20, 536, 119, 45);
		btnCajon12.setBorderPainted(false);
		btnCajon12.setContentAreaFilled(false);
		btnCajon12.setFocusPainted(false);
		btnCajon12.setIcon(recImg);
		btnCajon12.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon12.setActionCommand("Cajon1");
		add(btnCajon12);

		img = new ImageIcon("recursos/13.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon13 = new Boton();
		btnCajon13.setBounds(20, 582, 119, 45);
		btnCajon13.setBorderPainted(false);
		btnCajon13.setContentAreaFilled(false);
		btnCajon13.setFocusPainted(false);
		btnCajon13.setIcon(recImg);
		btnCajon13.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon13.setActionCommand("Cajon1");
		add(btnCajon13);

		img = new ImageIcon("recursos/14.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon14 = new Boton();
		btnCajon14.setBounds(20, 628, 119, 45);
		btnCajon14.setBorderPainted(false);
		btnCajon14.setContentAreaFilled(false);
		btnCajon14.setFocusPainted(false);
		btnCajon14.setIcon(recImg);
		btnCajon14.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon14.setActionCommand("Cajon1");
		add(btnCajon14);

		// ---------------------------SEGUNDA
		// FILA--------------------------------------------

		img = new ImageIcon("recursos/15.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon15 = new Boton();
		btnCajon15.setBounds(140, 30, 119, 45);
		btnCajon15.setBorderPainted(false);
		btnCajon15.setContentAreaFilled(false);
		btnCajon15.setFocusPainted(false);
		btnCajon15.setIcon(recImg);
		btnCajon15.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon15.setActionCommand("Cajon1");
		add(btnCajon15);

		img = new ImageIcon("recursos/16.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon16 = new Boton();
		btnCajon16.setBounds(140, 76, 119, 45);
		btnCajon16.setBorderPainted(false);
		btnCajon16.setContentAreaFilled(false);
		btnCajon16.setFocusPainted(false);
		btnCajon16.setIcon(recImg);
		btnCajon16.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon16.setActionCommand("Cajon1");
		add(btnCajon16);

		img = new ImageIcon("recursos/17.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon17 = new Boton();
		btnCajon17.setBounds(140, 122, 119, 45);
		btnCajon17.setBorderPainted(false);
		btnCajon17.setContentAreaFilled(false);
		btnCajon17.setFocusPainted(false);
		btnCajon17.setIcon(recImg);
		btnCajon17.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon17.setActionCommand("Cajon1");
		add(btnCajon17);

		img = new ImageIcon("recursos/18.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon18 = new Boton();
		btnCajon18.setBounds(140, 168, 119, 45);
		btnCajon18.setBorderPainted(false);
		btnCajon18.setContentAreaFilled(false);
		btnCajon18.setFocusPainted(false);
		btnCajon18.setIcon(recImg);
		btnCajon18.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon18.setActionCommand("Cajon1");
		add(btnCajon18);

		img = new ImageIcon("recursos/19.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon19 = new Boton();
		btnCajon19.setBounds(140, 214, 119, 45);
		btnCajon19.setBorderPainted(false);
		btnCajon19.setContentAreaFilled(false);
		btnCajon19.setFocusPainted(false);
		btnCajon19.setIcon(recImg);
		btnCajon19.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon19.setActionCommand("Cajon1");
		add(btnCajon19);

		img = new ImageIcon("recursos/20.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon20 = new Boton();
		btnCajon20.setBounds(140, 260, 119, 45);
		btnCajon20.setBorderPainted(false);
		btnCajon20.setContentAreaFilled(false);
		btnCajon20.setFocusPainted(false);
		btnCajon20.setIcon(recImg);
		btnCajon20.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon20.setActionCommand("Cajon1");
		add(btnCajon20);

		img = new ImageIcon("recursos/21.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon21 = new Boton();
		btnCajon21.setBounds(140, 306, 119, 45);
		btnCajon21.setBorderPainted(false);
		btnCajon21.setContentAreaFilled(false);
		btnCajon21.setFocusPainted(false);
		btnCajon21.setIcon(recImg);
		btnCajon21.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon21.setActionCommand("Cajon1");
		add(btnCajon21);

		img = new ImageIcon("recursos/22.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon22 = new Boton();
		btnCajon22.setBounds(140, 352, 119, 45);
		btnCajon22.setBorderPainted(false);
		btnCajon22.setContentAreaFilled(false);
		btnCajon22.setFocusPainted(false);
		btnCajon22.setIcon(recImg);
		btnCajon22.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon22.setActionCommand("Cajon1");
		add(btnCajon22);

		img = new ImageIcon("recursos/23.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon23 = new Boton();
		btnCajon23.setBounds(140, 398, 119, 45);
		btnCajon23.setBorderPainted(false);
		btnCajon23.setContentAreaFilled(false);
		btnCajon23.setFocusPainted(false);
		btnCajon23.setIcon(recImg);
		btnCajon23.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon23.setActionCommand("Cajon1");
		add(btnCajon23);

		img = new ImageIcon("recursos/24.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon24 = new Boton();
		btnCajon24.setBounds(140, 444, 119, 45);
		btnCajon24.setBorderPainted(false);
		btnCajon24.setContentAreaFilled(false);
		btnCajon24.setFocusPainted(false);
		btnCajon24.setIcon(recImg);
		btnCajon24.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon24.setActionCommand("Cajon1");
		add(btnCajon24);

		img = new ImageIcon("recursos/25.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon25 = new Boton();
		btnCajon25.setBounds(140, 490, 119, 45);
		btnCajon25.setBorderPainted(false);
		btnCajon25.setContentAreaFilled(false);
		btnCajon25.setFocusPainted(false);
		btnCajon25.setIcon(recImg);
		btnCajon25.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon25.setActionCommand("Cajon1");
		add(btnCajon25);

		img = new ImageIcon("recursos/26.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon26 = new Boton();
		btnCajon26.setBounds(140, 536, 119, 45);
		btnCajon26.setBorderPainted(false);
		btnCajon26.setContentAreaFilled(false);
		btnCajon26.setFocusPainted(false);
		btnCajon26.setIcon(recImg);
		btnCajon26.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon26.setActionCommand("Cajon1");
		add(btnCajon26);

		img = new ImageIcon("recursos/27.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon27 = new Boton();
		btnCajon27.setBounds(140, 582, 119, 45);
		btnCajon27.setBorderPainted(false);
		btnCajon27.setContentAreaFilled(false);
		btnCajon27.setFocusPainted(false);
		btnCajon27.setIcon(recImg);
		btnCajon27.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon27.setActionCommand("Cajon1");
		add(btnCajon27);

		img = new ImageIcon("recursos/28.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon28 = new Boton();
		btnCajon28.setBounds(140, 628, 119, 45);
		btnCajon28.setBorderPainted(false);
		btnCajon28.setContentAreaFilled(false);
		btnCajon28.setFocusPainted(false);
		btnCajon28.setIcon(recImg);
		btnCajon28.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon28.setActionCommand("Cajon1");
		add(btnCajon28);

		// ---------------------------TERCERA
		// FILA--------------------------------------------

		img = new ImageIcon("recursos/29.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon29 = new Boton();
		btnCajon29.setBounds(260, 30, 60, 80);
		btnCajon29.setBorderPainted(false);
		btnCajon29.setContentAreaFilled(false);
		btnCajon29.setFocusPainted(false);
		btnCajon29.setIcon(recImg);
		btnCajon29.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon29.setActionCommand("Cajon1");
		add(btnCajon29);

		btnCajon30 = new Boton();
		btnCajon30.setBounds(260, 111, 60, 80);
		btnCajon30.setBorderPainted(false);
		btnCajon30.setContentAreaFilled(false);
		btnCajon30.setFocusPainted(false);
		btnCajon30.setIcon(recImg);
		btnCajon30.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon30.setActionCommand("Cajon1");
		add(btnCajon30);

		btnCajon31 = new Boton();
		btnCajon31.setBounds(260, 192, 60, 80);
		btnCajon31.setBorderPainted(false);
		btnCajon31.setContentAreaFilled(false);
		btnCajon31.setFocusPainted(false);
		btnCajon31.setIcon(recImg);
		btnCajon31.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon31.setActionCommand("Cajon1");
		add(btnCajon31);

		btnCajon32 = new Boton();
		btnCajon32.setBounds(260, 273, 60, 80);
		btnCajon32.setBorderPainted(false);
		btnCajon32.setContentAreaFilled(false);
		btnCajon32.setFocusPainted(false);
		btnCajon32.setIcon(recImg);
		btnCajon32.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon32.setActionCommand("Cajon1");
		add(btnCajon32);

		btnCajon33 = new Boton();
		btnCajon33.setBounds(260, 354, 60, 80);
		btnCajon33.setBorderPainted(false);
		btnCajon33.setContentAreaFilled(false);
		btnCajon33.setFocusPainted(false);
		btnCajon33.setIcon(recImg);
		btnCajon33.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon33.setActionCommand("Cajon1");
		add(btnCajon33);

		btnCajon34 = new Boton();
		btnCajon34.setBounds(260, 435, 60, 80);
		btnCajon34.setBorderPainted(false);
		btnCajon34.setContentAreaFilled(false);
		btnCajon34.setFocusPainted(false);
		btnCajon34.setIcon(recImg);
		btnCajon34.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon34.setActionCommand("Cajon1");
		add(btnCajon34);

		btnCajon35 = new Boton();
		btnCajon35.setBounds(260, 516, 60, 80);
		btnCajon35.setBorderPainted(false);
		btnCajon35.setContentAreaFilled(false);
		btnCajon35.setFocusPainted(false);
		btnCajon35.setIcon(recImg);
		btnCajon35.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon35.setActionCommand("Cajon1");
		add(btnCajon35);

		btnCajon36 = new Boton();
		btnCajon36.setBounds(260, 597, 60, 76);
		btnCajon36.setBorderPainted(false);
		btnCajon36.setContentAreaFilled(false);
		btnCajon36.setFocusPainted(false);
		btnCajon36.setIcon(recImg);
		btnCajon36.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon36.setActionCommand("Cajon1");
		add(btnCajon36);

		// ---------------------------CUARTA
		// FILA--------------------------------------------

		img = new ImageIcon("recursos/38.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon37 = new Boton();
		btnCajon37.setBounds(321, 30, 119, 45);
		btnCajon37.setBorderPainted(false);
		btnCajon37.setContentAreaFilled(false);
		btnCajon37.setFocusPainted(false);
		btnCajon37.setIcon(recImg);
		btnCajon37.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon37.setActionCommand("Cajon1");
		add(btnCajon37);

		img = new ImageIcon("recursos/39.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon38 = new Boton();
		btnCajon38.setBounds(321, 76, 119, 45);
		btnCajon38.setBorderPainted(false);
		btnCajon38.setContentAreaFilled(false);
		btnCajon38.setFocusPainted(false);
		btnCajon38.setIcon(recImg);
		btnCajon38.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon38.setActionCommand("Cajon1");
		add(btnCajon38);

		btnCajon39 = new Boton();
		btnCajon39.setBounds(321, 122, 119, 45);
		btnCajon39.setBorderPainted(false);
		btnCajon39.setContentAreaFilled(false);
		btnCajon39.setFocusPainted(false);
		btnCajon39.setIcon(recImg);
		btnCajon39.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon39.setActionCommand("Cajon1");
		add(btnCajon39);

		btnCajon40 = new Boton();
		btnCajon40.setBounds(321, 168, 119, 45);
		btnCajon40.setBorderPainted(false);
		btnCajon40.setContentAreaFilled(false);
		btnCajon40.setFocusPainted(false);
		btnCajon40.setIcon(recImg);
		btnCajon40.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon40.setActionCommand("Cajon1");
		add(btnCajon40);

		btnCajon41 = new Boton();
		btnCajon41.setBounds(321, 214, 119, 45);
		btnCajon41.setBorderPainted(false);
		btnCajon41.setContentAreaFilled(false);
		btnCajon41.setFocusPainted(false);
		btnCajon41.setIcon(recImg);
		btnCajon41.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon41.setActionCommand("Cajon1");
		add(btnCajon41);

		btnCajon42 = new Boton();
		btnCajon42.setBounds(321, 260, 119, 45);
		btnCajon42.setBorderPainted(false);
		btnCajon42.setContentAreaFilled(false);
		btnCajon42.setFocusPainted(false);
		btnCajon42.setIcon(recImg);
		btnCajon42.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon42.setActionCommand("Cajon1");
		add(btnCajon42);

		btnCajon43 = new Boton();
		btnCajon43.setBounds(321, 306, 119, 45);
		btnCajon43.setBorderPainted(false);
		btnCajon43.setContentAreaFilled(false);
		btnCajon43.setFocusPainted(false);
		btnCajon43.setIcon(recImg);
		btnCajon43.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon43.setActionCommand("Cajon1");
		add(btnCajon43);

		btnCajon44 = new Boton();
		btnCajon44.setBounds(321, 352, 119, 45);
		btnCajon44.setBorderPainted(false);
		btnCajon44.setContentAreaFilled(false);
		btnCajon44.setFocusPainted(false);
		btnCajon44.setIcon(recImg);
		btnCajon44.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon44.setActionCommand("Cajon1");
		add(btnCajon44);

		btnCajon45 = new Boton();
		btnCajon45.setBounds(321, 398, 119, 45);
		btnCajon45.setBorderPainted(false);
		btnCajon45.setContentAreaFilled(false);
		btnCajon45.setFocusPainted(false);
		btnCajon45.setIcon(recImg);
		btnCajon45.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon45.setActionCommand("Cajon1");
		add(btnCajon45);

		btnCajon46 = new Boton();
		btnCajon46.setBounds(321, 444, 119, 45);
		btnCajon46.setBorderPainted(false);
		btnCajon46.setContentAreaFilled(false);
		btnCajon46.setFocusPainted(false);
		btnCajon46.setIcon(recImg);
		btnCajon46.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon46.setActionCommand("Cajon1");
		add(btnCajon46);

		btnCajon47 = new Boton();
		btnCajon47.setBounds(321, 490, 119, 45);
		btnCajon47.setBorderPainted(false);
		btnCajon47.setContentAreaFilled(false);
		btnCajon47.setFocusPainted(false);
		btnCajon47.setIcon(recImg);
		btnCajon47.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon47.setActionCommand("Cajon1");
		add(btnCajon47);

		btnCajon48 = new Boton();
		btnCajon48.setBounds(321, 536, 119, 45);
		btnCajon48.setBorderPainted(false);
		btnCajon48.setContentAreaFilled(false);
		btnCajon48.setFocusPainted(false);
		btnCajon48.setIcon(recImg);
		btnCajon48.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon48.setActionCommand("Cajon1");
		add(btnCajon48);

		btnCajon49 = new Boton();
		btnCajon49.setBounds(321, 582, 119, 45);
		btnCajon49.setBorderPainted(false);
		btnCajon49.setContentAreaFilled(false);
		btnCajon49.setFocusPainted(false);
		btnCajon49.setIcon(recImg);
		btnCajon49.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon49.setActionCommand("Cajon1");
		add(btnCajon49);

		btnCajon50 = new Boton();
		btnCajon50.setBounds(321, 628, 119, 45);
		btnCajon50.setBorderPainted(false);
		btnCajon50.setContentAreaFilled(false);
		btnCajon50.setFocusPainted(false);
		btnCajon50.setIcon(recImg);
		btnCajon50.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon50.setActionCommand("Cajon1");
		add(btnCajon50);

		// ---------------------------QUINTA
		// FILA--------------------------------------------

		btnCajon51 = new Boton();
		btnCajon51.setBounds(441, 30, 119, 45);
		btnCajon51.setBorderPainted(false);
		btnCajon51.setContentAreaFilled(false);
		btnCajon51.setFocusPainted(false);
		btnCajon51.setIcon(recImg);
		btnCajon51.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon51.setActionCommand("Cajon1");
		add(btnCajon51);

		btnCajon52 = new Boton();
		btnCajon52.setBounds(441, 76, 119, 45);
		btnCajon52.setBorderPainted(false);
		btnCajon52.setContentAreaFilled(false);
		btnCajon52.setFocusPainted(false);
		btnCajon52.setIcon(recImg);
		btnCajon52.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon52.setActionCommand("Cajon1");
		add(btnCajon52);

		btnCajon53 = new Boton();
		btnCajon53.setBounds(441, 122, 119, 45);
		btnCajon53.setBorderPainted(false);
		btnCajon53.setContentAreaFilled(false);
		btnCajon53.setFocusPainted(false);
		btnCajon53.setIcon(recImg);
		btnCajon53.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon53.setActionCommand("Cajon1");
		add(btnCajon53);

		btnCajon54 = new Boton();
		btnCajon54.setBounds(441, 168, 119, 45);
		btnCajon54.setBorderPainted(false);
		btnCajon54.setContentAreaFilled(false);
		btnCajon54.setFocusPainted(false);
		btnCajon54.setIcon(recImg);
		btnCajon54.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon54.setActionCommand("Cajon1");
		add(btnCajon54);

		btnCajon55 = new Boton();
		btnCajon55.setBounds(441, 214, 119, 45);
		btnCajon55.setBorderPainted(false);
		btnCajon55.setContentAreaFilled(false);
		btnCajon55.setFocusPainted(false);
		btnCajon55.setIcon(recImg);
		btnCajon55.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon55.setActionCommand("Cajon1");
		add(btnCajon55);

		btnCajon56 = new Boton();
		btnCajon56.setBounds(441, 260, 119, 45);
		btnCajon56.setBorderPainted(false);
		btnCajon56.setContentAreaFilled(false);
		btnCajon56.setFocusPainted(false);
		btnCajon56.setIcon(recImg);
		btnCajon56.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon56.setActionCommand("Cajon1");
		add(btnCajon56);

		btnCajon57 = new Boton();
		btnCajon57.setBounds(441, 306, 119, 45);
		btnCajon57.setBorderPainted(false);
		btnCajon57.setContentAreaFilled(false);
		btnCajon57.setFocusPainted(false);
		btnCajon57.setIcon(recImg);
		btnCajon57.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon57.setActionCommand("Cajon1");
		add(btnCajon57);

		btnCajon58 = new Boton();
		btnCajon58.setBounds(441, 352, 119, 45);
		btnCajon58.setBorderPainted(false);
		btnCajon58.setContentAreaFilled(false);
		btnCajon58.setFocusPainted(false);
		btnCajon58.setIcon(recImg);
		btnCajon58.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon58.setActionCommand("Cajon1");
		add(btnCajon58);

		btnCajon59 = new Boton();
		btnCajon59.setBounds(441, 398, 119, 45);
		btnCajon59.setBorderPainted(false);
		btnCajon59.setContentAreaFilled(false);
		btnCajon59.setFocusPainted(false);
		btnCajon59.setIcon(recImg);
		btnCajon59.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon59.setActionCommand("Cajon1");
		add(btnCajon59);

		btnCajon60 = new Boton();
		btnCajon60.setBounds(441, 444, 119, 45);
		btnCajon60.setBorderPainted(false);
		btnCajon60.setContentAreaFilled(false);
		btnCajon60.setFocusPainted(false);
		btnCajon60.setIcon(recImg);
		btnCajon60.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon60.setActionCommand("Cajon1");
		add(btnCajon60);

		btnCajon61 = new Boton();
		btnCajon61.setBounds(441, 490, 119, 45);
		btnCajon61.setBorderPainted(false);
		btnCajon61.setContentAreaFilled(false);
		btnCajon61.setFocusPainted(false);
		btnCajon61.setIcon(recImg);
		btnCajon61.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon61.setActionCommand("Cajon1");
		add(btnCajon61);

		btnCajon62 = new Boton();
		btnCajon62.setBounds(441, 536, 119, 45);
		btnCajon62.setBorderPainted(false);
		btnCajon62.setContentAreaFilled(false);
		btnCajon62.setFocusPainted(false);
		btnCajon62.setIcon(recImg);
		btnCajon62.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon62.setActionCommand("Cajon1");
		add(btnCajon62);

		btnCajon63 = new Boton();
		btnCajon63.setBounds(441, 582, 119, 45);
		btnCajon63.setBorderPainted(false);
		btnCajon63.setContentAreaFilled(false);
		btnCajon63.setFocusPainted(false);
		btnCajon63.setIcon(recImg);
		btnCajon63.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon63.setActionCommand("Cajon1");
		add(btnCajon63);

		btnCajon64 = new Boton();
		btnCajon64.setBounds(441, 628, 119, 45);
		btnCajon64.setBorderPainted(false);
		btnCajon64.setContentAreaFilled(false);
		btnCajon64.setFocusPainted(false);
		btnCajon64.setIcon(recImg);
		btnCajon64.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon64.setActionCommand("Cajon1");
		add(btnCajon64);

		// ---------------------------SEXTA
		// FILA--------------------------------------------

		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon65 = new Boton();
		btnCajon65.setBounds(561, 30, 60, 80);
		btnCajon65.setBorderPainted(false);
		btnCajon65.setContentAreaFilled(false);
		btnCajon65.setFocusPainted(false);
		btnCajon65.setIcon(recImg);
		btnCajon65.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon65.setActionCommand("Cajon1");
		add(btnCajon65);

		btnCajon66 = new Boton();
		btnCajon66.setBounds(561, 111, 60, 80);
		btnCajon66.setBorderPainted(false);
		btnCajon66.setContentAreaFilled(false);
		btnCajon66.setFocusPainted(false);
		btnCajon66.setIcon(recImg);
		btnCajon66.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon66.setActionCommand("Cajon1");
		add(btnCajon66);

		btnCajon67 = new Boton();
		btnCajon67.setBounds(561, 192, 60, 80);
		btnCajon67.setBorderPainted(false);
		btnCajon67.setContentAreaFilled(false);
		btnCajon67.setFocusPainted(false);
		btnCajon67.setIcon(recImg);
		btnCajon67.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon67.setActionCommand("Cajon1");
		add(btnCajon67);

		btnCajon68 = new Boton();
		btnCajon68.setBounds(561, 273, 60, 80);
		btnCajon68.setBorderPainted(false);
		btnCajon68.setContentAreaFilled(false);
		btnCajon68.setFocusPainted(false);
		btnCajon68.setIcon(recImg);
		btnCajon68.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon68.setActionCommand("Cajon1");
		add(btnCajon68);

		btnCajon69 = new Boton();
		btnCajon69.setBounds(561, 354, 60, 80);
		btnCajon69.setBorderPainted(false);
		btnCajon69.setContentAreaFilled(false);
		btnCajon69.setFocusPainted(false);
		btnCajon69.setIcon(recImg);
		btnCajon69.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon69.setActionCommand("Cajon1");
		add(btnCajon69);

		btnCajon70 = new Boton();
		btnCajon70.setBounds(561, 435, 60, 80);
		btnCajon70.setBorderPainted(false);
		btnCajon70.setContentAreaFilled(false);
		btnCajon70.setFocusPainted(false);
		btnCajon70.setIcon(recImg);
		btnCajon70.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon70.setActionCommand("Cajon1");
		add(btnCajon70);

		btnCajon71 = new Boton();
		btnCajon71.setBounds(561, 516, 60, 80);
		btnCajon71.setBorderPainted(false);
		btnCajon71.setContentAreaFilled(false);
		btnCajon71.setFocusPainted(false);
		btnCajon71.setIcon(recImg);
		btnCajon71.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon71.setActionCommand("Cajon1");
		add(btnCajon71);

		btnCajon72 = new Boton();
		btnCajon72.setBounds(561, 597, 60, 76);
		btnCajon72.setBorderPainted(false);
		btnCajon72.setContentAreaFilled(false);
		btnCajon72.setFocusPainted(false);
		btnCajon72.setIcon(recImg);
		btnCajon72.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon72.setActionCommand("Cajon1");
		add(btnCajon72);

		// ---------------------------SEPTIMA
		// FILA--------------------------------------------

		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon73 = new Boton();
		btnCajon73.setBounds(622, 30, 119, 45);
		btnCajon73.setBorderPainted(false);
		btnCajon73.setContentAreaFilled(false);
		btnCajon73.setFocusPainted(false);
		btnCajon73.setIcon(recImg);
		btnCajon73.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon73.setActionCommand("Cajon1");
		add(btnCajon73);

		btnCajon74 = new Boton();
		btnCajon74.setBounds(622, 76, 119, 45);
		btnCajon74.setBorderPainted(false);
		btnCajon74.setContentAreaFilled(false);
		btnCajon74.setFocusPainted(false);
		btnCajon74.setIcon(recImg);
		btnCajon74.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon74.setActionCommand("Cajon1");
		add(btnCajon74);

		btnCajon75 = new Boton();
		btnCajon75.setBounds(622, 122, 119, 45);
		btnCajon75.setBorderPainted(false);
		btnCajon75.setContentAreaFilled(false);
		btnCajon75.setFocusPainted(false);
		btnCajon75.setIcon(recImg);
		btnCajon75.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon75.setActionCommand("Cajon1");
		add(btnCajon75);

		btnCajon76 = new Boton();
		btnCajon76.setBounds(622, 168, 119, 45);
		btnCajon76.setBorderPainted(false);
		btnCajon76.setContentAreaFilled(false);
		btnCajon76.setFocusPainted(false);
		btnCajon76.setIcon(recImg);
		btnCajon76.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon76.setActionCommand("Cajon1");
		add(btnCajon76);

		btnCajon77 = new Boton();
		btnCajon77.setBounds(622, 214, 119, 45);
		btnCajon77.setBorderPainted(false);
		btnCajon77.setContentAreaFilled(false);
		btnCajon77.setFocusPainted(false);
		btnCajon77.setIcon(recImg);
		btnCajon77.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon77.setActionCommand("Cajon1");
		add(btnCajon77);

		btnCajon78 = new Boton();
		btnCajon78.setBounds(622, 260, 119, 45);
		btnCajon78.setBorderPainted(false);
		btnCajon78.setContentAreaFilled(false);
		btnCajon78.setFocusPainted(false);
		btnCajon78.setIcon(recImg);
		btnCajon78.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon78.setActionCommand("Cajon1");
		add(btnCajon78);

		btnCajon79 = new Boton();
		btnCajon79.setBounds(622, 306, 119, 45);
		btnCajon79.setBorderPainted(false);
		btnCajon79.setContentAreaFilled(false);
		btnCajon79.setFocusPainted(false);
		btnCajon79.setIcon(recImg);
		btnCajon79.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon79.setActionCommand("Cajon1");
		add(btnCajon79);

		btnCajon80 = new Boton();
		btnCajon80.setBounds(622, 352, 119, 45);
		btnCajon80.setBorderPainted(false);
		btnCajon80.setContentAreaFilled(false);
		btnCajon80.setFocusPainted(false);
		btnCajon80.setIcon(recImg);
		btnCajon80.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon80.setActionCommand("Cajon1");
		add(btnCajon80);

		btnCajon81 = new Boton();
		btnCajon81.setBounds(622, 398, 119, 45);
		btnCajon81.setBorderPainted(false);
		btnCajon81.setContentAreaFilled(false);
		btnCajon81.setFocusPainted(false);
		btnCajon81.setIcon(recImg);
		btnCajon81.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon81.setActionCommand("Cajon1");
		add(btnCajon81);

		btnCajon82 = new Boton();
		btnCajon82.setBounds(622, 444, 119, 45);
		btnCajon82.setBorderPainted(false);
		btnCajon82.setContentAreaFilled(false);
		btnCajon82.setFocusPainted(false);
		btnCajon82.setIcon(recImg);
		btnCajon82.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon82.setActionCommand("Cajon1");
		add(btnCajon82);

		btnCajon83 = new Boton();
		btnCajon83.setBounds(622, 490, 119, 45);
		btnCajon83.setBorderPainted(false);
		btnCajon83.setContentAreaFilled(false);
		btnCajon83.setFocusPainted(false);
		btnCajon83.setIcon(recImg);
		btnCajon83.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon83.setActionCommand("Cajon1");
		add(btnCajon83);

		btnCajon84 = new Boton();
		btnCajon84.setBounds(622, 536, 119, 45);
		btnCajon84.setBorderPainted(false);
		btnCajon84.setContentAreaFilled(false);
		btnCajon84.setFocusPainted(false);
		btnCajon84.setIcon(recImg);
		btnCajon84.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon84.setActionCommand("Cajon1");
		add(btnCajon84);

		btnCajon85 = new Boton();
		btnCajon85.setBounds(622, 582, 119, 45);
		btnCajon85.setBorderPainted(false);
		btnCajon85.setContentAreaFilled(false);
		btnCajon85.setFocusPainted(false);
		btnCajon85.setIcon(recImg);
		btnCajon85.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon85.setActionCommand("Cajon1");
		add(btnCajon85);

		btnCajon86 = new Boton();
		btnCajon86.setBounds(622, 628, 119, 45);
		btnCajon86.setBorderPainted(false);
		btnCajon86.setContentAreaFilled(false);
		btnCajon86.setFocusPainted(false);
		btnCajon86.setIcon(recImg);
		btnCajon86.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon86.setActionCommand("Cajon1");
		add(btnCajon86);

		// ---------------------------OCTAVA
		// FILA--------------------------------------------

		btnCajon87 = new Boton();
		btnCajon87.setBounds(742, 30, 119, 45);
		btnCajon87.setBorderPainted(false);
		btnCajon87.setContentAreaFilled(false);
		btnCajon87.setFocusPainted(false);
		btnCajon87.setIcon(recImg);
		btnCajon87.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon87.setActionCommand("Cajon1");
		add(btnCajon87);

		btnCajon88 = new Boton();
		btnCajon88.setBounds(742, 76, 119, 45);
		btnCajon88.setBorderPainted(false);
		btnCajon88.setContentAreaFilled(false);
		btnCajon88.setFocusPainted(false);
		btnCajon88.setIcon(recImg);
		btnCajon88.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon88.setActionCommand("Cajon1");
		add(btnCajon88);

		btnCajon89 = new Boton();
		btnCajon89.setBounds(742, 122, 119, 45);
		btnCajon89.setBorderPainted(false);
		btnCajon89.setContentAreaFilled(false);
		btnCajon89.setFocusPainted(false);
		btnCajon89.setIcon(recImg);
		btnCajon89.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon89.setActionCommand("Cajon1");
		add(btnCajon89);

		btnCajon90 = new Boton();
		btnCajon90.setBounds(742, 168, 119, 45);
		btnCajon90.setBorderPainted(false);
		btnCajon90.setContentAreaFilled(false);
		btnCajon90.setFocusPainted(false);
		btnCajon90.setIcon(recImg);
		btnCajon90.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon90.setActionCommand("Cajon1");
		add(btnCajon90);

		btnCajon91 = new Boton();
		btnCajon91.setBounds(742, 214, 119, 45);
		btnCajon91.setBorderPainted(false);
		btnCajon91.setContentAreaFilled(false);
		btnCajon91.setFocusPainted(false);
		btnCajon91.setIcon(recImg);
		btnCajon91.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon91.setActionCommand("Cajon1");
		add(btnCajon91);

		btnCajon92 = new Boton();
		btnCajon92.setBounds(742, 260, 119, 45);
		btnCajon92.setBorderPainted(false);
		btnCajon92.setContentAreaFilled(false);
		btnCajon92.setFocusPainted(false);
		btnCajon92.setIcon(recImg);
		btnCajon92.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon92.setActionCommand("Cajon1");
		add(btnCajon92);

		btnCajon93 = new Boton();
		btnCajon93.setBounds(742, 306, 119, 45);
		btnCajon93.setBorderPainted(false);
		btnCajon93.setContentAreaFilled(false);
		btnCajon93.setFocusPainted(false);
		btnCajon93.setIcon(recImg);
		btnCajon93.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon93.setActionCommand("Cajon1");
		add(btnCajon93);

		btnCajon94 = new Boton();
		btnCajon94.setBounds(742, 352, 119, 45);
		btnCajon94.setBorderPainted(false);
		btnCajon94.setContentAreaFilled(false);
		btnCajon94.setFocusPainted(false);
		btnCajon94.setIcon(recImg);
		btnCajon94.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon94.setActionCommand("Cajon1");
		add(btnCajon94);

		btnCajon95 = new Boton();
		btnCajon95.setBounds(742, 398, 119, 45);
		btnCajon95.setBorderPainted(false);
		btnCajon95.setContentAreaFilled(false);
		btnCajon95.setFocusPainted(false);
		btnCajon95.setIcon(recImg);
		btnCajon95.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon95.setActionCommand("Cajon1");
		add(btnCajon95);

		btnCajon96 = new Boton();
		btnCajon96.setBounds(742, 444, 119, 45);
		btnCajon96.setBorderPainted(false);
		btnCajon96.setContentAreaFilled(false);
		btnCajon96.setFocusPainted(false);
		btnCajon96.setIcon(recImg);
		btnCajon96.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon96.setActionCommand("Cajon1");
		add(btnCajon96);

		btnCajon97 = new Boton();
		btnCajon97.setBounds(742, 490, 119, 45);
		btnCajon97.setBorderPainted(false);
		btnCajon97.setContentAreaFilled(false);
		btnCajon97.setFocusPainted(false);
		btnCajon97.setIcon(recImg);
		btnCajon97.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon97.setActionCommand("Cajon1");
		add(btnCajon97);

		btnCajon98 = new Boton();
		btnCajon98.setBounds(742, 536, 119, 45);
		btnCajon98.setBorderPainted(false);
		btnCajon98.setContentAreaFilled(false);
		btnCajon98.setFocusPainted(false);
		btnCajon98.setIcon(recImg);
		btnCajon98.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon98.setActionCommand("Cajon1");
		add(btnCajon98);

		btnCajon99 = new Boton();
		btnCajon99.setBounds(742, 582, 119, 45);
		btnCajon99.setBorderPainted(false);
		btnCajon99.setContentAreaFilled(false);
		btnCajon99.setFocusPainted(false);
		btnCajon99.setIcon(recImg);
		btnCajon99.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon99.setActionCommand("Cajon1");
		add(btnCajon99);

		btnCajon100 = new Boton();
		btnCajon100.setBounds(742, 628, 119, 45);
		btnCajon100.setBorderPainted(false);
		btnCajon100.setContentAreaFilled(false);
		btnCajon100.setFocusPainted(false);
		btnCajon100.setIcon(recImg);
		btnCajon100.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon100.setActionCommand("Cajon1");
		add(btnCajon100);

		// ---------------------------NOVENA
		// FILA--------------------------------------------

		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon101 = new Boton();
		btnCajon101.setBounds(862, 30, 60, 80);
		btnCajon101.setBorderPainted(false);
		btnCajon101.setContentAreaFilled(false);
		btnCajon101.setFocusPainted(false);
		btnCajon101.setIcon(recImg);
		btnCajon101.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon101.setActionCommand("Cajon1");
		add(btnCajon101);

		btnCajon102 = new Boton();
		btnCajon102.setBounds(862, 111, 60, 80);
		btnCajon102.setBorderPainted(false);
		btnCajon102.setContentAreaFilled(false);
		btnCajon102.setFocusPainted(false);
		btnCajon102.setIcon(recImg);
		btnCajon102.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon102.setActionCommand("Cajon1");
		add(btnCajon102);

		btnCajon103 = new Boton();
		btnCajon103.setBounds(862, 192, 60, 80);
		btnCajon103.setBorderPainted(false);
		btnCajon103.setContentAreaFilled(false);
		btnCajon103.setFocusPainted(false);
		btnCajon103.setIcon(recImg);
		btnCajon103.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon103.setActionCommand("Cajon1");
		add(btnCajon103);

		btnCajon104 = new Boton();
		btnCajon104.setBounds(862, 273, 60, 80);
		btnCajon104.setBorderPainted(false);
		btnCajon104.setContentAreaFilled(false);
		btnCajon104.setFocusPainted(false);
		btnCajon104.setIcon(recImg);
		btnCajon104.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon104.setActionCommand("Cajon1");
		add(btnCajon104);

		btnCajon105 = new Boton();
		btnCajon105.setBounds(862, 354, 60, 80);
		btnCajon105.setBorderPainted(false);
		btnCajon105.setContentAreaFilled(false);
		btnCajon105.setFocusPainted(false);
		btnCajon105.setIcon(recImg);
		btnCajon105.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon105.setActionCommand("Cajon1");
		add(btnCajon105);

		btnCajon106 = new Boton();
		btnCajon106.setBounds(862, 435, 60, 80);
		btnCajon106.setBorderPainted(false);
		btnCajon106.setContentAreaFilled(false);
		btnCajon106.setFocusPainted(false);
		btnCajon106.setIcon(recImg);
		btnCajon106.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon106.setActionCommand("Cajon1");
		add(btnCajon106);

		btnCajon107 = new Boton();
		btnCajon107.setBounds(862, 516, 60, 80);
		btnCajon107.setBorderPainted(false);
		btnCajon107.setContentAreaFilled(false);
		btnCajon107.setFocusPainted(false);
		btnCajon107.setIcon(recImg);
		btnCajon107.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon107.setActionCommand("Cajon1");
		add(btnCajon107);

		btnCajon108 = new Boton();
		btnCajon108.setBounds(862, 597, 60, 76);
		btnCajon108.setBorderPainted(false);
		btnCajon108.setContentAreaFilled(false);
		btnCajon108.setFocusPainted(false);
		btnCajon108.setIcon(recImg);
		btnCajon108.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon108.setActionCommand("Cajon1");
		add(btnCajon108);

		// ---------------------------DECIMA
		// FILA--------------------------------------------

		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon109 = new Boton();
		btnCajon109.setBounds(923, 30, 119, 45);
		btnCajon109.setBorderPainted(false);
		btnCajon109.setContentAreaFilled(false);
		btnCajon109.setFocusPainted(false);
		btnCajon109.setIcon(recImg);
		btnCajon109.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon109.setActionCommand("Cajon1");
		add(btnCajon109);

		btnCajon110 = new Boton();
		btnCajon110.setBounds(923, 76, 119, 45);
		btnCajon110.setBorderPainted(false);
		btnCajon110.setContentAreaFilled(false);
		btnCajon110.setFocusPainted(false);
		btnCajon110.setIcon(recImg);
		btnCajon110.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon110.setActionCommand("Cajon1");
		add(btnCajon110);

		btnCajon111 = new Boton();
		btnCajon111.setBounds(923, 122, 119, 45);
		btnCajon111.setBorderPainted(false);
		btnCajon111.setContentAreaFilled(false);
		btnCajon111.setFocusPainted(false);
		btnCajon111.setIcon(recImg);
		btnCajon111.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon111.setActionCommand("Cajon1");
		add(btnCajon111);

		btnCajon112 = new Boton();
		btnCajon112.setBounds(923, 168, 119, 45);
		btnCajon112.setBorderPainted(false);
		btnCajon112.setContentAreaFilled(false);
		btnCajon112.setFocusPainted(false);
		btnCajon112.setIcon(recImg);
		btnCajon112.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon112.setActionCommand("Cajon1");
		add(btnCajon112);

		btnCajon113 = new Boton();
		btnCajon113.setBounds(923, 214, 119, 45);
		btnCajon113.setBorderPainted(false);
		btnCajon113.setContentAreaFilled(false);
		btnCajon113.setFocusPainted(false);
		btnCajon113.setIcon(recImg);
		btnCajon113.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon113.setActionCommand("Cajon1");
		add(btnCajon113);

		btnCajon114 = new Boton();
		btnCajon114.setBounds(923, 260, 119, 45);
		btnCajon114.setBorderPainted(false);
		btnCajon114.setContentAreaFilled(false);
		btnCajon114.setFocusPainted(false);
		btnCajon114.setIcon(recImg);
		btnCajon114.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon114.setActionCommand("Cajon1");
		add(btnCajon114);

		btnCajon115 = new Boton();
		btnCajon115.setBounds(923, 306, 119, 45);
		btnCajon115.setBorderPainted(false);
		btnCajon115.setContentAreaFilled(false);
		btnCajon115.setFocusPainted(false);
		btnCajon115.setIcon(recImg);
		btnCajon115.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon115.setActionCommand("Cajon1");
		add(btnCajon115);

		btnCajon116 = new Boton();
		btnCajon116.setBounds(923, 352, 119, 45);
		btnCajon116.setBorderPainted(false);
		btnCajon116.setContentAreaFilled(false);
		btnCajon116.setFocusPainted(false);
		btnCajon116.setIcon(recImg);
		btnCajon116.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon116.setActionCommand("Cajon1");
		add(btnCajon116);

		btnCajon117 = new Boton();
		btnCajon117.setBounds(923, 398, 119, 45);
		btnCajon117.setBorderPainted(false);
		btnCajon117.setContentAreaFilled(false);
		btnCajon117.setFocusPainted(false);
		btnCajon117.setIcon(recImg);
		btnCajon117.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon117.setActionCommand("Cajon1");
		add(btnCajon117);

		btnCajon118 = new Boton();
		btnCajon118.setBounds(923, 444, 119, 45);
		btnCajon118.setBorderPainted(false);
		btnCajon118.setContentAreaFilled(false);
		btnCajon118.setFocusPainted(false);
		btnCajon118.setIcon(recImg);
		btnCajon118.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon118.setActionCommand("Cajon1");
		add(btnCajon118);

		btnCajon119 = new Boton();
		btnCajon119.setBounds(923, 490, 119, 45);
		btnCajon119.setBorderPainted(false);
		btnCajon119.setContentAreaFilled(false);
		btnCajon119.setFocusPainted(false);
		btnCajon119.setIcon(recImg);
		btnCajon119.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon119.setActionCommand("Cajon1");
		add(btnCajon119);

		btnCajon120 = new Boton();
		btnCajon120.setBounds(923, 536, 119, 45);
		btnCajon120.setBorderPainted(false);
		btnCajon120.setContentAreaFilled(false);
		btnCajon120.setFocusPainted(false);
		btnCajon120.setIcon(recImg);
		btnCajon120.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon120.setActionCommand("Cajon1");
		add(btnCajon120);

		btnCajon121 = new Boton();
		btnCajon121.setBounds(923, 582, 119, 45);
		btnCajon121.setBorderPainted(false);
		btnCajon121.setContentAreaFilled(false);
		btnCajon121.setFocusPainted(false);
		btnCajon121.setIcon(recImg);
		btnCajon121.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon121.setActionCommand("Cajon1");
		add(btnCajon121);

		btnCajon122 = new Boton();
		btnCajon122.setBounds(923, 628, 119, 45);
		btnCajon122.setBorderPainted(false);
		btnCajon122.setContentAreaFilled(false);
		btnCajon122.setFocusPainted(false);
		btnCajon122.setIcon(recImg);
		btnCajon122.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon122.setActionCommand("Cajon1");
		add(btnCajon122);

		// ---------------------------ONCEAVA
		// FILA--------------------------------------------

		btnCajon123 = new Boton();
		btnCajon123.setBounds(1043, 30, 119, 45);
		btnCajon123.setBorderPainted(false);
		btnCajon123.setContentAreaFilled(false);
		btnCajon123.setFocusPainted(false);
		btnCajon123.setIcon(recImg);
		btnCajon123.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon123.setActionCommand("Cajon1");
		add(btnCajon123);

		btnCajon124 = new Boton();
		btnCajon124.setBounds(1043, 76, 119, 45);
		btnCajon124.setBorderPainted(false);
		btnCajon124.setContentAreaFilled(false);
		btnCajon124.setFocusPainted(false);
		btnCajon124.setIcon(recImg);
		btnCajon124.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon124.setActionCommand("Cajon1");
		add(btnCajon124);

		btnCajon125 = new Boton();
		btnCajon125.setBounds(1043, 122, 119, 45);
		btnCajon125.setBorderPainted(false);
		btnCajon125.setContentAreaFilled(false);
		btnCajon125.setFocusPainted(false);
		btnCajon125.setIcon(recImg);
		btnCajon125.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon125.setActionCommand("Cajon1");
		add(btnCajon125);

		btnCajon126 = new Boton();
		btnCajon126.setBounds(1043, 168, 119, 45);
		btnCajon126.setBorderPainted(false);
		btnCajon126.setContentAreaFilled(false);
		btnCajon126.setFocusPainted(false);
		btnCajon126.setIcon(recImg);
		btnCajon126.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon126.setActionCommand("Cajon1");
		add(btnCajon126);

		btnCajon127 = new Boton();
		btnCajon127.setBounds(1043, 214, 119, 45);
		btnCajon127.setBorderPainted(false);
		btnCajon127.setContentAreaFilled(false);
		btnCajon127.setFocusPainted(false);
		btnCajon127.setIcon(recImg);
		btnCajon127.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon127.setActionCommand("Cajon1");
		add(btnCajon127);

		btnCajon128 = new Boton();
		btnCajon128.setBounds(1043, 260, 119, 45);
		btnCajon128.setBorderPainted(false);
		btnCajon128.setContentAreaFilled(false);
		btnCajon128.setFocusPainted(false);
		btnCajon128.setIcon(recImg);
		btnCajon128.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon128.setActionCommand("Cajon1");
		add(btnCajon128);

		btnCajon129 = new Boton();
		btnCajon129.setBounds(1043, 306, 119, 45);
		btnCajon129.setBorderPainted(false);
		btnCajon129.setContentAreaFilled(false);
		btnCajon129.setFocusPainted(false);
		btnCajon129.setIcon(recImg);
		btnCajon129.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon129.setActionCommand("Cajon1");
		add(btnCajon129);

		btnCajon130 = new Boton();
		btnCajon130.setBounds(1043, 352, 119, 45);
		btnCajon130.setBorderPainted(false);
		btnCajon130.setContentAreaFilled(false);
		btnCajon130.setFocusPainted(false);
		btnCajon130.setIcon(recImg);
		btnCajon130.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon130.setActionCommand("Cajon1");
		add(btnCajon130);

		btnCajon131 = new Boton();
		btnCajon131.setBounds(1043, 398, 119, 45);
		btnCajon131.setBorderPainted(false);
		btnCajon131.setContentAreaFilled(false);
		btnCajon131.setFocusPainted(false);
		btnCajon131.setIcon(recImg);
		btnCajon131.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon131.setActionCommand("Cajon1");
		add(btnCajon131);

		btnCajon132 = new Boton();
		btnCajon132.setBounds(1043, 444, 119, 45);
		btnCajon132.setBorderPainted(false);
		btnCajon132.setContentAreaFilled(false);
		btnCajon132.setFocusPainted(false);
		btnCajon132.setIcon(recImg);
		btnCajon132.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon132.setActionCommand("Cajon1");
		add(btnCajon132);

		btnCajon133 = new Boton();
		btnCajon133.setBounds(1043, 490, 119, 45);
		btnCajon133.setBorderPainted(false);
		btnCajon133.setContentAreaFilled(false);
		btnCajon133.setFocusPainted(false);
		btnCajon133.setIcon(recImg);
		btnCajon133.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon133.setActionCommand("Cajon1");
		add(btnCajon133);

		btnCajon134 = new Boton();
		btnCajon134.setBounds(1043, 536, 119, 45);
		btnCajon134.setBorderPainted(false);
		btnCajon134.setContentAreaFilled(false);
		btnCajon134.setFocusPainted(false);
		btnCajon134.setIcon(recImg);
		btnCajon134.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon134.setActionCommand("Cajon1");
		add(btnCajon134);

		btnCajon135 = new Boton();
		btnCajon135.setBounds(1043, 582, 119, 45);
		btnCajon135.setBorderPainted(false);
		btnCajon135.setContentAreaFilled(false);
		btnCajon135.setFocusPainted(false);
		btnCajon135.setIcon(recImg);
		btnCajon135.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon135.setActionCommand("Cajon1");
		add(btnCajon135);

		btnCajon136 = new Boton();
		btnCajon136.setBounds(1043, 628, 119, 45);
		btnCajon136.setBorderPainted(false);
		btnCajon136.setContentAreaFilled(false);
		btnCajon136.setFocusPainted(false);
		btnCajon136.setIcon(recImg);
		btnCajon136.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon136.setActionCommand("Cajon1");
		add(btnCajon136);

//---------------------------------------------------------------------------------------------		
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

//		fondo = new ImageIcon(getClass().getResource("/imagenes/Estante5.jpg"));
//		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(325, 517, Image.SCALE_SMOOTH));
//		lblEstante5 = new JLabel(recFondo);
//		lblEstante5.setSize(325, 517);
//		lblEstante5.setBounds(300, 100, 325, 517);
//		add(lblEstante5);

//-----------------------------------------------------------------------------------------------------------

		img = new ImageIcon("recursos/inicio.png");
		recImg = new ImageIcon(img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		btnInicio = new Boton();
//		btnInicio.setBounds(1090, 590, 100, 100);todos menos cajonero
		btnInicio.setBounds(1240, 590, 100, 100);
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
		// scrool.setBounds(680, 220, 320, 150);todos menos cajonero
		scrool.setBounds(1170, 200, 170, 250);
		add(scrool);

		fondo = new ImageIcon(getClass().getResource("/imagenes/fondoEntrada.jpg"));
		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(1350, 750, Image.SCALE_SMOOTH));
		lblImagenFondo = new JLabel(recFondo);
		lblImagenFondo.setSize(1350, 750);
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
