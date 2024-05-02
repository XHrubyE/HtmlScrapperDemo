package fit.vutbr.HtmlScrapperDemo.movieDemo;

import fit.vutbr.HtmlScrapper.annotations.ObjectSelect;

import java.util.List;

public class MovieList {
    @ObjectSelect
    private List<Movie> movies;

    public List<Movie> getMovies() {
        return movies;
    }
}
