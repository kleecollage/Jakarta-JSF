package beans.helper;

import beans.model.Suburb;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.model.SelectItem;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class SuburbHelper {
    public List<Suburb> getSuburbs() {
        List<Suburb> suburbs = new ArrayList<>();
        int suburbId = 1;
        Suburb suburb = new Suburb(suburbId++, "Napoles", 3810);
        suburbs.add(suburb);

        suburb = new Suburb(suburbId++, "Polanco", 11530);
        suburbs.add(suburb);

        suburb = new Suburb(suburbId++, "Roma", 3100);
        suburbs.add(suburb);

        return suburbs;
    }

    public int getSuburbIdByName(String suburbName) {
        int suburbId = 0;
        List<Suburb> suburbs = this.getSuburbs();

        for (Suburb suburb : suburbs) {
            if (suburb.getSuburbName().equals(suburbName)) {
                suburbId = suburb.getSuburbId();
                break;
            }
        }

        return suburbId;
    }

    public int getSuburbIdByZipCode(int zipCode) {
        int suburbId = 0;
        List<Suburb> suburbs = this.getSuburbs();

        for (Suburb suburb : suburbs) {
            if (suburb.getZipCode() == zipCode) {
                suburbId = suburb.getSuburbId();
                break;
            }
        }

        return suburbId;
    }

    public List<SelectItem> getSelectItems() {
        List<SelectItem> selectItems = new ArrayList<>();
        List<Suburb> suburbs = this.getSuburbs();

        for (Suburb suburb : suburbs) {
            SelectItem selectItem = new SelectItem(suburb.getSuburbId(), suburb.getSuburbName());
            selectItems.add(selectItem);
        }

        return selectItems;
    }
}











