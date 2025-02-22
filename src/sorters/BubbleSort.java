package sorters;

public class BubbleSort extends Sorter {
    @Override
    public String getName() {
        return "Bubble Sort";
    }

    @Override
    public void sort(int delay, boolean sortAscending) {
        shouldStop = false;
        boolean sorted = false;
        int iterations = 0;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < model.getArrayLength() - 1 - iterations; i++) {
                if (shouldStop) {
                    return;
                }

                if (inOrder(controller.getNumAtIndex(i+1), controller.getNumAtIndex(i), sortAscending)) {
                    controller.swapIndexes(i, i+1);
                    sorted = false;

                    sleep(delay);
                }
            }
            iterations++;
        }
    }
}
