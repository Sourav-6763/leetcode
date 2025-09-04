class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        List<List<Integer>> ab = new ArrayList<>();
        for (int i = 0; i < profits.length; i++) {
            List<Integer> demo = new ArrayList<>();
            demo.add(profits[i]);
            demo.add(capital[i]);
            ab.add(demo);
        }
        Collections.sort(ab, (a, b) -> a.get(1) - b.get(1));
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int p = w;
        System.out.println(ab);
        int i = 0;
        while (k > 0) {
            while (i < ab.size() && p >= ab.get(i).get(1)) {
                maxHeap.offer(ab.get(i).get(0));
                i++;
            }
           if(!maxHeap.isEmpty())
            p += maxHeap.poll();

            k--;
        }
        return p;
    }
}