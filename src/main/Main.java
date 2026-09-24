package main;

import constant.MenuConstant;
import service.MatchService;
import java.util.Scanner;
import util.inputUtil;


public class Main {
  //The Running Place Where Program to work
  public static void main(String[] args) {



    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Please input YOUR NAME. : ");

      inputUtil input = new inputUtil();

      String name = input.checkUserName(scan) ;
      System.out.println("Hello, " + name + "! Let's Predict Matches Score! ");

      //Callback Menu List's Class
      MenuConstant menuConstant = new MenuConstant();


      //CRUD Class callback.
      MatchService matchService = new MatchService();

      /*
      Control Flow (Depending on User chooses Number, Going Each Classes.)
      Score Detail Registering/Reading & Showing/Updating/Deleting/Score Judging.
      */
      boolean isRoop = true;

      //while  true: Rooping the Program.
      while (isRoop) {
        int choiceNumber = menuConstant.showMenu(scan);


        switch (choiceNumber) {
          //If User Chooses "0", The Program is End.
          case 0:
            System.out.println("Can you Exit from this Program?");
            String endCommand = scan.next();
            if (endCommand.equals("y")) {
              System.out.println("Exit. Bye👋");
              isRoop = false;
            } else if (endCommand.equals("n")) {
              System.out.println("Let's Continue.");
              
            } else {
              System.out.println("Wrong Number. Please Check Your Number.");
            }
            break;

            // User chooses "1", The Program's Root goes MatchService/dataRegisterMatchDetails.
          case 1:
            matchService.registerMatchDetails(scan);
            System.out.println("Data is Saved.");
            break;

            //chooses 2, It goes MatchService/readingMatches.
          case 2:
            System.out.println("Here is Your Prediction List: ");
            System.out.println(" ");
            matchService.readingMatches(scan);
            break;

            //chooses 3, It goes MatchService/UpdatingMatches.
          case 3:
            matchService.updateMatches(scan);
            break;

            //chooses 4, It goes MatchService/DeletingMatches.
          case 4:
            matchService.deleteMatches(scan);
            break;

            //chooses 5, It goes judge/Judge.
          case 5:
            matchService.scoreJudge();
            break;

            default:
              System.out.println("Choose Number from 0 to 5.");


        }


      }
    }

  }
}
