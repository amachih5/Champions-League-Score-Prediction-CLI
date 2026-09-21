package model;


public class Match {
    private int id;
    private String homeTeam;

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    private String awayTeam;
    private int homeTeamPredictScore;

    public int getAwayTeamPredictScore() {
        return awayTeamPredictScore;
    }

    public void setAwayTeamPredictScore(int awayTeamPredictScore) {
        this.awayTeamPredictScore = awayTeamPredictScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public int getHomeTeamPredictScore() {
        return homeTeamPredictScore;
    }

    public void setHomeTeamPredictScore(int homeTeamPredictScore) {
        this.homeTeamPredictScore = homeTeamPredictScore;
    }

    public Integer getHomeTeamRealScore() {
        return homeTeamRealScore;
    }

    public void setHomeTeamRealScore(Integer homeTeamRealScore) {
        this.homeTeamRealScore = homeTeamRealScore;
    }

    public Integer getAwayTeamRealScore() {
        return awayTeamRealScore;
    }

    public void setAwayTeamRealScore(Integer awayTeamRealScore) {
        this.awayTeamRealScore = awayTeamRealScore;
    }

    private int awayTeamPredictScore;
    private Integer homeTeamRealScore;
    private Integer awayTeamRealScore;
}