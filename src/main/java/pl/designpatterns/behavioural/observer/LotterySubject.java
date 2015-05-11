package pl.designpatterns.behavioural.observer;

import java.util.List;

public interface LotterySubject {

    void registerObserver(LotteryObserver lotteryObserver);

    void detachObserver(LotteryObserver lotteryObserver);

    List<Integer> doTheLottery();
}
