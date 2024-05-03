package fit.vutbr.HtmlScrapperDemo.bookDemo;

import fit.vutbr.HtmlScrapper.annotations.CssSelect;
import fit.vutbr.HtmlScrapper.scrapper.ScrapperUtils;

@CssSelect(".bigBoxBody .coverWrapper")
public class BookImgValue {
    @CssSelect("a")
    private String imageHtml;

    public String getImageHtml() {
        return imageHtml;
    }

    public BookImgProcessed getProcessed() {
        BookImgProcessed processed = new BookImgProcessed();
        processed.setTitle(ScrapperUtils.extractAttributeValue(imageHtml, "img", "alt"));
        processed.setImage(ScrapperUtils.extractAttributeValue(imageHtml, "img", "src"));

        return processed;
    }
}
