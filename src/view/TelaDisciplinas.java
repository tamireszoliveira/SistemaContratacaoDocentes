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
		
		JButton btnNewButton = new JButton("+ Adicionar disciplina");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(6, 46, 538, 36);
		contentPane.add(btnNewButton);
		
		JTextPane txtpnDisciplinas = new JTextPane();
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
		
		JTextPane txtpnDisciplina = new JTextPane();
		txtpnDisciplina.setBounds(6, 6, 78, 19);
		panel.add(txtpnDisciplina);
		txtpnDisciplina.setFont(new Font("Arial", Font.PLAIN, 16));
		txtpnDisciplina.setText("Disciplina");
		
		JTextPane txtpnCodigoDisc = new JTextPane();
		txtpnCodigoDisc.setBounds(6, 25, 75, 16);
		panel.add(txtpnCodigoDisc);
		txtpnCodigoDisc.setText("Codigo Disc");
		txtpnCodigoDisc.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JTextPane txtpnDiaDaSemana = new JTextPane();
		txtpnDiaDaSemana.setText("Dia da semana");
		txtpnDiaDaSemana.setFont(new Font("Arial", Font.PLAIN, 13));
		txtpnDiaDaSemana.setBounds(6, 43, 110, 16);
		panel.add(txtpnDiaDaSemana);
		
		JTextPane txtpnHora = new JTextPane();
		txtpnHora.setText("Horario inicial");
		txtpnHora.setFont(new Font("Arial", Font.PLAIN, 13));
		txtpnHora.setBounds(6, 62, 110, 16);
		panel.add(txtpnHora);
		
		JTextPane txtpnHorasSemanais = new JTextPane();
		txtpnHorasSemanais.setText("Horas semanais");
		txtpnHorasSemanais.setFont(new Font("Arial", Font.PLAIN, 13));
		txtpnHorasSemanais.setBounds(6, 82, 110, 16);
		panel.add(txtpnHorasSemanais);
		
		JTextPane txtpnCdigoDoCurso = new JTextPane();
		txtpnCdigoDoCurso.setText("Código do curso");
		txtpnCdigoDoCurso.setFont(new Font("Arial", Font.PLAIN, 13));
		txtpnCdigoDoCurso.setBounds(6, 101, 110, 16);
		panel.add(txtpnCdigoDoCurso);
		
		JButton btnNewButton_1 = new JButton("");
		//Image img = new ImageIcon(this.getClass().getResource("/edit.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon("./img/edit.png"));
		btnNewButton_1.setBounds(472, 14, 45, 45);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon("./img/delete.png"));
		btnNewButton_1_1.setBounds(472, 62, 45, 45);
		panel.add(btnNewButton_1_1);
	}
}
