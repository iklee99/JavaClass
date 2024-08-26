public class StringMethods {
    public static void main(String[] args) {

        String str = "Hello, World!";

        int length = str.length(); // length of the string: 13
        char ch = str.charAt(0); // character at a specific index position: 'H'

        // substring from the given begin index to the end: "World!"
        String substr1 = str.substring(7);
        String substr2 = str.substring(0, 5);    // substring from index1 to index2: "Hello"

        // str과 given String의 내용 비교 (reference, 즉, 주소 비교 아님) : true
        boolean isEqual = str.equals("Hello, World!");
        // 대소문자 구분없이 내용 비교: true
        boolean isEqualIgnoreCase = str.equalsIgnoreCase("hello, world!");

        // dictionary order로 str > "Hello" 이면 positive, str < "Hello" 이면 negative
        // str == "Hello" 이면 0을 return
        int comparison = str.compareTo("Hello"); // Positive value
        int comparisonIgnoreCase = str.compareToIgnoreCase("hello"); // Positive value

        int index = str.indexOf("World");       // 처음 출현하는 World의 W의 index: 7
        int lastIndex = str.lastIndexOf("o");   // 마지막 출현하는 o의 index: 8
        boolean contains = str.contains("Hello"); // 주어진 substring을 포함하는가? true

        String replacedStr = str.replace('o', 'a'); // "Hella, Warld!"
        String replacedStr2 = str.replace("World", "Java"); // "Hello, Java!"
        String replacedAllStr = str.replaceAll("l", "L"); // "HeLLo, WorLd!"
        String replacedFirstStr = str.replaceFirst("l", "L"); // "HeLlo, World!"

        String upper = str.toUpperCase(); // 대문자로: "HELLO, WORLD!"
        String lower = str.toLowerCase(); // 소문자로: "hello, world!"

        String trimmedStr = str.trim(); // 앞뒤 공백이 제거된 문자열
        String[] words = str.split(", "); // ["Hello", "World!"]
        // "Hello, World"
        String joinedStr = String.join(", ", "Hello", "World");

        String intStr = String.valueOf(123);  // integer 123을 String "123" 으로
        String boolStr = String.valueOf(true); // boolean true를 String "true"로

        boolean startsWith = str.startsWith("Hello"); // true
        boolean endsWith = str.endsWith("!"); // true
        boolean isEmpty = str.isEmpty(); // false
    }
}
