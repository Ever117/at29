
public class Main {

    public static void main(String[] args) {


        Array list2 = new Array();

        list2.setArray(5); // here you need to specify the size of the needed array

        list2.printAllArray();
        list2.Keys();


        IntegerArray list3 = new IntegerArray();
        list3.SummInt();
        list3.averageArray();
        list3.summIntOdd();


        CharArray list4 = new CharArray();
       // list4.getCharByValue(0);
        list4.setCharByArg(0, ')');
        list4.printKeys();
    }
}