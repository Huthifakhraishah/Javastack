public class Main
{
	public static void main(String[] args) {
	StringManipulator x= new StringManipulator();
   	 System.out.println( x.trimAndConcat(" huti "," khraishi "));
   	 System.out.println( x.getIndexOrNull(" huti ",'h'));
   	 System.out.println( x.getIndexOrNull(" huti ",'q'));
   	 System.out.println( x.concatSubstring(" huti ",7,8,"kh"));
	}
}
