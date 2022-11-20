package carParking;
import java.awt.Button;
import java.util.*;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Page1 extends Frame{
	Page1(){
		setLayout(null);
		Button b1,b2,b3;
		b1 = new Button("IN");
		b2 = new Button("OUT");
		b3 = new Button("EXIT");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new In_Info().FrameDeveloping();
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Page3();
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		b1.setBounds(200, 200, 30, 20);
		b2.setBounds(300,200 , 30, 20);
		b3.setBounds(250, 400, 30, 20);
		add(b1);add(b2);add(b3);
		setBackground(Color.BLUE);
		setSize(800, 720);
	    setResizable(true);
	    setVisible(true);
	}
}
public class InOrOut extends Frame{
		public static void main(String[] args) {
			new Page1();
		}
		
}

