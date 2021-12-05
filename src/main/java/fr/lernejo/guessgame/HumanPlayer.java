package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;

import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;


public class HumanPlayer implements Player{

    public Logger logger= LoggerFactory.getLogger("Player");


    @Override
    public long askNextGuess() {
       do{
           logger.log("please input a number");

           try {
               Scanner guess = new Scanner(System.in);
               return guess.nextLong();

           }catch (NumberFormatException e){
               logger.log("not a number");

           }
       } while (true);
    }

    @Override
    public void respond(boolean lowerOrGreater) {

    }
}
