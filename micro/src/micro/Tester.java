package micro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tester {
	public static void main(String[] args) {

ArrayList list = new ArrayList<>();
list.add(20);
list.add(70);
list.add(90);
list.add(30);
list.add(60);
list.add(110);

ArrayList<Integer> res = new Tester().IDsOfPackages(110, list);
System.out.println(res.toString());
	}

	ArrayList<Integer> IDsOfPackages(int truckSpace, ArrayList<Integer> packagesSpace)

	{
		int reserveSpace = 30;
		Map<Integer, Integer> packMap = new HashMap<Integer, Integer>();
		ArrayList<Integer> list = new ArrayList<>();
		int remTruckSpack = truckSpace - reserveSpace; // 60
		for (int i = 0; i < packagesSpace.size(); i++) {
			if (packMap.containsKey(packagesSpace.get(i))) {
				list.add(packMap.get(packagesSpace.get(i)));
				list.add(i);
				//int[] intArr = new int[] {packMap.get(packagesSpace.get(i)), i};
				return list;
			} else {
				packMap.put(remTruckSpack - packagesSpace.get(i), i);
			}
		}
		return new ArrayList<>();
	}
}
