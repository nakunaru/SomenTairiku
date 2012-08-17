package main;

import twitter4j.*;

public class SomenTairiku {
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainWindow().setVisible(true);
			}
		});

		System.setProperty("twitter4j.debug", "true");
		Data data = Data.getInstance();
		try {
			data.loadData();
		} catch (Exception e) {
			e.printStackTrace();
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new AuthWindow().setVisible(true);
				}
			});
		}
	}
}
