import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class DVDTest {

	@Test
	void testDVD1() {
		ArrayList<String> sceneSet1 = new ArrayList<String>(Arrays.asList("Group of reporters", " Charles Foster Kane"));
		DVD movie1 = new DVD("To Kill A Mockingbird", 129, sceneSet1); //Arrange, Act
		
		assertEquals("To Kill A Mockingbird",movie1.getTitle());
	}
	@Test
	void testDVD2() {
		ArrayList<String> sceneSet1 = new ArrayList<String>(Arrays.asList("Group of reporters", " Charles Foster Kane"));
		DVD movie1 = new DVD("To Kill A Mockingbird", 129, sceneSet1); //Arrange, Act
		
		assertEquals(2,movie1.getScenes().size());
	}
	@Test
	void testDVD3() {
		ArrayList<String> sceneSet1 = new ArrayList<String>(Arrays.asList("Group of reporters", " Charles Foster Kane"));
		DVD movie1 = new DVD("To Kill A Mockingbird", 129, sceneSet1); //Arrange, Act
		
		assertEquals("To Kill A Mockingbird",movie1.getTitle());
	}

}
