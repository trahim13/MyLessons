package resources;

import java.util.ListResourceBundle;

public class resource_ru extends ListResourceBundle {
    private static final Object[][] contains = {
            {"samevalue", "Это текст локализации получекнный " +
                    "из класса расширяющего ListResourseBundle"},
            {"sameValue", "Это текст локализации получекнный " +
                    "из класса расширяющего ListResourseBundle по адресу массива 1 0"}
    };


    @Override
    protected Object[][] getContents() {
        return contains;
    }
}
