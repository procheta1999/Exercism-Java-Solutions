import java.util.*;

public class PigLatinTranslator
{
    private List<Character> vowels=new ArrayList<Character>();
    private List<String> consonantSounds= new ArrayList<String>();
    public PigLatinTranslator()
    {
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
    }
    private String detectConsonantSound(String phrase)
    {
        String consonantSound="";
        for(int i=0;i<phrase.length();i++)
        {
            if(!vowels.contains(phrase.charAt(i)))
            {
                if(phrase.charAt(i)=='y' && i!=0)
                {
                    break;
                }
                consonantSound=consonantSound+phrase.charAt(i);

            }

            else
            {
                break;
            }
        }
        return consonantSound;
    }
    private String singleWordTranslate(String phrase)
    {
        String result="";
        if(vowels.contains(phrase.charAt(0)))
        {
            result=phrase+"ay";
        }
        else if(new String(phrase.substring(0, 2)).equals("xr") || new String(phrase.substring(0, 2)).equals("yt"))
        {
            result=phrase+"ay";
        }
        else
        {
            String consonantSound=detectConsonantSound(phrase);
            if(phrase.contains(consonantSound+"u") && phrase.contains("qu"))
            {
                result=phrase.substring(phrase.indexOf("qu")+2)+consonantSound+"uay";
            }
            else if((phrase.contains(consonantSound+"y")) || (phrase.length()==2 && phrase.charAt(1)=='y'))
            {

                result=phrase.substring(phrase.indexOf('y'))+consonantSound+"ay";
            }
            else
            {
                result=phrase.substring(phrase.indexOf(consonantSound.charAt(consonantSound.length()-1))+1)+consonantSound+"ay";
            }
        }
        return result;
    }
    public String translate(String phrase) {
        String result = "";
        if(phrase.contains(" "))
        {
            List<String> wordList=new ArrayList<String>();
            wordList= List.of(phrase.split(" "));
            for(int i=0;i<wordList.size();i++)
            {
                if(i!=wordList.size()-1) {
                    result = result + singleWordTranslate(wordList.get(i)) + " ";
                }
                else
                {
                    result = result + singleWordTranslate(wordList.get(i));
                }
            }
        }
        else {
            result=singleWordTranslate(phrase);
        }
        return result;
    }
}