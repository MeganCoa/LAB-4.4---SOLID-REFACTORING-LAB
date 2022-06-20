import java.util.ArrayList;
import java.util.List;

public class VHS extends Movie implements Play {
	private double currentTime = 0;
	
	public double getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(double currentTime) {
		this.currentTime = currentTime;
	}

	public VHS(String title, double runTime, ArrayList<String> scenes) {
		super(title, runTime, scenes);
		currentTime = 0;
	}
	
	
	public void play(List<String> Scenes) {
		if(currentTime > getScenes().size() - 1) {
			rewind();
		}
		else {
			System.out.println("Scene: [" +  currentTime + "]\n ");
			currentTime++;
		}
	
	}
	public void rewind() {
		currentTime = 0;	
	}

}
