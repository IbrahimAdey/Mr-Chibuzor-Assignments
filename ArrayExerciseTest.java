import org.junit.jupiter.api.Test;
import static 
org.junit.jupiter.api.Assertions.assertArrayEquals;
public class ArrayExerciseTest{

	@Test
	public void testRangeArray(){

	ArrayExercise range = new ArrayExercise();

	int[] array = {5, 6, 10, 15, 20};

	range.rangeArray(array);

	int[] expected = {15};

	assertArrayEquals(expected, range.rangeArray(arrayNum));
	}
}
	
		
 
	