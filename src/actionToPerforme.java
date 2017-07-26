import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actionToPerforme implements ActionListener {
	
	public String buttonclicked;

	@Override
	public void actionPerformed(ActionEvent e) {
		Design saugat= new Design();
		
		buttonclicked= e.getActionCommand();
		
		//=========================C button clicked ==============================
		if (buttonclicked.equalsIgnoreCase("c")){
			saugat.value.setText("");
			if(saugat.getcount()==0){
			saugat.setfirstValue(null);
			}
			
			else if(saugat.getcount()==1){
			saugat.setsecondValue(null);
			}
		}
		
		//========================================================================
		
		//=======================plus clicked ====================================
		else if(buttonclicked.equals("+")){
					saugat.setbuttonclickedearlier("Plus");
					saugat.value.setText("");
					String check= saugat.getfirstValue();
					if (saugat.getafterequal()==1){
						if(check!=null){
							saugat.setcount(1);
						} 
						else{
							saugat.setcount(0);
						}
					}
					else if (saugat.getafterequal()==0){
						double result= saugat.getresult();
						saugat.setfirstValue(Double.toString(result));
						saugat.setcount(1);
				}
			}
		//======================================================================
				
		//-----------------------------CE BUTTON -------------------------------
		else if(buttonclicked.equalsIgnoreCase("ce")){
			saugat.setfirstValue(null);
			saugat.setsecondValue(null);
			saugat.value.setText("");
			saugat.setcount(0);
		}
		//----------------------------------------------------------------------
		
		//======================back button clicked==============================
		else if(buttonclicked.equalsIgnoreCase("back")){
			
			String number = null;
			if(saugat.getcount()==0){
				number=saugat.getfirstValue();
				saugat.setfirstValue(number.substring(0, number.length()-1));
				number=saugat.getfirstValue();
			}
			else if (saugat.getcount() ==1){
				number=saugat.getsecondvalue();
				saugat.setsecondValue(number.substring(0, number.length()-1));
				number=saugat.getsecondvalue();
			}
			
			saugat.value.setText(number);
			saugat.value.setFont(new Font("Arial Black", Font.BOLD, 10));
		}
		//======================================================================
		
		//=============================equals to button==========================
		else if(buttonclicked.equals("=")){
			double firstvalue= Double.parseDouble(saugat.getfirstValue());
			double secondvalue= Double.parseDouble(saugat.getsecondvalue());
			String action = saugat.getbuttonclickedearlier();
			
			if (action.equalsIgnoreCase("plus")){
				double result= firstvalue +secondvalue;
				saugat.setresult(result);
				String result2= Double.toString(result);
				saugat.value.setText(result2);
			}
			else if (action.equalsIgnoreCase("minus")){
				double result= firstvalue -secondvalue;
				saugat.setresult(result);
				String result2= Double.toString(result);
				saugat.value.setText(result2);
			}
			else if (action.equalsIgnoreCase("muntiply")){
				double result= firstvalue*secondvalue;
				saugat.setresult(result);
				String result2= Double.toString(result);
				saugat.value.setText(result2);
			}
			else if (action.equalsIgnoreCase("divide")){
				try{
				double result= firstvalue/secondvalue;
				saugat.setresult(result);
				String result2= Double.toString(result);
				saugat.value.setText(result2);
				}
				catch (Exception except){
					saugat.value.setText("cannot be divided by zero honey");
					saugat.setfirstValue(null);
					saugat.setsecondValue(null);
					saugat.setcount(0);
				}
				
			}
			saugat.value.setFont(new Font("Arial Black", Font.BOLD, 10));
			saugat.setcount(0);
			saugat.setafterequal(0);
			saugat.setfirstValue(null);
			saugat.setsecondValue(null);
			
		}
		//===================================================================
				
		//minus button ======================================================
		
		else if(buttonclicked.equals("-")){
			saugat.setbuttonclickedearlier("minus");
			saugat.value.setText("");
			String check= saugat.getfirstValue();
			if (saugat.getafterequal()==1){
				if(check!=null){
					saugat.setcount(1);
				} 
				else{
					saugat.setcount(0);
				}
			}
			else if (saugat.getafterequal()==0){
				double result= saugat.getresult();
				saugat.setfirstValue(Double.toString(result));
				saugat.setcount(1);
		}
	}
		
		//===============================multiplication sign ===================
		
		else if(buttonclicked.equals("*")){
			saugat.setbuttonclickedearlier("muntiply");
			saugat.value.setText("");
			String check= saugat.getfirstValue();
			if (saugat.getafterequal()==1){
				if(check!=null){
					saugat.setcount(1);
				} 
				else{
					saugat.setcount(0);
				}
			}
			else if (saugat.getafterequal()==0){
				double result= saugat.getresult();
				saugat.setfirstValue(Double.toString(result));
				saugat.setcount(1);
			}
		}
		//========================================================================
		
		//=============================division sign =============================
		
		else if(buttonclicked.equals("/")){
			saugat.setbuttonclickedearlier("divide");
			saugat.value.setText("");
			String check= saugat.getfirstValue();
			
			if (saugat.getafterequal()==1){
				if(check!=null){
					saugat.setcount(1);
				} 
				else{
					saugat.setcount(0);
				}
			}
			else if (saugat.getafterequal()==0){
				double result= saugat.getresult();
				saugat.setfirstValue(Double.toString(result));
				saugat.setcount(1);
		}
		}
		//========================================================================
		
		//=======================================================================
		else {
		String firstvalue= e.getActionCommand();
		int count=saugat.getcount();
		
		if(count==0){
			if(saugat.getfirstValue()!=null){
			String second= saugat.getfirstValue();
			saugat.setfirstValue(second+firstvalue);
			}
			else{
				saugat.setfirstValue(firstvalue);
			}
		saugat.value.setText(saugat.getfirstValue());
		saugat.value.setFont(new Font("Arial Black", Font.BOLD, 10));
		}
		
		else if (count==1){
				if(saugat.getsecondvalue()!=null){
				String second= saugat.getsecondvalue();
				saugat.setsecondValue(second+firstvalue);
				}
				else{
					saugat.setsecondValue(firstvalue);
					firstvalue= saugat.getsecondvalue();
				}
			saugat.value.setText(saugat.getsecondvalue());
			saugat.value.setFont(new Font("Arial Black", Font.BOLD, 10));
		}
			saugat.setafterequal(1);
		}
		
	}
	
}
