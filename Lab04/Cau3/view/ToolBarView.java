package view;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import controller.ToolBarController;

public class ToolBarView extends JFrame {

	public ToolBarView() {

		this.setTitle("Toolbar Example");
		this.setSize(900, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());

		// Tạo controller
		ToolBarController controller = new ToolBarController();

		// Tạo Toolbar
		JToolBar toolBar = new JToolBar();

		// Tạo các button theo yêu cầu
		JButton btnOpen = new JButton();
		btnOpen.setActionCommand("Open file");
		btnOpen.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(ToolBarView.class.getResource("icon_open.png"))));
		
		JButton btnSave = new JButton();
		btnSave.setActionCommand("Save");
		btnSave.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(ToolBarView.class.getResource("icon_save.png"))));
		
		JButton btnSaveAs = new JButton();
		btnSaveAs.setActionCommand("Save as");
		btnSaveAs.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(ToolBarView.class.getResource("icon_saveas.png"))));
		
		JButton btnPrint = new JButton();
		btnPrint.setActionCommand("Print");
		btnPrint.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(ToolBarView.class.getResource("icon_print.png"))));
		
		JButton btnSendMail = new JButton();
		btnSendMail.setActionCommand("Send mail");
		btnSendMail.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(ToolBarView.class.getResource("icon_mail.png"))));
		
		JButton btnFacebook = new JButton();
		btnFacebook.setActionCommand("Facebook");
		btnFacebook.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(ToolBarView.class.getResource("icon_facebook.png"))));
		
		JButton btnSlideShow = new JButton();
		btnSlideShow.setActionCommand("Slide show");
		btnSlideShow.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(ToolBarView.class.getResource("icon_slideshow.png"))));
		
		JButton btnHand = new JButton();
		btnHand.setActionCommand("Hand");
		btnHand.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(ToolBarView.class.getResource("icon_hand.png"))));
		
		JButton btnSearch = new JButton();
		btnSearch.setActionCommand("Search");
		btnSearch.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(ToolBarView.class.getResource("icon_search.png"))));
		
		JButton btnPointer = new JButton();
		btnPointer.setActionCommand("Pointer");
		btnPointer.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(ToolBarView.class.getResource("icon_pointer.png"))));
		
		JButton btnHighlight = new JButton();
		btnHighlight.setActionCommand("Highlight");
		btnHighlight.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(ToolBarView.class.getResource("icon_highlight.png"))));
		
		JButton btnCamera = new JButton();
		btnCamera.setActionCommand("Camera");
		btnCamera.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(ToolBarView.class.getResource("icon_camera.png"))));
		
		JButton btnRMS = new JButton();
		btnRMS.setActionCommand("RMS");
		btnRMS.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(ToolBarView.class.getResource("icon_rms.png"))));
		
		JButton btnSign = new JButton();
		btnSign.setActionCommand("Sign");
		btnSign.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(ToolBarView.class.getResource("icon_sign.png"))));

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