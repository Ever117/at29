public class CharArray extends Array {

     char [] arrayCH = {'(', '8', '4', ';', '%'};

     // ASCII format for int
    int [] ascCH = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57};


    public void setCharByArg(int arg, char charValue){
        arrayCH[arg] = charValue;
        if (arrayCH[arg] == charValue) {
            System.out.println("Char exists in array");
        } else {
            System.out.println("There some inconsistencies");
        }

    }
    public void printKeys() {

        System.out.println("All existing int in Char array: ");
        for (int i = 0; i<=4; i++) {
            for (int j = 0; j < ascCH.length; j++) {
                if (((int)(arrayCH[i])) == ascCH[j]) {
                    System.out.println(arrayCH[i]);

                }
            }
        }
    }
}
