public class SalesManager {

    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    //TODO максимальное значение:
    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    //TODO минимальное значение:
    public long min() {
        long min = sales[0] + 1;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    //TODO сумма всех ячеек:
    public long sum() {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //TODO размер массива:
    public long size() {
        long size = sales.length;
        return size;
    }

    public long average() {
        long average = (sum() - max() - min()) / (size() - 2);
        return average;
    }
}