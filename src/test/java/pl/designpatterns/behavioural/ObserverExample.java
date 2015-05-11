package pl.designpatterns.behavioural;

import pl.designpatterns.behavioural.observer.LotteryObserver;
import pl.designpatterns.behavioural.observer.NumberLottery;
import pl.designpatterns.template.DesignPatternTestTemplate;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.testng.annotations.Test;

public class ObserverExample extends DesignPatternTestTemplate {

    public ObserverExample() {
        super("Observer");
    }

    @Test(description = "Tests basic observer.")
    public void testSimpleObserver() {
        NumberLottery numberLottery = new NumberLottery();
        for (LotteryObserver lotteryObserver : createObservers()) {
            numberLottery.registerObserver(lotteryObserver);
        }
        numberLottery.doTheLottery();
    }

    private Collection<LotteryObserver> createObservers() {
        HashSet<LotteryObserver> lotteryObserverSet = new HashSet<LotteryObserver>();
        {
            LotteryObserver lotteryObserver = new LotteryObserver() {
                @Override
                public void notifyResults(List<Integer> arrayOfNumbers) {
                    System.out.println("I am Thomas, and I got one number: " + 10);
                }
            };
            lotteryObserverSet.add(lotteryObserver);

        }

        {
            LotteryObserver lotteryObserver = new LotteryObserver() {
                @Override
                public void notifyResults(List<Integer> arrayOfNumbers) {
                    System.out.println("I am Ann I got five numbers, I am rich now! ");
                }
            };
            lotteryObserverSet.add(lotteryObserver);

        }

        {
            LotteryObserver lotteryObserver = new LotteryObserver() {
                @Override
                public void notifyResults(List<Integer> arrayOfNumbers) {
                    System.out.println("I am Peter and I got nothing :( ");
                }
            };
            lotteryObserverSet.add(lotteryObserver);

        }
        return lotteryObserverSet;
    }
}
