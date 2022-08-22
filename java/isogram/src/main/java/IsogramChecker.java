import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        try {
            phrase=phrase.toLowerCase();
            Map<Character,Boolean> charMap=new HashMap();
            for(int i=0;i<phrase.length();i++)
            {
                if(phrase.charAt(i)!=' ' && phrase.charAt(i)!='-')
                if(!charMap.containsKey(phrase.charAt(i)))
                {
                    charMap.put(phrase.charAt(i),true);
                }
                else
                {
                    return false;
                }
            }
            return true;
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        }
    }

}
