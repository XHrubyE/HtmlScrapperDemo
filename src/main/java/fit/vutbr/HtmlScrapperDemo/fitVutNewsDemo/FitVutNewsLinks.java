package fit.vutbr.HtmlScrapperDemo.fitVutNewsDemo;

import fit.vutbr.HtmlScrapper.annotations.ObjectSelect;
import fit.vutbr.HtmlScrapper.scrapper.ScrapperUtils;

import java.util.List;
import java.util.stream.Collectors;

public class FitVutNewsLinks {
    @ObjectSelect
    private List<ArticleTab> ArticleTabs;

    public List<String> getLinks() {
        return ArticleTabs.stream().map(tab -> ScrapperUtils.extractAttributeValue(tab.getArticleHtml(), "a", "href")).collect(Collectors.toList());
    }
}
