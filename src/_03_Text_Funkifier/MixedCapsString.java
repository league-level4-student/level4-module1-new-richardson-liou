package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {
        this.unfunkifiedText = unfunkifiedText;
    }

    @Override
    public String funkifyText() {
        StringBuilder result = new StringBuilder();

        boolean toLowerCase = true;

        for (char c : unfunkifiedText.toCharArray()) {
   
            if (Character.isLetter(c)) {
                if (toLowerCase) {
                    result.append(Character.toLowerCase(c));
                } else {
                    result.append(Character.toUpperCase(c));
                }
                

                toLowerCase = !toLowerCase;
            } 
            else {
            	result.append(c);
            	toLowerCase=!toLowerCase;
            }
        }

        return result.toString();
    }
}