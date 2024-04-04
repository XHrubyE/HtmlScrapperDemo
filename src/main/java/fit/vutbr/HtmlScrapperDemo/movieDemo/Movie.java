package fit.vutbr.HtmlScrapperDemo.movieDemo;

import fit.vutbr.HtmlScrapper.anotations.CssSelect;
import fit.vutbr.HtmlScrapper.anotations.ObjectSelect;


@CssSelect(".sc-b0691f29-0.jbYPfh.cli-children")
public class Movie {
    @CssSelect(".ipc-title__text")
    private String title;
    @ObjectSelect
    private MovieInfo movieInfo;

    public String getTitle() {
        return title;
    }

    public MovieInfo getMovieInfo() {
        return movieInfo;
    }
}
