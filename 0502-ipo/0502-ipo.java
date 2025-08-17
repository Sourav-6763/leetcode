class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        ArrayList<List<Integer>> ab = new ArrayList<List<Integer>>();
        for (int i = 0; i < profits.length; i++) {
            List<Integer> demo = new ArrayList<>();
            demo.add(profits[i]);
            demo.add(capital[i]);
            ab.add(demo);

        }
        Collections.sort(ab, (a, b) -> a.get(1) - b.get(1));
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        int p = w;
        int i = 0;
        while (k > 0) {
            while ((i < ab.size()) && (p >= ab.get(i).get(1))) {
                maxheap.offer(ab.get(i).get(0));
                i++;
            }
            if (maxheap.isEmpty()) break; 
            p = p + maxheap.poll();
            k--;
        }
        System.out.println(maxheap);
        return p;
    }
}