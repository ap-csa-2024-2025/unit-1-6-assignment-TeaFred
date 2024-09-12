public class Problem2
{
    public static void main(String[] args)
    {
        double num1 = 57.3934;
        double num2 = 22.5211;
        int round1 = (int) (num1 + 0.5);
        int round2 = (int) (num2 + 0.5);
        int sum = round1 + round2;
        System.out.println("Two original numbers: ");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("The answer is " + round1 + " + " + round2 + " = " + sum);
    }
}
