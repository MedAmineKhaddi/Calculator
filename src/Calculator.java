import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("donner deux nombres");
		int Number = in.nextInt();
		System.out.println("");
		int Number_=in.nextInt();
		System.out.println("donner symbole +,*,-,/");
		char symbol =in.next().charAt(0);
		switch(symbol)
			{
			case '+':
				System.out.println(Number+Number_);
				break;
			case '-':
				System.out.println(Number-Number_);
				break;
			case '/':
				System.out.println(Number/Number_);
				break;
			case '*':
				System.out.println(Number*Number_);
				break;
			default :
				System.out.println("Erreur");
	}

	}

}
