package fit.vutbr.HtmlScrapperDemo.bookDemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import fit.vutbr.HtmlScrapper.scrapper.ScrapperTemplate;

public class BookDemo {
    public static void main(String[] args) {
        ScrapperTemplate template = new ScrapperTemplate();
        try {
            NewBookReleases newBookReleases = template.scrapeData("https://www.goodreads.com/genres/mystery", NewBookReleases.class);
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(newBookReleases.getNewReleases());
            System.out.println(json);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
