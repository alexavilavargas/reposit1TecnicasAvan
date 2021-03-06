package editor;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class TextoEditor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextArea txtArea;

	public TextoEditor() {

		this.setTitle("Editor de Texto");
		this.setSize(450, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new BorderLayout());

		addmenu();

		JScrollPane scrollPane = new JScrollPane(txtArea);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		txtArea = new JTextArea();
		scrollPane.setViewportView(txtArea);

		add(scrollPane, BorderLayout.CENTER);
	}

	private void addmenu() {
	
		JMenuBar menuBar = new JMenuBar();

		
		this.setJMenuBar(menuBar);

	
		JMenu fileMenu = new JMenu("Arquivo");
		JMenu editMenu = new JMenu("Editar");
		menuBar.add(fileMenu);
		menuBar.add(editMenu);

	
		JMenuItem menuItemNovo = new JMenuItem("Novo");
		JMenuItem menuItemAbrir = new JMenuItem("Abrir");
		JMenuItem menuItemCopiar = new JMenuItem("Copiar");
		JMenuItem menuItemColar = new JMenuItem("Colar");

		fileMenu.add(menuItemNovo);
		fileMenu.add(menuItemAbrir);

		editMenu.add(menuItemCopiar);
		editMenu.add(menuItemColar);

	}

public static void main(String[] args) {
	TextoEditor exec = new TextoEditor();
	exec.setVisible(true);
			}

}
