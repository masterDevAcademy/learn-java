public class StringMethodsPlayground {
    public static void main(String[] args) {

        String phrase = "Baldur's Gate";

        System.out.println("Original: " + phrase);
        System.out.println("Length: " + phrase.length());
        System.out.println("Uppercase: " + phrase.toUpperCase());
        System.out.println("Lowercase: " + phrase.toLowerCase());
        System.out.println("Substring (0, 6): " + phrase.substring(0, 6));
    }
}

