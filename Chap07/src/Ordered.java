public interface Ordered {
    public boolean precedes(Object other);

    // NOTE: o1.follows(o2) == o2.precedes(o1)
    public boolean follows(Object other);
}
