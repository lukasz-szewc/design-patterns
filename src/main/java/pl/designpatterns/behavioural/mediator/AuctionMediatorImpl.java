
package pl.designpatterns.behavioural.mediator;

public class AuctionMediatorImpl implements AuctionMediator {

    private double price;
    private AuctionColleague highestBidder;

    @Override
    public boolean registerBid(AuctionColleague auctionColleague, double price) {
        if (price > this.price) {
            this.price = price;
            this.highestBidder = auctionColleague;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getCurrentPrice() {
        return price;
    }

    @Override
    public String getHighestBidderName() {
        return highestBidder.getName();
    }

}
