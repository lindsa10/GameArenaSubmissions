public class MyGame {

    public static void main(String[] args) {
        GameArena gameArena = new GameArena(400, 600);

        // Creates border
        Line line1 = new Line(0, 0, 0, 600, 20, "BLUE");
        Line line2 = new Line(0, 0, 400, 0, 20, "BLUE");
        Line line3 = new Line(400, 0, 400, 600, 20, "BLUE");
        Line line4 = new Line(0, 600, 400, 600, 20, "BLUE");
        Line line5 = new Line(0, 500, 400, 500, 20, "BLUE");

        // Sprite that can move
        Rectangle one = new Rectangle(180, 535, 40, 40, "BLUE");

        gameArena.addLine(line1);
        gameArena.addLine(line2);
        gameArena.addLine(line3);
        gameArena.addLine(line4);
        gameArena.addLine(line5);
        gameArena.addRectangle(one);

        Ball b = new Ball(one.getXPosition(), one.getYPosition(), 10, "BLUE");


        while (true) {
            if (gameArena.rightPressed()){
                one.move(5, 0);
            }
            if (gameArena.leftPressed()){
                one.move(-5, 0);
            }
            if (one.getXPosition() >= 350){
                one.setXPosition(350);
            }
            if (one.getXPosition() <= 10) {
                one.setXPosition(10);
            }
            if (gameArena.spacePressed())
            {
                gameArena.addBall(b);
                b.move(0, -5);
            }

            gameArena.pause();
        }
    }
}