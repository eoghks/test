package Example;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class e269 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy斥 MM岿 dd老");
		System.out.println(sd.format(now.getTime()));
		sd=new SimpleDateFormat("yyyy斥 w林 E夸老");
		System.out.println(sd.format(now.getTime()));
		sd=new SimpleDateFormat("W林 E夸老 hh:mm");
		System.out.println(sd.format(now.getTime()));
		
	}

}
