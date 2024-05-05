package fit.vutbr.HtmlScrapperDemo.mobilePhonesDemo;


import fit.vutbr.HtmlScrapper.annotations.CssSelect;

@CssSelect(".col-md-6.col-xl-4")
public class MobilePhone {
    @CssSelect("h3 > a")
    private String modelName;

    @CssSelect(".item-rating span.bold")
    private Double rating;

    @CssSelect("div.item-description p")
    private String description;

    @CssSelect("div[class=\"actual \"] ")
    private String priceCzk;


    public MobilePhoneProcessed getProcessed() {
        MobilePhoneProcessed processed = new MobilePhoneProcessed();
        processed.setModelName(
                modelName == null ? null : modelName.replace("Mobilní telefon ", "")
        );
        processed.setPriceCzk(priceCzk == null ? null : priceCzk.replace("&nbsp;", ""));
        processed.setRating(rating);

        if (description != null) {
            String[] descriptionParts = description.split("•");

            processed.setScreenSize(descriptionParts[1].replace(" úhlopříčka ", ""));
            processed.setDisplay(descriptionParts[2]);
            processed.setResolution(descriptionParts[3]);

            Integer screenHz;
            if (descriptionParts[4].contains("Hz")) {
                screenHz = Integer.valueOf(
                        descriptionParts[4]
                                .replace(" obnovovací frekvence ", "")
                                .replace(" Hz ", "")
                );
            } else {
                screenHz = null;
            }

            processed.setScreenHz(screenHz);
            processed.setProcessor(descriptionParts[5]);
            processed.setInternalMemory(descriptionParts[6]);
        }

        return processed;
    }
}
