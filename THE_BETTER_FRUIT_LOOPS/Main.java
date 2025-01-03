package THE_BETTER_FRUIT_LOOPS;

public class Main {
    public static void main(String[] args) {
        int[] nums13 = {10, 20, 10, 30, 10, 20, 10, 30, 10, 20, 10, 30};
        int streak1 = ArrayAlgorithms.longestStreak(nums13);
        System.out.println(streak1);
        int[] nums14 = {10, 10, 20, 20, 20, 30, 30, 30, 30, 40, 40, 50};
        int streak2 = ArrayAlgorithms.longestStreak(nums14);
        System.out.println(streak2);
        int[] nums15 = {10, 10, 10, 10, 10, 10, 20, 20, 30, 30, 30, 30};
        int streak3 = ArrayAlgorithms.longestStreak(nums15);
        System.out.println(streak3);
        int[] nums16 = {20, 20, 30, 30, 30, 30, 10, 10, 10, 10, 10, 10};
        int streak4 = ArrayAlgorithms.longestStreak(nums16);
        System.out.println(streak4);
        int[] nums17 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int streak5 = ArrayAlgorithms.longestStreak(nums17);
        System.out.println(streak5);
    
    
    }
 }
 
 