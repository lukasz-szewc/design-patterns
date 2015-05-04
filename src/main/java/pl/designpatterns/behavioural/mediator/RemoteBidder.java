package pl.designpatterns.behavioural.mediator;

public class RemoteBidder implements AuctionColleague {

    private final String name;
    private final String country;
    private final AuctionMediator mediator;

    public RemoteBidder(String name, String country, AuctionMediator mediator) {
        this.name = name;
        this.country = country;
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return name + " remotely from " + country;
    }

    @Override
    public boolean bid(double price) {
        return mediator.getCurrentPrice() < price && mediator.registerBid(this, price);
    }

}
