
package autohella.controller;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import autohella.view.VentanaPrincipal;

public class AplMain {

	public static void main(String[] args) throws Exception {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (UnsupportedLookAndFeelException e) {
		} catch (ClassNotFoundException e) {
		} catch (InstantiationException e) {
		} catch (IllegalAccessException e) {
		}
		Controller control = new Controller();
	}
}