package pl.designpatterns.structual.adapter;

import java.util.List;

public interface NumberGenerator {

    Integer generateNumber();

    List<Integer> generateNumbersList(Integer howMany);

}
