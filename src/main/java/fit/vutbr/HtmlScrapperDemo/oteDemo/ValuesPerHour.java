package fit.vutbr.HtmlScrapperDemo.oteDemo;

import fit.vutbr.HtmlScrapper.anotations.CssSelect;
import fit.vutbr.HtmlScrapper.anotations.XPathSelect;

@XPathSelect("(//tbody)[2]/tr[position() <= 24]")
public class ValuesPerHour {
    @CssSelect("th")
    private Integer hour;
    @XPathSelect("td[1]")
    private Double price;
    @XPathSelect("td[2]")
    private Double volume;
    @XPathSelect("td[3]")
    private Double saldo;
    @XPathSelect("td[4]")
    private Double exp;
    @XPathSelect("td[5]")
    private Double imp;

    public Integer getHour() {
        return hour;
    }

    public Double getPrice() {
        return price;
    }

    public Double getVolume() {
        return volume;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getExp() {
        return exp;
    }

    public Double getImp() {
        return imp;
    }
}
