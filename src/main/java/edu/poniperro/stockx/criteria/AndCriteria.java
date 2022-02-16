package edu.poniperro.stockx.criteria;

import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> firstCriteriaItems = criteria.checkCriteria(sneaker);
        List<Offer> otherCriteriaItems = otherCriteria.checkCriteria(sneaker);

        List<Offer> items = new ArrayList<Offer>();
        for (Offer offer : otherCriteriaItems)
}
