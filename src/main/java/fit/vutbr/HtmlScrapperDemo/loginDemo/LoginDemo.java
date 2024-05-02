package fit.vutbr.HtmlScrapperDemo.loginDemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import fit.vutbr.HtmlScrapper.scrapper.ScrapperTemplate;

public class LoginDemo {
    public static void main(String[] args) {
        ScrapperTemplate template = new ScrapperTemplateWithLogin();
        try {
            LoginConfirmation loginConfirmation = template.scrapeData("https://team-simple.org/forum/index.php", LoginConfirmation.class);
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(loginConfirmation);
            System.out.println(json);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
