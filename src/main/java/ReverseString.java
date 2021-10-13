public class ReverseString {
    public static void main(String args[]) {
        String name = "Automation";
        StringBuilder stringBuilder = new StringBuilder(name);
        System.out.println("The reversed string using String buffer --> " + stringBuilder.reverse());
        System.out.println("-------------------");
        int lengthOfString = name.length();
        String reverseString = "";
        for (int i = lengthOfString - 1; i >= 0; i--) {
            reverseString = reverseString + name.charAt(i);
        }
        System.out.println("The reversed string with typcial for loop --> " + reverseString);
    }
}
