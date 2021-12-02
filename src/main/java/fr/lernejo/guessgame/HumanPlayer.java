package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;

import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;


public class HumanPlayer implements Player{

    public Logger logger= LoggerFactory.getLogger("Player");


    @Override
    public long askNextGuess() {
        System.out.println( "saisir une entrée de l’utilisateur");
        Scanner scanner = new Scanner(System.in);
        long nb = scanner.nextInt();

        return nb;
    }

    @Override
    public void respond(boolean lowerOrGreater) {

    }
}
