import com.sun.source.tree.ContinueTree;

public class NOMAIN {
    public static void main(String args1[]) {
        // объявление переменных
        var counter = 0;
        var baund=0;
        var i1=0;
        var summ=0;
        var leghthstringend = 0;
        //объявсление строк
        String stringi1 = "пр2иве-т,  при+ве7т";
        char[] charstringi2 = new char[stringi1.length()];
        char[] charstringi3 = new char[stringi1.length()];
        char[] charstringi4 = new char[stringi1.length()];
        char[] charstringi5 = new char[stringi1.length()];
        baund = (int) stringi1.length();
        System.out.println(charstringi2);
        System.out.println(stringi1 + " число символов = " + stringi1.length());
        System.out.println("счетчик = " + counter);
        char[] charstringi1 = stringi1.toCharArray();
        // удаление двойного пробела
        counter=0;
        charstringi2[0]=charstringi1[0];
        if ((int) charstringi1[0] == 32 & (int) charstringi1[1] == 32 ){
            counter = counter + 1;}
        else {charstringi2[1] = charstringi1[1];}
        for (i1 = 1;i1 < baund-1 ;i1++) if( (int) charstringi1[i1] == 32 & (int) charstringi1[i1+1] == 32 )
        { counter = counter + 1;
            i1=i1+1;
            charstringi2[i1 - counter] = charstringi1[i1];}
            else {charstringi2[i1 - counter] = charstringi1[i1];}
        charstringi2[baund - counter-1] = charstringi1[baund-1];
        leghthstringend = counter;
        for (i1 = 0;i1 < baund ;i1++) {
            System.out.print(charstringi2[i1]);}
        System.out.println("   ");
        System.out.println("удаленные символы = " + leghthstringend);
        //удаление знака "-"
        charstringi3 [0]=charstringi2[0];
        charstringi3 [1]=charstringi2[1];
        System.out.print("   ");
        counter=0;

            for (i1 = 0;i1 < baund-1 ;i1++)
                {
        if((int) charstringi2[i1] == 45)
        {charstringi3[i1 - counter-1] = charstringi2[i1+1];
            charstringi3[i1 - counter] = charstringi2[i1-1];
             counter= counter + 1;
        i1=i1+1;}
        else {
            charstringi3[i1-counter] = charstringi2[i1];}}
        leghthstringend =  leghthstringend + counter;
        for (i1 = 0;i1 < baund ;i1++) {
            System.out.print(charstringi3[i1]);}
        System.out.println("   ");
        System.out.println("удаленные символы = " + leghthstringend);
        // замена "+" на "!"
        for (i1 = 0;i1 < baund-1 ;i1++)
        {
            if((int) charstringi3[i1] == 43)
            {charstringi4[i1] = '!';}

            else {
                charstringi4[i1] = charstringi3[i1];}}
        for (i1 = 0;i1 < baund ;i1++) {
            System.out.print(charstringi4[i1]);}
        System.out.println("   ");
        System.out.println("удаленные символы = " + leghthstringend);
        // удаление и сложение цифр
        counter = 0;
        for (i1 = 0;i1 < baund ;i1++)
        {
            if((int) 47 < charstringi4[i1]&charstringi4[i1] < 58)
            {summ = summ + Character.getNumericValue(charstringi4[i1]);
                charstringi5[i1 - counter] = charstringi4[i1+1];
                counter= counter + 1;
                i1=i1+1;}
            else {
                charstringi5[i1-counter] = charstringi4[i1];}}
        for (i1 = 0;i1 < baund ;i1++) {
            System.out.print(charstringi5[i1]);}
        System.out.println("   ");
        System.out.println("сумма="+summ);
        leghthstringend =  leghthstringend + counter;
        System.out.println("удаленные символы = " + leghthstringend);
        char[] charstringend = new char[stringi1.length() - leghthstringend];
        System.out.println("KOHEЧНАЯ СТРОКА");
        for (i1 = 0;i1 < baund-leghthstringend ;i1++) {
            charstringend [i1]=charstringi5[i1];
            System.out.print( charstringend [i1]);}
        }}


