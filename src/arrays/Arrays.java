package arrays;
import java.util.ArrayList;
public class Arrays {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> num = new ArrayList<>();
		
		for (int j = 0; j < 10; j++) {
			num.add((j+1) + "-" + ((j+1)*10));
			System.out.println(num.get(j));
			
		}
	}

}
