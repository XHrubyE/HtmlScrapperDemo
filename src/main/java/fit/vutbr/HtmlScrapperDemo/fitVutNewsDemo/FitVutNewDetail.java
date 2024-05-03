package fit.vutbr.HtmlScrapperDemo.fitVutNewsDemo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import fit.vutbr.HtmlScrapper.annotations.CssSelect;
import fit.vutbr.HtmlScrapper.annotations.DateTimePattern;
import fit.vutbr.HtmlScrapper.scrapper.ScrapperUtils;

import java.time.LocalDate;

public class FitVutNewDetail {

    @DateTimePattern("d MMMM yyyy")
    @CssSelect("strong")
    private LocalDate date;

    @CssSelect(".b-detail__title")
    private String title;

    @CssSelect(".b-detail__content")
    private String content;

    @CssSelect(".b-detail__body .holder div")
    private String pictureHtml;

    public LocalDate getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getPictureHtml() {
        return ScrapperUtils.extractAttributeValue(pictureHtml, "img", "src");
    }
}
