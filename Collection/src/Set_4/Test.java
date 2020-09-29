package Set_4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country countries = new Country();
		countries.saveCountryNames("India");
		countries.saveCountryNames("USA");
		countries.saveCountryNames("Italy");
		countries.saveCountryNames("Spain");
		countries.saveCountryNames("China");

		System.out.println("China: " + countries.getCountry("China"));
		System.out.println("Japan: " + countries.getCountry("Japan"));		
	}

}
