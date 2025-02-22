package sorters;

public class BogoSort extends Sorter {
    @Override
    public String getName() {
        return "Bogo Sort";
    }

    @Override
    public void sort(int delay, boolean sortAscending) {
        shouldStop = false;
        while (!controller.isSorted(sortAscending)) {
            if (shouldStop) {
                return;
            }

            controller.shuffle();

            sleep(delay);
        }
    }
}
