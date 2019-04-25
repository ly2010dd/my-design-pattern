package pers.liy.pattern.interator;

public class BookShelf implements Aggregate {
    private Book[] books;
    private int last;

    public BookShelf(int n) {
        books = new Book[n];
        last = 0;
    }
    public void appendBook(Book book) {
        books[last] = book;
        last++;
    }
    public Book getBookAt(int index) {
        return books[index];
    }
    public int getLast() {
        return last;
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
