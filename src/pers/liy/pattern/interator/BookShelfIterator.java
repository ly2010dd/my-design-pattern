package pers.liy.pattern.interator;

public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        if (index >= bookShelf.getLength()) return false;
        return true;
    }
    @Override
    public Book next() {
        return bookShelf.getBookAt(index++);
    }
}
