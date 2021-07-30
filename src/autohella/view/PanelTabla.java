package autohella.view;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class PanelTabla extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tablaInformacionApostadores;
	private DefaultTableModel modeloTablaApostadores;
	private JScrollPane scrollTablaInformacionApostadores;
	private ImageIcon fondo, recFondo;
	private JLabel lblImagenFondo;


	public PanelTabla() {
		//setBorder(new TitledBorder("Información apostadores"));
		setLayout(new BorderLayout());
		
		fondo = new ImageIcon(getClass().getResource("/imagenes/fondoVintage.jpg"));
		recFondo = new ImageIcon(fondo.getImage().getScaledInstance(1200, 700, Image.SCALE_SMOOTH));
		lblImagenFondo = new JLabel(recFondo);
		lblImagenFondo.setSize(1200, 700);

		modeloTablaApostadores = new DefaultTableModel();
		modeloTablaApostadores.fireTableStructureChanged();
		tablaInformacionApostadores = new JTable(modeloTablaApostadores);
		tablaInformacionApostadores.setEnabled(false);

		modeloTablaApostadores.addColumn("Referencia");
		modeloTablaApostadores.addColumn("Nombre");
		modeloTablaApostadores.addColumn("Marca");
		modeloTablaApostadores.addColumn("Descripcion");
		modeloTablaApostadores.addColumn("Cantidad");
		modeloTablaApostadores.addColumn("Precio");

		scrollTablaInformacionApostadores = new JScrollPane(tablaInformacionApostadores);

		//botonLeerInformacionApostadores = new JButton("Actualizar tabla");
		//botonLeerInformacionApostadores.setActionCommand(COMMAND_LEER_INFORMACION_APOSTADORES);
		//add(lblImagenFondo);
		this.add(scrollTablaInformacionApostadores, BorderLayout.CENTER);
		//this.add(botonLeerInformacionApostadores, BorderLayout.PAGE_END);

	}
	
	public void actualizarTabla(String[][] data) {
		modeloTablaApostadores.setRowCount(0);
		for (int i = 0; i < data.length; i++) {
			modeloTablaApostadores.addRow(data[i]);
		}
	}

	public JTable getTablaInformacionApostadores() {
		return tablaInformacionApostadores;
	}
	
	public void setTablaInformacionApostadores(JTable tablaInformacionApostadores) {
		this.tablaInformacionApostadores = tablaInformacionApostadores;
	}

}

