import java.util.HashMap;

public class Caesar implements CipherInterface {

    private HashMap<Character, Character> charMap;

    public Caesar(String keyword) throws BadKeywordException {
        charMap = new HashMap<Character, Character>();
        charMap.put('A', 'X');
        charMap.put('B', 'Y');
        charMap.put('C', 'Z');
        charMap.put('D', 'A');
        charMap.put('E', 'B');
        charMap.put('F', 'C');
        charMap.put('G', 'D');
        charMap.put('H', 'E');
        charMap.put('I', 'F');
        charMap.put('J', 'G');
        charMap.put('K', 'H');
        charMap.put('L', 'I');
        charMap.put('M', 'J');
        charMap.put('N', 'K');
        charMap.put('O', 'L');
        charMap.put('P', 'M');
        charMap.put('Q', 'N');
        charMap.put('R', 'O');
        charMap.put('S', 'P');
        charMap.put('T', 'Q');
        charMap.put('U', 'R');
        charMap.put('V', 'S');
        charMap.put('W', 'T');
        charMap.put('X', 'U');
        charMap.put('Y', 'V');
        charMap.put('Z', 'W');
    }

    public String decode(String in) {
        String out = "";
        for (int i = 0; i < in.length(); i++) {
            out += this.decode(in.charAt(i));
        }
        return out;
    }


    @Override
    public char encode(char in) {
        return 0;
    }

    @Override
    public char decode(char in) {
        return charMap.get(in);
    }

    @Override
    public String encode(String in) {
        return null;
    }


}


