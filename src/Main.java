public class Main {

    public static void main(String[] args) {

        SalesManager week01 = new SalesManager(new int[]{15, 20, 21, 14, 16, 25, 30});
        System.out.println("максимальные продажи за указанный период: " + week01.max());
        System.out.println("минимальные продажи за указанный период: " + week01.min());
        System.out.println("общая сумма продажи за указанный период: " + week01.sum());
        System.out.println("размер указанного периода: " + week01.size());
        System.out.println("сумма обрезанного среднего: " + (week01.sum() - week01.max() - week01.min()) / (week01.size() - 2));

    }
}
