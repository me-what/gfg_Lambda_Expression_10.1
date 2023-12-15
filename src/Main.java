public class Main {
    public static boolean isStringOnlyAlphabet(String str)
    {
        return (
                (str != null) && (!str.equals(""))
                        && (str.chars().allMatch(Character::isLetter)));
    }

    public static void main(String[] args) {
        // 1
        System.out.println("Test Case 1:");
        String str1 = "GeeksforGeeks";
        System.out.println("Input: " + str1);

        System.out.println("Output: "
                + isStringOnlyAlphabet(str1));

        // 2
        System.out.println("\nTest Case 2:");
        String str2 = "Geeks4Geeks";
        System.out.println("Input: " + str2);

        System.out.println("Output: "
                + isStringOnlyAlphabet(str2));

        // 3
        System.out.println("\nTest Case 3:");
        String str3 = null;
        System.out.println("Input: " + str3);

        System.out.println("Output: "
                + isStringOnlyAlphabet(str3));

     // 4
        System.out.println("\nTest Case 4:");
        String str4 = "";
        System.out.println("Input: " + str4);

        System.out.println("Output: "
                + isStringOnlyAlphabet(str4));


        System.out.println();
        System.out.println("Значение \"p\" буква? Ответ: " + Character.isLetter('p'));
        System.out.println("Значение \"T\" буква? Ответ: " + Character.isLetter('T'));
        System.out.println("Значение \"1\" буква? Ответ: " + Character.isLetter('1'));
        System.out.println("Значение \"!\" буква? Ответ: " + Character.isLetter('!'));
        System.out.println("Значение \"&\" буква? Ответ: " + Character.isLetter('&'));
    }
}