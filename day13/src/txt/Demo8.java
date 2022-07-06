package txt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*活了多少天*/
public class Demo8 {
	public static void main(String[] args) throws ParseException {
		
        String time = "2000年10月20日  17:05:38 星期四";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
		long a = sdf.parse(time).getTime();
		Date date=new Date();
		System.out.println("截止目前你活了："+(date.getTime()-a)/(24*60*60*1000)+"天");
		
		//System.out.println(date);
	}

}
