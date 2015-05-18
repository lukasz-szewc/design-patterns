package pl.designpatterns.creational.factorymethod;

class MobilePhone implements Product {

    @Override
    public String presentYourself() {
        return "I am a mobile Phone- smartphone actually!";
    }

}
