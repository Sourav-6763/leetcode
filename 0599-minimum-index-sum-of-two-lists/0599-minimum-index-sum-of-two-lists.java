class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> res = new ArrayList<>();
        int count = 0;
        for (String s : list1) {
            map.put(s, count++);
        }
        int minsum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int idx = map.get(list2[i]);
                int present = idx + i;
                if (minsum >present) {
                    res.clear();
                    res.add(list2[i]);
                    minsum = present;
                } else if (minsum == present) {
                    res.add(list2[i]);
                }
            }
        }
        String[] array = res.toArray(new String[0]);
        return array;
    }
}