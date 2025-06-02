package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;

public class TelaInscricoes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInscricoes frame = new TelaInscricoes();
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
	public TelaInscricoes() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("+ Adicionar inscrição");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(6, 46, 538, 36);
		contentPane.add(btnNewButton);
		
		JTextPane txtpnDisciplinas = new JTextPane();
		txtpnDisciplinas.setBackground(new Color(238, 238, 238));
		txtpnDisciplinas.setFont(new Font("Arial", Font.PLAIN, 24));
		txtpnDisciplinas.setText("Inscrições");
		txtpnDisciplinas.setBounds(227, 6, 108, 28);
		contentPane.add(txtpnDisciplinas);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(6, 137, 538, 110);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnDisciplina = new JTextPane();
		txtpnDisciplina.setBounds(6, 6, 78, 19);
		panel.add(txtpnDisciplina);
		txtpnDisciplina.setFont(new Font("Arial", Font.PLAIN, 16));
		txtpnDisciplina.setText("Nome");
		
		JTextPane txtpnCodigoDisc = new JTextPane();
		txtpnCodigoDisc.setBounds(6, 25, 75, 16);
		panel.add(txtpnCodigoDisc);
		txtpnCodigoDisc.setText("CPF");
		txtpnCodigoDisc.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JTextPane txtpnDiaDaSemana = new JTextPane();
		txtpnDiaDaSemana.setText("CodigoProcesso");
		txtpnDiaDaSemana.setFont(new Font("Arial", Font.PLAIN, 13));
		txtpnDiaDaSemana.setBounds(6, 43, 110, 16);
		panel.add(txtpnDiaDaSemana);
		
		JButton btnNewButton_1 = new JButton("");
		//Image img = new ImageIcon(this.getClass().getResource("/edit.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon("./img/edit.png"));
		btnNewButton_1.setBounds(417, 33, 45, 45);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon("./img/delete.png"));
		btnNewButton_1_1.setBounds(474, 33, 45, 45);
		panel.add(btnNewButton_1_1);
		
		JTextPane txtpnPontuacao = new JTextPane();
		txtpnPontuacao.setText("Pontuacao");
		txtpnPontuacao.setFont(new Font("Arial", Font.PLAIN, 13));
		txtpnPontuacao.setBounds(6, 62, 110, 16);
		panel.add(txtpnPontuacao);
		
		JTextPane txtpnCodigodisciplina = new JTextPane();
		txtpnCodigodisciplina.setText("CodigoDisciplina");
		txtpnCodigodisciplina.setFont(new Font("Arial", Font.PLAIN, 13));
		txtpnCodigodisciplina.setBounds(6, 82, 110, 16);
		panel.add(txtpnCodigodisciplina);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Disciplina"}));
		comboBox.setBounds(61, 98, 235, 27);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Pontuação - Padrão", "Pontuação - Crescente", "Pontuação - Decrescente"}));
		comboBox_1.setBounds(308, 98, 236, 27);
		contentPane.add(comboBox_1);
		
		JTextPane txtpnFiltros = new JTextPane();
		txtpnFiltros.setText("Filtros");
		txtpnFiltros.setFont(new Font("Arial", Font.PLAIN, 13));
		txtpnFiltros.setBackground(UIManager.getColor("Button.background"));
		txtpnFiltros.setBounds(16, 102, 43, 16);
		contentPane.add(txtpnFiltros);
		
		ActionListener actListenerAdd = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaAddInscricao.main(null);
			}
		};
		
		btnNewButton.addActionListener(actListenerAdd);
	}
}
