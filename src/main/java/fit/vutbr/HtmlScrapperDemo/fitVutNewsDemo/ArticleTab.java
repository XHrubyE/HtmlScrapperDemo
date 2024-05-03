package fit.vutbr.HtmlScrapperDemo.fitVutNewsDemo;

import fit.vutbr.HtmlScrapper.annotations.CssSelect;

@CssSelect("#content li")
public class ArticleTab {
    @CssSelect("article")
    private String articleHtml;

    public String getArticleHtml() {
        return articleHtml;
    }
}
