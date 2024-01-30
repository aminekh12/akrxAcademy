package day6.challenge1;

public class RomanceBook extends Book{
    public RomanceBook(String title, String author, String isbn, String language) {
        super(title, author, isbn, language);
    }
    @Override
    public String toString() {
        return "RomanceBook {" +
                "title='" + this.getTitle() + '\'' +
                ", author='" + this.getAuthor() + '\'' +
                ", isbn='" + this.getIsbn() + '\'' +
                ", language='" + this.getLanguage() + '\'' +
                '}';
    }
}
