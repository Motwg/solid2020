package pl.zzpj2020.solid.srp.book.solution;

import java.util.Map;

public class Printer {

    private Book book;
    private int currentPage = 0;

    public String getCurrentPageContents() {
        return book.getPages().get(currentPage);
    }

    public void turnPage() {
        currentPage ++;
    }

    /**
     * Prints the current page.
     */
    public void printCurrentPage() {
        System.out.println(book.getPages().get(currentPage));
    }

    /**
     * Prints all pages
     * @return
     */
    public String printAllPages() {

        String allPages = "";
        for(Map.Entry<Integer, String> page : book.getPages().entrySet())
            allPages += (page.getKey() + " " + page.getValue());
        return  allPages;
    }
}
