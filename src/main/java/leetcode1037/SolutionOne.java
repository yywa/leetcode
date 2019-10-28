package leetcode1037;

/**
 * @author yyw
 * @date 2019/10/28
 **/
public class SolutionOne {
    private static boolean isBoomerang(int[][] points) {
        Integer x1 = points[0][0];
        Integer x2 = points[1][0];
        Integer x3 = points[2][0];
        Integer y1 = points[0][1];
        Integer y2 = points[1][1];
        Integer y3 = points[2][1];

        if ((x1.equals(x2) && x2.equals(x3))||(y1.equals(y2) && y2.equals(y3))){
            return false;
        }

        int xx1 = x2 - x1;
        int xx2 = x3 - x1;

        int yy1 = y2 - y1;
        int yy2 = y3 - y1;

        return (xx1 * yy2) != (xx2 * yy1);
    }
    public static void main(String[] args) {
        int[][] temp = {{1,1},{2,2},{3,3}};
        System.out.println(isBoomerang(temp));
    }
}
