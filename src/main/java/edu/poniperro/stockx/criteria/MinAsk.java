package edu.poniperro.stockx.criteria;

import edu.poniperro.stockx.item.Ask;
import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

import java.util.List;
import java.util.Optional;

public class MinAsk implements Criteria{
    public MinAsk (){}

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Optional<Offer> min =  sneaker.offers().
                stream().
                filter(o -> o instanceof Ask).
                min(Offer::compareTo);
        return min.map(List::of).orElseGet(List::of);
    }
}
