package edu.poniperro.stockx.item;

public interface Offer {

    public String size();

    public int value();

    public int compareTo(Offer offer);
}
