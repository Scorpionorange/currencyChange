public class currencyChanging {
    public static void main(String[] args){
        //Test 1:"Please input correct CurrencyList."
        //int A = testStartPoint(30, new int[]{});

        //Test 2:"Total is too small, and no way to change."
        //int A = testStartPoint(5, new int[]{100, 50, 20, 10});

        int A = testStartPoint(1, new int[]{100, 50, 20, 10, 5, 1});
        System.out.println(A);
        currencyChange(76, new int[]{100, 50, 20, 10, 5, 1});
    }
    public static int testStartPoint(int total, int[] currencyList){
        int start = 0;
        if(currencyList.length == 0){
            start = -1;
            System.out.println("Please input correct CurrencyList.");
        }
        else if(total < currencyList[currencyList.length-1]){
            start = -1;
            System.out.println("Total is too small, and no way to change.");
        }
        else {
            if(total >= currencyList[0]){
                start = 0;
            }
            for(int i = 0; i < currencyList.length - 1; i++){
                if((total < currencyList[i]) && (total >= currencyList[i + 1])){
                    start = i + 1;
                }
            }
        }
        return start;
    }

    public static void currencyChange(int total, int[] currencyList){
        int start = testStartPoint(total, currencyList);
        System.out.print(total + " = ");
        while ((start > -1)){
            System.out.print(currencyList[start] + " + ");
            total = total - currencyList[start];
            start = testStartPoint(total, currencyList);
        }

        /*
        total = total - currencyList[start];
        start = testStartPoint(total, currencyList);
        System.out.println(currencyList[start] + " ");
        System.out.println("start = " + start);

        total = total - currencyList[start];
        start = testStartPoint(total, currencyList);
        System.out.println(currencyList[start] + " ");
        System.out.println("start = " + start);

        total = total - currencyList[start];
        start = testStartPoint(total, currencyList);
        System.out.println(currencyList[start] + " ");
        System.out.println("start = " + start);

        total = total - currencyList[start];
        start = testStartPoint(total, currencyList);
        //System.out.println(currencyList[start] + " ");
        System.out.println("start = " + start);
        */
    }
}
