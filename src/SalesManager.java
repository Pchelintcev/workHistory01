public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    //TODO минимальное значение:
    public int min() {
        int min = sales[0] + 1;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    //TODO сумма всех ячеек:
    public int sum() {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //TODO размер массива:
    public int size() {
        int size = sales.length;
        return size;
    }
}