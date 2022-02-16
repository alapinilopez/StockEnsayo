package edu.poniperro.stockx.criteria;

import edu.poniperro.stockx.item.Bid;
import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bids implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers().
                stream().
                filter(o -> o instanceof Bid).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
    }
}
