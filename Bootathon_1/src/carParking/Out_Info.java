package carParking;
import calculations.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import dateFormat.Date_class;

import java.awt.*;
class Page3 extends Frame{
	String Vehicle_No,In_Time,Out_date, amount;
	long TotalTime;
	boolean find, clickDate;
	Label l1,l2,l3,l4,l5;
	TextField t1, t2, t3, t4, t5;
	Button b1, b2, b3;
	Page3(){
		setLayout(null);
		l1 = new Label("Vehicle No");
		l2 = new Label("In Time");
		l3 = new Label("Out Time");
		l4 = new Label("Total Hours");
		l5 = new Label("Amount");
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		t4 = new TextField();
		t5 = new TextField();
		b1 = new Button("SEARCH");
		b2 = new Button("BACK");
		b3 = new Button("PAY");
		t1.addTextListener(new  TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				boolean find = true;
				if(find) {
					Vehicle_No = t1.getText();
				}
			}
		});
		if(find) {
			t2.addTextListener(new TextListener() {
				
				@Override
				public void textValueChanged(TextEvent e) {
					In_Time = t2.getText();
				}
			});
			t3.addTextListener(new TextListener() {
				
				@Override
				public void textValueChanged(TextEvent e) {
					if(clickDate) {
						Out_date = new Date_class().DateGenerate();
						t3.setText(Out_date);
					}
				}
			});
			t4.addTextListener(new TextListener() {
				
				@Override
				public void textValueChanged(TextEvent e) {
					TotalTime = new TimeCalc().getTotalTime(In_Time, Out_date);
					t4.setText(""+TotalTime);
				}
			});
			t5.addTextListener(new TextListener() {
				
				@Override
				public void textValueChanged(TextEvent e) {
					amount = new BillGeneration().BillCalculation(TotalTime,"car");
					t5.setText(amount);
				}
			});
		}
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Page1();
			}
		});
		
		l1.setBounds(200, 200, 80, 40);
		l2.setBounds(200, 300, 80, 40);
		l3.setBounds(200, 400, 80, 40);
		l4.setBounds(200, 500, 80, 40);
		l5.setBounds(200, 600, 80, 40);
		t1.setBounds(300, 200, 150, 30);
		t2.setBounds(300, 300, 150, 30);
		t3.setBounds(300, 400, 150, 30);
		t4.setBounds(300, 500, 150, 30);
		t5.setBounds(300, 600, 150, 50);
		b1.setBounds(600, 200, 50, 30);
		b2.setBounds(250, 675, 50, 30);
		b3.setBounds(450,675,50,30);
		add(l1); add(l2); add(l3); add(l4); add(l5);
		add(t1); add(t2);add(t3); add(t4); add(t5);
		add(b1); add(b2); add(b3);
		setSize(1000, 720);
		setBackground(Color.LIGHT_GRAY);
		setResizable(true);
		setVisible(true);
	}
}
public class Out_Info {
	public static void main(String[] args) {
		new Page3();
	}
}
