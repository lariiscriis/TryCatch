package br.edu.fatecpg.view;

import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import br.edu.fatecpg.exception.ExcecaoEmail;
import br.edu.fatecpg.exception.ExcecaoNome;
import br.edu.fatecpg.model.CadastroCliente;
import br.edu.fatecpg.service.ValidandoExcecoes;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nome;
	private JTextField idade;
	private JTextField email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		ValidandoExcecoes validando = new ValidandoExcecoes();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Formulário de Cadastro");
		lblNewLabel.setBounds(123, 12, 167, 15);
		contentPane.add(lblNewLabel);

		nome = new JTextField();
		nome.setToolTipText("Digite seu nome:");
		nome.setBounds(156, 55, 114, 19);
		contentPane.add(nome);
		nome.setColumns(10);

		idade = new JTextField();
		idade.setToolTipText("Digite sua idade:");
		idade.setColumns(10);
		idade.setBounds(156, 105, 114, 19);
		contentPane.add(idade);

		email = new JTextField();
		email.setToolTipText("Digite seu email:");
		email.setColumns(10);
		email.setBounds(156, 143, 114, 19);
		contentPane.add(email);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(156, 39, 70, 15);
		contentPane.add(lblNome);

		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(156, 86, 70, 15);
		contentPane.add(lblIdade);

		JLabel lblEmail = new JLabel("email:");
		lblEmail.setBounds(156, 126, 70, 15);
		contentPane.add(lblEmail);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(154, 164, 117, 25);
		contentPane.add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String nomeTexto = nome.getText();
					int idadeTexto = Integer.parseInt(idade.getText());
					String emailTexto = email.getText();

					validando.ValidarNome(nomeTexto);
					validando.ValidarEmail(emailTexto);

					CadastroCliente CadCliente = new CadastroCliente(nomeTexto, idadeTexto, emailTexto);
					JOptionPane.showMessageDialog(TelaCadastro.this,
							"Cliente " + CadCliente.getNome() + " cadastrado com sucesso!\n",
							"Cadastrado! Bem vindo :)", JOptionPane.INFORMATION_MESSAGE);

				} catch (ExcecaoNome er) {
					JOptionPane.showMessageDialog(TelaCadastro.this, er.getMessage(), "Erro: ",
							JOptionPane.ERROR_MESSAGE);
				} catch (NumberFormatException err) {
					JOptionPane.showMessageDialog(TelaCadastro.this, err.getMessage(), "Erro: ",
							JOptionPane.ERROR_MESSAGE);
				} catch (ExcecaoEmail erro) {
					JOptionPane.showMessageDialog(TelaCadastro.this, erro.getMessage(), "Erro",
							JOptionPane.ERROR_MESSAGE);
				} catch (Exception error) {
					JOptionPane.showMessageDialog(TelaCadastro.this, error.getMessage(), "Erro",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

	}
}
