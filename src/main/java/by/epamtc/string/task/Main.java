package by.epamtc.string.task;

public class Main {
    public static void main(String[] args) {
        String mainStr = "Hey, It Is New String For Epam ii oi Training.";

        separateEvenAndOddCharacters(mainStr);
        countUpperAndLowerCasePercentage(mainStr);
        deleteDuplicateCharacters(mainStr);
        determineFrequencyOfOccurrenceOfCharacterInString(mainStr);
        determineFlipString(mainStr);
        insertSubstring(mainStr, "hey,_it_is_substring");

        deleteSubstring(mainStr, "hey");
        copySubstring(mainStr);
        defineStringLength(mainStr);
    }

    private static void separateEvenAndOddCharacters(String mainStr) {
        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();

        char[] charArr = mainStr.toCharArray();

        for (int i = 0; i < mainStr.length(); i++) {
            if (i % 2 != 0) {
                oddChars.append(charArr[i]);
            } else {
                evenChars.append(charArr[i]);
            }
        }
        System.out.println("String with even chars: " + evenChars);
        System.out.println("String with odd chars: " + oddChars);
    }

    private static void countUpperAndLowerCasePercentage(String mainStr) {
        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for (Character ch : mainStr.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            }
        }
        if (upperCaseCount != 0) {
            System.out.println("lower Case count / upper case count = " + ((double) lowerCaseCount / (double) upperCaseCount) + "%");
        }
    }

    private static void deleteDuplicateCharacters(String mainStr) {
        StringBuilder sb = new StringBuilder();
        mainStr.chars().distinct().forEach(c -> sb.append((char) c));

        System.out.println(sb);
    }

    private static void determineFrequencyOfOccurrenceOfCharacterInString(String mainStr) {
        long count = mainStr.chars().filter(ch -> ch == 'i').count();

        System.out.println(count);
    }

    private static void determineFlipString(String mainStr) {
        StringBuilder output = new StringBuilder((CharSequence) mainStr).reverse();

        System.out.println(output.toString());
    }

    private static void insertSubstring(String mainStr, String subStr) {
        StringBuilder output = new StringBuilder((CharSequence) mainStr).insert(mainStr.length() - 3, subStr);
        output.insert(4, subStr);

        System.out.println(output);
    }

    private static void deleteSubstring(String mainStr, String subStr) {
        System.out.println(mainStr.replace(subStr, ""));
    }

    private static void copySubstring(String mainStr) {
        System.out.println(mainStr.substring(8, 26));
    }

    private static void defineStringLength(String mainStr) {
        System.out.println(mainStr.length());
    }

    
}
