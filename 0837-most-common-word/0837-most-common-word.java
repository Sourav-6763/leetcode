class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> allBanned = new HashSet<String>();
        HashMap<String, Integer> map = new HashMap<>();
        String newParagraph = paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase();
        String[] word = newParagraph.split("\\s+");

        for (int i = 0; i < banned.length; i++) {
            allBanned.add(banned[i]);
        }
        for (int i = 0; i < word.length; i++) {
         if(!allBanned.contains(word[i])){
            if (map.containsKey(word[i])) {
                map.put(word[i], map.get(word[i]) + 1);

            } else {

                int count = 0;
                count++;
                map.put(word[i], count);

            }
         }
        }
        String mostCommon = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommon = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        // System.out.println(mostCommon);
        // System.out.println(maxCount);

        return mostCommon;
    }
}