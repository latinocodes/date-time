package date;

import java.util.Date;

import javax.swing.JOptionPane;

import java.text.*;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      Date dNow = new Date( );
	      SimpleDateFormat ft = new SimpleDateFormat ("E MM.dd.yyyy\n"
	    		  										+ "'at' hh:mm:ss a zzz");
	      
	      JOptionPane.showMessageDialog(null, "Today's Date: " + ft.format(dNow));
		
	}
}