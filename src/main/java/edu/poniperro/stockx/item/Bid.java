package edu.poniperro.stockx.item;

public class Bid implements Offer {
    private final String size;
    private final Integer bid;

    public Bid(String size, Integer bid) {
        this.size = size;
        this.bid = bid;
    }

    public String size() {
        return size;
    }

    public int value() {
        return this.bid.intValue();
    }

    @Override
    public int compareTo(Offer bid) {

        return this.bid.compareTo(bid.value());
    }


    @Override
    public String toString() {
        return "\t\t" + this.size() + "\t" + this.value() +"\n";
    }
}
