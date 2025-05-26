package abstact_and_interface_practice;

class Response implements flagType {

    public void checkFlagColour(String flagCard) {
        int flagCode = 0;
        if (flagCard.equalsIgnoreCase("Green")) {
            flagCode = 10;
            flag(flagCard, flagCode);
        } else if (flagCard.equalsIgnoreCase("Red")) {
            flagCode = 20;
            flag(flagCard, flagCode);
        } else {
            flagCode = -1;
            flag("INVALID FLAG COLOUR", flagCode);
        }
    }

    public void flag(String flagCard, int flagCode) {
        System.out.println("Flag colour is: " + flagCard);
        System.out.println("Flag code is: " + flagCode);
        System.out.println();
    }
}


public class Message {

    public static void main(String args[]) {
        Response r = new Response();
        r.checkFlagColour("Green");
        r.checkFlagColour("Red");
        r.checkFlagColour("abcd");
    }

}


