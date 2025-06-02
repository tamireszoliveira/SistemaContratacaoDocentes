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

public class TelaCursos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCursos frame = new TelaCursos();
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
	public TelaCursos() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("+ Adicionar curso");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(6, 46, 538, 36);
		contentPane.add(btnNewButton);
		
		JTextPane txtpnDisciplinas = new JTextPane();
		txtpnDisciplinas.setBackground(new Color(238, 238, 238));
		txtpnDisciplinas.setFont(new Font("Arial", Font.PLAIN, 24));
		txtpnDisciplinas.setText("Cursos");
		txtpnDisciplinas.setBounds(249, 6, 76, 28);
		contentPane.add(txtpnDisciplinas);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(6, 94, 538, 73);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnDisciplina = new JTextPane();
		txtpnDisciplina.setBounds(6, 6, 78, 19);
		panel.add(txtpnDisciplina);
		txtpnDisciplina.setFont(new Font("Arial", Font.PLAIN, 16));
		txtpnDisciplina.setText("Curso");
		
		JTextPane txtpnCodigoDisc = new JTextPane();
		txtpnCodigoDisc.setBounds(6, 25, 75, 16);
		panel.add(txtpnCodigoDisc);
		txtpnCodigoDisc.setText("Codigo Curso");
		txtpnCodigoDisc.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JTextPane txtpnDiaDaSemana = new JTextPane();
		txtpnDiaDaSemana.setText("Área Curso");
		txtpnDiaDaSemana.setFont(new Font("Arial", Font.PLAIN, 13));
		txtpnDiaDaSemana.setBounds(6, 43, 110, 16);
		panel.add(txtpnDiaDaSemana);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("./img/edit.png"));
		btnNewButton_1.setBounds(416, 14, 45, 45);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon("./img/delete.png"));
		btnNewButton_1_1.setBounds(473, 14, 45, 45);
		panel.add(btnNewButton_1_1);
		
		ActionListener actListenerAdd = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaAddCursos.main(null);
			}
		};
		
		btnNewButton.addActionListener(actListenerAdd);
	}
}
