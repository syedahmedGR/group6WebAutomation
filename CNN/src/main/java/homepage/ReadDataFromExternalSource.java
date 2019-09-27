package homepage;

import java.util.ArrayList;
import java.util.List;

public class ReadDataFromExternalSource {

    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Weather");
        itemsList.add("Football");
        itemsList.add("sports");
        itemsList.add("US ");
        itemsList.add("Entertainment");
        itemsList.add("Health");
        itemsList.add("Businness");
        itemsList.add("Style");

        return itemsList;
    }
}
