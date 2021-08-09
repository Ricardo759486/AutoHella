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
		setVisible(false);
		// setSize(1350, 715);cajonero
		setSize(1200, 700);
		inicializarComponentes();
	}

	public void inicializarComponentes() {

		img = new ImageIcon("recursos/minimizar.png");
		recImg = new ImageIcon(img.getImage().getScaledInstance(37, 37, Image.SCALE_DEFAULT));
		btnMinimizar = new JButton();
		btnMinimizar.setBounds(1085, 1, 70, 70);// todos
//		btnMinimizar.setBounds(1235, 1, 70, 70);//cajonero
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
		btnCerrar.setBounds(1130, 1, 70, 70);// todos
//		btnCerrar.setBounds(1280, 1, 70, 70);// cajonero		
		btnCerrar.setBorderPainted(false);
		btnCerrar.setContentAreaFilled(false);
		btnCerrar.setFocusPainted(false);
		btnCerrar.setIcon(recImg);
		btnCerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCerrar.setActionCommand("CERRARVENTANA");
		add(btnCerrar);

//------------------------------------Estantes-------------------------------------------------------------------

		img = new ImageIcon("recursos/ubicacion.png");
// recImg = new ImageIcon(img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));-----VitrinaDerecha
// recImg = new ImageIcon(img.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));-----VitrinaCentral
// recImg = new ImageIcon(img.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));-----VitrinaIzquierda
// recImg = new ImageIcon(img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));-----Bateria
// recImg = new ImageIcon(img.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));-----VitrinaTracera
// recImg = new ImageIcon(img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));-----Correas
// recImg = new ImageIcon(img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));-----EstanteN°1-2-3-4
// recImg = new ImageIcon(img.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));-----EstanteN°6
// recImg = new ImageIcon(img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));-----EstanteN°7-8-9-10-11

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
		btnLugar5.setBorderPainted(false);
		btnLugar5.setContentAreaFilled(false);
		btnLugar5.setFocusPainted(false);
		btnLugar5.setIcon(recImg);
		btnLugar5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnLugar5.setActionCommand("lugar5");
		add(btnLugar5);

		btnLugar6 = new Boton();
// btnLugar6.setBounds(440, 415, 60, 60);-----VitrinaDerecha
// btnLugar6.setBounds(440, 415, 60, 60);-----VitrinaCentral
// btnLugar6.setBounds(415, 400, 35, 35);-----VitrinaIzquierda
// btnLugar6.setBounds(425, 510, 50, 50);-----Baterias
// btnLugar6.setBounds(360, 430, 50, 50);-----Correas
// btnLugar6.setBounds(410, 485, 50, 50);-----Estante N° 1-2
// btnLugar6.setBounds(425, 430, 50, 50);-----Estante N° 3-4-5-10
// btnLugar6.setBounds(400, 555, 60, 60);-----Estante N° 6-9-11
		btnLugar6.setBorderPainted(false);
		btnLugar6.setContentAreaFilled(false);
		btnLugar6.setFocusPainted(false);
		btnLugar6.setIcon(recImg);
		btnLugar6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnLugar6.setActionCommand("lugar6");
		add(btnLugar6);

		btnLugar7 = new Boton();
// btnLugar7.setBounds(440, 475, 60, 60);-----VitrinaDerecha
// btnLugar7.setBounds(440, 475, 60, 60);-----VitrinaCentral
// btnLugar7.setBounds(415, 445, 35, 35);-----VitrinaIzquierda
// btnLugar7.setBounds(360, 491, 50, 50);-----Correas
// btnLugar7.setBounds(410, 565, 50, 50);-----Estante N° 1-2
// btnLugar7.setBounds(425, 505, 50, 50);-----Estante N° 3-4-5-10
		btnLugar7.setBorderPainted(false);
		btnLugar7.setContentAreaFilled(false);
		btnLugar7.setFocusPainted(false);
		btnLugar7.setIcon(recImg);
		btnLugar7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnLugar7.setActionCommand("lugar7");
		add(btnLugar7);

		btnLugar8 = new Boton();
// btnLugar8.setBounds(440, 540, 60, 60);-----VitrinaDerecha
// btnLugar8.setBounds(440, 540, 60, 60);-----VitrinaCentral
// btnLugar8.setBounds(415, 495, 35, 35);-----VitrinaIzquierda
// btnLugar8.setBounds(425, 577, 50, 50);-----Estante N° 3-4-5-10
		btnLugar8.setBorderPainted(false);
		btnLugar8.setContentAreaFilled(false);
		btnLugar8.setFocusPainted(false);
		btnLugar8.setIcon(recImg);
		btnLugar8.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnLugar8.setActionCommand("lugar8");
		add(btnLugar8);

		btnLugar9 = new Boton();
// btnLugar9.setBounds(415, 540, 35, 35);-----VitrinaIzquierda
		btnLugar9.setBorderPainted(false);
		btnLugar9.setContentAreaFilled(false);
		btnLugar9.setFocusPainted(false);
		btnLugar9.setIcon(recImg);
		btnLugar9.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnLugar9.setActionCommand("lugar9");
		add(btnLugar9);

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
		btnCajon1.setVisible(false);
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
		btnCajon2.setActionCommand("Cajon2");
		btnCajon2.setVisible(false);
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
		btnCajon3.setActionCommand("Cajon3");
		btnCajon3.setVisible(false);
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
		btnCajon4.setActionCommand("Cajon4");
		btnCajon4.setVisible(false);
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
		btnCajon5.setActionCommand("Cajon5");
		btnCajon6.setVisible(false);
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
		btnCajon6.setActionCommand("Cajon6");
		btnCajon6.setVisible(false);
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
		btnCajon7.setActionCommand("Cajon7");
		btnCajon7.setVisible(false);
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
		btnCajon8.setActionCommand("Cajon8");
		btnCajon8.setVisible(false);
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
		btnCajon9.setActionCommand("Cajon9");
		btnCajon9.setVisible(false);
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
		btnCajon10.setActionCommand("Cajon10");
		btnCajon10.setVisible(false);
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
		btnCajon11.setActionCommand("Cajon11");
		btnCajon11.setVisible(false);
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
		btnCajon12.setActionCommand("Cajon12");
		btnCajon12.setVisible(false);
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
		btnCajon13.setActionCommand("Cajon13");
		btnCajon13.setVisible(false);
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
		btnCajon14.setActionCommand("Cajon14");
		btnCajon14.setVisible(false);
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
		btnCajon15.setActionCommand("Cajon15");
		btnCajon15.setVisible(false);
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
		btnCajon16.setActionCommand("Cajon16");
		btnCajon16.setVisible(false);
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
		btnCajon17.setActionCommand("Cajon17");
		btnCajon17.setVisible(false);
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
		btnCajon18.setActionCommand("Cajon18");
		btnCajon18.setVisible(false);
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
		btnCajon19.setActionCommand("Cajon19");
		btnCajon19.setVisible(false);
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
		btnCajon20.setActionCommand("Cajon20");
		btnCajon20.setVisible(false);
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
		btnCajon21.setActionCommand("Cajon21");
		btnCajon21.setVisible(false);
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
		btnCajon22.setActionCommand("Cajon22");
		btnCajon22.setVisible(false);
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
		btnCajon23.setActionCommand("Cajon23");
		btnCajon23.setVisible(false);
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
		btnCajon24.setActionCommand("Cajon24");
		btnCajon24.setVisible(false);
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
		btnCajon25.setActionCommand("Cajon25");
		btnCajon25.setVisible(false);
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
		btnCajon26.setActionCommand("Cajon26");
		btnCajon26.setVisible(false);
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
		btnCajon27.setActionCommand("Cajon27");
		btnCajon27.setVisible(false);
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
		btnCajon28.setActionCommand("Cajon28");
		btnCajon28.setVisible(false);
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
		btnCajon29.setActionCommand("Cajon29");
		btnCajon29.setVisible(false);
		add(btnCajon29);

		img = new ImageIcon("recursos/30.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon30 = new Boton();
		btnCajon30.setBounds(260, 111, 60, 80);
		btnCajon30.setBorderPainted(false);
		btnCajon30.setContentAreaFilled(false);
		btnCajon30.setFocusPainted(false);
		btnCajon30.setIcon(recImg);
		btnCajon30.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon30.setActionCommand("Cajon30");
		btnCajon30.setVisible(false);
		add(btnCajon30);

		img = new ImageIcon("recursos/31.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon31 = new Boton();
		btnCajon31.setBounds(260, 192, 60, 80);
		btnCajon31.setBorderPainted(false);
		btnCajon31.setContentAreaFilled(false);
		btnCajon31.setFocusPainted(false);
		btnCajon31.setIcon(recImg);
		btnCajon31.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon31.setActionCommand("Cajon31");
		btnCajon31.setVisible(false);
		add(btnCajon31);

		img = new ImageIcon("recursos/32.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon32 = new Boton();
		btnCajon32.setBounds(260, 273, 60, 80);
		btnCajon32.setBorderPainted(false);
		btnCajon32.setContentAreaFilled(false);
		btnCajon32.setFocusPainted(false);
		btnCajon32.setIcon(recImg);
		btnCajon32.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon32.setActionCommand("Cajon32");
		btnCajon32.setVisible(false);
		add(btnCajon32);

		img = new ImageIcon("recursos/33.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon33 = new Boton();
		btnCajon33.setBounds(260, 354, 60, 80);
		btnCajon33.setBorderPainted(false);
		btnCajon33.setContentAreaFilled(false);
		btnCajon33.setFocusPainted(false);
		btnCajon33.setIcon(recImg);
		btnCajon33.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon33.setActionCommand("Cajon33");
		btnCajon33.setVisible(false);
		add(btnCajon33);

		img = new ImageIcon("recursos/34.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon34 = new Boton();
		btnCajon34.setBounds(260, 435, 60, 80);
		btnCajon34.setBorderPainted(false);
		btnCajon34.setContentAreaFilled(false);
		btnCajon34.setFocusPainted(false);
		btnCajon34.setIcon(recImg);
		btnCajon34.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon34.setActionCommand("Cajon34");
		btnCajon34.setVisible(false);
		add(btnCajon34);

		img = new ImageIcon("recursos/35.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon35 = new Boton();
		btnCajon35.setBounds(260, 516, 60, 80);
		btnCajon35.setBorderPainted(false);
		btnCajon35.setContentAreaFilled(false);
		btnCajon35.setFocusPainted(false);
		btnCajon35.setIcon(recImg);
		btnCajon35.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon35.setActionCommand("Cajon35");
		btnCajon35.setVisible(false);
		add(btnCajon35);

		img = new ImageIcon("recursos/36.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 76, Image.SCALE_DEFAULT));
		btnCajon36 = new Boton();
		btnCajon36.setBounds(260, 597, 60, 76);
		btnCajon36.setBorderPainted(false);
		btnCajon36.setContentAreaFilled(false);
		btnCajon36.setFocusPainted(false);
		btnCajon36.setIcon(recImg);
		btnCajon36.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon36.setActionCommand("Cajon36");
		btnCajon36.setVisible(false);
		add(btnCajon36);

		// ---------------------------CUARTA
		// FILA--------------------------------------------

		img = new ImageIcon("recursos/37.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon37 = new Boton();
		btnCajon37.setBounds(321, 30, 119, 45);
		btnCajon37.setBorderPainted(false);
		btnCajon37.setContentAreaFilled(false);
		btnCajon37.setFocusPainted(false);
		btnCajon37.setIcon(recImg);
		btnCajon37.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon37.setActionCommand("Cajon37");
		btnCajon37.setVisible(false);
		add(btnCajon37);

		img = new ImageIcon("recursos/38.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon38 = new Boton();
		btnCajon38.setBounds(321, 76, 119, 45);
		btnCajon38.setBorderPainted(false);
		btnCajon38.setContentAreaFilled(false);
		btnCajon38.setFocusPainted(false);
		btnCajon38.setIcon(recImg);
		btnCajon38.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon38.setActionCommand("Cajon38");
		btnCajon38.setVisible(false);
		add(btnCajon38);

		img = new ImageIcon("recursos/39.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon39 = new Boton();
		btnCajon39.setBounds(321, 122, 119, 45);
		btnCajon39.setBorderPainted(false);
		btnCajon39.setContentAreaFilled(false);
		btnCajon39.setFocusPainted(false);
		btnCajon39.setIcon(recImg);
		btnCajon39.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon39.setActionCommand("Cajon39");
		btnCajon39.setVisible(false);
		add(btnCajon39);

		img = new ImageIcon("recursos/40.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon40 = new Boton();
		btnCajon40.setBounds(321, 168, 119, 45);
		btnCajon40.setBorderPainted(false);
		btnCajon40.setContentAreaFilled(false);
		btnCajon40.setFocusPainted(false);
		btnCajon40.setIcon(recImg);
		btnCajon40.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon40.setActionCommand("Cajon40");
		btnCajon40.setVisible(false);
		add(btnCajon40);

		img = new ImageIcon("recursos/41.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon41 = new Boton();
		btnCajon41.setBounds(321, 214, 119, 45);
		btnCajon41.setBorderPainted(false);
		btnCajon41.setContentAreaFilled(false);
		btnCajon41.setFocusPainted(false);
		btnCajon41.setIcon(recImg);
		btnCajon41.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon41.setActionCommand("Cajon41");
		btnCajon41.setVisible(false);
		add(btnCajon41);

		img = new ImageIcon("recursos/42.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon42 = new Boton();
		btnCajon42.setBounds(321, 260, 119, 45);
		btnCajon42.setBorderPainted(false);
		btnCajon42.setContentAreaFilled(false);
		btnCajon42.setFocusPainted(false);
		btnCajon42.setIcon(recImg);
		btnCajon42.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon42.setActionCommand("Cajon42");
		btnCajon42.setVisible(false);
		add(btnCajon42);

		img = new ImageIcon("recursos/43.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon43 = new Boton();
		btnCajon43.setBounds(321, 306, 119, 45);
		btnCajon43.setBorderPainted(false);
		btnCajon43.setContentAreaFilled(false);
		btnCajon43.setFocusPainted(false);
		btnCajon43.setIcon(recImg);
		btnCajon43.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon43.setActionCommand("Cajon43");
		btnCajon43.setVisible(false);
		add(btnCajon43);

		img = new ImageIcon("recursos/44.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon44 = new Boton();
		btnCajon44.setBounds(321, 352, 119, 45);
		btnCajon44.setBorderPainted(false);
		btnCajon44.setContentAreaFilled(false);
		btnCajon44.setFocusPainted(false);
		btnCajon44.setIcon(recImg);
		btnCajon44.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon44.setActionCommand("Cajon44");
		btnCajon44.setVisible(false);
		add(btnCajon44);

		img = new ImageIcon("recursos/45.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon45 = new Boton();
		btnCajon45.setBounds(321, 398, 119, 45);
		btnCajon45.setBorderPainted(false);
		btnCajon45.setContentAreaFilled(false);
		btnCajon45.setFocusPainted(false);
		btnCajon45.setIcon(recImg);
		btnCajon45.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon45.setActionCommand("Cajon45");
		btnCajon45.setVisible(false);
		add(btnCajon45);

		img = new ImageIcon("recursos/46.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon46 = new Boton();
		btnCajon46.setBounds(321, 444, 119, 45);
		btnCajon46.setBorderPainted(false);
		btnCajon46.setContentAreaFilled(false);
		btnCajon46.setFocusPainted(false);
		btnCajon46.setIcon(recImg);
		btnCajon46.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon46.setActionCommand("Cajon46");
		btnCajon46.setVisible(false);
		add(btnCajon46);

		img = new ImageIcon("recursos/47.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon47 = new Boton();
		btnCajon47.setBounds(321, 490, 119, 45);
		btnCajon47.setBorderPainted(false);
		btnCajon47.setContentAreaFilled(false);
		btnCajon47.setFocusPainted(false);
		btnCajon47.setIcon(recImg);
		btnCajon47.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon47.setActionCommand("Cajon47");
		btnCajon47.setVisible(false);
		add(btnCajon47);

		img = new ImageIcon("recursos/48.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon48 = new Boton();
		btnCajon48.setBounds(321, 536, 119, 45);
		btnCajon48.setBorderPainted(false);
		btnCajon48.setContentAreaFilled(false);
		btnCajon48.setFocusPainted(false);
		btnCajon48.setIcon(recImg);
		btnCajon48.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon48.setActionCommand("Cajon48");
		btnCajon48.setVisible(false);
		add(btnCajon48);

		img = new ImageIcon("recursos/49.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon49 = new Boton();
		btnCajon49.setBounds(321, 582, 119, 45);
		btnCajon49.setBorderPainted(false);
		btnCajon49.setContentAreaFilled(false);
		btnCajon49.setFocusPainted(false);
		btnCajon49.setIcon(recImg);
		btnCajon49.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon49.setActionCommand("Cajon49");
		btnCajon49.setVisible(false);
		add(btnCajon49);

		img = new ImageIcon("recursos/50.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon50 = new Boton();
		btnCajon50.setBounds(321, 628, 119, 45);
		btnCajon50.setBorderPainted(false);
		btnCajon50.setContentAreaFilled(false);
		btnCajon50.setFocusPainted(false);
		btnCajon50.setIcon(recImg);
		btnCajon50.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon50.setActionCommand("Cajon50");
		btnCajon50.setVisible(false);
		add(btnCajon50);

		// ---------------------------QUINTA
		// FILA--------------------------------------------

		img = new ImageIcon("recursos/51.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon51 = new Boton();
		btnCajon51.setBounds(441, 30, 119, 45);
		btnCajon51.setBorderPainted(false);
		btnCajon51.setContentAreaFilled(false);
		btnCajon51.setFocusPainted(false);
		btnCajon51.setIcon(recImg);
		btnCajon51.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon51.setActionCommand("Cajon51");
		btnCajon51.setVisible(false);
		add(btnCajon51);

		img = new ImageIcon("recursos/52.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon52 = new Boton();
		btnCajon52.setBounds(441, 76, 119, 45);
		btnCajon52.setBorderPainted(false);
		btnCajon52.setContentAreaFilled(false);
		btnCajon52.setFocusPainted(false);
		btnCajon52.setIcon(recImg);
		btnCajon52.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon52.setActionCommand("Cajon52");
		btnCajon52.setVisible(false);
		add(btnCajon52);

		img = new ImageIcon("recursos/53.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon53 = new Boton();
		btnCajon53.setBounds(441, 122, 119, 45);
		btnCajon53.setBorderPainted(false);
		btnCajon53.setContentAreaFilled(false);
		btnCajon53.setFocusPainted(false);
		btnCajon53.setIcon(recImg);
		btnCajon53.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon53.setActionCommand("Cajon53");
		btnCajon53.setVisible(false);
		add(btnCajon53);

		img = new ImageIcon("recursos/54.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon54 = new Boton();
		btnCajon54.setBounds(441, 168, 119, 45);
		btnCajon54.setBorderPainted(false);
		btnCajon54.setContentAreaFilled(false);
		btnCajon54.setFocusPainted(false);
		btnCajon54.setIcon(recImg);
		btnCajon54.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon54.setActionCommand("Cajon54");
		btnCajon54.setVisible(false);
		add(btnCajon54);

		img = new ImageIcon("recursos/55.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon55 = new Boton();
		btnCajon55.setBounds(441, 214, 119, 45);
		btnCajon55.setBorderPainted(false);
		btnCajon55.setContentAreaFilled(false);
		btnCajon55.setFocusPainted(false);
		btnCajon55.setIcon(recImg);
		btnCajon55.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon55.setActionCommand("Cajon55");
		btnCajon55.setVisible(false);
		add(btnCajon55);

		img = new ImageIcon("recursos/56.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon56 = new Boton();
		btnCajon56.setBounds(441, 260, 119, 45);
		btnCajon56.setBorderPainted(false);
		btnCajon56.setContentAreaFilled(false);
		btnCajon56.setFocusPainted(false);
		btnCajon56.setIcon(recImg);
		btnCajon56.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon56.setActionCommand("Cajon56");
		btnCajon56.setVisible(false);
		add(btnCajon56);

		img = new ImageIcon("recursos/57.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon57 = new Boton();
		btnCajon57.setBounds(441, 306, 119, 45);
		btnCajon57.setBorderPainted(false);
		btnCajon57.setContentAreaFilled(false);
		btnCajon57.setFocusPainted(false);
		btnCajon57.setIcon(recImg);
		btnCajon57.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon57.setActionCommand("Cajon57");
		btnCajon57.setVisible(false);
		add(btnCajon57);

		img = new ImageIcon("recursos/58.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon58 = new Boton();
		btnCajon58.setBounds(441, 352, 119, 45);
		btnCajon58.setBorderPainted(false);
		btnCajon58.setContentAreaFilled(false);
		btnCajon58.setFocusPainted(false);
		btnCajon58.setIcon(recImg);
		btnCajon58.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon58.setActionCommand("Cajon58");
		btnCajon58.setVisible(false);
		add(btnCajon58);

		img = new ImageIcon("recursos/59.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon59 = new Boton();
		btnCajon59.setBounds(441, 398, 119, 45);
		btnCajon59.setBorderPainted(false);
		btnCajon59.setContentAreaFilled(false);
		btnCajon59.setFocusPainted(false);
		btnCajon59.setIcon(recImg);
		btnCajon59.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon59.setActionCommand("Cajon59");
		btnCajon59.setVisible(false);
		add(btnCajon59);

		img = new ImageIcon("recursos/60.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon60 = new Boton();
		btnCajon60.setBounds(441, 444, 119, 45);
		btnCajon60.setBorderPainted(false);
		btnCajon60.setContentAreaFilled(false);
		btnCajon60.setFocusPainted(false);
		btnCajon60.setIcon(recImg);
		btnCajon60.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon60.setActionCommand("Cajon60");
		btnCajon60.setVisible(false);
		add(btnCajon60);

		img = new ImageIcon("recursos/61.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon61 = new Boton();
		btnCajon61.setBounds(441, 490, 119, 45);
		btnCajon61.setBorderPainted(false);
		btnCajon61.setContentAreaFilled(false);
		btnCajon61.setFocusPainted(false);
		btnCajon61.setIcon(recImg);
		btnCajon61.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon61.setActionCommand("Cajon61");
		btnCajon61.setVisible(false);
		add(btnCajon61);

		img = new ImageIcon("recursos/62.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon62 = new Boton();
		btnCajon62.setBounds(441, 536, 119, 45);
		btnCajon62.setBorderPainted(false);
		btnCajon62.setContentAreaFilled(false);
		btnCajon62.setFocusPainted(false);
		btnCajon62.setIcon(recImg);
		btnCajon62.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon62.setActionCommand("Cajon62");
		btnCajon62.setVisible(false);
		add(btnCajon62);

		img = new ImageIcon("recursos/63.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon63 = new Boton();
		btnCajon63.setBounds(441, 582, 119, 45);
		btnCajon63.setBorderPainted(false);
		btnCajon63.setContentAreaFilled(false);
		btnCajon63.setFocusPainted(false);
		btnCajon63.setIcon(recImg);
		btnCajon63.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon63.setActionCommand("Cajon63");
		btnCajon63.setVisible(false);
		add(btnCajon63);

		img = new ImageIcon("recursos/64.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon64 = new Boton();
		btnCajon64.setBounds(441, 628, 119, 45);
		btnCajon64.setBorderPainted(false);
		btnCajon64.setContentAreaFilled(false);
		btnCajon64.setFocusPainted(false);
		btnCajon64.setIcon(recImg);
		btnCajon64.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon64.setActionCommand("Cajon64");
		btnCajon64.setVisible(false);
		add(btnCajon64);

		// ---------------------------SEXTA
		// FILA--------------------------------------------
		img = new ImageIcon("recursos/65.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon65 = new Boton();
		btnCajon65.setBounds(561, 30, 60, 80);
		btnCajon65.setBorderPainted(false);
		btnCajon65.setContentAreaFilled(false);
		btnCajon65.setFocusPainted(false);
		btnCajon65.setIcon(recImg);
		btnCajon65.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon65.setActionCommand("Cajon65");
		btnCajon65.setVisible(false);
		add(btnCajon65);

		img = new ImageIcon("recursos/66.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon66 = new Boton();
		btnCajon66.setBounds(561, 111, 60, 80);
		btnCajon66.setBorderPainted(false);
		btnCajon66.setContentAreaFilled(false);
		btnCajon66.setFocusPainted(false);
		btnCajon66.setIcon(recImg);
		btnCajon66.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon66.setActionCommand("Cajon66");
		btnCajon66.setVisible(false);
		add(btnCajon66);

		img = new ImageIcon("recursos/67.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon67 = new Boton();
		btnCajon67.setBounds(561, 192, 60, 80);
		btnCajon67.setBorderPainted(false);
		btnCajon67.setContentAreaFilled(false);
		btnCajon67.setFocusPainted(false);
		btnCajon67.setIcon(recImg);
		btnCajon67.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon67.setActionCommand("Cajon67");
		btnCajon67.setVisible(false);
		add(btnCajon67);

		img = new ImageIcon("recursos/68.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon68 = new Boton();
		btnCajon68.setBounds(561, 273, 60, 80);
		btnCajon68.setBorderPainted(false);
		btnCajon68.setContentAreaFilled(false);
		btnCajon68.setFocusPainted(false);
		btnCajon68.setIcon(recImg);
		btnCajon68.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon68.setActionCommand("Cajon68");
		btnCajon68.setVisible(false);
		add(btnCajon68);

		img = new ImageIcon("recursos/69.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon69 = new Boton();
		btnCajon69.setBounds(561, 354, 60, 80);
		btnCajon69.setBorderPainted(false);
		btnCajon69.setContentAreaFilled(false);
		btnCajon69.setFocusPainted(false);
		btnCajon69.setIcon(recImg);
		btnCajon69.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon69.setActionCommand("Cajon69");
		btnCajon69.setVisible(false);
		add(btnCajon69);

		img = new ImageIcon("recursos/70.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon70 = new Boton();
		btnCajon70.setBounds(561, 435, 60, 80);
		btnCajon70.setBorderPainted(false);
		btnCajon70.setContentAreaFilled(false);
		btnCajon70.setFocusPainted(false);
		btnCajon70.setIcon(recImg);
		btnCajon70.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon70.setActionCommand("Cajon70");
		btnCajon70.setVisible(false);
		add(btnCajon70);

		img = new ImageIcon("recursos/71.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon71 = new Boton();
		btnCajon71.setBounds(561, 516, 60, 80);
		btnCajon71.setBorderPainted(false);
		btnCajon71.setContentAreaFilled(false);
		btnCajon71.setFocusPainted(false);
		btnCajon71.setIcon(recImg);
		btnCajon71.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon71.setActionCommand("Cajon71");
		btnCajon71.setVisible(false);
		add(btnCajon71);

		img = new ImageIcon("recursos/72.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 76, Image.SCALE_DEFAULT));
		btnCajon72 = new Boton();
		btnCajon72.setBounds(561, 597, 60, 76);
		btnCajon72.setBorderPainted(false);
		btnCajon72.setContentAreaFilled(false);
		btnCajon72.setFocusPainted(false);
		btnCajon72.setIcon(recImg);
		btnCajon72.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon72.setActionCommand("Cajon72");
		btnCajon72.setVisible(false);
		add(btnCajon72);

		// ---------------------------SEPTIMA
		// FILA--------------------------------------------

		img = new ImageIcon("recursos/73.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon73 = new Boton();
		btnCajon73.setBounds(622, 30, 119, 45);
		btnCajon73.setBorderPainted(false);
		btnCajon73.setContentAreaFilled(false);
		btnCajon73.setFocusPainted(false);
		btnCajon73.setIcon(recImg);
		btnCajon73.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon73.setActionCommand("Cajon73");
		btnCajon73.setVisible(false);
		add(btnCajon73);

		img = new ImageIcon("recursos/74.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon74 = new Boton();
		btnCajon74.setBounds(622, 76, 119, 45);
		btnCajon74.setBorderPainted(false);
		btnCajon74.setContentAreaFilled(false);
		btnCajon74.setFocusPainted(false);
		btnCajon74.setIcon(recImg);
		btnCajon74.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon74.setActionCommand("Cajon74");
		btnCajon74.setVisible(false);
		add(btnCajon74);

		img = new ImageIcon("recursos/75.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon75 = new Boton();
		btnCajon75.setBounds(622, 122, 119, 45);
		btnCajon75.setBorderPainted(false);
		btnCajon75.setContentAreaFilled(false);
		btnCajon75.setFocusPainted(false);
		btnCajon75.setIcon(recImg);
		btnCajon75.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon75.setActionCommand("Cajon75");
		btnCajon75.setVisible(false);
		add(btnCajon75);

		img = new ImageIcon("recursos/76.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon76 = new Boton();
		btnCajon76.setBounds(622, 168, 119, 45);
		btnCajon76.setBorderPainted(false);
		btnCajon76.setContentAreaFilled(false);
		btnCajon76.setFocusPainted(false);
		btnCajon76.setIcon(recImg);
		btnCajon76.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon76.setActionCommand("Cajon76");
		btnCajon76.setVisible(false);
		add(btnCajon76);

		img = new ImageIcon("recursos/77.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon77 = new Boton();
		btnCajon77.setBounds(622, 214, 119, 45);
		btnCajon77.setBorderPainted(false);
		btnCajon77.setContentAreaFilled(false);
		btnCajon77.setFocusPainted(false);
		btnCajon77.setIcon(recImg);
		btnCajon77.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon77.setActionCommand("Cajon77");
		btnCajon77.setVisible(false);
		add(btnCajon77);

		img = new ImageIcon("recursos/78.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon78 = new Boton();
		btnCajon78.setBounds(622, 260, 119, 45);
		btnCajon78.setBorderPainted(false);
		btnCajon78.setContentAreaFilled(false);
		btnCajon78.setFocusPainted(false);
		btnCajon78.setIcon(recImg);
		btnCajon78.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon78.setActionCommand("Cajon78");
		btnCajon78.setVisible(false);
		add(btnCajon78);

		img = new ImageIcon("recursos/79.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon79 = new Boton();
		btnCajon79.setBounds(622, 306, 119, 45);
		btnCajon79.setBorderPainted(false);
		btnCajon79.setContentAreaFilled(false);
		btnCajon79.setFocusPainted(false);
		btnCajon79.setIcon(recImg);
		btnCajon79.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon79.setActionCommand("Cajon79");
		btnCajon79.setVisible(false);
		add(btnCajon79);

		img = new ImageIcon("recursos/80.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon80 = new Boton();
		btnCajon80.setBounds(622, 352, 119, 45);
		btnCajon80.setBorderPainted(false);
		btnCajon80.setContentAreaFilled(false);
		btnCajon80.setFocusPainted(false);
		btnCajon80.setIcon(recImg);
		btnCajon80.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon80.setActionCommand("Cajon80");
		btnCajon80.setVisible(false);
		add(btnCajon80);

		img = new ImageIcon("recursos/81.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon81 = new Boton();
		btnCajon81.setBounds(622, 398, 119, 45);
		btnCajon81.setBorderPainted(false);
		btnCajon81.setContentAreaFilled(false);
		btnCajon81.setFocusPainted(false);
		btnCajon81.setIcon(recImg);
		btnCajon81.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon81.setActionCommand("Cajon81");
		btnCajon81.setVisible(false);
		add(btnCajon81);

		img = new ImageIcon("recursos/82.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon82 = new Boton();
		btnCajon82.setBounds(622, 444, 119, 45);
		btnCajon82.setBorderPainted(false);
		btnCajon82.setContentAreaFilled(false);
		btnCajon82.setFocusPainted(false);
		btnCajon82.setIcon(recImg);
		btnCajon82.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon82.setActionCommand("Cajon82");
		btnCajon82.setVisible(false);
		add(btnCajon82);

		img = new ImageIcon("recursos/83.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon83 = new Boton();
		btnCajon83.setBounds(622, 490, 119, 45);
		btnCajon83.setBorderPainted(false);
		btnCajon83.setContentAreaFilled(false);
		btnCajon83.setFocusPainted(false);
		btnCajon83.setIcon(recImg);
		btnCajon83.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon83.setActionCommand("Cajon83");
		btnCajon83.setVisible(false);
		add(btnCajon83);

		img = new ImageIcon("recursos/84.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon84 = new Boton();
		btnCajon84.setBounds(622, 536, 119, 45);
		btnCajon84.setBorderPainted(false);
		btnCajon84.setContentAreaFilled(false);
		btnCajon84.setFocusPainted(false);
		btnCajon84.setIcon(recImg);
		btnCajon84.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon84.setActionCommand("Cajon84");
		btnCajon84.setVisible(false);
		add(btnCajon84);

		img = new ImageIcon("recursos/85.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon85 = new Boton();
		btnCajon85.setBounds(622, 582, 119, 45);
		btnCajon85.setBorderPainted(false);
		btnCajon85.setContentAreaFilled(false);
		btnCajon85.setFocusPainted(false);
		btnCajon85.setIcon(recImg);
		btnCajon85.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon85.setActionCommand("Cajon85");
		btnCajon85.setVisible(false);
		add(btnCajon85);

		img = new ImageIcon("recursos/86.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon86 = new Boton();
		btnCajon86.setBounds(622, 628, 119, 45);
		btnCajon86.setBorderPainted(false);
		btnCajon86.setContentAreaFilled(false);
		btnCajon86.setFocusPainted(false);
		btnCajon86.setIcon(recImg);
		btnCajon86.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon86.setActionCommand("Cajon86");
		btnCajon86.setVisible(false);
		add(btnCajon86);

		// ---------------------------OCTAVA
		// FILA--------------------------------------------

		img = new ImageIcon("recursos/87.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon87 = new Boton();
		btnCajon87.setBounds(742, 30, 119, 45);
		btnCajon87.setBorderPainted(false);
		btnCajon87.setContentAreaFilled(false);
		btnCajon87.setFocusPainted(false);
		btnCajon87.setIcon(recImg);
		btnCajon87.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon87.setActionCommand("Cajon87");
		btnCajon87.setVisible(false);
		add(btnCajon87);

		img = new ImageIcon("recursos/88.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon88 = new Boton();
		btnCajon88.setBounds(742, 76, 119, 45);
		btnCajon88.setBorderPainted(false);
		btnCajon88.setContentAreaFilled(false);
		btnCajon88.setFocusPainted(false);
		btnCajon88.setIcon(recImg);
		btnCajon88.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon88.setActionCommand("Cajon88");
		btnCajon88.setVisible(false);
		add(btnCajon88);

		img = new ImageIcon("recursos/89.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon89 = new Boton();
		btnCajon89.setBounds(742, 122, 119, 45);
		btnCajon89.setBorderPainted(false);
		btnCajon89.setContentAreaFilled(false);
		btnCajon89.setFocusPainted(false);
		btnCajon89.setIcon(recImg);
		btnCajon89.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon89.setActionCommand("Cajon89");
		btnCajon89.setVisible(false);
		add(btnCajon89);

		img = new ImageIcon("recursos/90.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon90 = new Boton();
		btnCajon90.setBounds(742, 168, 119, 45);
		btnCajon90.setBorderPainted(false);
		btnCajon90.setContentAreaFilled(false);
		btnCajon90.setFocusPainted(false);
		btnCajon90.setIcon(recImg);
		btnCajon90.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon90.setActionCommand("Cajon90");
		btnCajon90.setVisible(false);
		add(btnCajon90);

		img = new ImageIcon("recursos/91.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon91 = new Boton();
		btnCajon91.setBounds(742, 214, 119, 45);
		btnCajon91.setBorderPainted(false);
		btnCajon91.setContentAreaFilled(false);
		btnCajon91.setFocusPainted(false);
		btnCajon91.setIcon(recImg);
		btnCajon91.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon91.setActionCommand("Cajon91");
		btnCajon91.setVisible(false);
		add(btnCajon91);

		img = new ImageIcon("recursos/92.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon92 = new Boton();
		btnCajon92.setBounds(742, 260, 119, 45);
		btnCajon92.setBorderPainted(false);
		btnCajon92.setContentAreaFilled(false);
		btnCajon92.setFocusPainted(false);
		btnCajon92.setIcon(recImg);
		btnCajon92.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon92.setActionCommand("Cajon92");
		btnCajon92.setVisible(false);
		add(btnCajon92);

		img = new ImageIcon("recursos/93.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon93 = new Boton();
		btnCajon93.setBounds(742, 306, 119, 45);
		btnCajon93.setBorderPainted(false);
		btnCajon93.setContentAreaFilled(false);
		btnCajon93.setFocusPainted(false);
		btnCajon93.setIcon(recImg);
		btnCajon93.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon93.setActionCommand("Cajon93");
		btnCajon93.setVisible(false);
		add(btnCajon93);

		img = new ImageIcon("recursos/94.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon94 = new Boton();
		btnCajon94.setBounds(742, 352, 119, 45);
		btnCajon94.setBorderPainted(false);
		btnCajon94.setContentAreaFilled(false);
		btnCajon94.setFocusPainted(false);
		btnCajon94.setIcon(recImg);
		btnCajon94.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon94.setActionCommand("Cajon94");
		btnCajon94.setVisible(false);
		add(btnCajon94);

		img = new ImageIcon("recursos/95.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon95 = new Boton();
		btnCajon95.setBounds(742, 398, 119, 45);
		btnCajon95.setBorderPainted(false);
		btnCajon95.setContentAreaFilled(false);
		btnCajon95.setFocusPainted(false);
		btnCajon95.setIcon(recImg);
		btnCajon95.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon95.setActionCommand("Cajon95");
		btnCajon95.setVisible(false);
		add(btnCajon95);

		img = new ImageIcon("recursos/96.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon96 = new Boton();
		btnCajon96.setBounds(742, 444, 119, 45);
		btnCajon96.setBorderPainted(false);
		btnCajon96.setContentAreaFilled(false);
		btnCajon96.setFocusPainted(false);
		btnCajon96.setIcon(recImg);
		btnCajon96.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon96.setActionCommand("Cajon96");
		btnCajon96.setVisible(false);
		add(btnCajon96);

		img = new ImageIcon("recursos/97.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon97 = new Boton();
		btnCajon97.setBounds(742, 490, 119, 45);
		btnCajon97.setBorderPainted(false);
		btnCajon97.setContentAreaFilled(false);
		btnCajon97.setFocusPainted(false);
		btnCajon97.setIcon(recImg);
		btnCajon97.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon97.setActionCommand("Cajon97");
		btnCajon97.setVisible(false);
		add(btnCajon97);

		img = new ImageIcon("recursos/98.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon98 = new Boton();
		btnCajon98.setBounds(742, 536, 119, 45);
		btnCajon98.setBorderPainted(false);
		btnCajon98.setContentAreaFilled(false);
		btnCajon98.setFocusPainted(false);
		btnCajon98.setIcon(recImg);
		btnCajon98.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon98.setActionCommand("Cajon98");
		btnCajon98.setVisible(false);
		add(btnCajon98);

		img = new ImageIcon("recursos/99.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon99 = new Boton();
		btnCajon99.setBounds(742, 582, 119, 45);
		btnCajon99.setBorderPainted(false);
		btnCajon99.setContentAreaFilled(false);
		btnCajon99.setFocusPainted(false);
		btnCajon99.setIcon(recImg);
		btnCajon99.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon99.setActionCommand("Cajon99");
		btnCajon99.setVisible(false);
		add(btnCajon99);

		img = new ImageIcon("recursos/100.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon100 = new Boton();
		btnCajon100.setBounds(742, 628, 119, 45);
		btnCajon100.setBorderPainted(false);
		btnCajon100.setContentAreaFilled(false);
		btnCajon100.setFocusPainted(false);
		btnCajon100.setIcon(recImg);
		btnCajon100.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon100.setActionCommand("Cajon100");
		btnCajon100.setVisible(false);
		add(btnCajon100);

		// ---------------------------NOVENA
		// FILA--------------------------------------------

		img = new ImageIcon("recursos/101.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon101 = new Boton();
		btnCajon101.setBounds(862, 30, 60, 80);
		btnCajon101.setBorderPainted(false);
		btnCajon101.setContentAreaFilled(false);
		btnCajon101.setFocusPainted(false);
		btnCajon101.setIcon(recImg);
		btnCajon101.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon101.setActionCommand("Cajon101");
		btnCajon101.setVisible(false);
		add(btnCajon101);

		img = new ImageIcon("recursos/102.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon102 = new Boton();
		btnCajon102.setBounds(862, 111, 60, 80);
		btnCajon102.setBorderPainted(false);
		btnCajon102.setContentAreaFilled(false);
		btnCajon102.setFocusPainted(false);
		btnCajon102.setIcon(recImg);
		btnCajon102.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon102.setActionCommand("Cajon102");
		btnCajon102.setVisible(false);
		add(btnCajon102);

		img = new ImageIcon("recursos/103.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon103 = new Boton();
		btnCajon103.setBounds(862, 192, 60, 80);
		btnCajon103.setBorderPainted(false);
		btnCajon103.setContentAreaFilled(false);
		btnCajon103.setFocusPainted(false);
		btnCajon103.setIcon(recImg);
		btnCajon103.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon103.setActionCommand("Cajon103");
		btnCajon103.setVisible(false);
		add(btnCajon103);

		img = new ImageIcon("recursos/104.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon104 = new Boton();
		btnCajon104.setBounds(862, 273, 60, 80);
		btnCajon104.setBorderPainted(false);
		btnCajon104.setContentAreaFilled(false);
		btnCajon104.setFocusPainted(false);
		btnCajon104.setIcon(recImg);
		btnCajon104.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon104.setActionCommand("Cajon104");
		btnCajon104.setVisible(false);
		add(btnCajon104);

		img = new ImageIcon("recursos/105.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon105 = new Boton();
		btnCajon105.setBounds(862, 354, 60, 80);
		btnCajon105.setBorderPainted(false);
		btnCajon105.setContentAreaFilled(false);
		btnCajon105.setFocusPainted(false);
		btnCajon105.setIcon(recImg);
		btnCajon105.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon105.setActionCommand("Cajon105");
		btnCajon105.setVisible(false);
		add(btnCajon105);

		img = new ImageIcon("recursos/106.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon106 = new Boton();
		btnCajon106.setBounds(862, 435, 60, 80);
		btnCajon106.setBorderPainted(false);
		btnCajon106.setContentAreaFilled(false);
		btnCajon106.setFocusPainted(false);
		btnCajon106.setIcon(recImg);
		btnCajon106.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon106.setActionCommand("Cajon106");
		btnCajon106.setVisible(false);
		add(btnCajon106);

		img = new ImageIcon("recursos/107.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
		btnCajon107 = new Boton();
		btnCajon107.setBounds(862, 516, 60, 80);
		btnCajon107.setBorderPainted(false);
		btnCajon107.setContentAreaFilled(false);
		btnCajon107.setFocusPainted(false);
		btnCajon107.setIcon(recImg);
		btnCajon107.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon107.setActionCommand("Cajon107");
		btnCajon107.setVisible(false);
		add(btnCajon107);

		img = new ImageIcon("recursos/108.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(60, 76, Image.SCALE_DEFAULT));
		btnCajon108 = new Boton();
		btnCajon108.setBounds(862, 597, 60, 76);
		btnCajon108.setBorderPainted(false);
		btnCajon108.setContentAreaFilled(false);
		btnCajon108.setFocusPainted(false);
		btnCajon108.setIcon(recImg);
		btnCajon108.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon108.setActionCommand("Cajon108");
		btnCajon108.setVisible(false);
		add(btnCajon108);

		// ---------------------------DECIMA
		// FILA--------------------------------------------

		img = new ImageIcon("recursos/109.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon109 = new Boton();
		btnCajon109.setBounds(923, 30, 119, 45);
		btnCajon109.setBorderPainted(false);
		btnCajon109.setContentAreaFilled(false);
		btnCajon109.setFocusPainted(false);
		btnCajon109.setIcon(recImg);
		btnCajon109.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon109.setActionCommand("Cajon109");
		btnCajon109.setVisible(false);
		add(btnCajon109);

		img = new ImageIcon("recursos/110.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon110 = new Boton();
		btnCajon110.setBounds(923, 76, 119, 45);
		btnCajon110.setBorderPainted(false);
		btnCajon110.setContentAreaFilled(false);
		btnCajon110.setFocusPainted(false);
		btnCajon110.setIcon(recImg);
		btnCajon110.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon110.setActionCommand("Cajon110");
		btnCajon110.setVisible(false);
		add(btnCajon110);

		img = new ImageIcon("recursos/111.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon111 = new Boton();
		btnCajon111.setBounds(923, 122, 119, 45);
		btnCajon111.setBorderPainted(false);
		btnCajon111.setContentAreaFilled(false);
		btnCajon111.setFocusPainted(false);
		btnCajon111.setIcon(recImg);
		btnCajon111.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon111.setActionCommand("Cajon111");
		btnCajon111.setVisible(false);
		add(btnCajon111);

		img = new ImageIcon("recursos/112.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon112 = new Boton();
		btnCajon112.setBounds(923, 168, 119, 45);
		btnCajon112.setBorderPainted(false);
		btnCajon112.setContentAreaFilled(false);
		btnCajon112.setFocusPainted(false);
		btnCajon112.setIcon(recImg);
		btnCajon112.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon112.setActionCommand("Cajon112");
		btnCajon112.setVisible(false);
		add(btnCajon112);

		img = new ImageIcon("recursos/113.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon113 = new Boton();
		btnCajon113.setBounds(923, 214, 119, 45);
		btnCajon113.setBorderPainted(false);
		btnCajon113.setContentAreaFilled(false);
		btnCajon113.setFocusPainted(false);
		btnCajon113.setIcon(recImg);
		btnCajon113.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon113.setActionCommand("Cajon113");
		btnCajon113.setVisible(false);
		add(btnCajon113);

		img = new ImageIcon("recursos/114.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon114 = new Boton();
		btnCajon114.setBounds(923, 260, 119, 45);
		btnCajon114.setBorderPainted(false);
		btnCajon114.setContentAreaFilled(false);
		btnCajon114.setFocusPainted(false);
		btnCajon114.setIcon(recImg);
		btnCajon114.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon114.setActionCommand("Cajon114");
		btnCajon114.setVisible(false);
		add(btnCajon114);

		img = new ImageIcon("recursos/115.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon115 = new Boton();
		btnCajon115.setBounds(923, 306, 119, 45);
		btnCajon115.setBorderPainted(false);
		btnCajon115.setContentAreaFilled(false);
		btnCajon115.setFocusPainted(false);
		btnCajon115.setIcon(recImg);
		btnCajon115.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon115.setActionCommand("Cajon115");
		btnCajon115.setVisible(false);
		add(btnCajon115);

		img = new ImageIcon("recursos/116.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon116 = new Boton();
		btnCajon116.setBounds(923, 352, 119, 45);
		btnCajon116.setBorderPainted(false);
		btnCajon116.setContentAreaFilled(false);
		btnCajon116.setFocusPainted(false);
		btnCajon116.setIcon(recImg);
		btnCajon116.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon116.setActionCommand("Cajon116");
		btnCajon116.setVisible(false);
		add(btnCajon116);

		img = new ImageIcon("recursos/117.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon117 = new Boton();
		btnCajon117.setBounds(923, 398, 119, 45);
		btnCajon117.setBorderPainted(false);
		btnCajon117.setContentAreaFilled(false);
		btnCajon117.setFocusPainted(false);
		btnCajon117.setIcon(recImg);
		btnCajon117.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon117.setActionCommand("Cajon117");
		btnCajon117.setVisible(false);
		add(btnCajon117);

		img = new ImageIcon("recursos/118.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon118 = new Boton();
		btnCajon118.setBounds(923, 444, 119, 45);
		btnCajon118.setBorderPainted(false);
		btnCajon118.setContentAreaFilled(false);
		btnCajon118.setFocusPainted(false);
		btnCajon118.setIcon(recImg);
		btnCajon118.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon118.setActionCommand("Cajon118");
		btnCajon118.setVisible(false);
		add(btnCajon118);

		img = new ImageIcon("recursos/119.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon119 = new Boton();
		btnCajon119.setBounds(923, 490, 119, 45);
		btnCajon119.setBorderPainted(false);
		btnCajon119.setContentAreaFilled(false);
		btnCajon119.setFocusPainted(false);
		btnCajon119.setIcon(recImg);
		btnCajon119.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon119.setActionCommand("Cajon119");
		btnCajon119.setVisible(false);
		add(btnCajon119);

		img = new ImageIcon("recursos/120.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon120 = new Boton();
		btnCajon120.setBounds(923, 536, 119, 45);
		btnCajon120.setBorderPainted(false);
		btnCajon120.setContentAreaFilled(false);
		btnCajon120.setFocusPainted(false);
		btnCajon120.setIcon(recImg);
		btnCajon120.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon120.setActionCommand("Cajon120");
		btnCajon120.setVisible(false);
		add(btnCajon120);

		img = new ImageIcon("recursos/121.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon121 = new Boton();
		btnCajon121.setBounds(923, 582, 119, 45);
		btnCajon121.setBorderPainted(false);
		btnCajon121.setContentAreaFilled(false);
		btnCajon121.setFocusPainted(false);
		btnCajon121.setIcon(recImg);
		btnCajon121.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon121.setActionCommand("Cajon121");
		btnCajon121.setVisible(false);
		add(btnCajon121);

		img = new ImageIcon("recursos/122.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon122 = new Boton();
		btnCajon122.setBounds(923, 628, 119, 45);
		btnCajon122.setBorderPainted(false);
		btnCajon122.setContentAreaFilled(false);
		btnCajon122.setFocusPainted(false);
		btnCajon122.setIcon(recImg);
		btnCajon122.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon122.setActionCommand("Cajon122");
		btnCajon122.setVisible(false);
		add(btnCajon122);

		// ---------------------------ONCEAVA
		// FILA--------------------------------------------

		img = new ImageIcon("recursos/123.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon123 = new Boton();
		btnCajon123.setBounds(1043, 30, 119, 45);
		btnCajon123.setBorderPainted(false);
		btnCajon123.setContentAreaFilled(false);
		btnCajon123.setFocusPainted(false);
		btnCajon123.setIcon(recImg);
		btnCajon123.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon123.setActionCommand("Cajon123");
		btnCajon123.setVisible(false);
		add(btnCajon123);

		img = new ImageIcon("recursos/124.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon124 = new Boton();
		btnCajon124.setBounds(1043, 76, 119, 45);
		btnCajon124.setBorderPainted(false);
		btnCajon124.setContentAreaFilled(false);
		btnCajon124.setFocusPainted(false);
		btnCajon124.setIcon(recImg);
		btnCajon124.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon124.setActionCommand("Cajon124");
		btnCajon124.setVisible(false);
		add(btnCajon124);

		img = new ImageIcon("recursos/125.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon125 = new Boton();
		btnCajon125.setBounds(1043, 122, 119, 45);
		btnCajon125.setBorderPainted(false);
		btnCajon125.setContentAreaFilled(false);
		btnCajon125.setFocusPainted(false);
		btnCajon125.setIcon(recImg);
		btnCajon125.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon125.setActionCommand("Cajon125");
		btnCajon125.setVisible(false);
		add(btnCajon125);

		img = new ImageIcon("recursos/126.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon126 = new Boton();
		btnCajon126.setBounds(1043, 168, 119, 45);
		btnCajon126.setBorderPainted(false);
		btnCajon126.setContentAreaFilled(false);
		btnCajon126.setFocusPainted(false);
		btnCajon126.setIcon(recImg);
		btnCajon126.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon126.setActionCommand("Cajon126");
		btnCajon126.setVisible(false);
		add(btnCajon126);

		img = new ImageIcon("recursos/127.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon127 = new Boton();
		btnCajon127.setBounds(1043, 214, 119, 45);
		btnCajon127.setBorderPainted(false);
		btnCajon127.setContentAreaFilled(false);
		btnCajon127.setFocusPainted(false);
		btnCajon127.setIcon(recImg);
		btnCajon127.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon127.setActionCommand("Cajon127");
		btnCajon127.setVisible(false);
		add(btnCajon127);

		img = new ImageIcon("recursos/128.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon128 = new Boton();
		btnCajon128.setBounds(1043, 260, 119, 45);
		btnCajon128.setBorderPainted(false);
		btnCajon128.setContentAreaFilled(false);
		btnCajon128.setFocusPainted(false);
		btnCajon128.setIcon(recImg);
		btnCajon128.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon128.setActionCommand("Cajon128");
		btnCajon128.setVisible(false);
		add(btnCajon128);

		img = new ImageIcon("recursos/129.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon129 = new Boton();
		btnCajon129.setBounds(1043, 306, 119, 45);
		btnCajon129.setBorderPainted(false);
		btnCajon129.setContentAreaFilled(false);
		btnCajon129.setFocusPainted(false);
		btnCajon129.setIcon(recImg);
		btnCajon129.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon129.setActionCommand("Cajon129");
		btnCajon129.setVisible(false);
		add(btnCajon129);

		img = new ImageIcon("recursos/130.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon130 = new Boton();
		btnCajon130.setBounds(1043, 352, 119, 45);
		btnCajon130.setBorderPainted(false);
		btnCajon130.setContentAreaFilled(false);
		btnCajon130.setFocusPainted(false);
		btnCajon130.setIcon(recImg);
		btnCajon130.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon130.setActionCommand("Cajon130");
		btnCajon130.setVisible(false);
		add(btnCajon130);

		img = new ImageIcon("recursos/131.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon131 = new Boton();
		btnCajon131.setBounds(1043, 398, 119, 45);
		btnCajon131.setBorderPainted(false);
		btnCajon131.setContentAreaFilled(false);
		btnCajon131.setFocusPainted(false);
		btnCajon131.setIcon(recImg);
		btnCajon131.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon131.setActionCommand("Cajon131");
		btnCajon131.setVisible(false);
		add(btnCajon131);

		img = new ImageIcon("recursos/132.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon132 = new Boton();
		btnCajon132.setBounds(1043, 444, 119, 45);
		btnCajon132.setBorderPainted(false);
		btnCajon132.setContentAreaFilled(false);
		btnCajon132.setFocusPainted(false);
		btnCajon132.setIcon(recImg);
		btnCajon132.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon132.setActionCommand("Cajon132");
		btnCajon132.setVisible(false);
		add(btnCajon132);

		img = new ImageIcon("recursos/133.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon133 = new Boton();
		btnCajon133.setBounds(1043, 490, 119, 45);
		btnCajon133.setBorderPainted(false);
		btnCajon133.setContentAreaFilled(false);
		btnCajon133.setFocusPainted(false);
		btnCajon133.setIcon(recImg);
		btnCajon133.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon133.setActionCommand("Cajon133");
		btnCajon133.setVisible(false);
		add(btnCajon133);

		img = new ImageIcon("recursos/134.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon134 = new Boton();
		btnCajon134.setBounds(1043, 536, 119, 45);
		btnCajon134.setBorderPainted(false);
		btnCajon134.setContentAreaFilled(false);
		btnCajon134.setFocusPainted(false);
		btnCajon134.setIcon(recImg);
		btnCajon134.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon134.setActionCommand("Cajon134");
		btnCajon134.setVisible(false);
		add(btnCajon134);

		img = new ImageIcon("recursos/135.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon135 = new Boton();
		btnCajon135.setBounds(1043, 582, 119, 45);
		btnCajon135.setBorderPainted(false);
		btnCajon135.setContentAreaFilled(false);
		btnCajon135.setFocusPainted(false);
		btnCajon135.setIcon(recImg);
		btnCajon135.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon135.setActionCommand("Cajon135");
		btnCajon135.setVisible(false);
		add(btnCajon135);

		img = new ImageIcon("recursos/136.jpg");
		recImg = new ImageIcon(img.getImage().getScaledInstance(119, 45, Image.SCALE_DEFAULT));
		btnCajon136 = new Boton();
		btnCajon136.setBounds(1043, 628, 119, 45);
		btnCajon136.setBorderPainted(false);
		btnCajon136.setContentAreaFilled(false);
		btnCajon136.setFocusPainted(false);
		btnCajon136.setIcon(recImg);
		btnCajon136.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCajon136.setActionCommand("Cajon136");
		btnCajon136.setVisible(false);
		add(btnCajon136);

//---------------------------------------------------------------------------------------------		
//----------------------------Entrada----------------------------------------------------------

		fondo = new ImageIcon(getClass().getResource("/imagenes/VitrinaDerechaPuestos.jpg"));
		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(338, 579, Image.SCALE_SMOOTH));
		lblVitrinaDerecha = new JLabel(recFondo);
		lblVitrinaDerecha.setSize(338, 579);
		lblVitrinaDerecha.setBounds(300, 60, 338, 579);
		lblVitrinaDerecha.setVisible(false);
		add(lblVitrinaDerecha);

		fondo = new ImageIcon(getClass().getResource("/imagenes/VitrinaCentral.jpg"));
		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(446, 386, Image.SCALE_SMOOTH));
		lblVitrinaCentral = new JLabel(recFondo);
		lblVitrinaCentral.setSize(446, 386);
		lblVitrinaCentral.setBounds(200, 180, 446, 386);
		lblVitrinaCentral.setVisible(false);
		add(lblVitrinaCentral);

		fondo = new ImageIcon(getClass().getResource("/imagenes/VitrinaIzquierdaPuestos.jpg"));
		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(376, 517, Image.SCALE_SMOOTH));
		lblVitrinaDerecha = new JLabel(recFondo);
		lblVitrinaDerecha.setSize(376, 517);
		lblVitrinaDerecha.setBounds(250, 90, 376, 517);
		lblVitrinaDerecha.setVisible(false);
		add(lblVitrinaDerecha);

		fondo = new ImageIcon(getClass().getResource("/imagenes/BateriasPuestos.jpg"));
		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(291, 517, Image.SCALE_SMOOTH));
		lblBaterias = new JLabel(recFondo);
		lblBaterias.setSize(291, 517);
		lblBaterias.setBounds(300, 90, 291, 517);
		lblBaterias.setVisible(false);
		add(lblBaterias);

		fondo = new ImageIcon(getClass().getResource("/imagenes/VitrinaTraseraPuestos.jpg"));
		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(441, 291, Image.SCALE_SMOOTH));
		lblVitrinaTrasera = new JLabel(recFondo);
		lblVitrinaTrasera.setSize(441, 291);
		lblVitrinaTrasera.setBounds(200, 200, 441, 291);
		lblVitrinaTrasera.setVisible(false);
		add(lblVitrinaTrasera);

		fondo = new ImageIcon(getClass().getResource("/imagenes/CorreasPuestos.jpg"));
		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(632, 400, Image.SCALE_SMOOTH));
		lblCorreas = new JLabel(recFondo);
		lblCorreas.setSize(632, 400);
		lblCorreas.setBounds(30, 150, 632, 400);
		lblCorreas.setVisible(false);
		add(lblCorreas);

		fondo = new ImageIcon(getClass().getResource("/imagenes/Estante7.jpg"));
		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(367, 617, Image.SCALE_SMOOTH));
		lblEstante7 = new JLabel(recFondo);
		lblEstante7.setSize(367, 617);
		lblEstante7.setBounds(260, 50, 367, 617);
		lblEstante7.setVisible(false);
		add(lblEstante7);

		fondo = new ImageIcon(getClass().getResource("/imagenes/Estante8.jpg"));
		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(348, 617, Image.SCALE_SMOOTH));
		lblEstante8 = new JLabel(recFondo);
		lblEstante8.setSize(348, 617);
		lblEstante8.setBounds(280, 50, 348, 617);
		lblEstante8.setVisible(false);
		add(lblEstante8);

		fondo = new ImageIcon(getClass().getResource("/imagenes/Estante6.jpg"));
		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(391, 616, Image.SCALE_SMOOTH));
		lblEstante6 = new JLabel(recFondo);
		lblEstante6.setSize(391, 616);
		lblEstante6.setBounds(230, 50, 391, 616);
		lblEstante6.setVisible(false);
		add(lblEstante6);

		fondo = new ImageIcon(getClass().getResource("/imagenes/Estante5.jpg"));
		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(325, 517, Image.SCALE_SMOOTH));
		lblEstante5 = new JLabel(recFondo);
		lblEstante5.setSize(325, 517);
		lblEstante5.setBounds(300, 100, 325, 517);
		lblEstante5.setVisible(false);
		add(lblEstante5);

//-----------------------------------------------------------------------------------------------------------

		img = new ImageIcon("recursos/inicio.png");
		recImg = new ImageIcon(img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		btnInicio = new Boton();
		btnInicio.setBounds(1090, 590, 100, 100);// todos menos cajonero
//		btnInicio.setBounds(1240, 590, 100, 100);cojenero
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
		scrool.setBounds(680, 220, 320, 150);// todos menos cajonero
//		scrool.setBounds(1170, 200, 170, 250);cajonero
		add(scrool);

		fondo = new ImageIcon(getClass().getResource("/imagenes/fondoEntrada.jpg"));
// recFondo = new ImageIcon(fondo.getImage().getScaledInstance(1350, 750, Image.SCALE_SMOOTH));cajonero
		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(1200, 700, Image.SCALE_SMOOTH));
		lblImagenFondo = new JLabel(recFondo);
// lblImagenFondo.setSize(1350, 750);cajonero
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

	public JLabel getLblVitrinaDerecha() {
		return lblVitrinaDerecha;
	}

	public void setLblVitrinaDerecha(JLabel lblVitrinaDerecha) {
		this.lblVitrinaDerecha = lblVitrinaDerecha;
	}

	public JLabel getLblVitrinaCentral() {
		return lblVitrinaCentral;
	}

	public void setLblVitrinaCentral(JLabel lblVitrinaCentral) {
		this.lblVitrinaCentral = lblVitrinaCentral;
	}

	public JLabel getLblBaterias() {
		return lblBaterias;
	}

	public void setLblBaterias(JLabel lblBaterias) {
		this.lblBaterias = lblBaterias;
	}

	public JLabel getLblVitrinaTrasera() {
		return lblVitrinaTrasera;
	}

	public void setLblVitrinaTrasera(JLabel lblVitrinaTrasera) {
		this.lblVitrinaTrasera = lblVitrinaTrasera;
	}

	public JLabel getLblCorreas() {
		return lblCorreas;
	}

	public void setLblCorreas(JLabel lblCorreas) {
		this.lblCorreas = lblCorreas;
	}

	public JLabel getLblEstante5() {
		return lblEstante5;
	}

	public void setLblEstante5(JLabel lblEstante5) {
		this.lblEstante5 = lblEstante5;
	}

	public JLabel getLblEstante6() {
		return lblEstante6;
	}

	public void setLblEstante6(JLabel lblEstante6) {
		this.lblEstante6 = lblEstante6;
	}

	public JLabel getLblEstante7() {
		return lblEstante7;
	}

	public void setLblEstante7(JLabel lblEstante7) {
		this.lblEstante7 = lblEstante7;
	}

	public JLabel getLblEstante8() {
		return lblEstante8;
	}

	public void setLblEstante8(JLabel lblEstante8) {
		this.lblEstante8 = lblEstante8;
	}

	public JTextArea getTexto() {
		return texto;
	}

	public void setTexto(JTextArea texto) {
		this.texto = texto;
	}

	public JTextArea getCajonero() {
		return cajonero;
	}

	public void setCajonero(JTextArea cajonero) {
		this.cajonero = cajonero;
	}

	public JScrollPane getScrool() {
		return scrool;
	}

	public void setScrool(JScrollPane scrool) {
		this.scrool = scrool;
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

	public Boton getBtnInicio() {
		return btnInicio;
	}

	public void setBtnInicio(Boton btnInicio) {
		this.btnInicio = btnInicio;
	}

	public Boton getBtnLugar1() {
		return btnLugar1;
	}

	public void setBtnLugar1(Boton btnLugar1) {
		this.btnLugar1 = btnLugar1;
	}

	public Boton getBtnLugar2() {
		return btnLugar2;
	}

	public void setBtnLugar2(Boton btnLugar2) {
		this.btnLugar2 = btnLugar2;
	}

	public Boton getBtnLugar3() {
		return btnLugar3;
	}

	public void setBtnLugar3(Boton btnLugar3) {
		this.btnLugar3 = btnLugar3;
	}

	public Boton getBtnLugar4() {
		return btnLugar4;
	}

	public void setBtnLugar4(Boton btnLugar4) {
		this.btnLugar4 = btnLugar4;
	}

	public Boton getBtnLugar5() {
		return btnLugar5;
	}

	public void setBtnLugar5(Boton btnLugar5) {
		this.btnLugar5 = btnLugar5;
	}

	public Boton getBtnLugar6() {
		return btnLugar6;
	}

	public void setBtnLugar6(Boton btnLugar6) {
		this.btnLugar6 = btnLugar6;
	}

	public Boton getBtnLugar7() {
		return btnLugar7;
	}

	public void setBtnLugar7(Boton btnLugar7) {
		this.btnLugar7 = btnLugar7;
	}

	public Boton getBtnLugar8() {
		return btnLugar8;
	}

	public void setBtnLugar8(Boton btnLugar8) {
		this.btnLugar8 = btnLugar8;
	}

	public Boton getBtnLugar9() {
		return btnLugar9;
	}

	public void setBtnLugar9(Boton btnLugar9) {
		this.btnLugar9 = btnLugar9;
	}

	public Boton getBtnCajon1() {
		return btnCajon1;
	}

	public void setBtnCajon1(Boton btnCajon1) {
		this.btnCajon1 = btnCajon1;
	}

	public Boton getBtnCajon2() {
		return btnCajon2;
	}

	public void setBtnCajon2(Boton btnCajon2) {
		this.btnCajon2 = btnCajon2;
	}

	public Boton getBtnCajon3() {
		return btnCajon3;
	}

	public void setBtnCajon3(Boton btnCajon3) {
		this.btnCajon3 = btnCajon3;
	}

	public Boton getBtnCajon4() {
		return btnCajon4;
	}

	public void setBtnCajon4(Boton btnCajon4) {
		this.btnCajon4 = btnCajon4;
	}

	public Boton getBtnCajon5() {
		return btnCajon5;
	}

	public void setBtnCajon5(Boton btnCajon5) {
		this.btnCajon5 = btnCajon5;
	}

	public Boton getBtnCajon6() {
		return btnCajon6;
	}

	public void setBtnCajon6(Boton btnCajon6) {
		this.btnCajon6 = btnCajon6;
	}

	public Boton getBtnCajon7() {
		return btnCajon7;
	}

	public void setBtnCajon7(Boton btnCajon7) {
		this.btnCajon7 = btnCajon7;
	}

	public Boton getBtnCajon8() {
		return btnCajon8;
	}

	public void setBtnCajon8(Boton btnCajon8) {
		this.btnCajon8 = btnCajon8;
	}

	public Boton getBtnCajon9() {
		return btnCajon9;
	}

	public void setBtnCajon9(Boton btnCajon9) {
		this.btnCajon9 = btnCajon9;
	}

	public Boton getBtnCajon10() {
		return btnCajon10;
	}

	public void setBtnCajon10(Boton btnCajon10) {
		this.btnCajon10 = btnCajon10;
	}

	public Boton getBtnCajon11() {
		return btnCajon11;
	}

	public void setBtnCajon11(Boton btnCajon11) {
		this.btnCajon11 = btnCajon11;
	}

	public Boton getBtnCajon12() {
		return btnCajon12;
	}

	public void setBtnCajon12(Boton btnCajon12) {
		this.btnCajon12 = btnCajon12;
	}

	public Boton getBtnCajon13() {
		return btnCajon13;
	}

	public void setBtnCajon13(Boton btnCajon13) {
		this.btnCajon13 = btnCajon13;
	}

	public Boton getBtnCajon14() {
		return btnCajon14;
	}

	public void setBtnCajon14(Boton btnCajon14) {
		this.btnCajon14 = btnCajon14;
	}

	public Boton getBtnCajon15() {
		return btnCajon15;
	}

	public void setBtnCajon15(Boton btnCajon15) {
		this.btnCajon15 = btnCajon15;
	}

	public Boton getBtnCajon16() {
		return btnCajon16;
	}

	public void setBtnCajon16(Boton btnCajon16) {
		this.btnCajon16 = btnCajon16;
	}

	public Boton getBtnCajon17() {
		return btnCajon17;
	}

	public void setBtnCajon17(Boton btnCajon17) {
		this.btnCajon17 = btnCajon17;
	}

	public Boton getBtnCajon18() {
		return btnCajon18;
	}

	public void setBtnCajon18(Boton btnCajon18) {
		this.btnCajon18 = btnCajon18;
	}

	public Boton getBtnCajon19() {
		return btnCajon19;
	}

	public void setBtnCajon19(Boton btnCajon19) {
		this.btnCajon19 = btnCajon19;
	}

	public Boton getBtnCajon20() {
		return btnCajon20;
	}

	public void setBtnCajon20(Boton btnCajon20) {
		this.btnCajon20 = btnCajon20;
	}

	public Boton getBtnCajon21() {
		return btnCajon21;
	}

	public void setBtnCajon21(Boton btnCajon21) {
		this.btnCajon21 = btnCajon21;
	}

	public Boton getBtnCajon22() {
		return btnCajon22;
	}

	public void setBtnCajon22(Boton btnCajon22) {
		this.btnCajon22 = btnCajon22;
	}

	public Boton getBtnCajon23() {
		return btnCajon23;
	}

	public void setBtnCajon23(Boton btnCajon23) {
		this.btnCajon23 = btnCajon23;
	}

	public Boton getBtnCajon24() {
		return btnCajon24;
	}

	public void setBtnCajon24(Boton btnCajon24) {
		this.btnCajon24 = btnCajon24;
	}

	public Boton getBtnCajon25() {
		return btnCajon25;
	}

	public void setBtnCajon25(Boton btnCajon25) {
		this.btnCajon25 = btnCajon25;
	}

	public Boton getBtnCajon26() {
		return btnCajon26;
	}

	public void setBtnCajon26(Boton btnCajon26) {
		this.btnCajon26 = btnCajon26;
	}

	public Boton getBtnCajon27() {
		return btnCajon27;
	}

	public void setBtnCajon27(Boton btnCajon27) {
		this.btnCajon27 = btnCajon27;
	}

	public Boton getBtnCajon28() {
		return btnCajon28;
	}

	public void setBtnCajon28(Boton btnCajon28) {
		this.btnCajon28 = btnCajon28;
	}

	public Boton getBtnCajon29() {
		return btnCajon29;
	}

	public void setBtnCajon29(Boton btnCajon29) {
		this.btnCajon29 = btnCajon29;
	}

	public Boton getBtnCajon30() {
		return btnCajon30;
	}

	public void setBtnCajon30(Boton btnCajon30) {
		this.btnCajon30 = btnCajon30;
	}

	public Boton getBtnCajon31() {
		return btnCajon31;
	}

	public void setBtnCajon31(Boton btnCajon31) {
		this.btnCajon31 = btnCajon31;
	}

	public Boton getBtnCajon32() {
		return btnCajon32;
	}

	public void setBtnCajon32(Boton btnCajon32) {
		this.btnCajon32 = btnCajon32;
	}

	public Boton getBtnCajon33() {
		return btnCajon33;
	}

	public void setBtnCajon33(Boton btnCajon33) {
		this.btnCajon33 = btnCajon33;
	}

	public Boton getBtnCajon34() {
		return btnCajon34;
	}

	public void setBtnCajon34(Boton btnCajon34) {
		this.btnCajon34 = btnCajon34;
	}

	public Boton getBtnCajon35() {
		return btnCajon35;
	}

	public void setBtnCajon35(Boton btnCajon35) {
		this.btnCajon35 = btnCajon35;
	}

	public Boton getBtnCajon36() {
		return btnCajon36;
	}

	public void setBtnCajon36(Boton btnCajon36) {
		this.btnCajon36 = btnCajon36;
	}

	public Boton getBtnCajon37() {
		return btnCajon37;
	}

	public void setBtnCajon37(Boton btnCajon37) {
		this.btnCajon37 = btnCajon37;
	}

	public Boton getBtnCajon38() {
		return btnCajon38;
	}

	public void setBtnCajon38(Boton btnCajon38) {
		this.btnCajon38 = btnCajon38;
	}

	public Boton getBtnCajon39() {
		return btnCajon39;
	}

	public void setBtnCajon39(Boton btnCajon39) {
		this.btnCajon39 = btnCajon39;
	}

	public Boton getBtnCajon40() {
		return btnCajon40;
	}

	public void setBtnCajon40(Boton btnCajon40) {
		this.btnCajon40 = btnCajon40;
	}

	public Boton getBtnCajon41() {
		return btnCajon41;
	}

	public void setBtnCajon41(Boton btnCajon41) {
		this.btnCajon41 = btnCajon41;
	}

	public Boton getBtnCajon42() {
		return btnCajon42;
	}

	public void setBtnCajon42(Boton btnCajon42) {
		this.btnCajon42 = btnCajon42;
	}

	public Boton getBtnCajon43() {
		return btnCajon43;
	}

	public void setBtnCajon43(Boton btnCajon43) {
		this.btnCajon43 = btnCajon43;
	}

	public Boton getBtnCajon44() {
		return btnCajon44;
	}

	public void setBtnCajon44(Boton btnCajon44) {
		this.btnCajon44 = btnCajon44;
	}

	public Boton getBtnCajon45() {
		return btnCajon45;
	}

	public void setBtnCajon45(Boton btnCajon45) {
		this.btnCajon45 = btnCajon45;
	}

	public Boton getBtnCajon46() {
		return btnCajon46;
	}

	public void setBtnCajon46(Boton btnCajon46) {
		this.btnCajon46 = btnCajon46;
	}

	public Boton getBtnCajon47() {
		return btnCajon47;
	}

	public void setBtnCajon47(Boton btnCajon47) {
		this.btnCajon47 = btnCajon47;
	}

	public Boton getBtnCajon48() {
		return btnCajon48;
	}

	public void setBtnCajon48(Boton btnCajon48) {
		this.btnCajon48 = btnCajon48;
	}

	public Boton getBtnCajon49() {
		return btnCajon49;
	}

	public void setBtnCajon49(Boton btnCajon49) {
		this.btnCajon49 = btnCajon49;
	}

	public Boton getBtnCajon50() {
		return btnCajon50;
	}

	public void setBtnCajon50(Boton btnCajon50) {
		this.btnCajon50 = btnCajon50;
	}

	public Boton getBtnCajon51() {
		return btnCajon51;
	}

	public void setBtnCajon51(Boton btnCajon51) {
		this.btnCajon51 = btnCajon51;
	}

	public Boton getBtnCajon52() {
		return btnCajon52;
	}

	public void setBtnCajon52(Boton btnCajon52) {
		this.btnCajon52 = btnCajon52;
	}

	public Boton getBtnCajon53() {
		return btnCajon53;
	}

	public void setBtnCajon53(Boton btnCajon53) {
		this.btnCajon53 = btnCajon53;
	}

	public Boton getBtnCajon54() {
		return btnCajon54;
	}

	public void setBtnCajon54(Boton btnCajon54) {
		this.btnCajon54 = btnCajon54;
	}

	public Boton getBtnCajon55() {
		return btnCajon55;
	}

	public void setBtnCajon55(Boton btnCajon55) {
		this.btnCajon55 = btnCajon55;
	}

	public Boton getBtnCajon56() {
		return btnCajon56;
	}

	public void setBtnCajon56(Boton btnCajon56) {
		this.btnCajon56 = btnCajon56;
	}

	public Boton getBtnCajon57() {
		return btnCajon57;
	}

	public void setBtnCajon57(Boton btnCajon57) {
		this.btnCajon57 = btnCajon57;
	}

	public Boton getBtnCajon58() {
		return btnCajon58;
	}

	public void setBtnCajon58(Boton btnCajon58) {
		this.btnCajon58 = btnCajon58;
	}

	public Boton getBtnCajon59() {
		return btnCajon59;
	}

	public void setBtnCajon59(Boton btnCajon59) {
		this.btnCajon59 = btnCajon59;
	}

	public Boton getBtnCajon60() {
		return btnCajon60;
	}

	public void setBtnCajon60(Boton btnCajon60) {
		this.btnCajon60 = btnCajon60;
	}

	public Boton getBtnCajon61() {
		return btnCajon61;
	}

	public void setBtnCajon61(Boton btnCajon61) {
		this.btnCajon61 = btnCajon61;
	}

	public Boton getBtnCajon62() {
		return btnCajon62;
	}

	public void setBtnCajon62(Boton btnCajon62) {
		this.btnCajon62 = btnCajon62;
	}

	public Boton getBtnCajon63() {
		return btnCajon63;
	}

	public void setBtnCajon63(Boton btnCajon63) {
		this.btnCajon63 = btnCajon63;
	}

	public Boton getBtnCajon64() {
		return btnCajon64;
	}

	public void setBtnCajon64(Boton btnCajon64) {
		this.btnCajon64 = btnCajon64;
	}

	public Boton getBtnCajon65() {
		return btnCajon65;
	}

	public void setBtnCajon65(Boton btnCajon65) {
		this.btnCajon65 = btnCajon65;
	}

	public Boton getBtnCajon66() {
		return btnCajon66;
	}

	public void setBtnCajon66(Boton btnCajon66) {
		this.btnCajon66 = btnCajon66;
	}

	public Boton getBtnCajon67() {
		return btnCajon67;
	}

	public void setBtnCajon67(Boton btnCajon67) {
		this.btnCajon67 = btnCajon67;
	}

	public Boton getBtnCajon68() {
		return btnCajon68;
	}

	public void setBtnCajon68(Boton btnCajon68) {
		this.btnCajon68 = btnCajon68;
	}

	public Boton getBtnCajon69() {
		return btnCajon69;
	}

	public void setBtnCajon69(Boton btnCajon69) {
		this.btnCajon69 = btnCajon69;
	}

	public Boton getBtnCajon70() {
		return btnCajon70;
	}

	public void setBtnCajon70(Boton btnCajon70) {
		this.btnCajon70 = btnCajon70;
	}

	public Boton getBtnCajon71() {
		return btnCajon71;
	}

	public void setBtnCajon71(Boton btnCajon71) {
		this.btnCajon71 = btnCajon71;
	}

	public Boton getBtnCajon72() {
		return btnCajon72;
	}

	public void setBtnCajon72(Boton btnCajon72) {
		this.btnCajon72 = btnCajon72;
	}

	public Boton getBtnCajon73() {
		return btnCajon73;
	}

	public void setBtnCajon73(Boton btnCajon73) {
		this.btnCajon73 = btnCajon73;
	}

	public Boton getBtnCajon74() {
		return btnCajon74;
	}

	public void setBtnCajon74(Boton btnCajon74) {
		this.btnCajon74 = btnCajon74;
	}

	public Boton getBtnCajon75() {
		return btnCajon75;
	}

	public void setBtnCajon75(Boton btnCajon75) {
		this.btnCajon75 = btnCajon75;
	}

	public Boton getBtnCajon76() {
		return btnCajon76;
	}

	public void setBtnCajon76(Boton btnCajon76) {
		this.btnCajon76 = btnCajon76;
	}

	public Boton getBtnCajon77() {
		return btnCajon77;
	}

	public void setBtnCajon77(Boton btnCajon77) {
		this.btnCajon77 = btnCajon77;
	}

	public Boton getBtnCajon78() {
		return btnCajon78;
	}

	public void setBtnCajon78(Boton btnCajon78) {
		this.btnCajon78 = btnCajon78;
	}

	public Boton getBtnCajon79() {
		return btnCajon79;
	}

	public void setBtnCajon79(Boton btnCajon79) {
		this.btnCajon79 = btnCajon79;
	}

	public Boton getBtnCajon80() {
		return btnCajon80;
	}

	public void setBtnCajon80(Boton btnCajon80) {
		this.btnCajon80 = btnCajon80;
	}

	public Boton getBtnCajon81() {
		return btnCajon81;
	}

	public void setBtnCajon81(Boton btnCajon81) {
		this.btnCajon81 = btnCajon81;
	}

	public Boton getBtnCajon82() {
		return btnCajon82;
	}

	public void setBtnCajon82(Boton btnCajon82) {
		this.btnCajon82 = btnCajon82;
	}

	public Boton getBtnCajon83() {
		return btnCajon83;
	}

	public void setBtnCajon83(Boton btnCajon83) {
		this.btnCajon83 = btnCajon83;
	}

	public Boton getBtnCajon84() {
		return btnCajon84;
	}

	public void setBtnCajon84(Boton btnCajon84) {
		this.btnCajon84 = btnCajon84;
	}

	public Boton getBtnCajon85() {
		return btnCajon85;
	}

	public void setBtnCajon85(Boton btnCajon85) {
		this.btnCajon85 = btnCajon85;
	}

	public Boton getBtnCajon86() {
		return btnCajon86;
	}

	public void setBtnCajon86(Boton btnCajon86) {
		this.btnCajon86 = btnCajon86;
	}

	public Boton getBtnCajon87() {
		return btnCajon87;
	}

	public void setBtnCajon87(Boton btnCajon87) {
		this.btnCajon87 = btnCajon87;
	}

	public Boton getBtnCajon88() {
		return btnCajon88;
	}

	public void setBtnCajon88(Boton btnCajon88) {
		this.btnCajon88 = btnCajon88;
	}

	public Boton getBtnCajon89() {
		return btnCajon89;
	}

	public void setBtnCajon89(Boton btnCajon89) {
		this.btnCajon89 = btnCajon89;
	}

	public Boton getBtnCajon90() {
		return btnCajon90;
	}

	public void setBtnCajon90(Boton btnCajon90) {
		this.btnCajon90 = btnCajon90;
	}

	public Boton getBtnCajon91() {
		return btnCajon91;
	}

	public void setBtnCajon91(Boton btnCajon91) {
		this.btnCajon91 = btnCajon91;
	}

	public Boton getBtnCajon92() {
		return btnCajon92;
	}

	public void setBtnCajon92(Boton btnCajon92) {
		this.btnCajon92 = btnCajon92;
	}

	public Boton getBtnCajon93() {
		return btnCajon93;
	}

	public void setBtnCajon93(Boton btnCajon93) {
		this.btnCajon93 = btnCajon93;
	}

	public Boton getBtnCajon94() {
		return btnCajon94;
	}

	public void setBtnCajon94(Boton btnCajon94) {
		this.btnCajon94 = btnCajon94;
	}

	public Boton getBtnCajon95() {
		return btnCajon95;
	}

	public void setBtnCajon95(Boton btnCajon95) {
		this.btnCajon95 = btnCajon95;
	}

	public Boton getBtnCajon96() {
		return btnCajon96;
	}

	public void setBtnCajon96(Boton btnCajon96) {
		this.btnCajon96 = btnCajon96;
	}

	public Boton getBtnCajon97() {
		return btnCajon97;
	}

	public void setBtnCajon97(Boton btnCajon97) {
		this.btnCajon97 = btnCajon97;
	}

	public Boton getBtnCajon98() {
		return btnCajon98;
	}

	public void setBtnCajon98(Boton btnCajon98) {
		this.btnCajon98 = btnCajon98;
	}

	public Boton getBtnCajon99() {
		return btnCajon99;
	}

	public void setBtnCajon99(Boton btnCajon99) {
		this.btnCajon99 = btnCajon99;
	}

	public Boton getBtnCajon100() {
		return btnCajon100;
	}

	public void setBtnCajon100(Boton btnCajon100) {
		this.btnCajon100 = btnCajon100;
	}

	public Boton getBtnCajon101() {
		return btnCajon101;
	}

	public void setBtnCajon101(Boton btnCajon101) {
		this.btnCajon101 = btnCajon101;
	}

	public Boton getBtnCajon102() {
		return btnCajon102;
	}

	public void setBtnCajon102(Boton btnCajon102) {
		this.btnCajon102 = btnCajon102;
	}

	public Boton getBtnCajon103() {
		return btnCajon103;
	}

	public void setBtnCajon103(Boton btnCajon103) {
		this.btnCajon103 = btnCajon103;
	}

	public Boton getBtnCajon104() {
		return btnCajon104;
	}

	public void setBtnCajon104(Boton btnCajon104) {
		this.btnCajon104 = btnCajon104;
	}

	public Boton getBtnCajon105() {
		return btnCajon105;
	}

	public void setBtnCajon105(Boton btnCajon105) {
		this.btnCajon105 = btnCajon105;
	}

	public Boton getBtnCajon106() {
		return btnCajon106;
	}

	public void setBtnCajon106(Boton btnCajon106) {
		this.btnCajon106 = btnCajon106;
	}

	public Boton getBtnCajon107() {
		return btnCajon107;
	}

	public void setBtnCajon107(Boton btnCajon107) {
		this.btnCajon107 = btnCajon107;
	}

	public Boton getBtnCajon108() {
		return btnCajon108;
	}

	public void setBtnCajon108(Boton btnCajon108) {
		this.btnCajon108 = btnCajon108;
	}

	public Boton getBtnCajon109() {
		return btnCajon109;
	}

	public void setBtnCajon109(Boton btnCajon109) {
		this.btnCajon109 = btnCajon109;
	}

	public Boton getBtnCajon110() {
		return btnCajon110;
	}

	public void setBtnCajon110(Boton btnCajon110) {
		this.btnCajon110 = btnCajon110;
	}

	public Boton getBtnCajon111() {
		return btnCajon111;
	}

	public void setBtnCajon111(Boton btnCajon111) {
		this.btnCajon111 = btnCajon111;
	}

	public Boton getBtnCajon112() {
		return btnCajon112;
	}

	public void setBtnCajon112(Boton btnCajon112) {
		this.btnCajon112 = btnCajon112;
	}

	public Boton getBtnCajon113() {
		return btnCajon113;
	}

	public void setBtnCajon113(Boton btnCajon113) {
		this.btnCajon113 = btnCajon113;
	}

	public Boton getBtnCajon114() {
		return btnCajon114;
	}

	public void setBtnCajon114(Boton btnCajon114) {
		this.btnCajon114 = btnCajon114;
	}

	public Boton getBtnCajon115() {
		return btnCajon115;
	}

	public void setBtnCajon115(Boton btnCajon115) {
		this.btnCajon115 = btnCajon115;
	}

	public Boton getBtnCajon116() {
		return btnCajon116;
	}

	public void setBtnCajon116(Boton btnCajon116) {
		this.btnCajon116 = btnCajon116;
	}

	public Boton getBtnCajon117() {
		return btnCajon117;
	}

	public void setBtnCajon117(Boton btnCajon117) {
		this.btnCajon117 = btnCajon117;
	}

	public Boton getBtnCajon118() {
		return btnCajon118;
	}

	public void setBtnCajon118(Boton btnCajon118) {
		this.btnCajon118 = btnCajon118;
	}

	public Boton getBtnCajon119() {
		return btnCajon119;
	}

	public void setBtnCajon119(Boton btnCajon119) {
		this.btnCajon119 = btnCajon119;
	}

	public Boton getBtnCajon120() {
		return btnCajon120;
	}

	public void setBtnCajon120(Boton btnCajon120) {
		this.btnCajon120 = btnCajon120;
	}

	public Boton getBtnCajon121() {
		return btnCajon121;
	}

	public void setBtnCajon121(Boton btnCajon121) {
		this.btnCajon121 = btnCajon121;
	}

	public Boton getBtnCajon122() {
		return btnCajon122;
	}

	public void setBtnCajon122(Boton btnCajon122) {
		this.btnCajon122 = btnCajon122;
	}

	public Boton getBtnCajon123() {
		return btnCajon123;
	}

	public void setBtnCajon123(Boton btnCajon123) {
		this.btnCajon123 = btnCajon123;
	}

	public Boton getBtnCajon124() {
		return btnCajon124;
	}

	public void setBtnCajon124(Boton btnCajon124) {
		this.btnCajon124 = btnCajon124;
	}

	public Boton getBtnCajon125() {
		return btnCajon125;
	}

	public void setBtnCajon125(Boton btnCajon125) {
		this.btnCajon125 = btnCajon125;
	}

	public Boton getBtnCajon126() {
		return btnCajon126;
	}

	public void setBtnCajon126(Boton btnCajon126) {
		this.btnCajon126 = btnCajon126;
	}

	public Boton getBtnCajon127() {
		return btnCajon127;
	}

	public void setBtnCajon127(Boton btnCajon127) {
		this.btnCajon127 = btnCajon127;
	}

	public Boton getBtnCajon128() {
		return btnCajon128;
	}

	public void setBtnCajon128(Boton btnCajon128) {
		this.btnCajon128 = btnCajon128;
	}

	public Boton getBtnCajon129() {
		return btnCajon129;
	}

	public void setBtnCajon129(Boton btnCajon129) {
		this.btnCajon129 = btnCajon129;
	}

	public Boton getBtnCajon130() {
		return btnCajon130;
	}

	public void setBtnCajon130(Boton btnCajon130) {
		this.btnCajon130 = btnCajon130;
	}

	public Boton getBtnCajon131() {
		return btnCajon131;
	}

	public void setBtnCajon131(Boton btnCajon131) {
		this.btnCajon131 = btnCajon131;
	}

	public Boton getBtnCajon132() {
		return btnCajon132;
	}

	public void setBtnCajon132(Boton btnCajon132) {
		this.btnCajon132 = btnCajon132;
	}

	public Boton getBtnCajon133() {
		return btnCajon133;
	}

	public void setBtnCajon133(Boton btnCajon133) {
		this.btnCajon133 = btnCajon133;
	}

	public Boton getBtnCajon134() {
		return btnCajon134;
	}

	public void setBtnCajon134(Boton btnCajon134) {
		this.btnCajon134 = btnCajon134;
	}

	public Boton getBtnCajon135() {
		return btnCajon135;
	}

	public void setBtnCajon135(Boton btnCajon135) {
		this.btnCajon135 = btnCajon135;
	}

	public Boton getBtnCajon136() {
		return btnCajon136;
	}

	public void setBtnCajon136(Boton btnCajon136) {
		this.btnCajon136 = btnCajon136;
	}

}
