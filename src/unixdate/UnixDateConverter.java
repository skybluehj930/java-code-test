package unixdate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnixDateConverter {

	public static String getTimestampToDate(String timestampStr){
	    long timestamp = Long.parseLong(timestampStr);
	    Date date = new java.util.Date(timestamp*1000L); 
	    SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH-mm-ss.SSS"); 
	    sdf.setTimeZone(java.util.TimeZone.getTimeZone("GMT+9")); 
	    String formattedDate = sdf.format(date);
	    return formattedDate;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dateStr = getTimestampToDate("1591073135855");
	    System.out.println(dateStr);
	}

}
