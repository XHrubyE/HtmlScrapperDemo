package fit.vutbr.HtmlScrapperDemo.loginDemo;

import fit.vutbr.HtmlScrapper.annotations.CssSelect;
import fit.vutbr.HtmlScrapper.annotations.XPathSelect;

public class LoginConfirmation {
    @CssSelect("#brdwelcome span")
    private String loginMessage;

    @XPathSelect("//*[@id='brdwelcome']/ul/li[2]/span")
    private String lastVisited;

    public String getLoginMessage() {
        return loginMessage;
    }

    public String getLastVisited() {
        return lastVisited;
    }
}
