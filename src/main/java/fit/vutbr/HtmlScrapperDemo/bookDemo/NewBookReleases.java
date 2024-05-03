package fit.vutbr.HtmlScrapperDemo.bookDemo;

import fit.vutbr.HtmlScrapper.annotations.ObjectSelect;

import java.util.List;
import java.util.stream.Collectors;

public class NewBookReleases {
    @ObjectSelect
    private List<BookImgValue> bookImgValueList;

    public List<BookImgProcessed> getNewReleases() {
        return bookImgValueList.stream().map(BookImgValue::getProcessed).collect(Collectors.toList());
    }

}
