package ucf.assignments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Inventory {

    public static List<Items> allItems = new ArrayList<>();

    public static void sortSerial()
    {
        allItems.sort(Comparator.comparing(o -> o.Serial.toLowerCase()));
    }

    public static void sortName()
    {
        allItems.sort(Comparator.comparing(o -> o.name.toLowerCase()));
    }

    public static void sortValue()
    {
        allItems.sort(Comparator.comparing(o -> o.value));
    }
}
