/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.behavioural.mediator;

/**
 *
 */
public interface AuctionMediator {

    public boolean registerBid(AuctionCollegue auctionCollegue , double price);

    public double getCurrentPrice();

    public String getHighestBidderName();
}
