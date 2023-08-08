package dev.bacongubbe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Scanner;

public class FemettanDice {
  private static final Logger logger = LoggerFactory.getLogger(FemettanDice.class);

  private static final String[] FRAMES = new String[]{"⚀", "⚁", "⚂", "⚃", "⚄", "⚅"};
  private static final String[] CATEGORIES = new String[]{"1", "2", "3", "4", "★", "★"};
  private static final Scanner SCANNER = new Scanner(System.in);

  public static void main(String[] args) {
    logger.info("App starting");
    String curr;
    try {

      while (true) {
        curr = SCANNER.nextLine();
        if (curr.equals("exit")) {
          logger.info("Exiting app");
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
        String message = "";
        if (!curr.isBlank()) {
          message = "Enter 'help' for help, or 'exit' to kill the programme. For now, let's roll the dice!: ";
        }
        int animationFrames = 20;
        int animationDelayMs = 150;
        System.out.println(message);
        for (int frame = 0; frame < animationFrames; frame++) {
          System.out.print("\r" + "Rolling: " + FRAMES[frame % FRAMES.length]);
          try {
            Thread.sleep(animationDelayMs);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        String result = CATEGORIES[new Random().nextInt(CATEGORIES.length)];
        logger.info("rolled: " + result);
        System.out.print("\r" + "Rolling: " + result + "\n");
      }
    } catch (Exception e) {
      logger.error(e.getMessage());
    }
  }
}
