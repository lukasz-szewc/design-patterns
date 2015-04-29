/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.behavioural.mediator;

/**
 *
 */
public class PersonBidder implements AuctionCollegue {

    private String name;
    private final AuctionMediator mediator;

    public PersonBidder(String name, AuctionMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean bid(double price) {
        return mediator.registerBid(this, price);
    }

}
