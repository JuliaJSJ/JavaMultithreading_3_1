public class Palindrome {

    public static void palindrome (String strings[]) {
        for (int k = 0; k < strings.length; k++) {
            String original = strings[k];
            StringBuilder buffer = new StringBuilder(original);
            buffer.reverse();
            String data = buffer.toString();
            boolean isEqual = original.equals(data);
            if (isEqual && (original.length() == Main.countSymbolThree)) {
                Main.lengthThree.getAndIncrement();
            } else if (isEqual && (original.length() == Main.countSymbolFour)) {
                Main.lengthFour.getAndIncrement();
            } else if (isEqual && (original.length() == Main.countSymbolFive)) {
                Main.lengthFive.getAndIncrement();
            }
        }
    }
}
