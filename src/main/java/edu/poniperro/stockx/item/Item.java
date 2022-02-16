package edu.poniperro.stockx.item;

import java.util.List;

public interface Item {


    int getBid();

    int getAsk();

    int getSale();

    public void setBid(int bid);

    void add(Offer offer);

    List<Offer> offers();
}
