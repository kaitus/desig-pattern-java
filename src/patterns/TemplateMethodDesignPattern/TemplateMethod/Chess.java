package patterns.TemplateMethodDesignPattern.TemplateMethod;

public class Chess extends Game {

    private int maxTurns = 10;
    private int turn = 1;

    public Chess() {
        super(2);
    }

    @Override
    protected int getWinningPlayer() {
        return 0;
    }

    @Override
    protected boolean haveWinner() {
        return turn == maxTurns;
    }

    @Override
    protected void takeTurn() {
        System.out.println("Turn " + (turn++) + " taken by player " + currentPayer);
        currentPayer = (currentPayer+1) % numberOfPlayer;
    }

    @Override
    protected void start() {
        System.out.println("Starting a game of chess");
    }
}