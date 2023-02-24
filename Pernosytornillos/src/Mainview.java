import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class Mainview extends JFrame {

	private JPanel contentPane;
	public JPanel panel;
	public JLabel lblNewLabel;
	public JTextField perrosT;
	public JLabel lblPiezasDeLego;
	public JTextField PerrosN;
	public JLabel lblEstanInfectadosCon;
	public JLabel grupo;
	public JTextField grupos;
	public JLabel lblPerrosAlAzar;
	public JPanel panel_1;
	public JLabel lblSeranNegros;
	public JLabel Resultado1;
	public JButton creditos;
	public JLabel lblcualSeriaLa;
	public JTextField Perrosnn;
	public JLabel lblPerrosNoNegros;
	public JLabel lblY;
	public JTextField PerrosNN;
	public JLabel lblPerrosNegrosEn;
	public JPanel panel_2;
	public JLabel lblProbabilidadDeQue;
	public JLabel Resultado2;
	public JPanel panel_3;
	public JLabel lblSeranNegros_2;
	public JLabel Resultado2_1;
	public JButton Calcular1;
	public JButton Calcular2;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Mainview() {
		setResizable(false);
		setTitle("Ejercicio 3.13 Paul Meyer(1973) 1ra edicion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 859, 641);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(10, 10, 823, 584);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Suponga que tiene ");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblNewLabel.setBounds(10, 20, 240, 44);
		panel.add(lblNewLabel);
		
		perrosT = new JTextField();
		perrosT.setFont(new Font("Verdana", Font.PLAIN, 22));
		perrosT.setBounds(249, 20, 56, 44);
		panel.add(perrosT);
		perrosT.setColumns(10);
		
		lblPiezasDeLego = new JLabel("Perros y ");
		lblPiezasDeLego.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblPiezasDeLego.setBounds(315, 20, 102, 44);
		panel.add(lblPiezasDeLego);
		
		PerrosN = new JTextField();
		PerrosN.setFont(new Font("Verdana", Font.PLAIN, 22));
		PerrosN.setColumns(10);
		PerrosN.setBounds(431, 20, 56, 44);
		panel.add(PerrosN);
		
		lblEstanInfectadosCon = new JLabel("Son negros");
		lblEstanInfectadosCon.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblEstanInfectadosCon.setBounds(506, 20, 147, 44);
		panel.add(lblEstanInfectadosCon);
		
		grupo = new JLabel("Si se escogen");
		grupo.setFont(new Font("Verdana", Font.PLAIN, 22));
		grupo.setBounds(20, 74, 164, 44);
		panel.add(grupo);
		
		grupos = new JTextField();
		grupos.setFont(new Font("Verdana", Font.PLAIN, 22));
		grupos.setColumns(10);
		grupos.setBounds(205, 74, 56, 44);
		panel.add(grupos);
		
		lblPerrosAlAzar = new JLabel("Perros al azar");
		lblPerrosAlAzar.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblPerrosAlAzar.setBounds(277, 74, 164, 44);
		panel.add(lblPerrosAlAzar);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 102));
		panel_1.setBounds(0, 130, 823, 82);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		lblSeranNegros = new JLabel("Probabilidad de que todos sean negros");
		lblSeranNegros.setBounds(10, 25, 467, 28);
		lblSeranNegros.setFont(new Font("Verdana", Font.PLAIN, 22));
		panel_1.add(lblSeranNegros);
		
		Resultado1 = new JLabel("");
		Resultado1.setForeground(new Color(51, 102, 255));
		Resultado1.setFont(new Font("Verdana", Font.PLAIN, 36));
		Resultado1.setBounds(507, 7, 263, 53);
		panel_1.add(Resultado1);
		
		creditos = new JButton("Basado en");
		creditos.setForeground(new Color(153, 51, 51));
		creditos.setBackground(new Color(102, 153, 153));
		creditos.setFont(new Font("Tahoma", Font.PLAIN, 23));
		creditos.setBounds(289, 528, 211, 46);
		panel.add(creditos);
		
		lblcualSeriaLa = new JLabel("\u00BFCual seria la probabilidad de sacar");
		lblcualSeriaLa.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblcualSeriaLa.setBounds(9, 316, 408, 44);
		panel.add(lblcualSeriaLa);
		
		Perrosnn = new JTextField();
		Perrosnn.setFont(new Font("Verdana", Font.PLAIN, 22));
		Perrosnn.setColumns(10);
		Perrosnn.setBounds(431, 316, 56, 44);
		panel.add(Perrosnn);
		
		lblPerrosNoNegros = new JLabel("Perros no negros");
		lblPerrosNoNegros.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblPerrosNoNegros.setBounds(523, 316, 200, 44);
		panel.add(lblPerrosNoNegros);
		
		lblY = new JLabel("y ");
		lblY.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblY.setBounds(67, 380, 22, 44);
		panel.add(lblY);
		
		PerrosNN = new JTextField();
		PerrosNN.setFont(new Font("Verdana", Font.PLAIN, 22));
		PerrosNN.setColumns(10);
		PerrosNN.setBounds(111, 380, 56, 44);
		panel.add(PerrosNN);
		
		lblPerrosNegrosEn = new JLabel("Perros negros en un solo grupo?");
		lblPerrosNegrosEn.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblPerrosNegrosEn.setBounds(205, 380, 376, 44);
		panel.add(lblPerrosNegrosEn);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(51, 204, 204));
		panel_2.setBounds(0, 213, 823, 82);
		panel.add(panel_2);
		
		lblProbabilidadDeQue = new JLabel("Probabilidad de que ninguno sea negro");
		lblProbabilidadDeQue.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblProbabilidadDeQue.setBounds(10, 25, 490, 28);
		panel_2.add(lblProbabilidadDeQue);
		
		Resultado2 = new JLabel("");
		Resultado2.setForeground(new Color(51, 255, 102));
		Resultado2.setFont(new Font("Verdana", Font.PLAIN, 36));
		Resultado2.setBounds(510, 7, 277, 53);
		panel_2.add(Resultado2);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(102, 204, 153));
		panel_3.setBounds(0, 440, 823, 82);
		panel.add(panel_3);
		
		lblSeranNegros_2 = new JLabel("Probabilidad");
		lblSeranNegros_2.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblSeranNegros_2.setBounds(157, 19, 154, 28);
		panel_3.add(lblSeranNegros_2);
		
		Resultado2_1 = new JLabel("");
		Resultado2_1.setForeground(new Color(204, 51, 0));
		Resultado2_1.setFont(new Font("Verdana", Font.PLAIN, 36));
		Resultado2_1.setBounds(321, 1, 165, 53);
		panel_3.add(Resultado2_1);
		
		Calcular1 = new JButton("Calcular");
		Calcular1.setForeground(new Color(153, 51, 51));
		Calcular1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		Calcular1.setBackground(new Color(102, 153, 153));
		Calcular1.setBounds(474, 74, 211, 46);
		panel.add(Calcular1);
		
		Calcular2 = new JButton("Calcular");
		Calcular2.setForeground(new Color(153, 51, 51));
		Calcular2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		Calcular2.setBackground(new Color(102, 153, 153));
		Calcular2.setBounds(591, 379, 211, 46);
		panel.add(Calcular2);
	}
}
