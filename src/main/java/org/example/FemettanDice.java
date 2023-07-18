package org.example;

import java.util.Random;
import java.util.Scanner;

public class FemettanDice {

  private static final String[] FRAMES = new String[]{"⚀", "⚁", "⚂", "⚃", "⚄", "⚅"};

  public static void main(String[] args) {
    String[] numbers = new String[]{"1", "2", "3", "4", "★"};
    Scanner scanner = new Scanner(System.in);
    String curr;
    while (true) {
      curr = scanner.nextLine();
      if (curr.equals("exit")) {
        break;
      }
      if (curr.equals("help")) {
        System.out.println("""
          FEMETTAN DICE

          In order to get a random number, press enter or write
          any text and then press enter. It really does not matter
          keklmao

          however, in order to kill the programme,
          type 'exit' and then press the enter key.
          This Kills The Crab. :)
          """);
        continue;
      }
      String message = "Rolling: ";
      if (!curr.isBlank()) {
        message = "Enter 'help' for help, or 'exit' to kill the programme. For now, let's roll the dice!: ";
      }
      int animationFrames = 20;
      int animationDelayMs = 150;
      for (int frame = 0; frame < animationFrames; frame++) {
        System.out.print("\r" + message + FRAMES[frame % FRAMES.length]);
        try {
          Thread.sleep(animationDelayMs);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.print("\r" + message + numbers[new Random().nextInt(numbers.length)] + "\n");
    }
  }
}
