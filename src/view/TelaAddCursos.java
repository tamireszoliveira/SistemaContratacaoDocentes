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

public class TelaAddCursos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nomeCurso;
	private JTextPane txtpnDigiteO;
	private JTextField codCurso;
	private JTextPane txtpnDigiteODia;
	private JButton btnNewButton;
	private JTextField areaCurso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAddCursos frame = new TelaAddCursos();
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
	public TelaAddCursos() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnAdicionarDisciplina = new JTextPane();
		txtpnAdicionarDisciplina.setBackground(new Color(237, 238, 238));
		txtpnAdicionarDisciplina.setText("Adicionar Cursos");
		txtpnAdicionarDisciplina.setFont(new Font("Arial", Font.PLAIN, 24));
		txtpnAdicionarDisciplina.setBounds(218, 6, 181, 31);
		contentPane.add(txtpnAdicionarDisciplina);
		
		JTextPane txtNomeCurso = new JTextPane();
		txtNomeCurso.setText("Digite o nome do curso");
		txtNomeCurso.setFont(new Font("Arial", Font.PLAIN, 14));
		txtNomeCurso.setBackground(new Color(238, 238, 238));
		txtNomeCurso.setBounds(20, 51, 132, 37);
		contentPane.add(txtNomeCurso);
		
		nomeCurso = new JTextField();
		nomeCurso.setBounds(157, 49, 421, 37);
		contentPane.add(nomeCurso);
		nomeCurso.setColumns(10);
		
		txtpnDigiteO = new JTextPane();
		txtpnDigiteO.setText("Digite o código do curso");
		txtpnDigiteO.setFont(new Font("Arial", Font.PLAIN, 14));
		txtpnDigiteO.setBackground(UIManager.getColor("Button.background"));
		txtpnDigiteO.setBounds(20, 102, 132, 37);
		contentPane.add(txtpnDigiteO);
		
		codCurso = new JTextField();
		codCurso.setColumns(10);
		codCurso.setBounds(157, 100, 421, 37);
		contentPane.add(codCurso);
		
		txtpnDigiteODia = new JTextPane();
		txtpnDigiteODia.setText("Digite a área do curso");
		txtpnDigiteODia.setFont(new Font("Arial", Font.PLAIN, 14));
		txtpnDigiteODia.setBackground(UIManager.getColor("Button.background"));
		txtpnDigiteODia.setBounds(20, 153, 132, 37);
		contentPane.add(txtpnDigiteODia);
		
		btnNewButton = new JButton("Enviar");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(461, 207, 117, 29);
		contentPane.add(btnNewButton);
		
		areaCurso = new JTextField();
		areaCurso.setColumns(10);
		areaCurso.setBounds(157, 153, 421, 37);
		contentPane.add(areaCurso);
	}
}
