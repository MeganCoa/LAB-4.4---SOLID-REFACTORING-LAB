import java.util.ArrayList;
import java.util.Scanner;

public class DVD extends Movie {
	
	public DVD(String title, double runTime, ArrayList<String> scenes) {
		super(title, runTime, scenes);
	}
	@Override
	public void play() {
		Scanner scrn = new Scanner(System.in);
		
			System.out.println("Which scene of the DVD " + this.getTitle() + "\n");
			System.out.println("Would you like to watch? Select 0 to 5:");
			int sceneChoice = scrn.nextInt();
			System.out.println("Scene " + sceneChoice + ": " + this.getScenes().indexOf(sceneChoice)+ "\n");
		
	}

}
