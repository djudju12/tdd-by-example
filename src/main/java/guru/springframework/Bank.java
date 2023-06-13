package guru.springframework;

import java.util.HashMap;

public class Bank {

    private HashMap<Pair, Integer> rateMap = new HashMap<>();

    Money reduce(Expression source, String toCurrency) {
        return source.reduce(this, toCurrency);
    }

    public void addRate(String from, String to, int rate) {
        rateMap.put(new Pair(from, to), rate);
    }

    public int rate(String from, String to) {
        if (to.equals(from))
            return 1;
        return rateMap.get(new Pair(from, to));
    }
}
