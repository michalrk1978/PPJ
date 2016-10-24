package zadanie2s78;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Napisy {
    Map<String, Integer> map;

    public Napisy() {
        map = new TreeMap<String, Integer>();
    }

    public void dodaj(String napis) {
        int tmp = 0;
        if(map.get(napis) != null){
            tmp = map.get(napis);
        }
        map.put(napis, ++tmp);
    }

    public String toString() {
        String wynik = "";
        String tmp;
        Set<String> napisy = map.keySet();
        for (Iterator<String> i = napisy.iterator(); i.hasNext(); ) {
            tmp = i.next();
            wynik += tmp + " " + map.get(tmp) + ", ";
        }
        return wynik;
    }
}
