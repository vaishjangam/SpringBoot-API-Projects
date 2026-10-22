package MovieWatchlist;

public class Movie {
    private long id;
    private String title;
    private int releaseYear;

    public Movie(long id, String title, int releaseYear) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public long getId() { return id; }
    public String getTitle() { return title; }
    public int getReleaseYear() { return releaseYear; }

    public void setId(long id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}