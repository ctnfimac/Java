
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Diseno extends JFrame{
	public Diseno(){
		setBounds(550,200,300,410);
		setTitle("Lista tipo Pila");
		Lamina lamina = new Lamina();
		add(lamina);
		setVisible(true);
	}
}

class Lamina extends JPanel{
	JTextField datoOut, datoIn;
	JButton bIngresar, bExtraer, vectorButton[];
	JLabel ldatoIn, ldatoOut;
    Box verticalLeft;
    private int contador, valores[];
    Pila lista;

	public Lamina(){
		bIngresar = new JButton("AGREGAR");
		bExtraer = new JButton("EXTRAER");
		datoOut = new JTextField(8);
		datoIn = new JTextField(8);
		ldatoIn = new JLabel("Valor a ingresar:  ");
		ldatoOut = new JLabel("Valor extraido:    ");
		vectorButton = new JButton[14];
		contador = 14;
		lista = new Pila();

		bIngresar.addActionListener(new ManipulaBoton());//se pone a la escucha
		bExtraer.addActionListener(new ManipulaBoton());

		ldatoIn.setForeground(Color.GREEN);
		ldatoOut.setForeground(Color.GREEN);

		bIngresar.setBackground(new Color(230, 126, 34));
		bIngresar.setForeground(Color.WHITE);

		bExtraer.setBackground(new Color(230, 126, 34));
		bExtraer.setForeground(Color.WHITE);
	
		setBackground( new Color(0, 0, 0));
	
		datoOut.setMaximumSize(datoOut.getPreferredSize());
		datoIn.setMaximumSize(datoIn.getPreferredSize());
		
		Box container = Box.createHorizontalBox();
 		Box verticalRight = Box.createVerticalBox();
 		verticalLeft = Box.createVerticalBox();

 		Box boxInput = Box.createHorizontalBox();
 		boxInput.add(ldatoIn);
 	
 		boxInput.add(datoIn);
 		Box boxBinput = Box.createHorizontalBox();
 		boxBinput.add(Box.createVerticalStrut(10));
 		boxBinput.add(bIngresar);

 		Box boxOutput = Box.createHorizontalBox();
 	
 		boxOutput.add(ldatoOut);
 
 		boxOutput.add(datoOut);
 		Box boxBoutput = Box.createHorizontalBox();
 		boxBoutput.add(Box.createVerticalStrut(10));
 		boxBoutput.add(bExtraer);		


 		verticalRight.add(boxInput);
 		verticalRight.add(Box.createVerticalStrut(20));
 		verticalRight.add(boxBinput);

 		verticalRight.add(Box.createVerticalStrut(80));

 		verticalRight.add(boxOutput);
 		verticalRight.add(Box.createVerticalStrut(20));
 		verticalRight.add(boxBoutput);

 		cargoBotones();
 		container.add(verticalLeft);
 		container.add(Box.createHorizontalStrut(20));
 		container.add(verticalRight);
		add(container);
	}

	public void cargoBotones(){
		for( int i = 0 ; i < 14 ; i++){
			vectorButton[i] = new JButton("__");
			vectorButton[i].setEnabled(false);
			verticalLeft.add(vectorButton[i]);
		}
	}

	public void agregaBoton(int info){
		int i ;

		 if(contador > 0 ) {
		 	//pongo toda la lista como vacia __
		 	for( i = 0 ; i < contador -1 ; i++){
		 		vectorButton[i].setBackground(Color.WHITE);
				vectorButton[i].setText("__");
			    vectorButton[i].setEnabled(false);
			}

			if( info >= 0 && info < 100){
				if( info < 10 ) vectorButton[i].setText("0"+info);
				else 			vectorButton[i].setText(""+info);
				vectorButton[i].setBackground(new Color(192, 57, 43));
				vectorButton[i].setForeground(Color.WHITE);
				vectorButton[i].setEnabled(true);
				lista.insertar(info);
				contador--;
			}else System.out.println("Valor fuera de rango");
		 }else System.out.println("la lista ya esta llena");		
	}


	public void extraerBoton(){
	  
	  if(!lista.vacia()){
	  		datoOut.setText(vectorButton[contador].getText());
	  		vectorButton[contador].setText("__");
	  		vectorButton[contador].setBackground(Color.WHITE);
		    vectorButton[contador].setEnabled(false);
		    System.out.println("valor extraido: "+lista.extraer());
		    contador++;
	    }else System.out.println("Lista vacia");	
	}

	private class ManipulaBoton implements ActionListener{

		public void actionPerformed(ActionEvent e){

			if( e.getActionCommand().equals(("AGREGAR"))== true ){
				//System.out.println("valor:"+ datoIn.getText());
				String entrada = datoIn.getText(); 
				if( entrada.equals("") == false){
				  int dato = Integer.parseInt(datoIn.getText());
				  agregaBoton(dato);
				  datoIn.setText("");
			    }
			}

			if( e.getActionCommand().equals(("EXTRAER"))== true ){
				extraerBoton();	
			}
		}
	}
}