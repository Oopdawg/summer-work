public class stringToArray {
    public static void main(String[] args){
        String myStr = "testingABCDEF01234";

        String[] mySplitStr = myStr.split(""); // splits string

        for (String s : mySplitStr){
            System.out.println(s + " " + s.getClass().getName());
        }
    }
}
