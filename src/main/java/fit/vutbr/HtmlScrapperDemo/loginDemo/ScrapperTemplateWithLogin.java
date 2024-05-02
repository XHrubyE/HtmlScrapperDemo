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

//            Map<String, String> formData = new HashMap<>();  // create form data
//            formData.put("username", "xhrico00");
//            formData.put("password", "fas-okatyn");
//            formData.put("redirect", "");
//            formData.put("login", "Přihlásit");
//
//            Connection.Response res = Jsoup.connect("https://fituska.eu/ucp.php?mode=login") // log into IS
//                    .data(formData)
//                    .method(Connection.Method.POST)
//                    .execute();
//
//
//
//            Map<String, String> cookies = new HashMap<>();
//            cookies.put("fituska_eu_forum_u", "1");
//            cookies.put("cookieName2", "cookieValue2");
//
//            Document doc = Jsoup.connect(res.url().toString()) // ??? this will route me back to the login page
//                    .cookies(res.cookies())    // add cookies from successful log in call
//                    .method(Connection.Method.GET)
//                    .get();
//
//            return doc;

//            form_sent: 1
//            redirect_url: https://team-simple.org/forum/index.php
//            req_username: scrappertest
//            req_password: scrappertest
//            login: Login

//            https://team-simple.org/forum/login.php?action=in


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
