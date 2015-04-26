/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.behavioural.observer;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/**
 *
 */
public class NumberLottery implements LotterySubject {

    private final LinkedHashSet<LotteryObserver> observersSet;

    public NumberLottery() {
        observersSet = new LinkedHashSet<LotteryObserver>();
    }

    @Override
    public void registerObserver(LotteryObserver lotteryObserver) {
        observersSet.add(lotteryObserver);
    }

    @Override
    public void detachObserver(LotteryObserver lotteryObserver) {
        observersSet.remove(lotteryObserver);
    }

    @Override
    public List<Integer> doTheLottery() {
        List<Integer> list = Arrays.asList(10,20,30,40,50,60);
        System.out.println("Picked numbers : " + list);

        for (LotteryObserver lotteryObserver : observersSet) {
            lotteryObserver.notifyResults(list);
        }
        return list;
    }
}
