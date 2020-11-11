
public class main {

    public static void main(String[] args) {
        System.out.print(doBinaryToDecimal("00101010"));
        System.out.println(doDecimalToBinary(49));

    }
    public static int doBinaryToDecimal(String input){
        int runningTotal=0; //!Todo make better bc this is slow
        for (int i = 0; i< input.length();i++){
            runningTotal += ((input.charAt(i))==("0").toCharArray()[0] ? 0 : (Math.pow(2,i-1)));
        }

        return (runningTotal);};

    public static String doDecimalToBinary(int input){
        int runningTotal = 0;
        String runningString = ("");
        int currentWeight;
        for(int i = 0; i < 8 ;i++){
            currentWeight = (int) Math.pow(2,(8-i));
            if(i%currentWeight > 0){
                runningTotal -= currentWeight;
                runningString.concat("1");
            }else{runningString.concat("0");}
        }

        return  runningString;
    }
}
