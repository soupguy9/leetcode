class Solution {
    public List<String> fizzBuzz(int n) {
       
	   List<String> ret = new ArrayList<String>();
        String tmp = "";
        
        for (int i = 1; i <= n; i++) {
            tmp = "";
            if (i % 3 == 0) {
                tmp = "Fizz"; 
            }
            if (i % 5 == 0) {
                tmp += "Buzz";
            }
            if (tmp.isEmpty()) {
                tmp = Integer.toString(i);
            }
            ret.add(tmp);
        }
        
        return ret;
	   
        /* Slower, less mem maybe?
		List<String> ret = new ArrayList<String>();
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ret.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                ret.add("Fizz"); 
            }
            else if (i % 5 == 0) {
                ret.add("Buzz");
            }
            else {
                ret.add(Integer.toString(i));
            }
        }
        
        return ret;*/
    }
}