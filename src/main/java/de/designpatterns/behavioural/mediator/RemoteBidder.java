/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.behavioural.mediator;

/**
 *
 */
public class RemoteBidder implements AuctionCollegue {

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
        return name + " remotelly from " + country;
    }

    @Override
    public boolean bid(double price) {
        if (mediator.getCurrentPrice() >= price) {
            return false;
        }
        return mediator.registerBid(this, price);
    }

}
