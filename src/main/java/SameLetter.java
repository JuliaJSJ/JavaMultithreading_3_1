public class SameLetter {
    public static int count3 = 0;
    public static int count4 = 0;
    public static int count5 = 0;

    public static void sameLetter (String strings[]) {
        for (int k = 0; k < strings.length; k++) {
            String original = strings[k];
            int j = 1;
            for (int i = 0; i < original.length()-1; i++) {
                if (original.charAt(i) == original.charAt(i + 1)) {
                    j = j + 1;
                } else {
                    break;
                }
            }
            if ((j == Main.countSymbolThree) && (original.length() == Main.countSymbolThree)) {
                Main.lengthThree.getAndIncrement();
                count3 = count3 +1;
            } else if ((j == Main.countSymbolFour) && (original.length() == Main.countSymbolFour)) {
                Main.lengthFour.getAndIncrement();
                count4 = count4 +1;
            } else if ((j == Main.countSymbolFive) && (original.length() == Main.countSymbolFive)) {
                Main.lengthFive.getAndIncrement();
                count5 = count5 +1;
            }
        }
    }
}
