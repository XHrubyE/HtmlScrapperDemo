package fit.vutbr.HtmlScrapperDemo.oteDemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import fit.vutbr.HtmlScrapper.scrapper.ScrapperTemplate;

public class runDemo {
    public static void main(String[] args) {
        ScrapperTemplate template = new ScrapperTemplate();
        try {
            Ote ote = template.scrapeData("https://www.ote-cr.cz/cs/kratkodobe-trhy/elektrina/denni-trh?date=2024-03-27", Ote.class);
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(ote);
            System.out.println(json);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
