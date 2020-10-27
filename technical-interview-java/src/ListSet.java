import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSet {

	public static void main(String[] args) {
		Integer[] nums = new Integer[] { 0, 1, 2, 3, 4, 5 };
		List<Integer> list = new ArrayList<>(Arrays.asList(nums));
		list.set(3, 999);
		System.out.println(list);

	}

}
