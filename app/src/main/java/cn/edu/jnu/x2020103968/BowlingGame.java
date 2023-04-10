package cn.edu.jnu.x2020103968;

public class BowlingGame {
    int score=0;
//    int pins[] =new int[21];
//    int current_pin_index=0;
    public void roll(int pin) {
        score+=pin;
    }

    public int score() {
//        int totalScore=0;
//        for(int scoreIndex=0;scoreIndex<pins.length;scoreIndex++)
//        {
//            totalScore+=pins[scoreIndex];
//            //如果是补中，就把下下球分数计入
//            if(scoreIndex<19){
//                if(10==pins[scoreIndex]+pins[scoreIndex+1]) {
//                    totalScore+=pins[scoreIndex+2];
//                }
//            }
//        }
        return score;
    }
}
