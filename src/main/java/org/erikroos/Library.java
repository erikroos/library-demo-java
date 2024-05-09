package main.java.org.erikroos;

import java.util.ArrayList;
import java.util.List;

public class Library {
    /**
     * A library contains a set of bookcases.
     *
     * @author erikroos
     */

    private List<BookCase> bookCases;

    public Library(int nrOfBookCases) {
        this.bookCases = new ArrayList<>();
        for (int i = 0; i < nrOfBookCases; i++) {
            bookCases.add(new BookCase());
        }
    }

    public int getNrOfBookCases() {
        return bookCases.size();
    }
}
