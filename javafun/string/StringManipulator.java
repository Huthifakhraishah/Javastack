
public class StringManipulator {
    public static String trimAndConcat(String string1, String string2) {
        return string1.trim().concat(string2.trim());
    }

    public static Integer getIndexOrNull(String input, char c) {
	Integer index = input.indexOf(c);
	if (index == -1){
		return null;
	}
	return index;
    }

    public static String concatSubstring(String input, int A, int B, String input2) {
        String substr;
        try{
            substr = input.substring(A, B);
        } catch(IndexOutOfBoundsException e) {
            System.out.println(String.format("Exception caught: %s", e));
            substr = "caugth you";
        }

        return substr.concat(input2);
    }
}