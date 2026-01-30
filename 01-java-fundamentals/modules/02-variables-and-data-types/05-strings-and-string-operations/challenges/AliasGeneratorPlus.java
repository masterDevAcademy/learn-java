public class AliasGeneratorPlus {
    public static void main(String[] args) {

        String baseName = "ShadowHeart";
        String mood = "Dark";
        String role = "Cleric";

        String shortTag = baseName.substring(0, 6);
        int nameLength = baseName.length();

        String finalAlias = mood + "_" + shortTag + "_" + role;

        System.out.println("ALIAS GENERATED");
        System.out.println("===============");
        System.out.println("Base Name: " + baseName);
        System.out.println("Name Length: " + nameLength);
        System.out.println("Short Tag: " + shortTag);
        System.out.println("Final Alias: " + finalAlias);
    }
}
