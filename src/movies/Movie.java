package movies;

public class Movie {

    /* FIELDS */
    private String name;
    private String category;

    /* GETTERS/SETTERS */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    /* Consgtructors */
    public Movie() {
    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }
}
