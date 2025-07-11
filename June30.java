//que to count the letters,digit and symbols from a mixed string
import java.util.Scanner;

public class June30 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string.......");
	        String input = sc.nextLine();

	        

	        int letters = 0;
	        int digits = 0;
	        int symbols = 0;

	        for (char ch : input.toCharArray()) {
	           

	           
	            if (Character.isLetter(ch)) {//Character is wrapper class okkkkk like Integer,Boolean,Double
	                letters++;
	            }
	            
	            else if (Character.isDigit(ch)) {
	                digits++;
	            }
	            
	            else {
	                symbols++;
	            }
	        }

	        System.out.println("Letters are.. " + letters);
	        System.out.println("Digits are.. " + digits);
	        System.out.println("Symbols are.. " + symbols);

	        sc.close();
	    }
	}
