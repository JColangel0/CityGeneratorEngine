public class Library extends Building {
    private int numBooks;
    private int numLibraryCards;

    public Library(int numBooks, int numLibraryCards) {
        super("Stryker City Library", 15);
        this.numBooks = numBooks;
        this.numLibraryCards = numLibraryCards;
    }

    public int getBooks() {
        return numBooks;
    }

    public int getNumLibraryCards() {
        return numLibraryCards;
    }
}