package fit.vutbr.HtmlScrapperDemo.fitVutNewsDemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import fit.vutbr.HtmlScrapper.scrapper.ScrapperTemplate;

public class FitVutNewsDemo {
    public static void main(String[] args) {
        ScrapperTemplate template = new ScrapperTemplate();
        try {
            FitVutNewsLinks news = template.scrapeData("https://www.fit.vut.cz/.en", FitVutNewsLinks.class);

            for (String url : news.getLinks()) {
                FitVutNewDetail articleDetail = template.scrapeData(url, FitVutNewDetail.class);

                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.findAndRegisterModules();
                String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(articleDetail);
                System.out.println(json);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
