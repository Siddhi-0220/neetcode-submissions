class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (String op : operations) {
            if(op.equals("+")){
                int last = stack.pop();
                int newScore = last + stack.peek();
                stack.push(last);
                stack.push(newScore);
                sum += newScore;
            }else if(op.equals("D")){
                int newScore = 2 * stack.peek();
                stack.push(newScore);
                sum += newScore;
            }else if(op.equals("C")){
                sum -= stack.pop();
            }else{
                int val = Integer.parseInt(op);
                stack.push(val);
                sum += val;
            }
        }
    return sum;    
    }
}