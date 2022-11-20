package dateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class Date_class {
	public String DateGenerate() {
		String pattern = "dd-MM-YYYY HH:mm:ss";
		SimpleDateFormat simpleDateFormat =new SimpleDateFormat(pattern, new Locale("en", "IN"));
		String date = simpleDateFormat.format(new Date());
		return date;
	}
}
