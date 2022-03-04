/**
 * @author:yym
 * @create:2021/5/19,20:06
 * @version:1.0
 */
public class BusyStudent {
    public static void main(String[] args) {
        BusyStudent student = new BusyStudent();
        int[] startTime = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] endTime = {10, 10, 10, 10, 10, 10, 10, 10, 10};
        int queryTime = 5;
        int i = student.busyStudent(startTime, endTime, queryTime);
        System.out.println(i);
    }

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int sum = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                sum++;
            }
        }
        return sum;
    }
}
