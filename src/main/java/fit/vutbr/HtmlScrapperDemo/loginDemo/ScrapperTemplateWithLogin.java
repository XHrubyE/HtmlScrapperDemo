package fit.vutbr.HtmlScrapperDemo.loginDemo;

import fit.vutbr.HtmlScrapper.scrapper.ScrapperTemplate;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ScrapperTemplateWithLogin extends ScrapperTemplate {
    @Override
    protected Document getDocumentFromUrl(String url) {
        String loginUrl = "https://team-simple.org/forum/login.php?action=in";
        String credential = "scrappertest";
        try {

            Map<String, String> formData = new HashMap<>();  // create form data for log in request
            formData.put("form_sent", "1");
            formData.put("redirect_url", url);
            formData.put("req_username", credential);
            formData.put("req_password", credential);
            formData.put("login", "Login");


            Connection.Response loginResponse = Jsoup.connect(loginUrl) // Post request to log into forum
                    .data(formData)
                    .method(Connection.Method.POST)
                    .execute();

            return Jsoup.connect(url)                    // get request for source document
                    .cookies(loginResponse.cookies())    // add cookies from successful log in request
                    .method(Connection.Method.GET)
                    .get();

        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
