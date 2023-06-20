public class Books {

    private String name,author,genre;

    public Books(String name, String author, String genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;
    }
    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public String getGenre(){
        return genre;
    }
}
