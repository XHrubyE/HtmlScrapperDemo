package fit.vutbr.HtmlScrapperDemo.movieDemo;

import fit.vutbr.HtmlScrapper.anotations.ObjectSelect;
import fit.vutbr.HtmlScrapper.anotations.XPathSelect;;

import java.util.List;

public class MovieList {
    @ObjectSelect
    private List<Movie> movies;

//    @XPathSelect("//li/div[2]/div/div/div/a/h3")
//    private List<String> movieNames;

    public List<Movie> getMovies() {
        return movies;
    }
}
