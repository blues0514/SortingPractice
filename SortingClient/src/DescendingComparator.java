public class DescendingComparator implements SorterItemComparator {
    @Override
    public boolean isSwappable(int lhs, int rhs) {
        return lhs < rhs;
    }
}
