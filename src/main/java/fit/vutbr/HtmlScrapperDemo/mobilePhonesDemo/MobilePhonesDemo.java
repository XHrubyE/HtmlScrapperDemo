package fit.vutbr.HtmlScrapperDemo.mobilePhonesDemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import fit.vutbr.HtmlScrapper.scrapper.ScrapperTemplate;

public class MobilePhonesDemo {
    public static void main(String[] args) {
        ScrapperTemplate template = new ScrapperTemplate();
        try {
            MobilePhoneList mobilePhoneList = template.scrapeData("https://www.datart.cz/mobilni-telefony.html", MobilePhoneList.class);
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mobilePhoneList.getMobilePhones());
            System.out.println(json);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
