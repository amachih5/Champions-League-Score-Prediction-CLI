package service;

import model.Match;

import java.util.ArrayList;
import java.util.Scanner;

public class MatchService {

  //Defining Empty ArrayList Here.
  private final ArrayList<Match>  matches = new ArrayList<>();


  // -------- Registering/Saving  ---------
  public void registerMatchDetails(Scanner scan) {
    Match m = new Match();
      //User Input ID Here.
      System.out.println("Please Input Id Number Here. : ");
      int idNumber = scan.nextInt();
      m.setId(idNumber);

      scan.nextLine();

      // User Input Their Supporting Team Here .
      System.out.println("Please Input Your Supporting Team.: ");
      String homeTeam = scan.nextLine();
      m.setHomeTeam(homeTeam);



      //They Input Their Away Team Here.
      System.out.println("Please Input Your Away Team.");
      String awayTeam = scan.nextLine();
      m.setAwayTeam(awayTeam);

      //They Input Score to Predict Them Supporting Team.
      System.out.println("Please Input Here Your Supporting Team's Prediction Score.");
      int homeTeamPredictionScore = scan.nextInt();
      m.setHomeTeamPredictScore(homeTeamPredictionScore);

      //They Input Score to Predict Them Away Team.
      System.out.println("Please Input Here Your Away Team's Prediction Score.");
      int awayTeamPredictionScore = scan.nextInt();
      m.setAwayTeamPredictScore(awayTeamPredictionScore);

      //They add ArrayList of match iterable in Home & Away Team's Name & Prediction Score.
      matches.add(m);


  }

  // ------- Reading/Showing -------
  public void readingMatches(Scanner scan) {
    for (Match m : matches) {
      if (matches.isEmpty()) {
        System.out.println("Data is not anything yet.");
        return;
      }

      System.out.println("==================");
      System.out.printf(
              "%d: %n %s %d - %s %d %n",
              m.getId(), m.getHomeTeam(), m.getHomeTeamPredictScore(),
              m.getAwayTeam(), m.getAwayTeamPredictScore()
      );
      System.out.println("==================");
    }
  }

  //------- Updating -------
  public void updateMatches(Scanner scan) {

  }

  //------- Deleting -------
  public void deleteMatches(Scanner scan) {
    
  } 

}
