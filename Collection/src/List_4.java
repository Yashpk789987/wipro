import java.util.ArrayList;
import java.util.List;

class CustomList<E> extends ArrayList<E> {
	@Override
	public boolean add(E e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			return true;
		} else {
			throw new ClassCastException("Only Integer, Float, and Double are supported.");
		}
	}
}

public class List_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> list = new CustomList<>();

		try {
			list.add(37);
			list.add(12.2F);
			list.add(2.37D);
			list.add("String");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(list);
	}

}
