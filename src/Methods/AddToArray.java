package Methods;

import java.util.ArrayList;
import java.util.List;

public class AddToArray {
    List<Integer> myList = new ArrayList<>();

    public void addMember(int x) {
        myList.add(x);
    }

    public int[] listArrayToArray() {
        int[] mass = new int[myList.size()];

        for (int i = 0; i < myList.size(); i++) {
            mass[i] = myList.get(i);
        }
        return mass;
    }


}
