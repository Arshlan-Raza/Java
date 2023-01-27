public class Main {
    public static void main(String[] args) {
        int score1=calculateHighScorePosition(1500);
        int score2=calculateHighScorePosition(900);
        int score3=calculateHighScorePosition(400);
        int score4=calculateHighScorePosition(50);
        displayHighScorePosition("Arshlan",score1);
        displayHighScorePosition("Arshlan",score2);
        displayHighScorePosition("Arshlan",score3);
        displayHighScorePosition("Arshlan",score4);


    }
    public static void displayHighScorePosition(String name, int position){


        System.out.println(name+ " managed to get the position into " +position+ " on the high score table");
    }
    public static int calculateHighScorePosition(int score){
        if (score>1000){
            return 1;
        } else if (score>500 && score<1000) {
            return 2;
        } else if (score>100 && score<500) {
            return 3;
        }
        else {
            return 4;
        }
    }
}