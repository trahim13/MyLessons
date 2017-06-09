package resources;

import java.util.ListResourceBundle;

public class resource_en extends ListResourceBundle {
    private static final Object[][] contains = {
            {"samevalue", "Thi is the English text from class extend ListResourceBundle"}
    };

    @Override
    protected Object[][] getContents() {
        return contains;
    }
}
