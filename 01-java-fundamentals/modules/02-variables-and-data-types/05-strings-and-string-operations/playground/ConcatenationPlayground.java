public class ConcatenationPlayground {
    public static void main(String[] args) {

        String title = "Dark";
        String name = "ShadowHeart";

        String aliasNoSpace = title + name;
        String aliasWithSpace = title + " " + name;
        String aliasWithUnderscore = title + "_" + name;

        System.out.println("No space: " + aliasNoSpace);
        System.out.println("With space: " + aliasWithSpace);
        System.out.println("With underscore: " + aliasWithUnderscore);
    }
}
