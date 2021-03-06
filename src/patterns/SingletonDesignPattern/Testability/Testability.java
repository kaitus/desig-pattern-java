package patterns.SingletonDesignPattern.Testability;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class Testability {

    @Test
    public void isSingletonTest()
    {
        SingletonDatabase db = SingletonDatabase.getInstance();
        SingletonDatabase db2 = SingletonDatabase.getInstance();
        assertSame(db, db2);
        assertEquals(1, SingletonDatabase.getCount());
    }

    @Test
    public void singletonTotalPopulationTest()
    {
        // testing on a live database
        SingletonRecordFinder rf = new SingletonRecordFinder();
        //List<String> names = List.of("Seoul", "Mexico City");
        List<String> names = new ArrayList<>();
        names.add("Seoul");
        names.add("Mexico City");
        int tp = rf.getTotalPopulation(names);
        assertEquals(17500000+17400000, tp);
    }

    @Test
    public void dependentPopulationTest()
    {
        DummyDatabase db = new DummyDatabase();
        ConfigurableRecordFinder rf = new ConfigurableRecordFinder(db);
        List type = new ArrayList();
        type.add("alpha");
        type.add("gamma");
        assertEquals(4, rf.getTotalPopulation(
                type
        ));
    }
}
