package org.example;

import java.util.Random;
import java.util.Scanner;

public class FemettanDice {

  public static void main(String[] args) {
    String[] numbers = new String[]{ "1", "2", "3", "4", "★" };
    Scanner scanner = new Scanner(System.in);
    String curr;
    while (true) {
      curr = scanner.nextLine();
      if (curr.equals("exit")) {
        break;
      }
      if (curr.equals("help")){
        System.out.println("""
          FEMETTAN DICE

          In order to get a random number, press enter or write
          any text and then press enter. It really does not matter
          keklmao

          however, in order to kill the programme,
          just enter 'exit' and then press the enter key.
          This Kills The Crab. :)
          """);
      }
      System.out.println(numbers[new Random().nextInt(numbers.length)]);
    }
  }
}
