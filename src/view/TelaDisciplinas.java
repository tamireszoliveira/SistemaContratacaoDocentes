package view;

import java.awt.EventQueue;
import view.TelaManterDisciplina;

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

public class TelaDisciplinas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDisciplinas frame = new TelaDisciplinas();
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
	public TelaDisciplinas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAdd = new JButton("+ Adicionar disciplina");
		btnAdd.setBackground(new Color(255, 255, 255));
		btnAdd.setBounds(6, 46, 538, 36);
		contentPane.add(btnAdd);
		
		JTextPane txtpnDisciplinas = new JTextPane();
		txtpnDisciplinas.setEditable(false);
		txtpnDisciplinas.setBackground(new Color(238, 238, 238));
		txtpnDisciplinas.setFont(new Font("Arial", Font.PLAIN, 24));
		txtpnDisciplinas.setText("Disciplinas");
		txtpnDisciplinas.setBounds(223, 6, 113, 28);
		contentPane.add(txtpnDisciplinas);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(6, 94, 538, 123);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextPane txtDisc = new JTextPane();
		txtDisc.setEditable(false);
		txtDisc.setBounds(6, 6, 78, 19);
		panel.add(txtDisc);
		txtDisc.setFont(new Font("Arial", Font.PLAIN, 16));
		txtDisc.setText("Disciplina");
		
		JTextPane txtCod = new JTextPane();
		txtCod.setEditable(false);
		txtCod.setBounds(6, 25, 75, 16);
		panel.add(txtCod);
		txtCod.setText("Codigo Disc");
		txtCod.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JTextPane txtDia = new JTextPane();
		txtDia.setEditable(false);
		txtDia.setText("Dia da semana");
		txtDia.setFont(new Font("Arial", Font.PLAIN, 13));
		txtDia.setBounds(6, 43, 110, 16);
		panel.add(txtDia);
		
		JTextPane txtHora = new JTextPane();
		txtHora.setEditable(false);
		txtHora.setText("Horario inicial");
		txtHora.setFont(new Font("Arial", Font.PLAIN, 13));
		txtHora.setBounds(6, 62, 110, 16);
		panel.add(txtHora);
		
		JTextPane txtHrSemanais = new JTextPane();
		txtHrSemanais.setEditable(false);
		txtHrSemanais.setText("Horas semanais");
		txtHrSemanais.setFont(new Font("Arial", Font.PLAIN, 13));
		txtHrSemanais.setBounds(6, 82, 110, 16);
		panel.add(txtHrSemanais);
		
		JTextPane txtCodCurso = new JTextPane();
		txtCodCurso.setEditable(false);
		txtCodCurso.setText("Código do curso");
		txtCodCurso.setFont(new Font("Arial", Font.PLAIN, 13));
		txtCodCurso.setBounds(6, 101, 110, 16);
		panel.add(txtCodCurso);
		
		JButton btnEdicao = new JButton("Editar");
		btnEdicao.setIcon(new ImageIcon("./img/edit.png"));
		btnEdicao.setBounds(419, 6, 110, 36);
		panel.add(btnEdicao);
		
		JButton btnApaga = new JButton("Apagar");
		btnApaga.setIcon(new ImageIcon("./img/delete.png"));
		btnApaga.setBounds(419, 81, 110, 36);
		panel.add(btnApaga);
		
		JButton btnInsc = new JButton("Inscritos");
		btnInsc.setIcon(new ImageIcon("./img/alunos.png"));
		btnInsc.setBounds(419, 43, 110, 36);
		panel.add(btnInsc);
		
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
				TelaManterDisciplina.main(false);
				dispose();
			}
		};
		
		ActionListener actListenerEdit = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaManterDisciplina.main(true);
				dispose();
			}
		};
		
		ActionListener actListenerInsc = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaDisciplinas_Inscritos.main(null);
				dispose();
			}
		};
		
		btnAdd.addActionListener(actListenerAdd);
		btnEdicao.addActionListener(actListenerEdit);
		btnInsc.addActionListener(actListenerInsc);
		}
}
