package br.com.rafael.views;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JTable;

public class Dashboard {
	
	public Dashboard() {
	}
	
	public void sceneDashboard(String userName) {
		JFrame frame = new JFrame("Dashboard");
		frame.setSize(600, 400);
		frame.setLayout(new BorderLayout());
		
		Panel panel = new Panel(new GridLayout(2, 1));
		Label titleLabel = new Label("Dashboard", Label.CENTER);
		titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
		
		Label userNameLabel = new Label("Usuário: " + userName, Label.CENTER);
		panel.add(titleLabel);
		panel.add(userNameLabel);
		
		String[][] data = {
				{"Alice", "alice@email.com", "12334"},
				{"Bob", "bob@email.com", "12334"},
				{"Carol", "carol@email.com", "12334"},
		};
		
		String[] columns = {"Nome", "E-mail", "Senha"};
		
		JTable table = new JTable(data, columns);
		table.setFillsViewportHeight(true);
	}
	
	protected final class WindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

}
