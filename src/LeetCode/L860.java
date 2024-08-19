package LeetCode;
class LemonadeChange {

    public static boolean lemonadeChange(int[] bills) {
        int fiveCount = 0;
        int tenCount = 0;

        for (int bill : bills) {
            if (bill == 5) {
                fiveCount++;
            } else if (bill == 10) {
                if (fiveCount == 0) {
                    return false;
                }
                fiveCount--;
                tenCount++;
            } else if (bill == 20) {
                if (tenCount > 0 && fiveCount > 0) {
                    tenCount--;
                    fiveCount--;
                } else if (fiveCount >= 3) {
                    fiveCount -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int bills[] = {5, 5, 5, 10, 20};
        boolean output = lemonadeChange(bills);
        System.out.println(output);  // This will print: true
    }
}
