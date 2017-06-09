package JavaFX;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class FX19_Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        ObservableList<String> obsevableList = FXCollections.observableList(list);
        obsevableList.addListener(new ListChangeListener<String>() {
            @Override
            public void onChanged(Change<? extends String> c) {
                System.out.println("Element was add in ObservableList");
            }
        });


        list.add("one");
        obsevableList.add("two");
        System.out.println("in list");
        for (String a :
             list) {
            System.out.println(a);

        }
        System.out.println("in observableList");
        for (String a :
                obsevableList) {
            System.out.println(a);
        }

        System.out.println("size");
        System.out.println(list.size());
        System.out.println(obsevableList.size());

        obsevableList.add("new value");

        System.out.println("in observableList");
        for (String a :
                obsevableList) {
            System.out.println(a);
        }


        System.out.println("in new list");
        for (String a :
                list) {
            System.out.println(a);

        }

    }





}
