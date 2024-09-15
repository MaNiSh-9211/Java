package DSAs.string;
public class string {

    public static void main(String[] args) {
        String str = "Hello, World!";

        // 1. length()
        // Returns the length of the string.
        System.out.println("Length of str: " + str.length());

        // 2. charAt(int index)
        // Returns the character at the specified index.
        System.out.println("Character at index 7: " + str.charAt(7));

        // 3. substring(int beginIndex, int endIndex)
        // Returns a substring from the specified beginIndex to endIndex.
        System.out.println("Substring from index 7 to 12: " + str.substring(7, 12));

        // 4. substring(int beginIndex)
        // Returns a substring from the specified beginIndex to the end of the string.
        System.out.println("Substring from index 7: " + str.substring(7));

        // 5. indexOf(String str)
        // Returns the index of the first occurrence of the specified substring.
        System.out.println("Index of 'World': " + str.indexOf("World"));

        // 6. lastIndexOf(String str)
        // Returns the index of the last occurrence of the specified substring.
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));

        // 7. replace(char oldChar, char newChar)
        // Replaces all occurrences of the oldChar with newChar.
        System.out.println("Replace 'o' with '0': " + str.replace('o', '0'));

        // 8. replace(CharSequence target, CharSequence replacement)
        // Replaces all occurrences of the target sequence with the replacement sequence.
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        // 9. toLowerCase()
        // Converts all characters of the string to lowercase.
        System.out.println("Lowercase: " + str.toLowerCase());

        // 10. toUpperCase()
        // Converts all characters of the string to uppercase.
        System.out.println("Uppercase: " + str.toUpperCase());

        // 11. trim()
        // Removes leading and trailing whitespace.
        String strWithSpaces = "   Trim me   ";
        System.out.println("Trimmed string: '" + strWithSpaces.trim() + "'");

        // 12. split(String regex)
        // Splits the string around matches of the given regular expression.
        String[] parts = str.split(", ");
        System.out.println("Split by ', ': ");
        for (String part : parts) {
            System.out.println(part);
        }

        // 13. join(CharSequence delimiter, CharSequence... elements)
        // Joins the provided elements into a single string separated by the given delimiter.
        String joined = String.join(", ", "Java", "Python", "C++");
        System.out.println("Joined string: " + joined);

        // 14. contains(CharSequence sequence)
        // Checks if the string contains the specified sequence of characters.
        System.out.println("Contains 'World': " + str.contains("World"));

        // 15. startsWith(String prefix)
        // Checks if the string starts with the specified prefix.
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));

        // 16. endsWith(String suffix)
        // Checks if the string ends with the specified suffix.
        System.out.println("Ends with 'World!': " + str.endsWith("World!"));

        // 17. isEmpty()
        // Checks if the string is empty.
        System.out.println("Is string empty: " + str.isEmpty());

        // 18. valueOf(Object obj)
        // Returns the string representation of the object.
        int number = 123;
        System.out.println("String value of number 123: " + String.valueOf(number));

        // 19. format(String format, Object... args)
        // Returns a formatted string using the specified format string and arguments.
        System.out.println("Formatted string: " + String.format("Hello, %s!", "World"));

        // 20. equals(Object anObject)
        // Compares the string to the specified object for equality.
        System.out.println("Equals 'Hello, World!': " + str.equals("Hello, World!"));

        // 21. equalsIgnoreCase(String anotherString)
        // Compares the string to another string, ignoring case.
        System.out.println("EqualsIgnoreCase 'HELLO, WORLD!': " + str.equalsIgnoreCase("HELLO, WORLD!"));

        // 22. compareTo(String anotherString)
        // Compares the string to another string lexicographically.
        System.out.println("CompareTo 'Hello, World!': " + str.compareTo("Hello, World!"));

        // 23. compareToIgnoreCase(String str)
        // Compares the string to another string lexicographically, ignoring case.
        System.out.println("CompareToIgnoreCase 'HELLO, WORLD!': " + str.compareToIgnoreCase("HELLO, WORLD!"));

        // 24. concat(String str)
        // Concatenates the specified string to the end of this string.
        System.out.println("Concatenated string: " + str.concat(" Have a nice day!"));

        // 25. toCharArray()
        // Converts the string to a new character array.
        char[] charArray = str.toCharArray();
        System.out.println("Character array: " + java.util.Arrays.toString(charArray));

        // 26. codePoints()
        // Returns an IntStream of Unicode code points from the string.
        System.out.println("Code points: ");
        str.codePoints().forEach(cp -> System.out.print(cp + " "));
        System.out.println();

        // 27. lines()
        // Returns a Stream of lines extracted from this string.
        String multiLineStr = "Line1\nLine2\nLine3";
        System.out.println("Lines in multiLineStr: ");
        multiLineStr.lines().forEach(System.out::println);

        // 28. strip()
        // Removes leading and trailing whitespace.
        System.out.println("Stripped string: '" + strWithSpaces.strip() + "'");

        // 29. stripLeading()
        // Removes leading whitespace.
        System.out.println("Stripped leading whitespace: '" + strWithSpaces.stripLeading() + "'");

        // 30. stripTrailing()
        // Removes trailing whitespace.
        System.out.println("Stripped trailing whitespace: '" + strWithSpaces.stripTrailing() + "'");

        // 31. repeat(int count)
        // Returns a string whose value is the concatenation of this string repeated count times.
        System.out.println("Repeated string (3 times): " + str.repeat(3));

        // 32. indent(int n)
        // Returns a string with each line indented by the specified number of spaces.
        String indentedStr = "Line1\nLine2\nLine3";
        System.out.println("Indented string (4 spaces): ");
       System.out.println(indentedStr.indent(4));  // avalable from java 11
    }
}
