package entornosEj1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.ScrollPaneConstants;

public class Departamentos {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Departamentos window = new Departamentos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Departamentos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setMinimumSize(new Dimension(10000, 10000));
		frame.setMinimumSize(new Dimension(750, 550));
		frame.getContentPane().setSize(new Dimension(1000, 1000));
		frame.setSize(new Dimension(802, 1000));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 434, 24);
		
		JLabel lblNewLabel = new JLabel("DATOS DE DEPARTAMENTOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setForeground(new Color(0, 0, 255));
		panel.add(lblNewLabel);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo Departamento");
		lblNewLabel_1.setFont(lblNewLabel_1.getFont().deriveFont(12f));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setToolTipText("14");
		lblNewLabel_1.setSize(new Dimension(1005, 1005));
		lblNewLabel_1.setPreferredSize(new Dimension(10050, 14));
		lblNewLabel_1.setMinimumSize(new Dimension(1005, 14));
		lblNewLabel_1.setMaximumSize(new Dimension(1005, 14));
		lblNewLabel_1.setBounds(19, 52, 133, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(new Color(255, 128, 255));
		textField.setBounds(175, 50, 55, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre departamento");
		lblNewLabel_2.setBounds(19, 77, 145, 24);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setBounds(174, 80, 113, 18);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Selecciona el pais");
		lblNewLabel_1_1.setBounds(23, 140, 114, 24);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Localidad Departamento");
		lblNewLabel_2_1.setBounds(19, 108, 145, 24);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(174, 109, 113, 18);
		frame.getContentPane().add(textField_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Gestion");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(402, 78, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnPersonal = new JRadioButton("Personal");
		buttonGroup.add(rdbtnPersonal);
		rdbtnPersonal.setBounds(402, 109, 109, 23);
		frame.getContentPane().add(rdbtnPersonal);
		
		JRadioButton rdbtnApoyo = new JRadioButton("Apoyo");
		buttonGroup.add(rdbtnApoyo);
		rdbtnApoyo.setBounds(402, 141, 109, 23);
		frame.getContentPane().add(rdbtnApoyo);
		
		JRadioButton rdbtnTecnologico = new JRadioButton("Tecnologico");
		buttonGroup.add(rdbtnTecnologico);
		rdbtnTecnologico.setBounds(402, 169, 109, 23);
		frame.getContentPane().add(rdbtnTecnologico);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Aplicar subida");
		chckbxNewCheckBox.setBounds(414, 218, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"España", "Italia"}));
		comboBox.setBounds(147, 141, 93, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Ver Datos");
		btnNewButton.setBounds(18, 189, 109, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnInsertarOficina = new JButton("Insertar Oficina");
		btnInsertarOficina.setBounds(117, 235, 139, 24);
		frame.getContentPane().add(btnInsertarOficina);
		
		JButton btnNewButton_1 = new JButton("Limpiar Datos");
		btnNewButton_1.setBounds(215, 184, 125, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo de desplazamiento");
		lblNewLabel_3.setBounds(398, 52, 168, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setSelectedTextColor(Color.BLACK);
		editorPane.setForeground(Color.BLACK);
		editorPane.setBackground(new Color(255, 255, 128));
		editorPane.setBounds(10, 35, 679, 241);
		frame.getContentPane().add(editorPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setSize(new Dimension(25, 20));
		scrollPane.setMaximumSize(new Dimension(3, 3));
		scrollPane.setMinimumSize(new Dimension(3, 3));
		scrollPane.setBounds(32, 284, 625, 203);
		frame.getContentPane().add(scrollPane);
		
		JTextArea txtrDDD = new JTextArea();
		txtrDDD.setTabSize(18);
		txtrDDD.setSize(new Dimension(300, 300));
		txtrDDD.setMinimumSize(new Dimension(300, 25));
		txtrDDD.setToolTipText("");
		txtrDDD.setText("d\r\nd\r\nd\r\nd\r\nd\r\nd\r\nd\r\nd\r\nd\r\nd\r\nd\r\nd\r\n");
		scrollPane.setViewportView(txtrDDD);
	}
}
