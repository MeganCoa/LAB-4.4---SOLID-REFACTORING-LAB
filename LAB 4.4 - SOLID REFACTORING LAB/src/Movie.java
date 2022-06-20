import java.util.ArrayList;

public abstract class Movie {
	private String title;
	private double runTime;
	private ArrayList<String> scenes;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getRunTime() {
		return runTime;
	}
	public void setRunTime(double runTime) {
		this.runTime = runTime;
	}
	public ArrayList<String> getScenes() {
		return scenes;
	}
	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
	}
	
	//regular constructors and methods for instance variables
	
	public Movie(String title, double runTime, ArrayList<String> scenes) {
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes; 
	}
	@Override
	public String toString() {
		return "Title:" + title + " Runtime:" + runTime + "\nScenes:" + scenes + "\n";
	}
	public void printInfo() {
		System.out.println("Title:" + this.title + " Runtime:" + this.runTime);
	}
	public void printScenes() {
		
		for(String scene: scenes) {
			
			System.out.println("Scene: [" + scenes.indexOf(scene) + "] " + scene);
		}
	}
	public abstract void play();
}
