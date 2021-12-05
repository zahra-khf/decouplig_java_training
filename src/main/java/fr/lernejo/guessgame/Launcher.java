package fr.lernejo.guessgame;
import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args){
        final Player player ;
        final long numberToGuess;
        final long maxloop ;
        if (args.length>0 && args[0].equals("-interactive")){
            player= new HumanPlayer();
            SecureRandom random = new SecureRandom();
            numberToGuess= random.nextInt(100);
            maxloop = Long.MAX_VALUE;

        }else if (args.length>1 && args[0].equals("-auto")){
            player= new ComputerPlayer();
            String numberToGuessText = args[1];
            numberToGuess=Long.parseLong(numberToGuessText);
            maxloop=1000;

        }else{
            throw new IllegalArgumentException("bad parametre");
        }
        Simulation simulation = new Simulation(player);
        SecureRandom random = new SecureRandom();

        long  Number = random.nextInt(100);


        simulation.initialize(Number);

        simulation.loopUntilPlayerSucceed(maxloop);

    }
}
