import java.util.ArrayList;

public class Book {
    SecondClass secondClass = new SecondClass();



    private String title;
    private String author;
    private String typeOfBinding;
    private String publisher;
    private int yearOfPublication, pages, price;


    //    PUT THERE TRUE IF YOU WANT LIST OF EXACT AUTHER, FALSE - PUBLISHER
    public void listOfBooks(String key, boolean authorOrPublisher) {
        for (Book book :
                secondClass.library) {
            if (book.author.equals(key) && authorOrPublisher) {
                System.out.println(book);
            }

            if (book.publisher.equals(key) && !authorOrPublisher) {
                System.out.println(book);
            }
        }
    }

    public void listOfBooks(int yearToCompare) {
        for (Book book :
                secondClass.library) {
            if (book.yearOfPublication > yearToCompare) {
                System.out.println(book);
            }
        }
    }

    public Book(String title, String author, String typeOfBinding, String publisher, int yearOfPublication, int pages, int price) {
        this.title = title;
        this.author = author;
        this.typeOfBinding = typeOfBinding;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.pages = pages;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", typeOfBinding='" + typeOfBinding + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    protected class SecondClass {
        public ArrayList<Book> library = new ArrayList<>();
        public static void main(String[] args) {
            Book book = new Book("sdkfjhsfhj", "nos", "bumaga", "rukopis", 2000, 9, 50);
            book.secondClass.library.add(new Book("sdkfjhsfhj", "nos", "bumaga", "rukopis", 2000, 9, 50));
            book.secondClass.library.add(new Book("sdkfjhsfhj", "Bunin", "bumaga", "Samizdat", 2020, 9, 50));
            book.secondClass.library.add(new Book("sdkfjhsfhj", "nos", "bumaga", "rukopis", 1800, 9, 50));
            book.secondClass.library.add(new Book("sdkfjhsfhj", "Nenos", "bumaga", "Samizdat", 54, 9, 50));
            book.secondClass.library.add(new Book("sdkfjhsfhj", "nos", "bumaga", "Samizdat", 12, 9, 50));
            book.listOfBooks(1800);
        }
    }
}

