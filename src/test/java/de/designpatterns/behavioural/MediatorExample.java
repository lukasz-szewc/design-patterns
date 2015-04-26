/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.behavioural;

import de.designpatterns.behavioural.mediator.AuctionCollegue;
import de.designpatterns.behavioural.mediator.AuctionMediator;
import de.designpatterns.behavioural.mediator.AuctionMediatorImpl;
import de.designpatterns.behavioural.mediator.PersonBidder;
import de.designpatterns.behavioural.mediator.RemoteBidder;
import de.designpatterns.template.DesignPatternTestTemplate;
import java.util.LinkedHashMap;
import java.util.Map;
import org.testng.annotations.Test;

/**
 *
 */
public class MediatorExample extends DesignPatternTestTemplate {

    public MediatorExample() {
        super("Mediator");
    }

    @Test(description = "Tests whether stopped engine starts.")
    public void testMediator() {
        AuctionMediator auctionMediator = new AuctionMediatorImpl();

        PersonBidder johnSmith = new PersonBidder("John Smith", auctionMediator);
        PersonBidder annConnor = new PersonBidder("Anne Connor", auctionMediator);

        RemoteBidder clientFromFrance = new RemoteBidder("Jean Michelle Jarre", "France", auctionMediator);
        RemoteBidder clientFromGermany = new RemoteBidder("Helmut Muller", "Germany", auctionMediator);

        LinkedHashMap<Double ,AuctionCollegue> auctionMap = new LinkedHashMap<Double, AuctionCollegue>();
        auctionMap.put(10d, annConnor);
        auctionMap.put(12d, johnSmith);
        auctionMap.put(16d, clientFromFrance);
        auctionMap.put(13d, annConnor);
        auctionMap.put(18d, johnSmith);
        auctionMap.put(19d, clientFromFrance);
        auctionMap.put(33d, clientFromGermany);

        for (Map.Entry<Double, AuctionCollegue> entry : auctionMap.entrySet()) {
            AuctionCollegue auctionCollegue = entry.getValue();
            Double price = entry.getKey();

            boolean accepted = auctionCollegue.bid(price);
            System.out.println(auctionCollegue.getName() + " bids " + price + " and is bid accepted? : " + accepted );

            System.out.println("[AUCTION} Current higest price: " + auctionMediator.getCurrentPrice() + " Current bidder: " + auctionMediator.getHighestBidderName());

        }


    }
}
