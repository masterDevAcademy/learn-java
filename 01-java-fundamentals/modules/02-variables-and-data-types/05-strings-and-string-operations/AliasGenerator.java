// Lesson 5 Strings and String Operations
// Mini Project - Alias Generator

/*
    Create a program that generates a custom alias using String operations.
    
    The program should store text value in string variables, combine multiple 
    strings into a single alias, use length() and substring() to analyze and 
    modify text, and print the results in a clean, readable format.
    
    HINT: Use a prefix for the final alias (mood, role, title, etc)
*/
public class AliasGenerator {
    public static void main(String[] args) {

        // Declare and initialize your String variables
        String prefix = "Dark";
        String name = "ShadowHeart";
        int nameLength = name.length();
        String shortTag = name.substring(0, 6);

        // Build your alias here

        String finalAlias = prefix + "_" + name;

        // Print your results here

        System.out.println("###################################");
        System.out.println("#         ALIAS GENERATED         #");
        System.out.println("###################################");
        System.out.println("#                                 #");
        System.out.println("# Base Name: " + name + "          #"); 
        System.out.println("# Name Length: " + nameLength + "                 #");
        System.out.println("# Short Tag: " + shortTag + "               #");
        System.out.println("# Final Alias: " + finalAlias + "   #");
        System.out.println("#                                 #");
        System.out.println("###################################");

    }
}


/*
    MINI PROJECT TASKS
    ----------------------------------
    Build your own Alias Generator

    Do NOT use user input(Scanner), conditional logic (if, switch), 
    loops, or randomization.

    Requirements:
    - Declare and initialize at least three String variables
    - Create a combined alias using concatenation
    - Display the length of at least on string
    - Extract one part of a String using substring()
    - Print all results using variables (no hardcaded output values)
    - Compile and run without errors
*/