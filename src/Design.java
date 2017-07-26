import javax.swing.*;

import java.awt.*;

public class Design extends JFrame{
	
	//Calcuation variables=============================
	private static String firstvalue;
	private static String secondvalue;
	private static int count;
	private static String buttonclickedearlier;
	private static int afterequal;
	private static double result;
	//=================================================
	
	//panel list======================================
	private JPanel panel1;
	private JPanel panel2;
	//================================================
	
	public JTextArea value;
	 
	
	//row1 ============================================
	private JButton buttonce;
	private JButton buttonc;
	private JButton buttonback;
	private JButton buttondivide;
	//==================================================
	
	
	//row2 =============================================
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton buttonplus;
	//===================================================
	
	//row3 ==============================================
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton buttonminus;
	//===================================================
	
	//row4 ==============================================
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton buttonmuntiply;
	//===================================================
	
	//row3 ==============================================
	private JButton button00;
	private JButton button0;
	private JButton buttonpoint;
	private JButton buttonequal;
	//===================================================

	
	public Design(){
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		buildpanel();
		add(panel1);
		add(panel2);
		
		pack();
		setVisible(true);
	}

	public void buildpanel() {
		
		//panel1 components===============================
		value= new JTextArea(6,20);
		value.setEditable(false);
		panel1= new JPanel();
		panel1.add(value);
		//===================================================
		
		//panel 2 components ===============================
		panel2= new JPanel(new GridLayout(5,4));
		
		//row1==================================================
		buttonce= new JButton("CE");
		buttonce.addActionListener(new actionToPerforme());
		buttonc= new JButton("C");
		buttonc.addActionListener(new actionToPerforme());
		buttonback= new JButton("Back");
		buttonback.addActionListener(new actionToPerforme());
		buttondivide= new JButton("/");
		buttondivide.addActionListener(new actionToPerforme());
		
		panel2.add(buttonce);
		panel2.add(buttonc);
		panel2.add(buttonback);
		panel2.add(buttondivide);
		
		
		//==================================================
		
		
		//row2==================================================
		button7= new JButton("7");
		button7.addActionListener(new actionToPerforme());
		button8= new JButton("8");
		button8.addActionListener(new actionToPerforme());
		button9= new JButton("9");
		button9.addActionListener(new actionToPerforme());
		buttonplus= new JButton("+");
		buttonplus.addActionListener(new actionToPerforme());
				
		panel2.add(button7);
		panel2.add(button8);
		panel2.add(button9);
		panel2.add(buttonplus);
		//========================================================
		
		//row3==================================================
		button4= new JButton("4");
		button4.addActionListener(new actionToPerforme());
		button5= new JButton("5");
		button5.addActionListener(new actionToPerforme());
		button6= new JButton("6");
		button6.addActionListener(new actionToPerforme());
		buttonminus= new JButton("-");
		buttonminus.addActionListener(new actionToPerforme());
				
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		panel2.add(buttonminus);
		//======================================================
		
		//row4==================================================
		button1= new JButton("1");
		button1.addActionListener(new actionToPerforme());
		button2= new JButton("2");
		button2.addActionListener(new actionToPerforme());
		button3= new JButton("3");
		button3.addActionListener(new actionToPerforme());
		buttonmuntiply= new JButton("*");
		buttonmuntiply.addActionListener(new actionToPerforme());
				
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(buttonmuntiply);
		//==================================================
		
		//row5==================================================
		button00= new JButton("00");
		button00.addActionListener(new actionToPerforme());
		button0= new JButton("0");
		button0.addActionListener(new actionToPerforme());
		buttonpoint= new JButton(".");
		buttonpoint.addActionListener(new actionToPerforme());
		buttonequal= new JButton("=");
		buttonequal.addActionListener(new actionToPerforme());
		
		panel2.add(button00);
		panel2.add(button0);
		panel2.add(buttonpoint);
		panel2.add(buttonequal);
		//======================================================
		
	}
	
	// methods to get the first value and the second value===============================
	public void setfirstValue(String value){
		firstvalue= value;
	}
	
	public void setcount(int value){
		count=value;
	}
	
	public void setsecondValue(String value){
		secondvalue=value;
	}
	
	public String getfirstValue(){
		return firstvalue;
	}

	public int getcount(){
		return count;
	}
	
	public String getsecondvalue(){
		return secondvalue;
	}
	
	public void setbuttonclickedearlier(String value){
		buttonclickedearlier=value;
	}
	
	public String getbuttonclickedearlier(){
		return buttonclickedearlier;
	}
	
	public void setafterequal(int value){
		afterequal=value;
	}
	
	public int getafterequal(){
		return afterequal;
	}
	
	public void setresult(double value){
		result=value;
	}
	
	public double getresult(){
		return result;
	}
	//=======================================================================================
}
