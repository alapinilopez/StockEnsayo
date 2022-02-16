package edu.poniperro.stockx.criteria;

import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

import java.util.List;

public interface Criteria {

    List<Offer> checkCriteria(Item sneaker);
}
