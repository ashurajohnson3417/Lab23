import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		boolean go = true;
		while(go){
		System.out.println("Welcome to the Movie List Application!" + "\n" + "There are 10 movies in this list.");

		Movie one = new Movie("Scary Movie", "Horror");
		Movie two = new Movie("27 Dresses", "Comedy");
		Movie three = new Movie("007", "Action");
		Movie four = new Movie("Law and Order", "Drama");
		Movie five = new Movie("Aliens", "Sci-Fi");
		Movie six = new Movie("Saw", "Horror");
		Movie seven = new Movie("The Intern", "Comedy");
		Movie eight = new Movie("Mission Impossible", "Action");
		Movie nine = new Movie("Cold Case", "Drama");
		Movie ten = new Movie("Predator", "Sci-Fi");

		ArrayList<Movie> movies = new ArrayList<Movie>();
		movies.add(one);
		movies.add(two);
		movies.add(three);
		movies.add(four);
		movies.add(five);
		movies.add(six);
		movies.add(seven);
		movies.add(eight);
		movies.add(nine);
		movies.add(ten);

		System.out.println();
		ArrayList<String> categories = new ArrayList<String>();
		for (Movie c : movies) {
			if (!categories.contains(c.getCategory())) {
				categories.add(c.getCategory());
				System.out.println(c.getCategory());
			}
		}
		System.out.println("What category are you interested in?");
		Scanner userChoice = new Scanner (System.in);
		String movieCat = userChoice.nextLine();
		
		switch(movieCat){
		case "Horror":
			System.out.println(one.getTitle());
			System.out.println(six.getTitle());
			break;
		case "Comedy":
			System.out.println(two.getTitle());
			System.out.println(seven.getTitle());
			break;
		case "Action":
			System.out.println(three.getTitle());
			System.out.println(eight.getTitle());
			break;
		case "Drama":
			System.out.println(four.getTitle());
			System.out.println(nine.getTitle());
			break;
		case "Sci-Fi":
			System.out.println(five.getTitle());
			System.out.println(ten.getTitle());
			break;
		}
		System.out.println("Continue? Y/N:  ");
		String cont = userChoice.nextLine();
		if(cont.equalsIgnoreCase("Y")){
			
		}else{
			System.out.println("Goodbye");
			go= false;
		}
	}
		
	}
}
