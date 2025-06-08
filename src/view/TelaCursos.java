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
		
		JButton btnAdd = new JButton("+ Adicionar curso");
		btnAdd.setBackground(new Color(255, 255, 255));
		btnAdd.setBounds(6, 46, 538, 36);
		contentPane.add(btnAdd);
		
		JTextPane txtCursos = new JTextPane();
		txtCursos.setEditable(false);
		txtCursos.setBackground(new Color(238, 238, 238));
		txtCursos.setFont(new Font("Arial", Font.PLAIN, 24));
		txtCursos.setText("Cursos");
		txtCursos.setBounds(249, 6, 76, 28);
		contentPane.add(txtCursos);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(6, 94, 538, 73);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextPane txtCurso = new JTextPane();
		txtCurso.setEditable(false);
		txtCurso.setBounds(6, 6, 78, 19);
		panel.add(txtCurso);
		txtCurso.setFont(new Font("Arial", Font.PLAIN, 16));
		txtCurso.setText("Curso");
		
		JTextPane txtCod = new JTextPane();
		txtCod.setEditable(false);
		txtCod.setBounds(6, 25, 75, 16);
		panel.add(txtCod);
		txtCod.setText("Codigo Curso");
		txtCod.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JTextPane txtArea = new JTextPane();
		txtArea.setEditable(false);
		txtArea.setText("Área Curso");
		txtArea.setFont(new Font("Arial", Font.PLAIN, 13));
		txtArea.setBounds(6, 43, 110, 16);
		panel.add(txtArea);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setIcon(new ImageIcon("./img/edit.png"));
		btnEditar.setBounds(337, 17, 90, 36);
		panel.add(btnEditar);
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.setIcon(new ImageIcon("./img/delete.png"));
		btnApagar.setBounds(436, 17, 90, 36);
		panel.add(btnApagar);
		
		
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
		
		btnAdd.addActionListener(actListenerAdd);
		btnEditar.addActionListener(actListenerEdit);
	}
	
	
}
