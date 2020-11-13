public class Dice {

        private Integer numberOfDice;
        private Integer tossAndSum = 0;

        public Dice(int numberOfDice){
            this.numberOfDice = numberOfDice;
        }

        public Integer tossAndSum(){
            tossAndSum = 0;
            for(int i=1; i<= numberOfDice; i++){
                tossAndSum += 1+(int)(Math.random()*6);
            }
            return tossAndSum;

        }
        public Integer getNumberOfDice(){
            return numberOfDice;
        }


}
