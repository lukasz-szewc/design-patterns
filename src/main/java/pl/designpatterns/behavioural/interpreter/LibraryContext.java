/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.behavioural.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class LibraryContext {
    public static final String EMPTY_LIST_OF_BOOKS = "List of Books is empty";

    private List<String> listOfBooks = new ArrayList<String>();

    public void addBookTitle(String string) {
        listOfBooks.add(string);
    }

    public void getLastAddedBook() {
        if (listOfBooks.isEmpty()) {
            System.out.println(EMPTY_LIST_OF_BOOKS);
        } else {
            System.out.println(listOfBooks.get(listOfBooks.size() - 1));
        }
    }

    public void getAllBooks() {
        StringBuilder bookBuilder = new StringBuilder();
        for (String string : listOfBooks) {
            bookBuilder.append(string);
            bookBuilder.append("\n");
        }
        System.out.println(bookBuilder.toString());
    }
}
