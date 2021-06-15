
public class PhoneTest {

    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("S9", 99, "T-Mobile","RING RING");
        Iphone iphone10 = new Iphone("X", 100, "ATT", "Zzz zzz zzz");
        s9.displayInfo();
        System.out.println(s9.ring());
        System.out.println(s9.unlock());
        iphone10.displayInfo();
        System.out.println(iphone10.ring());
        System.out.println(iphone10.unlock());
    }

}
