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

public class TelaAddInscricao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextPane txtpnDigiteO;
	private JTextField codProcesso;
	private JTextPane txtpnDigiteODia;
	private JComboBox selecaoDisc;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAddInscricao frame = new TelaAddInscricao();
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
	public TelaAddInscricao() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnAdicionarDisciplina = new JTextPane();
		txtpnAdicionarDisciplina.setBackground(new Color(237, 238, 238));
		txtpnAdicionarDisciplina.setText("Adicionar Inscrição");
		txtpnAdicionarDisciplina.setFont(new Font("Arial", Font.PLAIN, 24));
		txtpnAdicionarDisciplina.setBounds(198, 6, 206, 31);
		contentPane.add(txtpnAdicionarDisciplina);
		
		JTextPane txtpnDisciplina = new JTextPane();
		txtpnDisciplina.setText("Selecione o professor");
		txtpnDisciplina.setFont(new Font("Arial", Font.PLAIN, 14));
		txtpnDisciplina.setBackground(new Color(238, 238, 238));
		txtpnDisciplina.setBounds(20, 51, 132, 37);
		contentPane.add(txtpnDisciplina);
		
		txtpnDigiteO = new JTextPane();
		txtpnDigiteO.setText("Digite o código do processo");
		txtpnDigiteO.setFont(new Font("Arial", Font.PLAIN, 14));
		txtpnDigiteO.setBackground(UIManager.getColor("Button.background"));
		txtpnDigiteO.setBounds(20, 102, 132, 37);
		contentPane.add(txtpnDigiteO);
		
		codProcesso = new JTextField();
		codProcesso.setColumns(10);
		codProcesso.setBounds(157, 100, 421, 37);
		contentPane.add(codProcesso);
		
		txtpnDigiteODia = new JTextPane();
		txtpnDigiteODia.setText("Selecione a disciplina");
		txtpnDigiteODia.setFont(new Font("Arial", Font.PLAIN, 14));
		txtpnDigiteODia.setBackground(UIManager.getColor("Button.background"));
		txtpnDigiteODia.setBounds(20, 153, 132, 37);
		contentPane.add(txtpnDigiteODia);
		
		selecaoDisc = new JComboBox();
		selecaoDisc.setModel(new DefaultComboBoxModel(new String[] {"Disciplina"}));
		selecaoDisc.setFont(new Font("Arial", Font.PLAIN, 16));
		selecaoDisc.setBounds(157, 149, 421, 41);
		contentPane.add(selecaoDisc);
		
		btnNewButton = new JButton("Enviar");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(461, 204, 117, 29);
		contentPane.add(btnNewButton);
		
		JComboBox selecaoProf = new JComboBox();
		selecaoProf.setFont(new Font("Arial", Font.PLAIN, 16));
		selecaoProf.setModel(new DefaultComboBoxModel(new String[] {"Professor"}));
		selecaoProf.setBounds(157, 49, 421, 46);
		contentPane.add(selecaoProf);
	}
}
