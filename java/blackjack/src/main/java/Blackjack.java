import java.util.HashMap;
import java.util.Map;

public class Blackjack {
    public Map<String, Integer> cardMap= new HashMap();
    public Blackjack()
    {
        cardMap.put("ace",11);
        cardMap.put("two",2);
        cardMap.put("three",3);
        cardMap.put("four",4);
        cardMap.put("five",5);
        cardMap.put("six",6);
        cardMap.put("seven",7);
        cardMap.put("eight",8);
        cardMap.put("nine",9);
        cardMap.put("ten",10);
        cardMap.put("jack",10);
        cardMap.put("king",10);
        cardMap.put("queen",10);
        cardMap.put("other",0);
    }
    public int parseCard(String card) {
        try
        {

            return cardMap.get(card);
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Please implement the Blackjack.parseCard method");
        }
    }

    public boolean isBlackjack(String card1, String card2) {
        try
        {

            return cardMap.get(card1)+cardMap.get(card2)==21;
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Please implement the Blackjack.isBlackjack method");
        }
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        try
        {


            if(isBlackjack)
            {
                if (dealerScore!=parseCard("ace") && dealerScore!=parseCard("king") && dealerScore!=parseCard("queen") && dealerScore!=parseCard("jack") && dealerScore!=parseCard("ten"))
                {
                    return "W";
                }
                else
                {
                    return "S";
                }
            }
            // else if(dealerScore==parseCard("ace") && isBlackjack==false)
            // {
            //     return "P";
            // }
            return "P";

        }
        catch(UnsupportedOperationException e)
        {
            throw new UnsupportedOperationException("Please implement the Blackjack.largeHand method");
        }


    }

    public String smallHand(int handScore, int dealerScore) {
        try
        {
            if(handScore>=17)
            {
                return "S";
            }
            else if(handScore<=11)
            {
                return "H";
            }
            else
            {
                if(dealerScore>=7)
                {
                    return "H";
                }
                else
                {
                    return "S";
                }
            }
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Please implement the Blackjack.smallHand method");
        }
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
