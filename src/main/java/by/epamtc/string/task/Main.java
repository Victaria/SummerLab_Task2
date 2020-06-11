package by.epamtc.string.task;

public class Main {
    public static void main(String[] args) {
        String mainStr = "Hey, It Is New String For Epam ii oi Training.";

        printSeparatedEvenAndOddCharacters(mainStr);
        printCountOfUpperAndLowerCasePercentage(mainStr);
        printWithoutDeletedDuplicateCharacters(mainStr);

        printFrequencyOfOccurrenceOfCharacterInString(mainStr);
        printFlipString(mainStr);
        printWithInsertedSubstring(mainStr, "hey,_it_is_substring");

        printWithoutDeletedSubstring(mainStr, "hey");
        printCopyOfSubstring(mainStr);
        printStringLength(mainStr);

        printNumberOfOccurrencesOfSubstringInString(mainStr, "i");
        printStringWordsInReverseOrder(mainStr);
        printStringWithReplacedSpaceWithSymbol(mainStr);

        printStringWithReplacedLettersInLongestWord(mainStr);
        printLengthOfShortestWord(mainStr);
        printNumberOfWords(mainStr);

        printStringWithSwappedWords(mainStr);
        printStringWithDeletedLastWord(mainStr);
        printStringWithAddedSpaces(mainStr);

        printIsStringPalindrome(mainStr);
        printStringWithReplacedSubstring(mainStr);
        printResultOfAddingVeryLongIntegers();

        printResultOfDeletingWordsWithGivenLength(mainStr);
        printResultOfRemovingExtraSpaces(mainStr);
        printResultOfHighlightingWords(mainStr);
    }

    private static void printSeparatedEvenAndOddCharacters(String mainStr) {
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

    private static void printCountOfUpperAndLowerCasePercentage(String mainStr) {
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

    private static void printWithoutDeletedDuplicateCharacters(String mainStr) {
        StringBuilder sb = new StringBuilder();
        mainStr.chars().distinct().forEach(c -> sb.append((char) c));

        System.out.println(sb);
    }

    private static void printFrequencyOfOccurrenceOfCharacterInString(String mainStr) {
        long count = mainStr.chars().filter(ch -> ch == 'i').count();

        System.out.println(count);
    }

    private static void printFlipString(String mainStr) {
        StringBuilder output = new StringBuilder((CharSequence) mainStr).reverse();

        System.out.println(output.toString());
    }

    private static void printWithInsertedSubstring(String mainStr, String subStr) {
        StringBuilder output = new StringBuilder((CharSequence) mainStr).insert(mainStr.length() - 3, subStr);
        output.insert(4, subStr);

        System.out.println(output);
    }

    private static void printWithoutDeletedSubstring(String mainStr, String subStr) {
        System.out.println(mainStr.replace(subStr, ""));
    }

    private static void printCopyOfSubstring(String mainStr) {
        System.out.println(mainStr.substring(8, 26));
    }

    private static void printStringLength(String mainStr) {
        System.out.println(mainStr.length());
    }

    private static void printNumberOfOccurrencesOfSubstringInString(String mainStr, String subStr) {
        mainStr = mainStr.replace(subStr, "+");
        long count = mainStr.chars().filter(ch -> ch == '+').count();

        System.out.println(count);
    }

    private static void printStringWordsInReverseOrder(String mainStr) {
        String[] arr = mainStr.split(" ");

        StringBuilder mainStrBuilder = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            mainStrBuilder.append(arr[i]);
            mainStrBuilder.append(" ");
        }
        System.out.println(mainStrBuilder);
    }

    private static void printStringWithReplacedSpaceWithSymbol(String mainStr) {
        System.out.println(mainStr.replace(" ", "*"));
    }

    private static void printStringWithReplacedLettersInLongestWord(String mainStr) {
        String[] arr = mainStr.split(" ");
        int length = 0;
        String longWord = "";

        for (String word : arr) {
            if (length < word.length()) {
                length = word.length();
                longWord = word;
            }
        }

        System.out.println(mainStr.replace(longWord, longWord.replace("a", "b")));
    }

    private static void printLengthOfShortestWord(String mainStr) {
        String[] arr = mainStr.split(" ");
        int length = 100;

        for (String word : arr) {
            if (length > word.length()) {
                length = word.length();
            }
        }

        System.out.println(length);
    }

    private static void printNumberOfWords(String mainStr) {
        String[] arr = mainStr.split(" ");

        System.out.println(arr.length);
    }

    private static void printStringWithSwappedWords(String mainStr) {
        String[] arr = mainStr.split(" ");

        if (arr.length > 6) {
            String temp = arr[6];
            arr[6] = arr[5];
            arr[5] = temp;
        }

        StringBuilder mainStrBuilder = new StringBuilder();
        for (String s : arr) {
            mainStrBuilder.append(s);
            mainStrBuilder.append(" ");
        }
        System.out.println(mainStrBuilder);

    }

    private static void printStringWithDeletedLastWord(String mainStr) {
        StringBuilder stringBuilder = new StringBuilder((CharSequence) mainStr);
        stringBuilder.delete(stringBuilder.lastIndexOf(" "), stringBuilder.length() - 1);
        System.out.println(stringBuilder);
    }

    private static void printStringWithAddedSpaces(String mainStr) {
        StringBuilder stringBuilder = new StringBuilder((CharSequence) mainStr);
        stringBuilder.insert(16, " ");
        stringBuilder.insert(6, " ");
        System.out.println(stringBuilder);
    }

    private static void printIsStringPalindrome(String mainStr) {
        String clean = mainStr.replaceAll(" ", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        System.out.println(reverse.toString().equals(clean));
    }

    private static void printStringWithReplacedSubstring(String mainStr) {
        System.out.println(mainStr.replace("ii", "NEW"));
    }

    private static void printResultOfAddingVeryLongIntegers() {
        String s1 = "2222222222222222222";
        String s2 = "111111111111111111111111111";
        StringBuilder result = new StringBuilder();

        int s1Length = s1.length();
        int s2Length = s2.length();
        int diff = s2Length - s1Length;

        int carry = 0;

        for (int i = s1Length - 1; i>=0; i--)
        {
            int sum = ((int)(s1.charAt(i)-'0') +
                    (int)(s2.charAt(i+diff)-'0') + carry);
            result.append((char) (sum % 10 + '0'));
            carry = sum / 10;
        }

        for (int i = s2Length - s1Length - 1; i >= 0; i--)
        {
            int sum = ((int)(s2.charAt(i) - '0') + carry);
            result.append((char) (sum % 10 + '0'));
            carry = sum / 10;
        }

        if (carry > 0)
            result.append((char) (carry + '0'));

        System.out.println(result.reverse().toString());
    }

    private static void printResultOfDeletingWordsWithGivenLength(String mainStr) {

    }

    private static void printResultOfRemovingExtraSpaces(String mainStr) {

    }

    private static void printResultOfHighlightingWords(String mainStr) {

    }
}
