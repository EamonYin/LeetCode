/**
 * @author:yym
 * @create:2021/5/20,20:08
 * @version:1.0
 */
public class DiagonalSum {
    public static void main(String[] args) {
        int[][] nums = {{1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}};
        int[][] nums2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] nums3 = {
                {7, 3, 1, 9},
                {3, 4, 6, 9},
                {6, 9, 6, 6},
                {9, 5, 8, 5}
        };
        DiagonalSum ds = new DiagonalSum();
        int i = ds.diagonalSum(nums3);
        System.out.println(i);
    }

    public int diagonalSum(int[][] mat) {
        int n = mat.length, sum = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i == j || i + j == n - 1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
//        int sum = 0;
//        //对角线中心点
//        int heart = mat.length / 2;
//        //主对角线
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat.length; j++) {
//                if (i == j) {
//                    sum = sum + mat[i][j];
//                }
//            }
//        }
//        System.out.println("主对角线"+sum);
//        //副对角线
//        for (int i = mat.length - 1; i >= 0; i--) {
////            for (int j = mat.length-i; j<mat.length; j) {
//            if (mat.length - i > 0) {
//                if (mat.length % 2 != 0) {
//                    //基数
//                    if (mat[i][mat.length - i] != mat[heart][heart]) {
//                        sum = sum + mat[i][mat.length - i];
//                    }
//                }
//                //偶数
//                else {
////                    if (i == mat.length-i) {
////                        System.out.println("坐标["+i+","+j+"]"+mat[i][j]);
//                    sum = sum + mat[i][mat.length - i];
////                    }
//                }
//            }
//        }
////        }
//        return sum;
}
}
