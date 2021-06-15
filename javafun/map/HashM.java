import java.util.HashMap;
public class HashM {
    public static void main(String[] args){
        Track();
    }
    public static void Track() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Fairouz", "Sahrt hoop");
        map.put("Abd al Haleem", "Qaret al fenjan");
        map.put("Ziad al ra7bani", "3aishi wa7da blak");
        map.put("Mel7m Baraket", "Bdak milion Seni");
        String track = map.get("Ziad al ra7bani");
        System.out.println(track);
        for (String key : map.keySet()) {
            System.out.println(" Track : " + key + " Lyrics: "+ map.get(key));
        }
    }
}