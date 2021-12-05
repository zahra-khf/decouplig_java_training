package fr.lernejo.guessgame;

public class ComputerPlayer implements Player{
    private long min= Long.MIN_VALUE;
    private long max =Long.MAX_VALUE;
    @Override
    public long askNextGuess() {
        return (min + max)/2;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater){
            max = (min + max)/2;
        }else {
            min = (min + max)/2;
        }

    }
}
