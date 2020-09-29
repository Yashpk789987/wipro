import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Map_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties properties = new Properties();

		properties.setProperty("MP", "Bhopal");
		properties.setProperty("Rajasthan", "Jodhpur");
		properties.setProperty("UP", "Jaipur");

		Set<Entry<Object, Object>> set = properties.entrySet();
		Iterator<Entry<Object, Object>> it = set.iterator();

		while (it.hasNext()) {
			Entry<Object, Object> me = it.next();
			System.out.println(me);
		}
	}

}
