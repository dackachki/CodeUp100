
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("갯수 입력:");
	 int quantity = sc.nextInt();
	 sc.nextLine();
	 
	 System.out.println("추 무게 입력:");
	 String input = sc.nextLine();
	 System.out.println("L/R");
	 String direction = sc.nextLine();
	 String[] showDirection = new String[quantity];
	 showDirection = direction.split("");
	 int[] weight = new int[quantity];
	 for(int i =0; i<quantity;i++) {
		
			
		 weight[i] = Integer.parseInt(input.split(" ")[i]);
		 System.out.printf("%d",weight[i]);
		 System.out.printf("%s",showDirection[i]);
		 System.out.println();
	 }
}
}
