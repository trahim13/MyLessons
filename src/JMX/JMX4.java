package JMX;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JMX4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("CC");
        list.add("cc");
        list.add("A");
        list.add("bb");
        list.add("zz");
        list.add("aa");
        list.add("AA");
        list.add("aa");

        Collator collator = Collator.getInstance();
        collator.setStrength(Collator.PRIMARY);
        collator.setStrength(Collator.SECONDARY);
        collator.setStrength(Collator.TERTIARY);
        Collections.sort(list, collator);
        for (String a :
                list) {
            System.out.println(a);
        }




    }
}
