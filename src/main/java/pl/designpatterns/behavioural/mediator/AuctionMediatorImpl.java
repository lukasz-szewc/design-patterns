/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.behavioural.mediator;

/**
 *
 */
public class AuctionMediatorImpl implements AuctionMediator {

    private double price;
    private AuctionCollegue highestBidder;

    @Override
    public boolean registerBid(AuctionCollegue auctionCollegue, double price) {
        if (price > this.price) {
            this.price = price;
            this.highestBidder = auctionCollegue;
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
