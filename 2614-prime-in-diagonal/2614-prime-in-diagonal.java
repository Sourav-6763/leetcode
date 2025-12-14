class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;

        ArrayList<Integer> demo = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    demo.add(nums[i][j]);
                }
                if (i + j == n - 1) {
                    demo.add(nums[i][j]);
                }
            }
        }

        int max = 0;

        for (int i = 0; i < demo.size(); i++) {
            int x = demo.get(i);

            if (x < 2) continue;   // ✅ small fix

            boolean isPrime = true;

            for (int j = 2; j * j <= x; j++) {   // ✅ MAIN FIX
                if (x % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                max = Math.max(x, max);
            }
        }

        return max;
    }
}
