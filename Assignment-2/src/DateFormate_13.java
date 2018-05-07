import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

/*
 * Read Date in ‘YYYYMMDD’ format and display in mm/dd/yy format and “dd day
month yyyy” formats. Handle all the exceptions.
 */
public class DateFormate_13 {

	    public static void main (String[] args) {
	    	try {
	    		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd ");  
		    	   DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("mm/dd/yy");  
		    	   LocalDateTime now = LocalDateTime.now(); 
		    	   
		    	   System.out.println(dtf.format(now));  
		    	   System.out.println(dtf1.format(now)); 
		    	   
		    	   SimpleDateFormat formatter = new SimpleDateFormat("dd E MM yyyy");
		    	   Date d = new Date();
		    	   System.out.println(formatter.format(d)); 
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e.getMessage());
	    	}
	    	    
	    	   
	    }
	}   