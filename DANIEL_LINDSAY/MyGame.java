public class MyGame {

    public static void main(String[] args) {
        GameArena gameArena = new GameArena(400, 600);
        Ball b = new Ball(250, 150, 30, "BLUE");

        gameArena.addBall(b);

        while (true) {
            gameArena.pause();
        }
    }
}