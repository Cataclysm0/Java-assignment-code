package lab10.lab10_3;

import java.util.Scanner;

public class TypingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        GiveLetter gl = new GiveLetter();
        Thread guessLetter = new Thread(gl);
        guessLetter.start();
        while (true) {
            char gLetter = sc.next().charAt(0);
            if (gLetter == '#') {
                System.exit(0);
            } else if (gLetter == GiveLetter.letter) {
                score++;
                System.out.println("输入对了目前分数：" + score);
            } else {
                System.out.println("输入错了目前分数：" + score);
            }
            guessLetter.interrupt();
        }
    }
}
