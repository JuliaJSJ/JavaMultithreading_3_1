import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static AtomicInteger lengthThree = new AtomicInteger();
    public static AtomicInteger lengthFour = new AtomicInteger();
    public static AtomicInteger lengthFive = new AtomicInteger();

    public static int countSymbolThree = 3;
    public static int countSymbolFour = 4;
    public static int countSymbolFive = 5;

    public static void main(String[] args) throws Exception{
        Random random = new Random();
        String[] texts = new String[100_000];
        for (int i = 0; i < texts.length; i++) {
            texts[i] = generateText("abc", 3 + random.nextInt(3));
            System.out.println(texts[i]);
        }

        Runnable logicPalindrome = () -> {
            Palindrome.palindrome(texts);
        };

        Runnable logicSameLetter = () -> {
            SameLetter.sameLetter(texts);
        };

        Runnable logicOrderLetter = () -> {
            OrderLetter.orderLetter(texts);
        };

        Thread thread1 = new Thread(logicPalindrome);
        Thread thread2 = new Thread(logicSameLetter);
        Thread thread3 = new Thread(logicOrderLetter);


        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Красивых слов с длиной 3: " + (lengthThree.get() - SameLetter.count3 - SameLetter.count3)  + " штук");
        System.out.println("Красивых слов с длиной 4: " + (lengthFour.get()  - SameLetter.count4 - SameLetter.count4)+ " штук");
        System.out.println("Красивых слов с длиной 5: " + (lengthFive.get()  - SameLetter.count5 - SameLetter.count5) + " штук");

        }

    public static String generateText(String letters, int length) {
        Random random = new Random();
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < length; i++) {
            text.append(letters.charAt(random.nextInt(letters.length())));
        }
        return text.toString();
    }
}
