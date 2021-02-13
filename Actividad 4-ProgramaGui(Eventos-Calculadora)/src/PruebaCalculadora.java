import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
class CalculadoraWindows extends JFrame implements ActionListener {
	JLabel cdt1;
	JTextArea Cdll1;
	JButton btnsumar;
	JButton btnrestar;
	JButton btndividir;
	JButton btnmultiplicar;
	JButton btnResultado;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JButton btn7;
	JButton btn8;
	JButton btn9;
	JButton btn0;
	JButton btnCN;
	JButton btnC;
	JButton btnRaiz;
	JButton btnx2;
	JButton btnPor;
	JButton btnMasmen;
	JButton btnPun;
	
	double num1;
	double num2;
	double resultado;
	char operador;
	
	public CalculadoraWindows() {
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(300,600);
		setTitle("Calculadora");
		
		cdt1 =new JLabel("Estandar");
		add(cdt1);
		
		
		//Lugar en el ques er vera el numero Pulsado en el boton y los resultados 
		Cdll1 = new JTextArea("0");
		add(Cdll1);
		
		//Boton de sumar 
		btnsumar = new JButton ("+");
		add(btnsumar);
		btnsumar.addActionListener(this);
		
		//Boton Restar
		btnrestar = new JButton ("-");
		add(btnrestar);
		btnrestar.addActionListener(this);
		
		//Boton Dividir 
		btndividir = new JButton ("/");
		add(btndividir);
		btndividir.addActionListener(this);
		
		//Boton multiplicar 
		btnmultiplicar = new JButton ("*");
		add(btnmultiplicar); 
		btnmultiplicar.addActionListener(this);
		
		//Boton multiplicar 
		btnResultado = new JButton ("=");
		add(btnResultado); 
		btnResultado.addActionListener(this);
		
		//Boton 1
		btn1 = new JButton ("1");
		add(btn1); 
		btn1.addActionListener(this);
		
		//Boton 2
		btn2 = new JButton ("2");
		add(btn2); 
		btn2.addActionListener(this);
		
		//Boton 3
		btn3 = new JButton ("3");
		add(btn3); 
		btn3.addActionListener(this);
		
		//Boton 4
		btn4 = new JButton ("4");
		add(btn4); 
		btn4.addActionListener(this);
		
		//Boton 5
		btn5 = new JButton ("5");
		add(btn5); 
		btn5.addActionListener(this);
		
		//Boton 6
		btn6 = new JButton ("6");
		add(btn6); 
		btn6.addActionListener(this);
		
		//Boton 7
		btn7 = new JButton ("7");
		add(btn7); 
		btn7.addActionListener(this);
		
		//Boton 8
		btn8 = new JButton ("8");
		add(btn8); 
		btn8.addActionListener(this);
		
		//Boton 9 
		btn9 = new JButton ("9");
		add(btn9); 
		btn9.addActionListener(this);
		
		//Boton 0
		btn0 = new JButton ("0");
		add(btn0); 
		btn0.addActionListener(this);
		
		//Boton Borrar c
		btnC = new JButton ("C");
		add(btnC); 
		btnC.addActionListener(this);
		
		//Boton borrar esquina
		btnCN = new JButton ("<=");
		add(btnCN); 
		btnCN.addActionListener(this);
		
		//Boton de raiz 
		btnRaiz = new JButton ("R");
		add(btnRaiz); 
		btnRaiz.addActionListener(this);
		
		//Boton de elevado al cuadrado
		btnx2 = new JButton ("x2");
		add(btnx2); 
		btnx2.addActionListener(this);
		
		//Boton de porcentaje 
		btnPor = new JButton ("%");
		add(btnPor); 
		btnPor.addActionListener(this);
		
		//Boton Punto
		btnPun = new JButton (".");
		add(btnPun); 
		btnPun.addActionListener(this);
		
		//Boton +-
		btnMasmen = new JButton ("+-");
		add(btnMasmen); 
		btnMasmen.addActionListener(this);
		

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}
public class PruebaCalculadora {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable () {
			public void run() {
				new CalculadoraWindows ();
			}
		});
	}

}