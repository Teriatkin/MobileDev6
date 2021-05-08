package ua.kpi.comsys.IV8226.model;

public class MovieItem {

    private String Title;
    private String Year;
    private String imdbID;
    private String Type;
    private String Poster;

    public String getTitle() {
        return Title;
    }

    public String getYear() {
        return Year;
    }

    public String getType() {
        return Type;
    }

    public String getPoster() {
        return Poster;
    }

    public String getImdbID() { return imdbID; }

    public String toString() {
        return "{\"Title\":\"" + Title + "\"," +
                "\"Year\":\"" + Year + "\"," +
                "\"imdbID\": \""+ imdbID + "\"," +
                "\"Type\":\"" + Type + "\"," +
                "\"Poster\":\"" + Poster + "\"}";
    }
}
