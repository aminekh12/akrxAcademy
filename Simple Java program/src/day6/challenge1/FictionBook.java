package day6.challenge1;

public class FictionBook extends Book{
    public FictionBook(String title, String author, String isbn, String language) {
        super(title, author, isbn, language);
    }
    @Override
    public String toString() {
        return "FictionBook {" +
                "title='" + this.getTitle() + '\'' +
                ", author='" + this.getAuthor() + '\'' +
                ", isbn='" + this.getIsbn() + '\'' +
                ", language='" + this.getLanguage() + '\'' +
                '}';
    }

}
