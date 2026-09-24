package service;

import model.Match;
import util.inputUtil;
import java.util.ArrayList;
import java.util.Scanner;

public class MatchService {

    //Defining Empty ArrayList Here.
    private final ArrayList<Match> matches = new ArrayList<>();

    private final inputUtil input = new inputUtil();


    // -------- Registering/Saving  ---------
    public void registerMatchDetails(Scanner scan) {
        Match m = new Match();
        //User Input ID Here.
        System.out.println("Please Input ID Number Here. : ");
        int idNumber = input.readNumber(scan);
        m.setId(idNumber);



        // User Input Their Supporting Team Here .
        System.out.println("Please Input Your Supporting Team Here.: ");
        String homeTeam = input.readingTeamName(scan);
        m.setHomeTeam(homeTeam);


        //They Input Their Away Team Here.
        System.out.println("Please Input Your Away Team Here.");
        String awayTeam = input.readingTeamName(scan);
        m.setAwayTeam(awayTeam);

        //They Input Score to Predict Them Supporting Team.
        System.out.println("Please Input Your Supporting Team's Prediction Score Here.");
        int homeTeamPredictionScore = input.readNumber(scan);
        m.setHomeTeamPredictScore(homeTeamPredictionScore);

        //They Input Score to Predict Them Away Team.
        System.out.println("Please Input Your Away Team's Prediction Score Here.");
        int awayTeamPredictionScore = input.readNumber(scan);
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
        int updateNumber = input.readNumber(scan);


        //Prepare Empty iterable Here.
        Match found = null;

        //Searching ID by for Roop % if Sentence.
        for (Match m : matches) {
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
        int homeTeamRealScore = input.readNumber(scan);
        found.setHomeTeamRealScore(homeTeamRealScore);

        System.out.println("Please Input Here The Your Away Team's Real Score.");
        int awayTeamRealScore = input.readNumber(scan);
        found.setAwayTeamRealScore(awayTeamRealScore);

        //Matches Data With Real & Prediction Score.
        System.out.println("Here is Your Prediction(Up) & Real Score(Down).");
        System.out.println("=================");
        System.out.printf(
                "%d: %n %s %d - %d %s %n %s %d - %d %s %n",
                found.getId(), found.getHomeTeam(), found.getHomeTeamPredictScore(), found.getAwayTeamPredictScore(), found.getAwayTeam(),
                found.getHomeTeam(), found.getHomeTeamRealScore(), found.getAwayTeamRealScore(), found.getAwayTeam()
        );

        System.out.println("=================");


        System.out.println("Matches Detail is Updated.");


    }

    //------- Deleting -------
    public void deleteMatches(Scanner scan) {
        System.out.println("Please Input Number Here You wanna Delete.");
        int deleteNumber = input.readNumber(scan);


        Match found = null;

        for (Match m : matches) {
            if (m.getId() == deleteNumber) {
                found = m;
                break;
            }
        }
        // If ID(found iterable) is NOT Found, Printing "Sorry, ID is not Found."
        if (found == null) {
            System.out.println("Sorry, ID is not Found.");
        }

        //If ID(found iterable) is just Found, The Number User wanna Delete is Removed WITH remove Method.
        if (found != null) {
            matches.remove(found);
            System.out.println("Completed Deleting! ID = " + deleteNumber);

        }

    }

    //------- Judging -------
    public void scoreJudge() {
        int hittingCounter = 0;
        int totalPoint = 0;
        int missCounter = 0;
        int judgingCounter = 0;

        //Rooping For Sentence Cause To compare Team's Score Data.
        for (Match m : matches) {

          // If User's Inputted Team Score(Home & Away) is NOT Found, The Process is Skipped.
          if(m.getHomeTeamRealScore() == null || m.getAwayTeamRealScore() == null) {
            continue;
          }
          judgingCounter++;

          // If It is Found, The Hitting Counter and hittingCounter(+3)/missCounter(-3) is increment(decrement).
          if (m.getHomeTeamPredictScore() == m.getHomeTeamRealScore() && m.getAwayTeamPredictScore() == m.getAwayTeamRealScore()) {
            hittingCounter++;
            totalPoint +=3;
          } else {
            missCounter++;
            totalPoint -= 3;

            //If User's TotalPoint is Smaller than 0, TotalPoint is Initialized(0 Point).
            if(totalPoint < 0) {
              totalPoint = 0;
            }
          }

        }

        //If JudgingCounter is 0, Process is returned to do Noting.
        if(judgingCounter == 0) {
          System.out.println("No Scores Data is Inputted.");
          return;
        }

        double rate = (double) hittingCounter / judgingCounter * 100;

        System.out.println("==================");
        System.out.printf("Hit: %d / %d　Games %n", hittingCounter, judgingCounter);
        System.out.printf("Miss: %d Games %n", missCounter);
        System.out.printf("Hitting Rate: %.1f%% %n", rate);
        System.out.printf("Your Prediction Point: %d Points %n", totalPoint);
        System.out.println("==================");


    }


}
