package ar.com.fimac.Views;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class VentanaHija extends JFrame{
	
	private LaminaHija lamina;
	
	public VentanaHija(){
		setTitle("Ventana Hija");
		setBounds(800,200,250,250);
	
		lamina = new LaminaHija();
		add(lamina);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	
	public void setMensaje(String msj){
		lamina.setMensaje(msj);
	}
}

class LaminaHija extends JPanel{
	private JLabel mensaje;

	public LaminaHija(){
		mensaje = new JLabel("hola");
		add(mensaje);
	}

	public void setMensaje(String msj){
		mensaje.setText(msj);
	}
}
