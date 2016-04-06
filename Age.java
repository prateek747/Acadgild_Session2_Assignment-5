import java.util.Scanner; 
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
        System.out.println("Please enter your age....");
        age = sc.nextInt();
        if (age >= 18){
        	System.out.println("You can vote");
        }
        else{
        	System.out.println("You are too young too vote");
        }
        
        
	}

}
