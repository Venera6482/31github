package edabit;

public class EdabitConverter {
    public int intoSeconds(int minutes){
        int result = minutes*60;
        return result;
    }

    public static void main(String[] args) {
        EdabitConverter min = new EdabitConverter();
        int minutes = 5;
        int convertToSeconds = min.intoSeconds(minutes);
        System.out.printf(minutes+" minutes is equal to "+convertToSeconds+" seconds");
    }

}
