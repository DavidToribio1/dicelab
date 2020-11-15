public class Simulation {

    private Integer numDice;
    private Integer numTosses;
    private Dice dice;
    private Bins bin;

    public Simulation(int numDice, int numTosses) {
        this.numDice = numDice;
        this.numTosses = numTosses;
        dice = new Dice(numDice);
        bin = new Bins(numDice, (numDice * 6)+ 1);
    }

    public void runSimulation() {
        Integer result;
        for (int i = 1; i <= numTosses; i++) {
            result = dice.tossAndSum();
            bin.incrementBin(result);


        }

        }

        public void printResults(){
            String finalResult;
            finalResult = "***\n" +
                    "Simulation of " + numDice + " dice tossed " + numTosses + " times.\n"
                    + "***\n";
            for (int i=numDice; i<=numDice*6; i++){
                double average = bin.binArray[i];
                 finalResult += i + " :   " + bin.binArray[i] + ": " + average + " "
                    + geneStars(average) + "\n";


            }
                System.out.print(finalResult);
    }

            public String geneStars(double average) {
                String stars = "";
                long dPercentage = Math.round(average * 100);

                for (int i = 1; i <= dPercentage; i++) {
                    stars += "*";

                }
                return stars;
            }


    }
