package Day08.swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.tree.*;

public class GUITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("My Java Swing Test");
		
		JLabel l1 = new JLabel("this is a text");
		f.add(l1);
		
		JTextField t1 = new JTextField("this is a text");
		f.add(t1);
		
		JButton b1 = new JButton("OK");
		f.add(b1);
		
		String[] gui = {"Swing","awt"};
		JList list = new JList(gui);
		f.add(list);
		
		String data[][] = {
				{"Python","Good"},
				{"C++","VeryBad"},
				{"Java","Difficult"}
		};
		
		String colname[] = {"Subject","Feel"};
		JTable table = new JTable(data,colname);
		f.add(table);
		
		JSpinner spinner = new JSpinner();
		f.add(spinner);
		
		JSlider slider = new JSlider(JSlider.VERTICAL);
		f.add(slider);
		
		JMenuBar menubar = new JMenuBar();
		JMenu fileMenu = new JMenu("File"); menubar.add(fileMenu);
		JMenu item1 = new JMenu("Open"); fileMenu.add(item1);
		JMenu item2 = new JMenu("Save"); fileMenu.add(item2);
		
		JMenu helpMenu = new JMenu("Help"); menubar.add(helpMenu);
		f.add(menubar);
		
		f.setSize(600, 600);
		f.setLayout(new GridLayout(3,3));
		f.setVisible(true);
	}

}
