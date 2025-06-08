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
		
		JButton btnInsc = new JButton("+ Adicionar inscrição");
		btnInsc.setBackground(new Color(255, 255, 255));
		btnInsc.setBounds(6, 46, 538, 36);
		contentPane.add(btnInsc);
		
		JTextPane txtInscricoes = new JTextPane();
		txtInscricoes.setEditable(false);
		txtInscricoes.setBackground(new Color(238, 238, 238));
		txtInscricoes.setFont(new Font("Arial", Font.PLAIN, 24));
		txtInscricoes.setText("Inscrições");
		txtInscricoes.setBounds(227, 6, 108, 28);
		contentPane.add(txtInscricoes);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(6, 137, 538, 124);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextPane txtNome = new JTextPane();
		txtNome.setEditable(false);
		txtNome.setBounds(6, 6, 78, 19);
		panel.add(txtNome);
		txtNome.setFont(new Font("Arial", Font.PLAIN, 16));
		txtNome.setText("Nome");
		
		JTextPane txtCPF = new JTextPane();
		txtCPF.setEditable(false);
		txtCPF.setBounds(6, 25, 75, 16);
		panel.add(txtCPF);
		txtCPF.setText("CPF");
		txtCPF.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JTextPane txtCod = new JTextPane();
		txtCod.setEditable(false);
		txtCod.setText("CodigoProcesso");
		txtCod.setFont(new Font("Arial", Font.PLAIN, 13));
		txtCod.setBounds(6, 43, 110, 16);
		panel.add(txtCod);
		
		JButton btnNewButton_1 = new JButton("Editar");
		//Image img = new ImageIcon(this.getClass().getResource("/edit.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon("./img/edit.png"));
		btnNewButton_1.setBounds(437, 24, 90, 36);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Apagar");
		btnNewButton_1_1.setIcon(new ImageIcon("./img/delete.png"));
		btnNewButton_1_1.setBounds(437, 66, 90, 36);
		panel.add(btnNewButton_1_1);
		
		JTextPane txtPont = new JTextPane();
		txtPont.setEditable(false);
		txtPont.setText("Pontuacao");
		txtPont.setFont(new Font("Arial", Font.PLAIN, 13));
		txtPont.setBounds(6, 62, 110, 16);
		panel.add(txtPont);
		
		JTextPane txtCodDis = new JTextPane();
		txtCodDis.setEditable(false);
		txtCodDis.setText("CodigoDisciplina");
		txtCodDis.setFont(new Font("Arial", Font.PLAIN, 13));
		txtCodDis.setBounds(6, 82, 110, 16);
		panel.add(txtCodDis);
		
		JTextPane txtPontos = new JTextPane();
		txtPontos.setEditable(false);
		txtPontos.setText("Status");
		txtPontos.setFont(new Font("Arial", Font.PLAIN, 13));
		txtPontos.setBounds(6, 102, 110, 16);
		panel.add(txtPontos);
		
		JComboBox comboDisc = new JComboBox();
		comboDisc.setModel(new DefaultComboBoxModel(new String[] {"Disciplina"}));
		comboDisc.setBounds(61, 98, 235, 27);
		contentPane.add(comboDisc);
		
		JComboBox comboPontuacao = new JComboBox();
		comboPontuacao.setModel(new DefaultComboBoxModel(new String[] {"Pontuação - Padrão", "Pontuação - Crescente", "Pontuação - Decrescente"}));
		comboPontuacao.setBounds(308, 98, 236, 27);
		contentPane.add(comboPontuacao);
		
		JTextPane txtFiltros = new JTextPane();
		txtFiltros.setText("Filtros");
		txtFiltros.setFont(new Font("Arial", Font.PLAIN, 13));
		txtFiltros.setBackground(UIManager.getColor("Button.background"));
		txtFiltros.setBounds(16, 102, 43, 16);
		contentPane.add(txtFiltros);
		
		ActionListener actListenerAdd = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaManterInscricao.main(false);
			}
		};
		
		ActionListener actListenerEdit = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaManterInscricao.main(true);
			}
		};
		
		btnInsc.addActionListener(actListenerAdd);
		btnNewButton_1.addActionListener(actListenerEdit);
	}
}
