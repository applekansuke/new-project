
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.example.tool.DumpObject;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class MyFrame extends JFrame
implements ActionListener, ListSelectionListener{

	private JPanel contentPane;
	private JTextField textField;
	JLabel label;
	JList list;
	private JScrollPane scrollPane_1;
	JTextArea textArea;
	MyData myData = new MyData();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
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
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
				GridBagLayout gbl_contentPane = new GridBagLayout();
				gbl_contentPane.columnWidths = new int[]{424, 0};
				gbl_contentPane.rowHeights = new int[]{19, 225, 67, 0, 0};
				gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
				gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
				contentPane.setLayout(gbl_contentPane);
						
								textField = new JTextField();
								GridBagConstraints gbc_textField = new GridBagConstraints();
								gbc_textField.anchor = GridBagConstraints.NORTH;
								gbc_textField.fill = GridBagConstraints.HORIZONTAL;
								gbc_textField.insets = new Insets(0, 0, 5, 0);
								gbc_textField.gridx = 0;
								gbc_textField.gridy = 0;
								contentPane.add(textField, gbc_textField);
								textField.addActionListener((ActionListener) this);
								textField.setColumns(10);
				
						JScrollPane scrollPane = new JScrollPane();
						GridBagConstraints gbc_scrollPane = new GridBagConstraints();
						gbc_scrollPane.fill = GridBagConstraints.BOTH;
						gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
						gbc_scrollPane.gridx = 0;
						gbc_scrollPane.gridy = 1;
						contentPane.add(scrollPane, gbc_scrollPane);
						
								list = new JList(myData.model);
								scrollPane.setViewportView(list);
								list.addListSelectionListener(this);
								
								JLabel lblNewLabel = new JLabel("New label");
								label = lblNewLabel;
								scrollPane.setColumnHeaderView(lblNewLabel);
								label.setText("çsêî=" + myData.model.size());
				
		
		scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridheight = 2;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 2;
		contentPane.add(scrollPane_1, gbc_scrollPane_1);
		
		textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = textField.getText();
		myData.model.addElement(s);
		label.setText("çsêî=" + myData.model.size());
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		int lIndex = list.getSelectedIndex();
		if(lIndex == -1){
			
		}else{
//			textArea.setText(myData.map.get(result).toString());
		}
		
		Object obj = list.getSelectedValue();
		Object obj2 = myData.map.get(obj);
		if(obj2 == null){
			textArea.setText("ìoò^Ç»ÇµÇÊÅI");
		}else{
			textArea.setText(myData.map.get(obj).toString());
		}
	}	
}
