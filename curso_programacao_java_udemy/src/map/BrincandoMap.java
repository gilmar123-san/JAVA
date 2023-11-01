package map;

import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class BrincandoMap {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("nome", "Gilmar Santana");
		cookies.put("email", "gilmar@gmail.com");
		cookies.put("phone", "256398741");
		
		cookies.remove("email");
		
			
		System.out.println("Contains 'Phone' key: " + cookies.containsKey("phone"));		
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("E-mail: " + cookies.get("email"));
		
		
		for (String key : cookies.keySet()) {
			System.out.println(key + " : " + cookies.get(key));
		}		
	}

}
