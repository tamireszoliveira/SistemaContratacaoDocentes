package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

public class TelaAddProfessor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nomeProf;
	private JTextPane txtpnDigiteO;
	private JTextField codProf;
	private JTextPane txtpnDigiteOHorrio;
	private JTextField horarioProf;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAddProfessor frame = new TelaAddProfessor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaAddProfessor() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 277);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnAdicionarDisciplina = new JTextPane();
		txtpnAdicionarDisciplina.setBackground(new Color(237, 238, 238));
		txtpnAdicionarDisciplina.setText("Adicionar Professor");
		txtpnAdicionarDisciplina.setFont(new Font("Arial", Font.PLAIN, 24));
		txtpnAdicionarDisciplina.setBounds(198, 6, 213, 31);
		contentPane.add(txtpnAdicionarDisciplina);
		
		JTextPane txtpnDisciplina = new JTextPane();
		txtpnDisciplina.setText("Digite o nome do professor");
		txtpnDisciplina.setFont(new Font("Arial", Font.PLAIN, 14));
		txtpnDisciplina.setBackground(new Color(238, 238, 238));
		txtpnDisciplina.setBounds(20, 51, 132, 37);
		contentPane.add(txtpnDisciplina);
		
		nomeProf = new JTextField();
		nomeProf.setBounds(157, 49, 421, 37);
		contentPane.add(nomeProf);
		nomeProf.setColumns(10);
		
		txtpnDigiteO = new JTextPane();
		txtpnDigiteO.setText("Digite o CPF do professor");
		txtpnDigiteO.setFont(new Font("Arial", Font.PLAIN, 14));
		txtpnDigiteO.setBackground(UIManager.getColor("Button.background"));
		txtpnDigiteO.setBounds(20, 102, 132, 37);
		contentPane.add(txtpnDigiteO);
		
		codProf = new JTextField();
		codProf.setColumns(10);
		codProf.setBounds(157, 100, 421, 37);
		contentPane.add(codProf);
		
		txtpnDigiteOHorrio = new JTextPane();
		txtpnDigiteOHorrio.setText("Digite a pontuação do professor");
		txtpnDigiteOHorrio.setFont(new Font("Arial", Font.PLAIN, 14));
		txtpnDigiteOHorrio.setBackground(UIManager.getColor("Button.background"));
		txtpnDigiteOHorrio.setBounds(20, 153, 132, 35);
		contentPane.add(txtpnDigiteOHorrio);
		
		horarioProf = new JTextField();
		horarioProf.setToolTipText("Digite o horário aqui");
		horarioProf.setColumns(10);
		horarioProf.setBounds(157, 151, 421, 37);
		contentPane.add(horarioProf);
		
		btnNewButton = new JButton("Enviar");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(461, 200, 117, 29);
		contentPane.add(btnNewButton);
	}
}
