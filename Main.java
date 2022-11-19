public class Main {
    public static void main(String[] args) {
        System.out.println(Levenshteinn.levenshtein("hi","hi"));
        System.out.println(Levenshteinn.levenshtein("","HI"));
        System.out.println(Levenshteinn.levenshtein("HAPPY","GOOD"));
    }
}