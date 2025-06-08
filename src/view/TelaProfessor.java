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

public class TelaProfessor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProfessor frame = new TelaProfessor();
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
	public TelaProfessor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAdd = new JButton("+ Adicionar professor");
		btnAdd.setBackground(new Color(255, 255, 255));
		btnAdd.setBounds(6, 46, 538, 36);
		contentPane.add(btnAdd);
		
		JTextPane txtProf = new JTextPane();
		txtProf.setEditable(false);
		txtProf.setBackground(new Color(238, 238, 238));
		txtProf.setFont(new Font("Arial", Font.PLAIN, 24));
		txtProf.setText("Professores");
		txtProf.setBounds(215, 6, 138, 28);
		contentPane.add(txtProf);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(6, 94, 538, 73);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextPane txtNome = new JTextPane();
		txtNome.setEditable(false);
		txtNome.setBounds(6, 6, 239, 19);
		panel.add(txtNome);
		txtNome.setFont(new Font("Arial", Font.PLAIN, 16));
		txtNome.setText("Nome");
		
		JTextPane txtCPF = new JTextPane();
		txtCPF.setEditable(false);
		txtCPF.setBounds(6, 25, 122, 16);
		panel.add(txtCPF);
		txtCPF.setText("CPF");
		txtCPF.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JTextPane txtPontos = new JTextPane();
		txtPontos.setEditable(false);
		txtPontos.setText("Pontos");
		txtPontos.setFont(new Font("Arial", Font.PLAIN, 13));
		txtPontos.setBounds(6, 43, 110, 16);
		panel.add(txtPontos);
		
		JButton btnEdit = new JButton("");
		//Image img = new ImageIcon(this.getClass().getResource("/edit.png")).getImage();
		btnEdit.setIcon(new ImageIcon("./img/edit.png"));
		btnEdit.setBounds(344, 16, 90, 36);
		panel.add(btnEdit);
		
		JButton btnDelete = new JButton("");
		btnDelete.setIcon(new ImageIcon("./img/delete.png"));
		btnDelete.setBounds(439, 16, 90, 36);
		panel.add(btnDelete);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setIcon(new ImageIcon("./img/voltar.png"));
		btnVoltar.setBounds(6, 6, 64, 30);
		contentPane.add(btnVoltar);
		
		ActionListener actListenerBack = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaInicial.main(null);
				dispose();
			}
		};
		
		btnVoltar.addActionListener(actListenerBack);
		
		ActionListener actListenerAdd = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaManterInscricao.main(false);
				dispose();
			}
		};
		
		ActionListener actListenerEdit = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaManterInscricao.main(true);
				dispose();
			}
		};
		
		btnAdd.addActionListener(actListenerAdd);
		btnEdit.addActionListener(actListenerAdd);
	}
}
