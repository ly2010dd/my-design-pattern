package pers.liy.pattern.interator;

public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }
    public Book getBookAt(int index) {
        return books[index];
    }
    public int getLength() {
        return last;
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
