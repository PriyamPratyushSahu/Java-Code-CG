/*Enter 5 over score and display list of outputs
-> Total score
-> Number of 4 scored
-> Number of 6 scored
-> Number of Wickets taken
-> Number of dot balls
-> Number of Wide ball
-> Number of No Ball

*/
package samplePractice;

public class CricketScore {
    int totalScore = 0;
    int totalFour = 0;
    int totalSix = 0;
    int totalWickets = 0;
    int totalDotBalls = 0;
    int totalWideBalls = 0;
    int totalNoBalls = 0;
    String[] ArrangeOvers(String scoreString){
        String[] overs = scoreString.split("\\]\\["); // split between ][
        overs[0] = overs[0].replace("[", "");
        overs[overs.length - 1] = overs[overs.length - 1].replace("]", "");
        return  overs;
    }
    void CalculateScore(String Overs[]){
        for(int i = 0; i < Overs.length; i++){
            System.out.println(Overs[i]);
            String eachOver[] = Overs[i].split("\\,");
            for(int j = 0; j < eachOver.length; j++){
                switch(eachOver[j]){
                    case "W":
                        totalWickets++;
                        break;
                    case "Wide":
                    case "NB":
                        totalScore++;
                        if(eachOver[j].compareTo("Wide") == 0)
                            totalWideBalls++;
                        else
                            totalNoBalls++;

                        break;
                    case "0":
                        totalDotBalls++;
                        break;
                    default:
                        totalScore+= Integer.parseInt(eachOver[j]);
                        if(Integer.parseInt(eachOver[j]) == 4) totalFour++;
                        else if(Integer.parseInt(eachOver[j]) == 6) totalSix++;
                }
            }
//            System.out.println("\n&&");
        }
    }
    void DisplayScore(){

        System.out.println("Total Score: "+totalScore);
        System.out.println("Number of 4 scored: "+totalFour);
        System.out.println("Number of 6 scored: "+totalSix);
        System.out.println("Number of Wickets taken: "+totalWickets);
        System.out.println("Number of dot balls: "+totalDotBalls);
        System.out.println("Number of Wide ball: "+totalWideBalls);
        System.out.println("Number of No Ball: "+totalNoBalls);
    }

    public static void main(String[] args) {
        CricketScore Cs = new CricketScore();
        String score = "[1,0,3,6,4,W]" +
                "[0,Wide,4,2,6,4,NB,2]" +
                "[4,6,2,0,4,1]" +
                "[1,Wide,2,6,4,0]" +
                "[1,0,2,6,4,NB,4]";
        String Overs[] = Cs.ArrangeOvers(score);
        Cs.CalculateScore(Overs);
        Cs.DisplayScore();



//
//        for (int i = 0; i < overs.length; i++) {
//            overs[i] = overs[i].replace("[", "").replace("]", "");
//            System.out.println("Over " + (i + 1) + ": " + overs[i]);
//        }


    }
}
