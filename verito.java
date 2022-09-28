import java.util.Scanner;
class Solution {
    public int romanToDec(String s) {
        int len = s.length();
        int ans = 0;
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            int cur = getValue(ch);
            if (i < len - 1 && cur < getValue(s.charAt(i + 1))) {
                ans -= cur;
            } else {
                ans += cur;
            }
        }
        return ans;
    }

    private int getValue(char ch) {
        int ans = 0;
        switch (ch) {
            case 'I':
                ans = 1;
                break;

            case 'V':
                ans = 5;
                break;

            case 'X':
                ans = 10;
                break;

            case 'L':
                ans = 50;
                break;

            case 'C':
                ans = 100;
                break;

            case 'D':
                ans = 500;
                break;

            case 'M':
                ans = 1000;
                break;

            default:
                break;
        }

        return ans;
    }
    public String intToRoman(int num)   
    {  
    int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
    String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
    StringBuilder roman = new StringBuilder();  
    for(int i=0;i<values.length;i++)   
         {  
            while(num >= values[i])   
            {  
                num = num - values[i];  
                roman.append(romanLetters[i]);  
            }  
        }  
            return roman.toString();
        }
    public void cs1()
    {
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();
        String[] roman = inp.split(",");
        int size = roman.length;
        int[] dec = new int[size];
        for(int i=0;i<size;i++)
        {
            dec[i] = romanToDec(roman[i]);
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(dec[i]);
            if(i<size-1)
                System.out.print(",");
        }
    }
    public void add()
    {
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();
        String[] roman = inp.split(",");
        int size = roman.length;
        int[] dec = new int[size];
        int sum =0 ;
        for(int i=0;i<size;i++)
        {
            dec[i] = romanToDec(roman[i]);
        } 
        for(int i =0;i<size;i++)
        {
            sum += dec[i];
        }
        System.out.println("Decimal: "+ sum);
        System.out.println("In Roman: "+ intToRoman(sum));
    }
    public void sub()
    {
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();
        String[] roman = inp.split(",");
        int size = roman.length;
        int[] dec = new int[size];
        int diff = 0;
        for(int i=0;i<size;i++)
        {
            dec[i] = romanToDec(roman[i]);
        }diff = dec[0]; 
        for(int i=1;i<size;i++)
        {            
            diff -= dec[i];
        }
        System.out.println("Decimal: "+ diff);
        if(diff<0)
        {
            System.out.println("In Roman: Invalid");
        }  
        else{
            System.out.println("In Roman: "+ intToRoman(diff));
        }
    }
    public void mul()
    {
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();
        String[] roman = inp.split(",");
        int size = roman.length;
        int[] dec = new int[size];
        int mul =1 ;
        for(int i=0;i<size;i++)
        {
            dec[i] = romanToDec(roman[i]);
        }         
        for(int i =0;i<size;i++)
        {
            mul *= dec[i];
        }
        System.out.println("Decimal: "+ mul);
        System.out.println("In Roman: "+ intToRoman(mul));
    }
    public void div()
    {
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();
        String[] roman = inp.split(",");
        int size = roman.length;
        int[] dec = new int[size];
        double div = 1;
        for(int i=0;i<size;i++)
        {
            dec[i] = romanToDec(roman[i]);
        } 
        div = dec[0];
        for(int i =1;i<size;i++)
        {            
            div /= dec[i];
        }
        System.out.println("Decimal: "+ div);
        if(div == (int)div)
        {
            int val = (int)div;
            System.out.println("In Roman: "+ intToRoman(val));
        }
        else     
        {
            System.out.println("In Roman: Invalid");
        }
    }
}

public class verito
{
    public static void main(String[] args) 
    {

        Scanner in = new Scanner(System.in);
        Solution ob = new Solution();
        System.out.println("1: Find decimal value");
        System.out.println("2: Add");
        System.out.println("3: Subtract");
        System.out.println("4: Multiply");
        System.out.println("5: Divide");
        while(true)
        {
            System.out.println("Enter the option: ");
            int ch = in.nextInt();
        switch(ch)
        {
            case 1:
                ob.cs1();
                break;
            case 2:
                ob.add();
                break;
            case 3:
                ob.sub();
                break;
            case 4: 
                ob.mul();
                break;
            case 5:
                ob.div();
                break;
            default:
                System.out.println("Exit....");
                System.exit(0);
        }
        System.out.println();
        }
    }     
}