package lab10.lab10_3;

import java.util.Random;
import java.util.Scanner;

public class GiveLetter implements Runnable {
    private Random r = new Random();
    static char letter;

    @Override
    public void run() {
        while (true) {
            letter = (char) ('a' + r.nextInt(26));
            System.out.println("显示的字符：" + letter);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ignored) {
            }
        }
    }
}
