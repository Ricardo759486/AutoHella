
package autohella.view;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class Boton extends JButton {
	
	float opacity = 0.9f;

	
	public Boton(String text) {
		super(text);
		addMouseListener(new EventButton());
	}

	public Boton() {
		super();
		addMouseListener(new EventButton());
	}

	public float getOpacity() {
		return opacity;
	}

	public void setOpacity(float opacity) {
		this.opacity = opacity;
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));
		super.paintComponent(g2);
	}

	public class EventButton extends MouseAdapter {

		public void mouseExited(MouseEvent me) {
			efectHover(1f, 0.5f, 0.03f, 10, false);
		}

		
		public void mouseEntered(MouseEvent me) {
			efectHover(0.5f, 1f, 0.03f, 10, true);
		}

		@Override
		public void mousePressed(MouseEvent me) {
			efectHover(1f, 0.6f, 0.1f, 1, false);
		}

		private void efectHover(float index, float range, float cont, int sleep, boolean event) {
			new Thread(() -> {
				for (float i = index; (event) ? i <= range : i >= range; i = (event) ? i + cont : i - cont) {
					setOpacity(i);
					try {
						Thread.sleep(sleep);
					} catch (InterruptedException e) {
					}

				}
			}).start();
		}
	}

}