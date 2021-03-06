package edu.poniperro.stockx.item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {
    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;

    private List<Offer> offers = new ArrayList<Offer>();

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public Object getStyle() {
        return style;
    }

    public Object getName() {
        return name;
    }

    @Override
    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    @Override
    public int getBid(){
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public int getAsk() {
        return ask;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }


    @Override
    public void add(Offer offer) {
        this.offers.add(offer);
    }

    @Override
    public List<Offer> offers() {
        return this.offers;
    }

    @Override
    public String toString() {
        return
                style + '\'' + name;
    }
}
