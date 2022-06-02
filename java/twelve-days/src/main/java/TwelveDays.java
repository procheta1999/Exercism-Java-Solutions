import java.util.*;
class TwelveDays {
    public Map<Integer,String> lyrics=new HashMap();
    public Map<Integer,String> orderOfLyrics=new HashMap();
    public TwelveDays()
    {
        lyrics.put(1,"a Partridge in a Pear Tree.\n");
        lyrics.put(2,"two Turtle Doves, ");
        lyrics.put(3,"three French Hens, ");
        lyrics.put(4,"four Calling Birds, ");
        lyrics.put(5,"five Gold Rings, ");
        lyrics.put(6,"six Geese-a-Laying, ");
        lyrics.put(7,"seven Swans-a-Swimming, ");
        lyrics.put(8,"eight Maids-a-Milking, ");
        lyrics.put(9,"nine Ladies Dancing, ");
        lyrics.put(10,"ten Lords-a-Leaping, ");
        lyrics.put(11,"eleven Pipers Piping, ");
        lyrics.put(12,"twelve Drummers Drumming, ");
        orderOfLyrics.put(1,"first");
        orderOfLyrics.put(2,"second");
        orderOfLyrics.put(3,"third");
        orderOfLyrics.put(4,"fourth");
        orderOfLyrics.put(5,"fifth");
        orderOfLyrics.put(6,"sixth");
        orderOfLyrics.put(7,"seventh");
        orderOfLyrics.put(8,"eighth");
        orderOfLyrics.put(9,"ninth");
        orderOfLyrics.put(10,"tenth");
        orderOfLyrics.put(11,"eleventh");
        orderOfLyrics.put(12,"twelfth");
    }
    String verse(int verseNumber) {
        try
        {
            String s="On the "+orderOfLyrics.get(verseNumber)+" day of Christmas my true love gave to me: ";
            for(int verseOrder=verseNumber;verseOrder>=1;verseOrder--)
            {
                if(verseNumber>1 && verseOrder==1)
                {
                    s=s+"and ";
                }
                s=s+lyrics.get(verseOrder);

            }
            return s;
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        }
    }

    String verses(int startVerse, int endVerse) {
        try
        {
            String song="";
            for(int lineNumber=startVerse;lineNumber<=endVerse;lineNumber++)
            {
                String s="On the "+orderOfLyrics.get(lineNumber)+" day of Christmas my true love gave to me: ";
                for(int verseOrder=lineNumber;verseOrder>=1;verseOrder--)
                {
                    if(lineNumber>1 && verseOrder==1)
                    {
                        s=s+"and ";
                    }
                    s=s+lyrics.get(verseOrder);

                }
                if(lineNumber<endVerse)
                {
                    s=s+"\n";
                }
                song =song+s;
            }

            return song;
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        }
    }

    String sing() {
        try
        {
            String song="";
            for(int lineNumber=1;lineNumber<=12;lineNumber++)
            {
                String s="On the "+orderOfLyrics.get(lineNumber)+" day of Christmas my true love gave to me: ";
                for(int verseOrder=lineNumber;verseOrder>=1;verseOrder--)
                {
                    if(lineNumber>1 && verseOrder==1)
                    {
                        s=s+"and ";
                    }
                    s=s+lyrics.get(verseOrder);

                }
                if(lineNumber<12)
                {
                    s=s+"\n";
                }
                song =song+s;
            }

            return song;
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        }
    }
}
