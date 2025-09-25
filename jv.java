import java.util.Scanner;
public class jv {
    public static void main(String[] args){
        /*///float a = 20.50f;
        float b = 45.40f;
        int c = 10;
        float sum = a + b;
        float discounted = sum * 0.9f;
        float percentage = sum * c / 100.0f;
        System.out.printf("%.2f ; %.2f ; %.2f%n", sum, discounted, percentage);///
        ///Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a*b)-(a*c)-100);///
        ///Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float senior = a*50/100;
        float junior = b*40/100;
        double total = senior*6 + junior*5;
        System.out.printf("%.2f", total);///
        ///Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float f = (a*b*c)/100;

        System.out.printf("%.2f\n", f);      
        System.out.printf("%.2f\n", f + a);
        float interest = f*2/100;
        System.out.printf("%.2f\n", interest);
        System.out.printf("%.2f\n", (f + a)-interest);//// 

        Scanner sc = new Scanner(System.in);
        int maxweight = sc.nextInt();   
        int adults = sc.nextInt();     
        int children = sc.nextInt();   
        int totalweight = (adults * 75) + (children * 50);
        if (totalweight <= maxweight) {
            System.out.println("Boat is stable");
        } else {
            System.out.println("Boat will drown");
        }
        sc.close();
        //1//
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>=0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
        sc.close();
        //2//
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        sc.close();
        //3//
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a);
        } else if(b>a){
            System.out.println(b);
        } else{
            System.out.println("Equal");
        }
        sc.close();
        //4// 
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if(a%400==0){
            System.out.println("Leap year");
        } else if(a%100==0){
            System.out.println("Not a leap year"); 
        } else if(a%4==0){
            System.out.println("Leap year");
        } else{
            System.out.println("Not a leap year");
        }
        sc.close();
        //5//
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=18){
            System.out.println("Eligible to vote");
        } else{
            System.out.println("Not eligible to vote");
        }
        sc.close();
        //6//
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){
            System.out.println("Positive");

        }else if(a<0){
            System.out.println("Negative");
        } else{
            System.out.println("Zero");
        }   
        sc.close();
        //7//
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest;
        if (a >= b) {
            if (a >= c) {
                largest = a;
            } else {
                largest = c;
            }
        } else {
            if (b >= c) {
                largest = b;
            } else {
                largest = c;
            }
        }
        sc.close();
        System.out.println(largest);
        //8//
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        ch =Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("Vowels");

        }
        else{
            System.out.println("Constonants");
        }
        sc.close();
        //9//
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        
        if(sum>=90 && sum<=100){
            System.out.println("Grade A");
        } else if(sum>=80 && sum<90){
            System.out.println("Grade B");
        } else if(sum>=70 && sum<80){
            System.out.println("Grade C");
        } else if(sum>=60 && sum<70){
            System.out.println("Grade D");
        } else if(sum>=40 && sum<60){
            System.out.println("Grade E");
        } else if(sum<40){
            System.out.println("FAIL");
        } else{
            System.out.println("Invalid input");
        }

        sc.close();
        //10//
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a%5==0 && b%5==0){
            System.out.println("Divisible by 5");
            if(a%11==0 && b%11==0){
                System.out.println("Divisible by 11");
            } else{
                System.out.println("Not divisible by 11");
            }
        } 
        else{
            System.out.println("Not divisible by 5 or 11");
        }
        sc.close();
        //11//
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday"); 
                break;
            case 7:
                System.out.println("Sunday");
                break;
        
            default:
                System.out.println("Invalid input");
                break;
        }
        sc.close();
        //12//
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operation = sc.nextInt();
        switch (operation) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break; 
            case 4:
                System.out.println(a/b);
                break;
        
            default:
                break;
        }
        sc.close();
        //13//
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;
            case 4:

                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");  
                break;
            case 11:
                System.out.println("November"); 
                break;
            case 12:
                System.out.println("December");
                break;
        
            default:
                System.out.println("Invalid input");
                break;
        }
        sc.close();


        Scanner sc= new Scanner(System.in);
        int len=sc.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
           
            System.out.println(arr[i]);
        }
        sc.close();


        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        int suma=0, sumb=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                suma+=i;
            } 
        }
        for(int i=1;i<=b;i++){
            if(b%i==0){
                sumb+=i;
            }
        }
        int tot1=suma/a;
        int tot2=sumb/b;
        if(tot1==tot2){
            System.out.println("Friendly numbers");
        } else{
            System.out.println("Not friendly numbers");
        }
        sc.close();

    
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        
        int fact=1;
        int b=a%10;
        System.out.println(b);
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }   
        System.out.println(fact);
        sc.close();*/
}
    }




