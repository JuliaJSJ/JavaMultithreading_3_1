public class OrderLetter {

    public static void orderLetter(String strings[]) {
        for (int k = 0; k < strings.length; k++) {
            String original = strings[k];
            int j = 1;
            for (int i = 0; i < original.length() - 1; i++) {
                if (original.charAt(i) <= original.charAt(i + 1)) {
                    j = j + 1;
                } else {
                    break;
                }
            }
            if ((j == Main.countSymbolThree) && (original.length() == Main.countSymbolThree)) {
                Main.lengthThree.getAndIncrement();
            } else if ((j == Main.countSymbolFour) && (original.length() == Main.countSymbolFour)) {
                Main.lengthFour.getAndIncrement();
            } else if ((j == Main.countSymbolFive) && (original.length() == Main.countSymbolFive)) {
                Main.lengthFive.getAndIncrement();
            }
        }
    }
}
