import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener{

	private String title = "conversor cm to metro ";
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem menuOption1;
	private JMenuItem menuOption2;
	private JMenuItem menuOption3;
	
	private JTextField valor;
	
	
	public Ventana(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(500,300);
		this.setTitle(title);
		JPanel panel = new JPanel();
		menuShow(panel);
		add(panel);
		
	}
	
	public void init() {
		
	}
	
	public void menuShow(JPanel container) {

		menuBar = new JMenuBar();
		
		menu = new JMenu();
		menu.setText("Conversor: ");
		
		menuOption1 = new JMenuItem("cm to metro");
		menuOption1.addActionListener(this);
		
		menuOption2 = new JMenuItem("metro to cm");
		menuOption2.addActionListener(this);
		
		menuOption3 = new JMenuItem("exit..");
		menuOption3.addActionListener(this);
		
		menu.add(menuOption1);
		menu.add(menuOption2);
		menu.add(menuOption3);
		menuBar.add(menu);
		container.add(menuBar);
	}
	
	
	
	public int valorInput(String text){
		
		String valor = JOptionPane.showInputDialog(text);
		return Integer.parseInt(valor);
	}
	
	public double calcularProporcion(int option, double valor) {
		return conversor.OptionConversor(option, valor);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menuOption3) {
			JOptionPane.showMessageDialog(menu, "adios :(");
			System.exit(0);
		}
		else if(e.getSource() == menuOption2) {
			double valor = valorInput("metro to centimetro: ");
			valor = calcularProporcion(2, valor);
			JOptionPane.showMessageDialog(menu, "Centimetro: "+valor);
		} 
		else if(e.getSource() == menuOption1) {
			double valor = valorInput("centimetro to metro: ");
			valor = calcularProporcion(1, valor);
			JOptionPane.showMessageDialog(menu, "Metros: "+valor);
			
		
		
		}
		
	}
	
}
