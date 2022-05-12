package datatypes;
import java.util.*;
public class Sample {

	public static void main(String[] args) {
		int x = 25, y = 3, n = 15;
		
		
	       
	        if ( y == 0) {
	            System.out.print("Infinite");
	            return;
	        }
	        if ( x == 0) {
	            System.out.print("0");
	            return;
	        }
	        if (n <= 0) {
	           
	            System.out.print(x / y);
	            return;
	        }
	 
	       
	        if (((x > 0) && (y < 0)) || ((x < 0) && (y > 0))) {
	            System.out.print("-");
	            x = x > 0 ? x : -x;
	            y = y > 0 ? y : -y;
	        }
	 
	       
	        int d = x / y;
	 
	        
	        for (int i = 0; i <= n; i++) {
	            System.out.print(d);
	            x = x - (y * d);
	            if (x == 0)
	                break;
	            x = x * 10;
	            d = x / y;
	            if (i == 0)
	                System.out.print(".");
	        }
	

}
}