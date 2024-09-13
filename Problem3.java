public class Problem3
{
    public static void main(String[] args)
    {
        double decimalNum = 67.3424;
        int semiFinalNum;
        int intNum = (int) decimalNum;
        double simplifiedNum = decimalNum - intNum;
        //.3424 is left
        int semiFinalNum = (int) simplifiedNum * 1000;
        System.out.println(semiFinalNum);
        int finalNum = semiFinalNum/10;
        System.out.println(finalNum/100);
        System.out.println(finalNum/10%10);
        System.out.println(finalNum%10);
    }
}
