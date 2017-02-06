import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTime {

	MyTime(){
	}
		
	static public String getString(){
		long currentTimeMillis = System.currentTimeMillis();

		//Calendar calendar = Calendar.getInstance();
		//calendar.setTimeInMillis(currentTimeMillis);
		//Log.v("Test",
		//    calendar.get(Calendar.HOUR_OF_DAY) + ":" +
		//    calendar.get(Calendar.MINUTE) + ":" +
		//    calendar.get(Calendar.SECOND) + ":" +
		//    calendar.get(Calendar.MILLISECOND));

		Date date = new Date(currentTimeMillis);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss SSS");
		return simpleDateFormat.format(date);
	}
}
