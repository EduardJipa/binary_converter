
public class main {

    public static void main(String[] args) {
        System.out.print(doBinaryToDecimal("00101010"));
    }
    public static int doBinaryToDecimal(String input){
        int runningTotal=0; //!Todo make better bc this is slow
        for (int i = 0; i< input.length();i++){
            runningTotal += ((input.charAt(i))==("0").toCharArray()[0] ? 0 : (Math.pow(2,i-1)));
        }

        return (runningTotal);};
}
