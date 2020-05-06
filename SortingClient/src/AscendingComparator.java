public class AscendingComparator implements SorterItemComparator {
    @Override
    public boolean isSwappable(int lhs, int rhs) {
        return lhs > rhs;
    }
}
