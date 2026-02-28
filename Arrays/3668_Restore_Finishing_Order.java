import java.util.HashSet;
public class 3668_Restore_Finishing_Order {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        int n = friends.length;
        for(int i = 0; i<n ; i++){
            set.add(friends[i]);
        }
        int n1 = order.length;
        int[] arr = new int[n];
        int k = 0;
        for(int i = 0; i<n1 ; i++){
            if(set.contains(order[i])){
                arr[k++] = order[i];
            }
        }
        return arr;
    }
}
}
