public class TimeConversion {

    static String convert(String s){
        String ar [] = s.split(":");
        String hour = ar[0];
        String minute = ar[1];
        String second = ar[2];
        if(hour.equals("12") && second.contains("AM")){
            hour = "00";
        }
        else if(second.contains("PM") && !hour.equals("12")){
            hour = String.valueOf(Integer.valueOf(hour)+12);
        }
        String newString = hour+":"+minute+":"+second.substring(0,2);
     return newString;
    }
    public static void main(String args[]){
       String s = "12:45:54PM";
        System.out.println(convert(s));
    }
}
