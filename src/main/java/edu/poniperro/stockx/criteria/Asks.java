package edu.poniperro.stockx.criteria;

import edu.poniperro.stockx.item.Ask;
import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Asks implements Criteria{
    public Asks() {}

    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers().
                stream().
                filter(o -> o instanceof Ask).
                sorted().
                collect(Collectors.toList());
    }
}
