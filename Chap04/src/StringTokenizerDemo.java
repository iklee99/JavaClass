import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        // Example input string
        String input = "Java is a high-level, class-based; object-oriented programming language.";

        // Creating a StringTokenizer with space, comma, and semicolon as delimiters
        StringTokenizer tokenizer = new StringTokenizer(input, " ,;");

        // Counting tokens
        int tokenCount = tokenizer.countTokens();
        System.out.println("Total number of tokens: " + tokenCount);

        // Iterating through tokens and printing each token
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}

