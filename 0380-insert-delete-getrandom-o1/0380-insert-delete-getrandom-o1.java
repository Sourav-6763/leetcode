class RandomizedSet {
    private Map<Integer, Integer> map;
    private List<Integer> ab;
    private Random rand;

    public RandomizedSet() {
        map = new HashMap<>();
        ab = new ArrayList<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        ab.add(val);
        map.put(val, ab.size() - 1);
        return true;
    }

    public boolean remove(int val) {
      if (!map.containsKey(val)) {
    return false;
}

        int idx = map.get(val);
        int lastElement = ab.get(ab.size() - 1);

        ab.set(idx, lastElement);
        map.put(lastElement, idx);

        ab.remove(ab.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        int index=rand.nextInt(ab.size());
        return ab.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */