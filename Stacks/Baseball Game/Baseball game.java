class Solution {
    public int calPoints(String[] operations) {
        int sum=0;
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<operations.length;i++){
            if(!operations[i].equals("C") && !operations[i].equals("D") &&!operations[i].equals("+")){
                int score=Integer.valueOf(operations[i]);
                sum+=score;
                res.add(score);
            }
            else if(operations[i].equals("C")){
                sum-=res.get(res.size()-1);
                res.remove(res.size()-1);
            }
            else if(operations[i].equals("D")){
                int score=res.get(res.size()-1)*2;
                sum+=score;
                res.add(score);
            }
            else if(operations[i].equals("+")){
                int score=res.get(res.size()-1)+res.get(res.size()-2);
                sum+=score;
                res.add(score);
            }
        }
        return sum;
    }
}