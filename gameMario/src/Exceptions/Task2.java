package Exceptions;

public class Task2 {
    static class AsociativArray{
        int value;
        String key;
        String keyArray [] = new String[100];
        int valueArray [] = new int[100];
        void Add(String key, int value){
            for (int i=0; i<keyArray.length;i++){
                if(keyArray[i]==null){
                    keyArray[i]=key;
                    valueArray[i]=value;
                    break;
                }
            }
        }
        int getread(String key){

            return value;
        }

    }
    public static class Task02 {
        public static void main(String args[]){
            AsociativArray ar1 = new AsociativArray();
            ar1.Add("abc", 52);
            ar1.Add("d", 10);
            ar1.Add("xyz", 107);

            System.out.println(ar1.keyArray[0] + " " + ar1.valueArray[0]);
            System.out.println(ar1.keyArray[1] + " " + ar1.valueArray[1]);
            System.out.println(ar1.keyArray[2] + " " + ar1.valueArray[2]);
        }
    }
}
