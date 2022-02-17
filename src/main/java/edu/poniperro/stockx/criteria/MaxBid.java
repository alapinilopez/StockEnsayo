package edu.poniperro.stockx.criteria;

import edu.poniperro.stockx.item.Bid;
import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

import java.util.List;
import java.util.Optional;

public class MaxBid implements Criteria{
    public MaxBid () {}

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Optional<Offer> max = sneaker.offers().
                stream().
                filter(o -> o instanceof Bid).
                max(Offer::compareTo);

        return max.map(List::of).orElseGet(List::of);
    }
}
