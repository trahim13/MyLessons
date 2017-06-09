package resources;

import java.util.ListResourceBundle;

public class resource_fr extends ListResourceBundle {
    private static final Object[][] contains = {
            {"samevalue", "Thi is the FRENCH text from class extend ListResourceBundle"}
    };

    @Override
    protected Object[][] getContents() {
        return contains;
    }
}
