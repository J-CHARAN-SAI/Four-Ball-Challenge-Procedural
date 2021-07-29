import processing.core.PApplet;

public class Fourballchallenge extends PApplet {

    public static final int WIDTH = 750;
    public static final int HEIGHT = 500;
    public static final int Diameter = 10;
    public int positionOfFirstBall = 0;
    public int positionOfSecondBall = 0;
    public int positionOfThirdBall = 0;
    public int positionOfFourthBall = 0;
    public static void main(String[] args) {
        PApplet.main("Fourballchallenge",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {

        ellipse(positionOfFirstBall, getOneFifthOfHeight(), Diameter,Diameter);
        positionOfFirstBall+=1;
        ellipse(positionOfSecondBall, 2*getOneFifthOfHeight(),Diameter,Diameter);
        positionOfSecondBall+=2;
        ellipse(positionOfThirdBall, 3*getOneFifthOfHeight(),Diameter,Diameter);
        positionOfThirdBall+=3;
        ellipse(positionOfFourthBall, 4*getOneFifthOfHeight(),Diameter,Diameter);
        positionOfFourthBall+=4;
    }

    private int getOneFifthOfHeight() {
        return HEIGHT / 5;
    }
}
