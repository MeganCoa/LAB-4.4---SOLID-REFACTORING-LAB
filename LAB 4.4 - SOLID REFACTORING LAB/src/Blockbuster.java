import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Blockbuster {
 
	public static void main(String[] args) {
		Scanner scrn = new Scanner(System.in);
		ArrayList<Movie> movieList = new ArrayList<>();
		
		ArrayList<String> sceneSet1 = new ArrayList<String>(Arrays.asList("Group of reporters", " Charles Foster Kane",
				"millionaire newspaper tycoon", "shown flashbacks from Kane's life", "fascinating man's rise to fame, and how he eventually fell off the top of the world."));
		movieList.add(new DVD("Citizen Kane", 119, sceneSet1));
		ArrayList<String> sceneSet2 = new ArrayList<String>(Arrays.asList("The story of Rick Blaine", "runs a nightclub in Casablanca",
				"cafe has become a kind of haven for refugees", "help them escape to America.", "Rick faces a tough challenge which will bring up unforeseen complications, heartbreak and ultimately an excruciating decision to make"));
		movieList.add(new DVD("Casablanca", 102, sceneSet2));
		ArrayList<String> sceneSet3 = new ArrayList<String>(Arrays.asList("1927 Hollywood.", "couple Lina Lamont and Don Lockwood,",
				"Don barely tolerates her, while Lina, despite thinking Don beneath her", "Musician Cosmo Brown, Don's best friend, gets hired as Monumental's ideas man", "bigger problem is Lina"));
		movieList.add(new DVD("Singin' In The Rain", 103, sceneSet3));
		
		ArrayList<String> sceneSet4 = new ArrayList<String>(Arrays.asList("Small-town Alabama, 1932. Atticus Finch", "children, Jem and Scout",
				"Tom Robinson, a black man accused of raping a white woman.", "Jem and Scout are intrigued by their neighbours, the Radleys,", "mysterious, seldom-seen Boo Radley in particular"));
		movieList.add(new VHS("To Kill A Mockingbird", 129, sceneSet4));
		ArrayList<String> sceneSet5 = new ArrayList<String>(Arrays.asList("Manhattan, Upper West Side, 1957.", "fight for supremacy",
				"whirlwind romance at the high-school dance ", "all-out turf war.", "Above all, when the future is uncertain, what's hope without love?"));
		movieList.add(new VHS("West Side Story", 193, sceneSet5));
		ArrayList<String> sceneSet6 = new ArrayList<String>(Arrays.asList("F.B.I. trainee Clarice Starling (Jodie Foster) ", "Crawford asks her to question Dr. Hannibal Lecter",
				"pick Lecter's brains to help them solve another serial murder case", "Buffalo Bill\" (Ted Levine), who has so far killed five victims,", "Case Solved!"));
		movieList.add(new VHS("The Silence Of The Lambs", 118, sceneSet6));
	
	
		
		System.out.println("Welcome to GC Blockbuster! \r\n"
				+ "Please Select a Movie from the list:\r\n"
				+ " ");
		//print list of movies
		for(int i = 0; i < movieList.size(); i++) {
			System.out.print(i + " ");
			movieList.get(i).printInfo();
		
		}
		System.out.println("Please select a movie you want to watch:");
		//take user input but start loop here
		int movieChoice = scrn.nextInt();
		Boolean keepAsking = true;
		while (keepAsking) {
			movieList.get(movieChoice);
			
		
		}
		keepAsking = getUserInput("Do you want to watch the movie? Y/N", scrn, 'y', 'n');
	}
		
		
		
		
		
		public static Boolean getUserInput(String message, Scanner scan, char y, char n) {
			y = Character.toLowerCase(y);
			n = Character.toLowerCase(n);
			Boolean incorrectInput = true;
			System.out.println(message);

			while (incorrectInput) {
				incorrectInput = false;
				char input = scan.next().charAt(0);
				if (y != input && n != input) {
					incorrectInput = true;
					System.out.println("Oops! Try agan!" + message);
				} else if (y == input) {
					
					return true;				
				}
		
			}
			System.out.println("Goodbye.");
			return false;	
		}
}
