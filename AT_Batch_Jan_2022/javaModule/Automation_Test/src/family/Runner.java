package family;

import com.google.gson.Gson;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
family f = new family("Bhuvana", 24, "Housewife", "9542919551" );

f.lastName();
family g = new family("harish",  29, "softeng","9030570390");
g.lastName();

Gson g1 = new Gson();
String result = g1.toJson(f);
System.out.println(result);
String result2 = g1.toJson(g);
System.out.println(result2);




  



	}

}
