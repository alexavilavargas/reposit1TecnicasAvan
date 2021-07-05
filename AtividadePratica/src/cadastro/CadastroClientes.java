package cadastro;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroClientes extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel panel1;
	private JPanel panel2;
	private JPanel	 panel3;
	private JTextField txtCPF;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JComboBox<String> bxProfissao;
	private JButton btnLimpar;
	private JButton btnCadastrar;

	public CadastroClientes() {

		this.setTitle("Janela de Cadastro de Clientes");
		this.setSize(new Dimension(461, 181));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		add(panel1);
		
		panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		add(panel2);

		panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		add(panel3);

		populaPanel1();
		populaPanel2();
		populaPanel3();

	}

	private void populaPanel1() {
		panel1.add(new JLabel("Cpf"));
		txtCPF = new JTextField(10);
		panel1.add(txtCPF);

		panel1.add(new JLabel("Nome"));
		txtNome= new JTextField(20);
		panel1.add(txtNome);
		
	}

	private void populaPanel2() {
		panel2.add(new JLabel("Endereco"));
		txtEndereco= new JTextField(15);
		panel2.add(txtEndereco);

		panel2.add(new JLabel("Profissao"));
		bxProfissao= new JComboBox<String>(new String[] {"--------"});
		bxProfissao.setPreferredSize(new Dimension(122,24));
		
		panel2.add(bxProfissao);
		
	}

	private void populaPanel3() {
		btnCadastrar = new JButton("Cadastrar");
		panel2.add(btnCadastrar);
		btnLimpar = new JButton("Limpar");
		panel2.add(btnLimpar);
		
	}
	
	public static void main(String[] args) {
		CadastroClientes exemplo = new CadastroClientes();
		exemplo.setVisible(true);
	}
	
	
}
