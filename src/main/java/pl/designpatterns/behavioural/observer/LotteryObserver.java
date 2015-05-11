package pl.designpatterns.behavioural.observer;

import java.util.List;

public interface LotteryObserver {

    void notifyResults(List<Integer> arrayOfNumbers);

}
