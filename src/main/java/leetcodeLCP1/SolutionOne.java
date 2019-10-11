package leetcodeLCP1;

/**
 * @author yyw
 * @date 2019/10/11
 */
public class SolutionOne {
    private static int game(int[] guess, int[] answer) {
        int length = guess.length;
        int result = 0;
        for (int i = 0; i < length; i++) {
            if (guess[i] == answer[i]) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] guess = {1, 2, 3};
        int[] answer = {1, 2, 3};
        System.out.println(game(guess, answer));
    }
}
