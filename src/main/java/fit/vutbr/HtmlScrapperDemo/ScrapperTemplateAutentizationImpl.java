package fit.vutbr.HtmlScrapperDemo;

import fit.vutbr.HtmlScrapper.scrapper.ScrapperTemplate;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class ScrapperTemplateAutentizationImpl extends ScrapperTemplate {
    @Override
    protected Document getDocumentFromUrl(String url) {
        try {
            System.out.println("NEW IMPLS");
//                        Connection.Response res = Jsoup.connect("http://techmvs.technion.ac.il:80/cics/wmn/wmngrad?aapmlkwi&ORD=1&s=1")
//                    .data("username", "myUsername", "password", "myPassword")
//                    .method(Method.POST)
//                    .execute();
//            Map<String, String> loginCookies = res.cookies();
//            Document doc = Jsoup.connect("urlYouNeedToBeLoggedInToAccess")
//                    .cookies(loginCookies)
//                    .get();
            return Jsoup.connect(url).get();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
