package view;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import controller.ToolBarController;

public class ToolBarView extends JFrame {

	public ToolBarView() {

		this.setTitle("Toolbar Example");
		this.setSize(1200, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());

		// Tạo controller
		ToolBarController controller = new ToolBarController();

		// Tạo Toolbar
		JToolBar toolBar = new JToolBar();

		// Tạo các button theo yêu cầu
		JButton btnOpen = new JButton("Open file");
		JButton btnSave = new JButton("Save");
		JButton btnSaveAs = new JButton("Save as");
		JButton btnPrint = new JButton("Print");
		JButton btnSendMail = new JButton("Send mail");
		JButton btnFacebook = new JButton("Facebook");
		JButton btnSlideShow = new JButton("Slide Show");
		JButton btnHand = new JButton("Hand");
		JButton btnSearch = new JButton("Search");
		JButton btnPointer = new JButton("Pointer");
		JButton btnHighlight = new JButton("Highlight");
		JButton btnCamera = new JButton("Camera");
		JButton btnRMS = new JButton("RMS");
		JButton btnSign = new JButton("Sign");

		// Gắn ActionListener
		btnOpen.addActionListener(controller);
		btnSave.addActionListener(controller);
		btnSaveAs.addActionListener(controller);
		btnPrint.addActionListener(controller);
		btnSendMail.addActionListener(controller);
		btnFacebook.addActionListener(controller);
		btnSlideShow.addActionListener(controller);
		btnHand.addActionListener(controller);
		btnSearch.addActionListener(controller);
		btnPointer.addActionListener(controller);
		btnHighlight.addActionListener(controller);
		btnCamera.addActionListener(controller);
		btnRMS.addActionListener(controller);
		btnSign.addActionListener(controller);

		// Thêm button vào toolbar
		toolBar.add(btnOpen);
		toolBar.add(btnSave);
		toolBar.add(btnSaveAs);
		toolBar.add(btnPrint);
		toolBar.add(btnSendMail);
		toolBar.add(btnFacebook);
		toolBar.add(btnSlideShow);
		toolBar.add(btnHand);
		toolBar.add(btnSearch);
		toolBar.add(btnPointer);
		toolBar.add(btnHighlight);
		toolBar.add(btnCamera);
		toolBar.add(btnRMS);
		toolBar.add(btnSign);

		// Thêm toolbar vào frame
		this.add(toolBar, BorderLayout.NORTH);

		this.setVisible(true);
	}
}