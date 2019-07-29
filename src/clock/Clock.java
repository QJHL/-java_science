package clock;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Clock extends Applet {

	public void paint(Graphics g) {
		g.drawOval(0, 0, 200, 200);

		/*
		 * g.drawOval(10, 10, 180, 180); g.drawLine(100, 0, 100, 5); g.drawString("12",
		 * 94, 20); g.drawLine(200, 100, 195, 100); g.drawString("3", 185, 105);
		 * g.drawLine(100, 200, 100, 195); g.drawString("6", 97, 190); g.drawLine(0,
		 * 100, 5, 100); g.drawString("9", 10, 105);
		 */

		for (int i = 1; i <= 60; i++) {

			g.drawLine(100 + (int) (100 * Math.sin((i / 60.0) * Math.PI * 2)),
					100 - (int) (100 * Math.cos((i / 60.0) * Math.PI * 2)),
					100 + (int) (95 * Math.sin((i / 60.0) * Math.PI * 2)),
					100 - (int) (95 * Math.cos((i / 60.0) * Math.PI * 2)));
		}

		for (int i = 1; i <= 12; i++) {
			g.drawString(i + "", 95 + (int) (82 * Math.sin((i / 12.0) * Math.PI * 2)),
					100 - (int) (82 * Math.cos((i / 12.0) * Math.PI * 2)));

			g.drawLine(100 + (int) (100 * Math.sin((i / 12.0) * Math.PI * 2)),
					100 - (int) (100 * Math.cos((i / 12.0) * Math.PI * 2)),
					100 + (int) (85 * Math.sin((i / 12.0) * Math.PI * 2)),
					100 - (int) (85 * Math.cos((i / 12.0) * Math.PI * 2)));
		}

		Date date = new Date();
		int hours = date.getHours();
		int minuters = date.getMinutes();
		int seconds = date.getSeconds();
		/* g.drawString(hours + ":" + minuters + ":" + seconds, 100, 100); */
		/*System.out.println(hours + ":" + minuters + ":" + seconds);*/
		SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
		String s = format.format(date);
		g.drawString(s, 100, 100);
		g.setColor(Color.green);
		g.drawLine(100, 100, 100 + (int) (90 * Math.sin((seconds / 60.0) * Math.PI * 2)),
				100 - (int) (90 * Math.cos((seconds / 60.0) * Math.PI * 2)));
		g.setColor(Color.BLUE);
		g.drawLine(100, 100, 100 + (int) (60 * Math.sin((minuters / 60.0) * Math.PI * 2)),
				100 - (int) (60 * Math.cos((minuters / 60.0) * Math.PI * 2)));
		g.setColor(Color.CYAN);
		g.drawLine(100, 100, 100 + (int) (30 * Math.sin((hours / 24.0) * Math.PI * 2)),
				100 - (int) (30 * Math.cos((hours / 24.0) * Math.PI * 2)));

		/*
		 * System.out.println("sin:"+Math.sin((seconds / 60.0) * Math.PI * 2));
		 * System.out.println("cos:"+Math.cos((seconds / 60.0) * Math.PI * 2));
		 */
		Clock clock = this;
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				clock.repaint();
			}
		}, 1000L);
	}
}
