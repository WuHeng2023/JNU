package cn.edu.jnu.x2020103968;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {

    private BowlingGame game;

    @Before
    public void setUp() throws Exception {
        game = new BowlingGame();
    }

    //测试1
    @Test
    public void test20Zeros()
    {
        repeatedRoll(0,20);
        assertEquals(0, game.score());
    }


    //测试2
    @Test
    public void test20Ones()
    {
        repeatedRoll(1,20);
        assertEquals(20, game.score());
    }
    private void repeatedRoll(int pin,int times) {
        for (int i = 0; i < times; i++) {
            game.roll(pin);
        }
    }

    //测试3
    @Test
    public void testASpare()
    {
        rollASpare();
        game.roll(7);
        repeatedRoll(0,17);
        assertEquals(24, game.score());
    }

    private void rollASpare() {
        game.roll(4);
        game.roll(6);
    }


    //测试4
    @Test
    public void testAStrike()
    {
        rollAStrike();
        game.roll(5);
        game.roll(4);
        repeatedRoll(0,16);
        assertEquals(28, game.score());
    }

    private void rollAStrike() {
        game.roll(10);
    }

    //测试5
    @Test
    public void testFullStrike()
    {
        repeatedRoll(10,12);
        assertEquals(300, game.score());
    }

}