
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
         int x = 1;
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
        
        for(int i=k; i<s.length();i++){
            String temp = s.substring(x,i+1);
            if(smallest.compareTo(temp)>0){
                smallest = temp;
            }
            x++;
        }
        x=1;

        for(int i=k; i<s.length();i++){
            String temp = s.substring(x,i+1);
            if(largest.compareTo(temp)<0){
                largest = temp;
            }
            x++;
        }
     

        return smallest + "\n" + largest;
    }

