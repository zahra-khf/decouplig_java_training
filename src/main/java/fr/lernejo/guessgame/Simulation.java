package fr.lernejo.guessgame;
import fr.lernejo.logger.LoggerFactory;
import fr.lernejo.logger.Logger;



    public class Simulation {

        private final Logger logger = LoggerFactory.getLogger("simulation");
        private final Player player;  //TODO add variable type
        private double numberToGuess; //TODO add variable type

        public Simulation(Player player) {
            //TODO implement me
            this.player = player;

        }

        public void initialize(long numberToGuess) {
            this.numberToGuess = numberToGuess;

        }

        /**
         * @return true if the player have guessed the right number
         */
        private boolean nextRound() {
            long playernumber = player.askNextGuess();
            if (numberToGuess < playernumber)
            {
                this.logger.log("nombre plus petit");

                return false;
            }
            else if (numberToGuess > playernumber) {
                this.logger.log("nombre plus grand");

                return false;
            }
            else {
                this.logger.log("nombre exacte ");
                return true;
            }
        }

        public void loopUntilPlayerSucceed() {
           boolean x =this.nextRound();
            while (x==false){
                this.nextRound();
                x =this.nextRound();
            }

        }
    }

