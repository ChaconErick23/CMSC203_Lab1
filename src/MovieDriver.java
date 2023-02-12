import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		// Creates scanner object
		Scanner input = new Scanner(System.in);
		
		// Creates Movie object
		Movie movieObject = new Movie();
		
		
		String title, rating;
		int soldTickets;
		char again;
		
		do {
			System.out.println("Enter the name of a movie: ");
			title = input.nextLine();
			movieObject.setTitle(title);
		
			System.out.println("Enter the rating of the movie: ");
			rating = input.nextLine();
			movieObject.setRating(rating);
		
			System.out.println("Enter the number of tickets sold for this movie: ");
			soldTickets = input.nextInt();
			movieObject.setSoldTickets(soldTickets);
			
			
			System.out.println(movieObject.toString());
		
			System.out.println("\nDo you want to enter another? (y or n): ");
			again = input.next().charAt(0);
			input.nextLine();
			
			System.out.println();
		}while(again == 'y' || again == 'Y');
		
		System.out.println("Goodbye!");
		
		input.close();
		

	}

}
