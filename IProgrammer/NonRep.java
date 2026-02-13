package IProgrammer;

public class NonRep {

    public static void nonRep(String str) {

        for (int i = 0; i < str.length(); i++) {

            boolean isRepeating = false;

            for (int j = 0; j < str.length(); j++) {

                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }

            if (!isRepeating) {
                System.out.println("First Non-Repeating Character: " + str.charAt(i));
                return;
            }
        }

        System.out.println("No Non-Repeating Character Found");
    }

    public static void main(String[] args) {
        String str = "aabbcdd";
        nonRep(str);
    }
}
