package edu.poniperro.stockx.item;

public class Bid implements Offer {
    private String size;
    private Integer bid;

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
        return "Bid{" +
                "size='" + size + '\'' +
                ", bid=" + bid +
                '}';
    }
}
