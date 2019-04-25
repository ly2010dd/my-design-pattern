package pers.liy.pattern.interator;

public class IteratorMain {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(10);
        bookShelf.appendBook(new Book("book1"));
        bookShelf.appendBook(new Book("book2"));
        bookShelf.appendBook(new Book("book3"));
        bookShelf.appendBook(new Book("book4"));
        Iterator bookShelfIterator = bookShelf.iterator();
        while (bookShelfIterator.hasNext()) {
            System.out.println(bookShelfIterator.next());
        }
    }
}
