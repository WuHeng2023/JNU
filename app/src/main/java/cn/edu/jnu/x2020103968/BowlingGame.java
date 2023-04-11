package cn.edu.jnu.x2020103968;

public class BowlingGame {
    int pins[] =new int[21];
    int current_pin_index=0;
    public void roll(int pin) {
        pins[current_pin_index++]+=pin;
    }

    public int score() {
        int totalScore=0;
        int currentFrameScoreIndex=0;
        for(int currentFrame=0;currentFrame<10;currentFrame++)
        {
            totalScore+=pins[currentFrameScoreIndex];
            totalScore+=pins[currentFrameScoreIndex+1];
            if(isAStrike(currentFrameScoreIndex)) {
//                totalScore+=pins[currentFrameScoreIndex+1];
                totalScore+=pins[currentFrameScoreIndex+2];
            }
            else if(isASpare(currentFrameScoreIndex)) {
//                totalScore+=pins[currentFrameScoreIndex+1];
                totalScore+=pins[currentFrameScoreIndex+2];
                currentFrameScoreIndex++;
            }
            else{
//                totalScore+=pins[currentFrameScoreIndex+1];
                currentFrameScoreIndex++;
            }
            currentFrameScoreIndex++;
        }
        return totalScore;
    }

    private boolean isAStrike(int scoreIndex) {
        return 10== pins[scoreIndex];
    }

    private boolean isASpare(int scoreIndex) {
        return 10==pins[scoreIndex]+pins[scoreIndex +1];
    }
}
