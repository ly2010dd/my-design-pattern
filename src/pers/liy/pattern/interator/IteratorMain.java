package pers.liy.pattern.interator;

public class IteratorMain {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("book1"));
        bookShelf.appendBook(new Book("book2"));
        bookShelf.appendBook(new Book("book3"));
        bookShelf.appendBook(new Book("book4"));
        //此处面向it编程，与具体Iterator类解耦，这也是这个设计模式的好处
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
