public class Twofer {
    public String twofer(String name) {
        try
        {
           if(name==null)
           {
               return "One for you, one for me.";
           }
           else
           {
               return "One for "+name+", one for me.";
           }
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        }
    }
}
