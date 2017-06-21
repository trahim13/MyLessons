package RegExp;

public class RegExp15_AtomicGroup {
    public static void main(String[] args) {
        System.out.println("abcc".matches("a(bc|b)c"));
        System.out.println("abc".matches("a(bc|b)c"));

        System.out.println();

        System.out.println("abcc".matches("a(?>bc|b)c"));
        System.out.println("abc".matches("a(?>bc|b)c"));

        System.out.println();

        System.out.println("integers".matches("\\b(integer|in|insert)\\b"));
        System.out.println("integers".matches("\\b(integer|in|insert)\\b"));

    }
}
