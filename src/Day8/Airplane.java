package Day8;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    @Override
    public String toString() {
        return "Производитель: " +producer+ ", год выпуска: " + year +", длина: " + length + ", вес: " +
                weight;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }



}
