import java.util.*;

public class ActivitySelection {
    public static int countActivity(int start[], int end[]){
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(activities[0][0]);

        int lastEnd = activities[0][2];
        for (int curr = 1; curr < start.length; curr++){
            if (activities[curr][1] >= lastEnd){
                ans.add(activities[curr][0]);
                lastEnd = activities[curr][2];
            }
        }

        for (int i = 0; i < ans.size(); i++){
            System.out.print("A" + ans.get(i) + " ");
        }
        return ans.size();
    }

    public static void main(String[] args) {
        int start[] = {3, 1, 0, 5, 8, 5};
        int end[] = {4, 2, 6, 7, 9, 9};
        countActivity(start, end);
    }
}
