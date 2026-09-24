package constant;
import java.util.Scanner;
import java.util.SplittableRandom;

import util.inputUtil;


public class MenuConstant {

    //Inserting util.inputUtil.java Due to Checking Number.
    private final inputUtil input = new inputUtil();

  public int showMenu(Scanner scan) {
      System.out.println("Menu↓");
      System.out.println("0.End/1.Register/2.Read & Show List/3.Update/4.Delete/5.Judge");
      System.out.println("Please input Number What you wanna Choose.(0 ~ 5): ");
      int scanNumber = input.readNumber(scan);
      if (scanNumber > 5 || scanNumber < 0) {
          System.out.println("Wrong Number. Please Check Your number.");
      }
      return  scanNumber;
  }
}
