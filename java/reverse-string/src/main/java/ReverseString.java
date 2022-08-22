class ReverseString {

    String reverse(String inputString) {
        try
        {
            String res="";
            int top=inputString.length()-1;
            while(top!=-1)
            {
                res=res+inputString.charAt(top);
                top--;
            }
            return res;
        }
        catch(Exception e)
        {
            throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        }
    }
  
}
