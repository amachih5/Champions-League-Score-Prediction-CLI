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
      System.out.println("Please Input ID Number Here. : ");
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
              "%d: %n %s %d - %d %s  %n",
              m.getId(), m.getHomeTeam(), m.getHomeTeamPredictScore(),
              m.getAwayTeamPredictScore(), m.getAwayTeam()
      );
      System.out.println("==================");
    }
  }

  //------- Updating -------
  public void updateMatches(Scanner scan) {
    System.out.println("Please Input ID Here.");
    int updateNumber = scan.nextInt();
    scan.nextLine();

    //Prepare Empty iterable Here.
    Match found = null;

    //Searching ID by for Roop % if Sentence.
    for (Match m : matches){
      if (m.getId() == updateNumber) {
        found = m;
        break;
      }
    }

    //If id is not found, Process is end.
    if (found == null) {
      System.out.println("Match's ID is not found.");
      return;
    }

    //If ID is found, Inserting The Real Matches Score Here.

      System.out.println("Please Input Here the Your Supporting Team's Real Score.");
      int homeTeamRealScore = scan.nextInt();
      found.setHomeTeamRealScore(homeTeamRealScore);

      System.out.println("Please Input Here The Your Away Team's Real Score.");
      int awayTeamRealScore = scan.nextInt();
      found.setAwayTeamRealScore(awayTeamRealScore);

      //Matches Data With Real & Prediction Score.
      System.out.println("Here is Your Prediction(Up) & Real Score(Down).");
      System.out.println("=================");
      System.out.printf(
              "%d: %n %s %d - %d %s %n %s %d - %d %s %n",
              found.getId(), found.getHomeTeam(), found.getHomeTeamPredictScore(),  found.getAwayTeamPredictScore(),found.getAwayTeam(),
              found.getHomeTeam(), found.getHomeTeamRealScore(),  found.getAwayTeamRealScore(), found.getAwayTeam()
              );

      System.out.println("=================");



      System.out.println("Matches Detail is Updated.");


  }

  //------- Deleting -------
  public void deleteMatches(Scanner scan) {
    int deleteNumber = scan.nextInt();
    scan.nextLine();

    Match found = null;

    for(Match m : matches) {
      if(m.getId() == deleteNumber) {
        found = m;
        break;
      }
    }

    if (found == null) {
      System.out.println("Sorry, ID is not Found.");
    }

    if (found != null) {
      System.out.println("Please Input ID Number Here.");

    }
    
  } 

}
