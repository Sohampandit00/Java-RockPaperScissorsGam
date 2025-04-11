import java.util.Scanner;
public class rockpaperscissors
{
	public static void main(String[] args){
		System.out.println("Make your choice for rock, paper, scissors against the computer");
		System.out.println("1 = rock, 2 = paper, 3 = scissors");
		Scanner scan = new Scanner(System.in);
		int userPick = scan.nextInt();
		int computerPick = (int)Math.random() * 3 + 1;

		if(userPick == computerPick){
		System.out.println("Draw!");
		System.out.println("You picked " + userPick);
		System.out.println("The computer picked " + computerPick);
		}else if(userPick == 3 && computerPick == 2){
		System.out.println("You win!");
		System.out.println("You picked " + userPick);
		System.out.println("The computer picked " + computerPick);
		}else if(userPick == 1 && computerPick == 2){
		System.out.println("Computer wins!");
		System.out.println("You picked " + userPick);
		System.out.println("The computer picked " + computerPick);
		}else if(userPick == 3 && computerPick == 1){
		System.out.println("Computer wins!");
		System.out.println("You picked " + userPick);
		System.out.println("The computer picked " + computerPick);
		}else if(userPick == 2 && computerPick == 3){
		System.out.println("Computer wins!");
		System.out.println("You picked " + userPick);
		System.out.println("The computer picked " + computerPick);
		}else if(userPick == 2 && computerPick == 1){
		System.out.println("You win!");
		System.out.println("You picked " + userPick);
		System.out.println("The computer picked " + computerPick);
		}else if(userPick == 1 && computerPick == 2){
		System.out.println("You win!");
		System.out.println("You picked " + userPick);
		System.out.println("The computer picked " + computerPick);
		}else{
		System.out.println("Please enter a correct input");
		}





	}
}
