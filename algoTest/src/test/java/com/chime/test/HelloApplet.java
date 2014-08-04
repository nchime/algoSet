package com.chime.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class HelloApplet extends java.applet.Applet implements Runnable {

	Font f = new Font("TimesRoman", Font.BOLD, 48);
	Color colors[] = new Color[50];
	Thread runner;

	public void start() {
		if (runner == null) {
			runner = new Thread(this);
			runner.start();
		}
	}

	public void stop() {
		runner = null;
	}

	public void run() {
		float c = 0;
		for (int i = 0; i < colors.length; i++) {
			colors[i] = Color.getHSBColor(c, (float) 1.0, (float) 1.0);
			c += .02;
		}

		int i = 0;
		Thread thisThread = Thread.currentThread();
		while (runner == thisThread) {
			setForeground(colors[i]);
			repaint();
			i++;
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
			if (i == colors.length)
				i = 0;
		}
	}

	public void paint(Graphics screen) {
		screen.setFont(f);
		screen.drawString("Hello, World!", 15, 50);
	}

}
