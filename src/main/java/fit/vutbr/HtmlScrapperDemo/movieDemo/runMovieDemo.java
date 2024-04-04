package fit.vutbr.HtmlScrapperDemo.movieDemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import fit.vutbr.HtmlScrapper.scrapper.ScrapperTemplate;
import fit.vutbr.HtmlScrapperDemo.oteDemo.Ote;

public class runMovieDemo {
    public static void main(String[] args) {
        ScrapperTemplate template = new ScrapperTemplate();
        try {
            // Downloading this source document takes a bit of time cca 20-30 seconds
            MovieList movies = template.scrapeData("https://www.imdb.com/chart/top/", MovieList.class);
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(movies);
            System.out.println(json);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
