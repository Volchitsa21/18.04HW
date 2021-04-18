import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ComputerAppl {
    public static void main(String[] args) {
        LinkedHashMap<Computer, Double> linkedHashMap = new LinkedHashMap<>();
        Computer comp1 = new Computer("Lenovo","Intel i7", 8);
        Computer comp2 = new Computer("HP","Intel i7", 8);
        Computer comp3 = new Computer("Apple"," M1", 12);
        Computer comp4 = new Computer("Lenovo","AMD Ryzen 7", 8);
        Computer comp5 = new Computer("HP","iCore i5", 8);

        linkedHashMap.put(comp1, 1.0);
        linkedHashMap.put(comp2, 2.0);
        linkedHashMap.put(comp3, 3.0);
        linkedHashMap.put(comp4, 4.0);
        linkedHashMap.put(comp5, 5.0);
        //linkedHashMap.put(new Computer("LEgion", "AMD", 2), 23.0);

        System.out.println(getСomputersLighter(linkedHashMap, 4.0));
    }

    public static List<Computer> getСomputersLighter(Map<Computer, Double> comps, Double toWeigh) {
        List<Computer> result = new ArrayList<>();
        for (Map.Entry entry : comps.entrySet()) {
            if ((double) entry.getValue() <= toWeigh) {
                result.add((Computer) entry.getKey());
            }
        }

        return result;
    }
}
