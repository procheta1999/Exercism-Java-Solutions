class RnaTranscription {

    String transcribe(String dnaStrand) {
        if(dnaStrand.length()==1)
        {
            switch(dnaStrand)
            {
                case "G":
                    return "C";
                case "C":
                    return "G";
                case "T":
                    return "A";
                case "A":
                    return "U";
            }
        }
        else if(dnaStrand=="")
        {
            return "";
        }
        else {
            String result="";
            for(int i=0;i<dnaStrand.length();i++)
            {
                if(dnaStrand.charAt(i)=='G')
                {
//                    dnaStrand.replace('G','C');
                    result=result+"C";
                }
                else if(dnaStrand.charAt(i)=='C')
                {
//                    dnaStrand.replace('C','G');
                    result=result+"G";
                }
                else if(dnaStrand.charAt(i)=='T')
                {
//                    dnaStrand.replace('T','A');
                    result=result+"A";
                }
                else
                {
//                    dnaStrand.replace('A','U');
                    result=result+"U";
                }
            }
            return result;
        }

        
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
