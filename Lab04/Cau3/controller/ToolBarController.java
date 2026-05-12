package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ToolBarController implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonName = e.getActionCommand();
		JOptionPane.showMessageDialog(null, "Bạn đã chọn chức năng: " + buttonName);
	}
}