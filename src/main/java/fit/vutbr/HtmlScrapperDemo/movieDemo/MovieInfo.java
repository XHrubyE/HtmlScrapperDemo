package fit.vutbr.HtmlScrapperDemo.movieDemo;

import fit.vutbr.HtmlScrapper.annotations.XPathSelect;

public class MovieInfo {
    @XPathSelect("div[2]/span[1]")
    private Integer year;
    @XPathSelect("div[2]/span[2]")
    private String duration;
    @XPathSelect("div[2]/span[3]")
    private String ageRating;

    public Integer getYear() {
        return year;
    }

    public String getDuration() {
        return duration;
    }

    public String getAgeRating() {
        return ageRating;
    }
}