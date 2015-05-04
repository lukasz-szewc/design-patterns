package pl.designpatterns.behavioural;

import pl.designpatterns.behavioural.mediator.AuctionColleague;
import pl.designpatterns.behavioural.mediator.AuctionMediator;
import pl.designpatterns.behavioural.mediator.AuctionMediatorImpl;
import pl.designpatterns.behavioural.mediator.PersonBidder;
import pl.designpatterns.behavioural.mediator.RemoteBidder;
import pl.designpatterns.template.DesignPatternTestTemplate;
import java.util.LinkedHashMap;
import java.util.Map;
import org.testng.annotations.Test;

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

        LinkedHashMap<Double ,AuctionColleague> auctionMap = new LinkedHashMap<Double, AuctionColleague>();
        auctionMap.put(10d, annConnor);
        auctionMap.put(12d, johnSmith);
        auctionMap.put(16d, clientFromFrance);
        auctionMap.put(13d, annConnor);
        auctionMap.put(18d, johnSmith);
        auctionMap.put(19d, clientFromFrance);
        auctionMap.put(33d, clientFromGermany);

        for (Map.Entry<Double, AuctionColleague> entry : auctionMap.entrySet()) {
            AuctionColleague auctionColleague = entry.getValue();
            Double price = entry.getKey();

            boolean accepted = auctionColleague.bid(price);
            System.out.println(auctionColleague.getName() + " bids " + price + " and is bid accepted? : " + accepted );

            System.out.println("[AUCTION} Current higest price: " + auctionMediator.getCurrentPrice() + " Current bidder: " + auctionMediator.getHighestBidderName());

        }


    }
}
