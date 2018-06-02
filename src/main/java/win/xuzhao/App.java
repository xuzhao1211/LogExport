package win.xuzhao;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class App {

	
	public static void main(String[] args){
		App app = new App();
		app.start();
	}

	private void close(){
		System.exit(0);
	}
	
	private void start() {
		init();
	}

	private Panel panel1;
	private Button button1;
	private TextField textField;
	private Frame mainFrame;
	
	private void init(){
		
		textField = new TextField();
		
		button1 = new Button();
		button1.setSize(100,100);
		button1.addMouseListener(new MainMouseListener());
		
		button1.addKeyListener(new KeyListener(){

			public void keyPressed(KeyEvent arg0) {
				System.out.println("keyPressed");	
			}

			public void keyReleased(KeyEvent arg0) {
				System.out.println("keyReleased");	
			}

			public void keyTyped(KeyEvent arg0) {
				System.out.println("keyTyped");	
			}
		});
		
		panel1 = new Panel();
		panel1.setSize(100,100);
		panel1.add(textField);
		panel1.add(button1);
		
		mainFrame = new Frame("LogExport");
		mainFrame.setLocation(100, 100);
		mainFrame.setLocationByPlatform(true);
		mainFrame.setSize(600,400);
		mainFrame.setBackground(Color.ORANGE);
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);
		mainFrame.setLayout(new FlowLayout());		
		mainFrame.addWindowListener(new MainWindowListener(this));
		mainFrame.add(panel1);
	}

	private class MainWindowListener implements WindowListener{

		private App app;
		
		public MainWindowListener(App app){
			this.app = app;
		}
		public void windowActivated(WindowEvent e) {
			System.out.println("TODO Auto-generated method stub");
		}

		public void windowClosed(WindowEvent e) {
			System.out.println("TODO Auto-generated method stub");
		}

		public void windowClosing(WindowEvent e) {
			app.close();
		}

		public void windowDeactivated(WindowEvent e) {
			System.out.println("TODO Auto-generated method stub");
		}

		public void windowDeiconified(WindowEvent e) {
			System.out.println("TODO Auto-generated method stub");
		}

		public void windowIconified(WindowEvent e) {
			System.out.println("TODO Auto-generated method stub");
		}

		public void windowOpened(WindowEvent e) {
			System.out.println("TODO Auto-generated method stub");
		}
	}
	
	private class MainMouseListener implements MouseListener {

		public void mouseClicked(MouseEvent arg0) {
			System.out.println("mouseClicked");
		}

		public void mouseEntered(MouseEvent arg0) {
			System.out.println("mouseEntered");	
		}

		public void mouseExited(MouseEvent arg0) {
			System.out.println("mouseExited");	
		}

		public void mousePressed(MouseEvent arg0) {
			System.out.println("mousePressed");	
		}

		public void mouseReleased(MouseEvent arg0) {
			System.out.println("mouseReleased");	
		}
	}
}
