package pl.designpatterns.behavioural.mediator;

public interface AuctionMediator {

    public boolean registerBid(AuctionColleague auctionColleague, double price);

    public double getCurrentPrice();

    public String getHighestBidderName();
}
