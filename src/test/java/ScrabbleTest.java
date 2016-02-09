import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_1() {
    App app = new App();
    Integer score= 1;
    assertEquals(score, app.scrabbleScore("a"));
  }

  @Test
  public void scrabbleScore_rturnsAScrabbleScoreForApple_9() {
    App app = new App();
    Integer score = 9;
    assertEquals(score, app.scrabbleScore("applE"));
  }

}
