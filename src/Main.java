public class Main {

    public static void main(String[] args){

        SalesManager week01 = new SalesManager(new int[] {15, 20, 21, 14, 16, 25, 30});
        System.out.println("максимальные продажи за указанный период: " + week01.max());
    }
}
