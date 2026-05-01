class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>s = new Stack<>();
        for(String c: operations){
            if(c.equals("+")){
                int x=s.pop();
                int y= s.peek();
                s.push(x);
                s.push(x+y);

            }

            else if(c.equals("D")){
                s.push(2*s.peek());
            }

            else if(c.equals("C")){
                s.pop();
            }
            else{
                s.push(Integer.parseInt(c));
            }
        }
    
    int sum = 0;
    while(!s.isEmpty()) sum+=s.pop();
    return sum;
        
    }
}