package fit.vutbr.HtmlScrapperDemo.oteDemo;



import fit.vutbr.HtmlScrapper.annotations.ObjectSelect;

import java.util.List;

public class Ote {
    @ObjectSelect
    private List<ValuesPerHour> values;

    public List<ValuesPerHour> getValues() {
        return values;
    }
}
