package edu.poniperro.stockx.item;

import java.util.List;

public interface Item {


    int getBid();

    public void setBid(int bid);

    void add(Offer offer);

    List<Offer> offers();
}
