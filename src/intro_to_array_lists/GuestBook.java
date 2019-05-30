package intro_to_array_lists;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GuestBook implements ActionListener{
	public static void main(String[] args) {
		new GuestBook().createUI();
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton Add = new JButton();
	JButton View = new JButton();
	private void createUI() {
	frame.add(panel);
	panel.add(Add);
	panel.add(View);
	Add.addActionListener(this);
	View.addActionListener(this);
	frame.setVisible(true);
	frame.setTitle("GuestBook");
	Add.setText("Add Name");
	View.setText("View Names");
	frame.pack();
	
	}
	ArrayList<String> names = new ArrayList<String>();
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed.equals(Add)) {
			String name = JOptionPane.showInputDialog("Enter a name");
			names.add(name);
		} else if(buttonPressed.equals(View)) {
			String name2 = "";
		for (int i = 0; i < names.size(); i++) {
			
			name2 = name2+ "Guest #"+(i+1)+" "+names.get(i)+"\n"+" ";
			
		}
		JOptionPane.showMessageDialog(null, name2);
		}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 

	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
	
}
