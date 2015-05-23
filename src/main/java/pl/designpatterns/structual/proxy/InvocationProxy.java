package pl.designpatterns.structual.proxy;

public class InvocationProxy implements PersonRetriever {
    private final Database database;
    private int interceptedInvocations;

    public InvocationProxy(Database database) {
        this.database = database;
    }

    @Override
    public Person retrievePerson(int id) {
        interceptedInvocations++;
        return database.retrievePerson(id);
    }

    public int interceptedInvocationsNumber() {
        return interceptedInvocations;
    }
}
