class Solution {
    public String simplifyPath(String path) {
        Stack<String> ab = new Stack<>();
        String[] xy = path.split("/");
        for (String i : xy) {
            if (i.equals(".") ||i.equals("")) {
                continue;
            } else if (i.equals("..")) {
                if (!ab.isEmpty()) {
                    ab.pop();
                }
            }
            else{
            ab.push(i);
            }
        }
        String res="";
        while(!ab.isEmpty()){
         res="/"+ab.pop()+res;
        }
        return res.length()==0?"/":res;
    }
}