package JavaFX;


import javafx.beans.binding.IntegerBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class FX5 {
    public static void main(String[] args) {
        IntegerProperty integerProperty = new SimpleIntegerProperty(5);
        integerProperty.set(6);
//        System.out.println(integerProperty.get());

        IntegerProperty integerProperty2 = new ReadOnlyIntegerWrapper(8);
        integerProperty2.set(9);
//        System.out.println(integerProperty2.get());

        Number value = integerProperty.add(integerProperty2).getValue();
        System.out.println(value);

        IntegerBinding integerBinding = new IntegerBinding() {
            {
                super.bind(integerProperty, integerProperty2);
            }

            @Override
            protected int computeValue() {
                return integerProperty.get() + integerProperty2.get();

            }
        };

        System.out.println("integrBindind = "+integerBinding.get());
        integerProperty.set(10);
        System.out.println("integerBinding = "+integerBinding.get());

integerProperty.addListener(new ChangeListener<Number>() {
    @Override
    public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
        System.out.println("new value " + newValue);
    }
});
//        integerProperty.bind(integerProperty2);
//        integerProperty2.set(10);
//
//        System.out.println(integerProperty.get());
//        System.out.println(integerProperty2.get());

        integerProperty.bindBidirectional(integerProperty2);
        integerProperty.set(19);

        System.out.println(integerProperty.get());
        System.out.println(integerProperty2.get());
    }
}
