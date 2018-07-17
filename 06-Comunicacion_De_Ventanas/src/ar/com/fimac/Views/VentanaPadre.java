package ar.com.fimac.Views;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.*;

public class VentanaPadre extends JFrame{
	
	public VentanaPadre(String nombreVentana){
		setTitle(nombreVentana);
		setBounds(400, 200, 350, 300);

		LaminaPadre lamina = new LaminaPadre();
		add(lamina);

		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


class LaminaPadre extends JPanel implements ActionListener{
	private	JLabel JLmensaje;
	private JButton JBenviar;
	private JTextField JTmensaje;

	private VentanaHija ventanaHija;

	public LaminaPadre(){
		this.setLayout(null);
		// inicializo componentes
		JLmensaje = new JLabel("Hola Mundo");
		JBenviar = new JButton("Enviar");
		JTmensaje = new JTextField("");

		ventanaHija = new VentanaHija();
		
		// estilos de los elementos
		JBenviar.setBounds(220,10,100,30);
		JTmensaje.setBounds(10,10,200,30);
		
		
		// agrego los eventos a elementos
		JBenviar.addActionListener(this);

		// agrego elementos a la lamina
		add(JTmensaje);
		add(JBenviar);
		add(JLmensaje);
	}

	public void setMensaje(String msj){
		JLmensaje.setText(msj);
	}

	// Eventos
	public void JBenviarClick(ActionEvent e){
		ventanaHija.setVisible(true);
		String msj = JTmensaje.getText();
		ventanaHija.setMensaje(msj);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		JBenviarClick(e);
	}
}