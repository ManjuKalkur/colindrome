import java.util.*;
public class Colindrome {


    public static void main(String args[]) throws InterruptedException {
        String str="abccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccbaabccba";
        final long startTime = System.currentTimeMillis();
        //if length devided 3 is even then there is colindrom posiblity
           if((str.length()/3)%2==0)
           {



               String rev = getReverseStr(str);
               //if whole string is palindrome then check for colindrome
               if(rev.equals(str))
               {
                 //create array by spliting at 3 character
                   String[] strThreeSplit = createArray(str);
                   //if three characters are equal to next  three character then colindrome
                   boolean isPal = isPal(strThreeSplit);
                   if(isPal==true) {
                      System.out.println(String.format("%s is  colindrome", str));

                  }
                  else{
                      System.out.println(String.format("%s is not colindrome",str));
                  }
               }
               else{
                   System.out.println(String.format("%s is not colindrome",str));
               }

           }
           else{
               System.out.println(String.format("%s is not colindrome",str));
           }
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));
    }


    /**
     * this checks is first three character equal to reverse if next three character
     * then checks from 7 th character if three character are equal to next three character
     * @param strThreeSplit
     * @return
     */


    private static boolean isPal(String[] strThreeSplit) {
        String rev;
        int i;

        boolean isPal=false;
        for(i=0; i< strThreeSplit.length; i=i+2)
        {

            rev=getReverseStr( strThreeSplit[i]);
            if(rev.equals(strThreeSplit[i+1]))
            {
                isPal=true;
            }
            else{
                isPal=false;
                        break;
            }

        }
        return isPal;
    }

    /**
     * create array by spliting creating string of 3 char
     * @param str
     * @return
     */
    private static String[] createArray(String str) {
        String strThreeSplit[]=new String[str.length()/3];
        String sdata="";
        int i=0;
        for(char data : str.toCharArray())
        {
            sdata=sdata+data;
            //when data length is 3 increment arr pos and set increment value to 0
            if(sdata.length()==3)
            {
            strThreeSplit[i++]=sdata;
            sdata="";
            }

        }
        return strThreeSplit;
    }


    /**
     * create reverse of given string
     * @param str
     * @return
     */

    private static String getReverseStr(String str) {
        String rev="";
        for(char data : str.toCharArray())
        {
         rev=data+rev;
        }
        return rev;
    }

}
