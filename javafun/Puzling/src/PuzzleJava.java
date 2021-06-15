import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class PuzzleJava {
	int[] array;
	ArrayList<Integer> newarray = new ArrayList<Integer>();
	double sum=0;
	public void array(int[] array) {
		this.array=array;
		for(int i=0;i<array.length;i++) {
		sum+=array[i];
		if(array[i] > 10) {
			newarray.add(array[i]);
		}
		}
		System.out.println(sum);
		System.out.println(newarray);
	
	}
    public static String[] RandomStringArr() {
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = StringManipulator.RandomString(5);
        return arr;
	}
}
