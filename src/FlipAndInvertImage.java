import java.util.Arrays;

/**
 * @author:yym
 * @create:2021/5/26,20:03
 * @version:1.0
 */
public class FlipAndInvertImage {
    public static void main(String[] args) {
        int[][] nums = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        FlipAndInvertImage f = new FlipAndInvertImage();
        int[][] ints = f.flipAndInvertImage(nums);
        System.out.println(Arrays.deepToString(ints));
    }

    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0, index = image.length - 1; j <= index; j++, index--) {
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][index] ^ 1;
                image[i][index] = temp;
            }
        }
        return image;
    }
}
