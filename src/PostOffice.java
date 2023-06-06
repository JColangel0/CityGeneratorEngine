public class PostOffice extends Building {
    private int numCarriers;
    private int numLetters;

    public PostOffice(int numCarriers, int numLetters) {
        super("Stryker City Post Office", 40);
        this.numCarriers = numCarriers;
        this.numLetters = numLetters;
    }

    public int getNumCarriers() {
        return numCarriers;
    }

    public int getNumLetters() {
        return numLetters;
    }
}