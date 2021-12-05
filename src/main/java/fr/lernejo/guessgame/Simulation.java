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

        public void loopUntilPlayerSucceed(long maxloop) {
            long start =System.currentTimeMillis();
            int counter = 0 ;
            do {
                counter ++;

            } while (counter<maxloop && !nextRound());
            long stop =System.currentTimeMillis();
            long duration_mm= (stop-start)/600000;
            long duration_ss= (stop-start)/1000;

            if(counter==maxloop){
                logger.log("fail in"+maxloop+"iteration  ");
                logger.log("took"+duration_mm+" mm "+duration_ss+" ss "+((stop-start)-(duration_ss*1000)-(duration_mm*600000))+" SS");
            }
            logger.log("well done in "+counter+"iteration ");
            logger.log("took"+duration_mm+" mm "+duration_ss+" ss "+((stop-start)-(duration_ss*1000)-(duration_mm*600000))+" SS");
        }





    }

