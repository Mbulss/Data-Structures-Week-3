import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");


        System.out.println("Colors in the ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Adding and removing elements
        colors.add(2, "Purple"); // Add a new color at the third position
        colors.remove(1); // Remove the second color
        System.out.println("\nUpdated ArrayList after adding and removing elements:");
        System.out.println(colors);

        // Searching for an element
        String searchTerm = "Green";
        System.out.println("\nSearching for color '" + searchTerm + "':");
        searchColor(colors, searchTerm);

        // Bonus Challenge: Duplicate removal
        removeDuplicates(colors);
        System.out.println("\nArrayList after removing duplicates:");
        System.out.println(colors);
    }

    public static void searchColor(ArrayList<String> colors, String searchTerm) {
        int index = colors.indexOf(searchTerm);
        if (index != -1) {
            System.out.println("Color '" + searchTerm + "' found at position " + index + ".");
        } else {
            System.out.println("Color '" + searchTerm + "' not found in the ArrayList.");
        }
    }

    public static ArrayList<String> removeDuplicates(ArrayList<String> list) {
        ArrayList<String> newList = new ArrayList<>();
        for (String element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        list.clear();
        list.addAll(newList);
        return list;
    }
}
