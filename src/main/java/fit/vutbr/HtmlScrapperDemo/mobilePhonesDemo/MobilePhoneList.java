package fit.vutbr.HtmlScrapperDemo.mobilePhonesDemo;



import fit.vutbr.HtmlScrapper.annotations.ObjectSelect;

import java.util.List;
import java.util.stream.Collectors;


public class MobilePhoneList {
    @ObjectSelect
    private List<MobilePhone> mobilePhones;

    public List<MobilePhoneProcessed> getMobilePhones() {
        return mobilePhones.stream().map(MobilePhone::getProcessed).collect(Collectors.toList());
    }
}
