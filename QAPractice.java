public class QAPractice {
    public static void main(String[] args) {
        String formatted = String.format("Hello group %d, I'm %s", 307, "Venera");
        System.out.println(formatted);
        String format = "Hello Stas";
        String replace = format.replaceAll("Stas", "Egor");
        System.out.println(replace);

        int age = 23;
        String question=age>18?"U r adult":"U cant get married";
        int year = 1;
        boolean experience = year>2?true:false;
        System.out.println(question);
        System.out.println(experience);
    }
}
