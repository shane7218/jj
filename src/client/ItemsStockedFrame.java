package client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;

public class ItemsStockedFrame extends JFrame {

	private JPanel contentPane;
	private JTextField itemIDToBeStockedField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ItemsStockedFrame frame = new ItemsStockedFrame();
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
	public ItemsStockedFrame() {
		setTitle("Stocker Main Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton logOutButton = new JButton("Log Out");
		logOutButton.setBounds(335, 11, 89, 23);
		contentPane.add(logOutButton);
		
		itemIDToBeStockedField = new JTextField();
		itemIDToBeStockedField.setText("Item ID");
		itemIDToBeStockedField.setBounds(65, 63, 119, 31);
		contentPane.add(itemIDToBeStockedField);
		itemIDToBeStockedField.setColumns(10);
		
		JButton itemStockedButton = new JButton("Item Stocked");
		itemStockedButton.setBounds(194, 63, 112, 33);
		contentPane.add(itemStockedButton);
		
		JList listOfItemsToBeStocked = new JList();
		listOfItemsToBeStocked.setBounds(65, 113, 241, 95);
		contentPane.add(listOfItemsToBeStocked);
	}

}
