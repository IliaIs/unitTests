package org.example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class BookTest {

    Book firstBookTest =
            new Book("Song of ice and fire", 2005,
                    new Author("George", "Martin", 10), 1500);
    Book secondBookTest =
            new Book("Story of my life", 1992,
                    new Author("Ilya", "Isaev", 10), 15);

    @Test
    void isBig_True() {
        assertThat(firstBookTest.isBig(), equalTo(true));
    }

    @Test
    void isBig_False() {
        assertThat(secondBookTest.isBig(), equalTo(false));
    }

    @Test
    void estimatePrice_True() {
        int actual = 14230;
        int expected = firstBookTest.estimatePrice();
        assertThat(expected, equalTo(actual));
    }

    @Test
    void estimatePrice_False() {
        int actual = 250;
        int expected = secondBookTest.estimatePrice();
        assertThat(expected, equalTo(actual));
    }

    @Test
    void matches_True() {
        assertThat(firstBookTest.matches("Geo"), equalTo(true));
    }

    @Test
    void matches_False() {
        assertThat(secondBookTest.matches("Geo"), equalTo(false));
    }
}