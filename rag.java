public class rag {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};

        // Define a regex pattern to find words that start with 'a' and end with 'e'
        String regex = "^a.*e$";

        // Iterate through the array and apply the regex pattern
        for (String word : words) {
            if (word.matches(regex)) {
                System.out.println("Match found: " + word);
            }
        }
    }
}
