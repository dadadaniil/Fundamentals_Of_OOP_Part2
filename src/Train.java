import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Train {

    private String destinationName;
    private int trainNumber;
    private String departureTime;

    public Train(int trainNumber, String departureTime, String destinationName) {
        this.trainNumber = trainNumber;
        this.destinationName = destinationName;
        this.departureTime = departureTime;
    }

    private ArrayList<Train> trainList = new ArrayList<>();
    private Map<Integer, Train> mapTrain = new HashMap<>();


    public static void main(String[] args) {
        Train train= new Train(0, "15.40", "Moscow");
        train.trainList.add(new Train(0, "15.40", "Moscow"));
        train.trainList.add(new Train(2, "12.20", "Hague"));
        train.trainList.add(new Train(1, "00.40", "Vilnius"));
        train.trainList.add(new Train(5, "10.40", "Vilnius"));
        train.trainList.add(new Train(8, "11.40", "Moscow"));
        train.sortByDestination();
        System.out.println(train.mapTrain.toString());

        final String name="1";
        final StringBuilder builder=new StringBuilder();
        builder.append("udshgfu");
    }


    public void displayById(int id) {
        System.out.println(String.format("number: %s, departure time: %s, destination name: %s", id, readTrainByNumber(id).departureTime, readTrainByNumber(id).destinationName));
    }


    public boolean doNeedSwap2Words(String firstWord, String secondword) {

        for (int i = 0; i < Math.min(secondword.length(), firstWord.length()); i++) {

            if (firstWord.charAt(i) > secondword.charAt(i)) {
                return true;

            }
            
            if (firstWord.charAt(i) < secondword.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    //OFC It is possible just to use "mapTrain.get(number)", but it is easier just to call method with one letter and Tab

    public Train readTrainByNumber(int number) {
        return trainList.get(number);
    }


    public void sortTrainsById() {
        for (int counter = 0; counter < trainList.size(); counter++) {
            mapTrain.put(readTrainByNumber(counter).trainNumber, readTrainByNumber(counter));
        }
        for (int counter = 0; counter < trainList.size(); counter++) {
            trainList.set(counter, mapTrain.get(counter));
        }
        mapTrain.clear();
    }


    public void sortByDestination() {
        boolean doNeedOneMoreCycle = true;
        while (doNeedOneMoreCycle) {
            doNeedOneMoreCycle = false;
            for (int counter = 0; counter < trainList.size() - 1; counter++) {
                if (doNeedSwap2Words(readTrainByNumber(counter).destinationName, trainList.get(counter + 1).destinationName) && !readTrainByNumber(counter).equals(readTrainByNumber(counter).destinationName)) {
                    swapTrains(counter);
                    doNeedOneMoreCycle = true;
                }

                if (readTrainByNumber(counter).destinationName.equals(readTrainByNumber(counter).destinationName)) {
                    if (doNeedSwap2Words(readTrainByNumber(counter).departureTime, readTrainByNumber(counter + 1).departureTime)) {
                        swapTrains(counter);
                    }
                }
            }
        }
    }


    public void swapTrains(int number) {
        Train bufferedTrain = new Train(readTrainByNumber(number).trainNumber, readTrainByNumber(number).departureTime, readTrainByNumber(number).destinationName);
        trainList.set(number, readTrainByNumber(number + 1));
        trainList.set(number + 1, bufferedTrain);
    }
}
