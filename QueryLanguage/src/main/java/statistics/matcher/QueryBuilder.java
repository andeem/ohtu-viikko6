package statistics.matcher;

import java.util.ArrayList;

public class QueryBuilder {

    private ArrayList<Matcher> matcher;

    public QueryBuilder() {
        matcher = new ArrayList();
    }
    public Matcher build() {
        Matcher[] m = matcher.toArray(new Matcher[0]);
        matcher.clear();
        return new And(m);
    }

    public QueryBuilder playsIn(String team) {
        this.matcher.add(new PlaysIn(team));
        return this;

    }

    public QueryBuilder hasFewerThan(int value, String category) {
        this.matcher.add(new HasFewerThan(value, category));
        return this;

    }

    public QueryBuilder hasAtLeast(int value, String category) {
        this.matcher.add(new HasAtLeast(value, category));
        return this;

    }

    public QueryBuilder oneOf(Matcher... m) {
        this.matcher.clear();
        this.matcher.add(new Or(m));
        return this;

    }
}
