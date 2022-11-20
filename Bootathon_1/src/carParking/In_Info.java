package carParking;
import dateFormat.*;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import backend.Inseertion;

import java.awt.*;

public class In_Info extends Frame{
	private String Name,Vehilce_Num,Vehicle_Type,Phone,Start_date,Address;
	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getVehilce_Num() {
		return Vehilce_Num;
	}

	public void setVehilce_Num(String vehilce_Num) {
		Vehilce_Num = vehilce_Num;
	}

	public String getVehicle_Type() {
		return Vehicle_Type;
	}

	public void setVehicle_Type(String vehicle_Type) {
		Vehicle_Type = vehicle_Type;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getStart_date() {
		return Start_date;
	}

	public void setStart_date(String start_date) {
		Start_date = start_date;
	}

	boolean clickDate;
	Label l1, l2, l3, l4, l5, l6;
	TextField t1, t2, t3, t4, t5;
	Choice a;
	Button b1,b2,b3;
	
	void FrameDeveloping(){
		
		setLayout(null);
		l1 = new Label("Name");
		l2 = new Label("Vehicle No.");
		l3 = new Label("Phone");
		l4 = new Label("Start Date");
		l5 = new Label("Address");
		l6 = new Label("Vehicle Type");
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		t4 = new TextField();
		t5 = new TextField();
		b1 = new Button("DATE");
		b2 = new Button("BACK");
		b3 = new Button("SUBMIT");
		a = new Choice();
		a.add("SELECT");
		a.add("CAR");a.add("BIKE");
		t1.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				
			}
		});
		t2.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				
			}
		});
		t3.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				
			}
		});
		t4.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				if(clickDate) {
					setStart_date( t4.getText());	
				}
			}
		});
		t5.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				
			}
		});
		a.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				setVehicle_Type(a.getSelectedItem());
				
			}
		});
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String date = new Date_class().DateGenerate();
				clickDate = true;
				t4.setText(date);
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Page1();
			}
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVehicle_Type(a.getSelectedItem());
				setPhone( t3.getText());
				setName(t1.getText());
				setVehilce_Num( t2.getText());
				setAddress(t5.getText());
				new Inseertion(getName(),getVehilce_Num(),getPhone(),getStart_date(),getAddress());
			}
		});
		l6.setBounds(200, 125, 80, 30);
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
		b1.setBounds(475, 500, 50, 30);
		b2.setBounds(250, 675, 50, 30);
		b3.setBounds(450,675,50,30);
		a.setBounds(300, 125, 50, 50);
		add(l1); add(l2); add(l3); add(l4); add(l5); add(l6);
		add(t1); add(t2);add(t3); add(t4); add(t5);
		add(b1); add(b2); add(b3);
		add(a);
		setSize(1000, 720);
		setBackground(Color.LIGHT_GRAY);
		setResizable(true);
		setVisible(true);
		
	}
	
}


