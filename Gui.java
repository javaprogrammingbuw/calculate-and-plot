import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame{

	private JPanel contentPane;
	private JPanel inputPane;
	private JPanel outputPane;
	private JTextField tf1;
	private JTextField tf2;
	private JButton calcBtn;

	public Gui(){
		initUi();
	}

	public void initUi(){
		contentPane = (JPanel) getContentPane();

		inputPane = new JPanel();
		tf1 = new JTextField();
		tf1.setText("Input comes here");
		tf2 = new JTextField();
		tf2.setText("Input comes here");
		calcBtn = new JButton("Compute");
		inputPane.add(tf1);
		inputPane.add(tf2);
		inputPane.add(calcBtn);
		inputPane.setLayout(new GridLayout(1,3));

		outputPane = new Graph();
		outputPane.setPreferredSize(new Dimension(600, 600));
		outputPane.setLayout(new FlowLayout());

		contentPane.add(inputPane);
		contentPane.add(outputPane);

		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        pack();

        //Position in screen center
        setLocationRelativeTo(null);
        //Close Application when window is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args){
		EventQueue.invokeLater(() ->{
            Gui gui = new Gui();
            gui.setVisible(true);
        });
	}

}