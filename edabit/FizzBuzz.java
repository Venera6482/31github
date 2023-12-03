package edabit;

public class FizzBuzz {
    public static String interviewQuestion(Integer i) {
        String num = i.toString();

        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        } else
            return num;
    }

    public static void main(String[] args) {
        System.out.println(interviewQuestion(21));
        System.out.println(interviewQuestion(44));
        System.out.println(interviewQuestion(10));
        System.out.println(interviewQuestion(15));
    }

}


