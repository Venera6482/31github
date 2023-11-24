package edabit;

public class CountWords {
    public static int count(String phrase){
        return phrase.split(" ").length;
    }

    public static void main(String[] args) {
        System.out.println(count("Hey Christmas is coming"));
        System.out.println(count("Thank u for giving us that opportunity to improve skills"));
    }
}
