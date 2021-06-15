import java.util.ArrayList;
public class Basics {
    public static void main(String[] args) {
        int[] array= {1,3,5,7,9,13,-5};
        // Print1to255();
        // Printodd();
        // Printsum1to255();
        Itrate(array);
        FindMax(array);
        Avg(array);
        Array1to255();
        Greaterthany(array, 5);
        SquareVal(array);
        MaxMinAvg(array);
    }   
    public static void Print1to255(){
        for (int i = 1; i < 256 ; i++){
            System.out.println(i);
        }
    }
    public static void Printodd(){
        for (int i = 1; i < 256 ; i+=2){
            System.out.println(i);
        }
    }
    public static void Printsum1to255(){
        int sum=0;
        for (int i = 1; i < 256 ; i++){
            sum += i;
            System.out.println(i);
            System.out.println(sum);
        }
    }
    public static void Itrate(int[] array){
        for (int i = 0; i < array.length ; i++){
            System.out.println(array[i]);
        }
    }
    public static void FindMax(int[] array){
        int min=array[0];
        for (int i = 0; i < array.length ; i++){
            if(array[i]> min ){
                min=array[i];
            }
        }
        System.out.println(min);
    }
    public static void FindMin(int[] array){
        int min=array[0];
        for (int i = 0; i < array.length ; i++){
            if(array[i]< min ){
                min=array[i];
            }
        }
        System.out.println(min);
    }
    public static void Avg(int[] array){
        int sum=0;
        double avg;
        for (int i = 0; i < array.length ; i++){
            sum += array[i];
        }
        avg=sum/array.length;
        System.out.println(avg);
    }
    public static void Array1to255(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 1; i < 256 ; i+=2){
            myArray.add(i);
        }
        System.out.println(myArray);
    }
    public static void Greaterthany(int[] array, int y) {
		int count = 0;
		for(int i=0; i < array.length; i++) {
			if(array[i] > y)
				count++;
		}
        System.out.println(count);
	}
    public static void SquareVal(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = array[i] * array[i];	
		}
        System.out.println(array);
	}
    public static void EliminateNeg(int[] array) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] < 0){
                array[i] = 0;
            }
		}
        System.out.println(array);
	}
    public static void MaxMinAvg(int[] array) {
        System.out.println(" Min:");
	    FindMin(array);
        System.out.println("Max:");
		FindMax(array);
        System.out.println("Average:");
		Avg(array);
	}
}
