import java.util.*;
class pro
{
    public static void main(String args[]){
        Scanner take = new Scanner(System.in);



    //// ternary operator ?: only 3 conditions ////

    //  int a = 10, b = 30;
    //  String ans = (a < b)? "hi": "by" ;
    //  System.out.println("ans :"+ ans);



    // int a = take.nextInt();
    // int b = take.nextInt();

    // String t = (a > b)?"a":(b > a)?"b":"c";
    // System.out.println(t);



   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    //// Switch case ////
   
    // Assingment 1:

    // int Day = take.nextInt();

    // switch (Day) {
    //     case 1:
    //         System.out.println("Monday");
    //         break;
    //     case 2:
    //         System.out.println("Tuesday");
    //         break;
    //     case 3:
    //         System.out.println("Wednesday");
    //         break;
    //     case 4:
    //         System.out.println("Thursday");
    //         break;
    //     case 5:
    //         System.out.println("Friday");
    //         break;
    //     case 6:
    //         System.out.println("Saturday");
    //         break;
    //     case 7:
    //         System.out.println("Sunday");
    //         break;
    
    //     default:
    //         System.out.println("not valid number");


    // }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //// for loop ////

 



   


   



    // 9. Write a Java program to reverse a given number using a for loop.
    //    Example:
    //    Input: 12345
    //    Output: 54321

    // 10. Write a Java program to check whether a given number is a palindrome.
    //     Example:
    //     Input: 1221
    //     Output: Palindrome

    // 11. Write a Java program to print the following pattern:

    //     *
    //     **
    //     ***
    //     ****
    //     *****

    // 12. Write a Java program to print the following pattern:

    //     1
    //     12
    //     123
    //     1234
    //     12345

    // 13. Write a Java program to print the following pattern:

    //         *
    //        ***
    //       *****
    //      *******
    //     *********






    // int n = 5;

    // for (int i = 1; i <= n; i++) {

    // // spaces
    //     for (int j = 1; j <= n - i; j++) {
    //     System.out.print(" ");
    //     }

    // // stars
    //     for (int j = 1; j <= 2 * i - 1; j++) {
    //     System.out.print("*");
    //     }

    // System.out.println();
    // }









    // 14. Write a Java program to print all Armstrong numbers between 1 and 1000.

    // 15. Write a Java program to find the second largest number from an array using a for loop.

    //     Example:
    //     Array = {10, 25, 8, 45, 32, 18}
    //     Output: 32



    // for (int i = 1; i <= 5; i++){

    //     for (int j = 1; j <= 5 -1; j++){
    //         System.out.print(" ");
    //     }
    //     for (int j = 1; j <= i; j++){
    //         System.out.print("*");
    //     } 

    //     System.out.println();
    // }

    // output
    // *                                    
    // **                           
    // *** 
    // ****
    // *****  



    // for(int i = 1; i <= 5; i++){
    //     for(int j = 1; j <= i; j++){
    //         System.out.print(i);
    //     }
    //     System.out.println();
    // }

    // output
    // 1
    // 22
    // 333
    // 4444
    // 55555




    // for(int i = 1; i <= 5; i++){
    //     for(int j = 1; j <= i; j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }

    //output
    // 1
    // 12
    // 123
    // 1234
    // 12345
    


      //Start    // end  
    // for(int i = 5; i >= 1; i--){
    //     for(int j = 1; j <= i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // output:
    // *****
    // ****
    // ***
    // **
    // *



    // for(int i = 1; i <= 5; i++){
    //     for(int j = 1; j <= i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // *
    // **
    // ***
    // ****
    // *****



    // int n = 5;

    // for(int i = 1; i <= n; i++){
    //     for(int j = 1; j <= n; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // output
    // *****
    // *****
    // *****
    // *****
    // *****









    // Assingment 11:

    // Assingment 10:

    // Assingment 9:

    // Assingment 8:
    // 8. Write a Java program to find the sum of all digits of a given number.***************************************************************************
    //    Example:
    //    Input: 5832
    //    Output: 18

    // int num = take.nextInt();
    // int sum = 0;

    // for(; num != 0; num = num / 10){
    //     int digit = num % 10;
    //     sum = sum + digit; 
    //     System.out.println(sum);
    // }
   



    // Assingment 7:
    // 7. Write a Java program to count the number of digits in a given number using a for loop.********************************************************
    //    Example:
    //    Input: 45872
    //    Output: 5 digits

    // int num = take.nextInt();
    // int count = 0;
    // for(; num != 0; num = num/10){
    //     count++;
    // }
    // System.out.println(count);



    // Assingment 6:
    // 6. Write a Java program to print the multiplication table of a given number from 1 to 20.***************************************************

    // int num = take.nextInt();
    // for(int i = 1; i <= 20; i++){
    //     System.out.println(num + " x " + i + " = " + (num * i));
    // }



    // Assingment 5:
    // 5. Write a Java program to calculate the power of a number without using Math.pow().
    //    Example:
    //    Input: 2, 5
    //    Output: 32

    // int base = take.nextInt();
    // int power = take.nextInt();
    // int result = 1;

    // for(int i = 1; i <= power; i++){
    //     result = result * base;
    // }
    // System.out.println(result);



    // Assingment 4:

    // 4. Write a Java program to find the factorial of a given number using a for loop.************************************************************************

        // int fact = 1;
        // int num = take.nextInt();

        // for(int i = 1; i <= num; i++){
        //     fact = fact * i;
        // }
        // System.out.println("Factorial :"+fact);


    // Assingment 3:
    // 3. Write a Java program to print all prime numbers between 1 and 100 using a for loop. *********************************************************************************

    // int  i, num, cout;

    // for(num = 1; num <= 100; num ++){
    //     cout = 0;
    //     for(i = 2; i <= num/2; i ++){
    //         if(num % i == 0){
    //             cout++;
    //             break;
    //         }
    //     }

    //     if(cout == 0 && num != 1){
    //         System.out.println(num + "");
    //     }

    // }



    // Assingment 2:
    // 2. Write a Java program to print the first 20 even numbers and calculate their sum.

    // for(int i = 1; i <= 20; i++){
    //     if(i % 2 == 0){
    //         System.out.println(i);
    //     }
    // }    


    // Assingment 1:
    // 1. Write a Java program to print all numbers between 1 and 100 that are divisible by both 3 and 5.

    // for(int i = 1;i <= 100; i++){
    //     if(i%3 == 0 && i%5 == 0){
    //         System.out.println(i);
    //     }
    // }



    //Ex 6:
    // for(int i = 1; i > 5; i--){
    //     System.out.println(i);
    // }

    // int sum = 0;
    // for(int i = 1; i <= 20; i++){
    // sum = sum + i;
    // System.out.println(sum);
    // }


    //Ex 5:
    // for(int i = 1; i <= 5; i++){
    //     System.out.println(i);
    // }


    //Ex 4: 
    // for(int i = 1; i <= 10; i++){
    //     System.out.println(i);
    // }


    //Ex 3.0:
    // for(int i = 0; i <= 20; i = i + 2){
    //     System.out.println(i);
    // }


    //Ex 3:
    // for(int i = 1; i <=20; i++){
    //     if(i % 2 != 0){
    //         System.out.println(i);
    //     }
    // }


    // for(int i = 1; i <= 20; i++){
    //     if(i % 2 == 0){
    //         System.out.println(i);
    //     }
    // }



    //Ex 2:
    // int sum = 1;
    // for(int i = 2; i <= 15; i++){
    //     sum = sum + i;
    //     System.out.println(sum);
    // }



    //Ex 1:

    // for (int i = 1; i <= 15; i++){
    //     System.out.println(i);
    // }




////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




//// While Loop ////

    // The while loop repeats a block of 
    // code as long as the specified condition is true:

    //Ex 4:

    // int i = 10;
    // while(i < 20){
    //     System.out.println("hi");
    //     i++;
    // }

    //Ex 3:

//     int count = 3;
//     while(count > 0){
//         System.out.println(count);
//         count--;
//     }
//     System.out.println("Happy New Year");



    //Ex 2:
    
    // int i = 0;
    // while(i < 5){
    //     System.out.println(i);
    //     i++;
    // }



    //Ex 1:

    // String name = "";

    // while(name.isEmpty()){
    //     System.out.print("Enter your name: ");
    //     name = take.nextLine();
    // }
    // System.out.println("Hello "+ name);

    // take.close();


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


 //// if else ////
    
    // Assingment 26: hard problem in nested if else

    // Q14. Bank Loan Eligibility
    // Accept:
    // Age
    // Salary
    // Credit score
    // Employment status

    // Logic:
    // First check whether age is between 21 and 60.
    // If eligible, check salary.
    // If salary is sufficient, check credit score.
    // If credit score is good, check employment status.
    // Finally display:
    // Loan Approved
    // Age Not Eligible
    // Salary Not Eligible
    // Credit Score Too Low
    // Employment Not Eligible

    // System.out.print("Enter Age :");
    // int age = take.nextInt();

    // System.out.print("Enter Salary :");
    // int salary = take.nextInt();

    // System.out.print("Enter Credit Score :");
    // int C_Score = take.nextInt();

    // System.out.print("Employment Status :");
    // String employ = take.next();***********************************************************************************************

    // if(age >= 21 && age <= 60){
    //     if(salary >= 25000){
    //         if(C_Score >= 720){
    //             if(employ.equals("employed")){          
    //                 System.out.println("Loan Approved");
    //             }
    //             else{
    //                 System.out.println("Not Eligible");
    //             }
    //         }
    //         else{
    //             System.out.println("Credit Score To Low");
    //         }
    //     }
    //     else{
    //         System.out.println("Salary not Eligible");
    //     }  
    // }
    // else{
    //     System.out.println("Age Not Eligible");
    // }
    



    // Assingment 25: nested **************************************************************************************************************

    // 5. Write a restaurant billing system:
    // Customer Type: Regular, Premium, VIP
    // Apply different discounts based on bill amount and customer type.

    // String cust = take.nextLine();

    // if(cust.equals("regular")){
    //     System.out.println("Discount up to 5%");
    // }
    // else if(cust.equals("premium")){
    //     System.out.println("Discount up to 25%");
    // }
    // else if(cust.equals("vip")){
    //     System.out.println("Discount up to 30%");
    // }
    // else{
    //     System.out.println("Invalid intput");
    // }
    


    // Assingment 24:

    // Age and Ticket Price
    // Accept a person's age. First check whether the person is a child, adult, or senior citizen. 
    // If the person is an adult, check whether they are a student and calculate the ticket price accordingly.

    // int age = take.nextInt();

    // if(age < 18){
    //     System.out.println("Child Ticket Price = 100");
    // }
    // else if(age >= 60){
    //     System.out.println("Senior Citizen Ticket Price = 150");
    // }
    // else{

    //     System.out.print("Are you a student? (true/false): ");
    //     boolean student = take.nextBoolean();

    //     if(student){
    //         System.out.println("Adult Student Ticket Price = 120");
    //     }
    //     else{
    //         System.out.println("Normal Adult Ticket Price = 200");
    //     }

    // }


    // Assingment 22: nested if else *************************************************************

    // Login System
    // Accept a username and password. First check whether the username is correct. If it is correct, check whether the password is correct. Display:

    // Invalid Username
    // Invalid Password
    // Login Successful

    // System.out.print("Enter Username :");
    // String user = take.nextLine();
    // System.out.print("Enter Password :");
    // int pass = take.nextInt();

    // if(user.equals("vedant")){
    //     if(pass == 321){
    //         System.out.println("Login Successful");
    //     }
    //     else{
    //         System.out.println("Invalid Password");
    //     }
    // }
    // else{
    //     System.out.println("Invalid Username");
    // }



    // Assingment 21:

    // 16. Write a program to calculate income tax:
    // Income up to ₹2,50,000 : No Tax
    // ₹2,50,001 - ₹5,00,000  : 5%
    // ₹5,00,001 - ₹10,00,000 : 20%
    // Above ₹10,00,000       : 30%

    // int income = take.nextInt();
    
    // if(income <= 250000){
    //     System.out.println("No Tax");
    // }
    // else if(income >= 250000 && income <= 500000){
    //     System.out.println("5% Tax");
    // }
    // else if(income >= 500000 && income <=1000000){
    //     System.out.println("20% Tax");
    // }
    // else{
    //     System.out.println("30% Tax");
    // }



    // Assingment 20:

    // 15. Write a program to check whether a person can apply for a driving license:
    // Below 18 : Not Eligible
    // 18-60 : Eligible
    // Above 60 : Eligible with Medical Certificate

    // int age = take.nextInt();

    // if(age < 18){
    //     System.out.println("Not Eligible");
    // }
    // else if(age >= 18 && age <= 60){
    //     System.out.println("Eligible");
    // }
    // else{
    //     System.out.println("Eligible with Medical Certificate");
    // }


  
    // Assingment 19:

    // 14. Write a program to determine ticket price:
    // Age below 5      : Free
    // Age 5-12         : ₹100
    // Age 13-59        : ₹200
    // Age 60 and above : ₹150

    // int age = take.nextInt();

    // if(age < 5){
    //     System.out.println("Free");
    // }
    // else if(age >= 5 && age <= 12){
    //     System.out.println("$ 100");
    // }
    // else if(age >= 13 && age <= 59){
    //     System.out.println("$ 200");
    // }
    // else{
    //     System.out.println("$ 150");
    // }



    // Assingment 18:

    // 13. Write a program to check examination result:
    // Marks >= 75 : Distinction
    // Marks >= 60 : First Class
    // Marks >= 50 : Second Class
    // Marks >= 35 : Pass
    // Otherwise : Fail

    // int marks = take.nextInt();

    // if(marks >= 75){
    //     System.out.println("Distriction");
    // }
    // else if(marks >= 60){
    //     System.out.println("First Class");
    // }
    // else if(marks >= 50){
    //     System.out.println("Second Class");
    // }
    // else if(marks >= 35){
    //     System.out.println("Thank God Pass");
    // }
    // else{
    //     System.out.println("Way to farm");
    // }



    // Assingment 18: Comparision *************************************************************************** nested if else
    
    // find big value
    // a
    // b
    // c

    // int a = take.nextInt();
    // int b = take.nextInt();
    // int c = take.nextInt();

    // if(a > b){
    //     if(a > c){
    //         System.out.println("a");
    //     }
    //     else{
    //         System.out.println("c");
    //     }

    // }
    // else{
    //     if(b > c){
    //         System.out.println("b");
    //     }
    //     else{
    //         System.out.println("c");
    //     }
    // }



    // Assingment 17:

    // 12. Write a program to classify temperature:
    // Below 0°C       : Freezing
    // 0-15°C          : Cold
    // 16-25°C         : Pleasant
    // 26-35°C         : Warm
    // Above 35°C      : Hot

    // int temp = take.nextInt();

    // if(temp < 0){
    //     System.out.println("Freezing Temperature");
    // }
    // else if(temp >= 0 && temp <= 15){
    //     System.out.println("Cold Temperature");
    // }
    // else if(temp >= 16 && temp <= 25){
    //     System.out.println("Pleasant Temperature");
    // }
    // else if(temp >= 26 && temp <= 35){
    //     System.out.println("Warm Tempersture");
    // }
    // else if(temp > 35){
    //     System.out.println("Hot Temperature");
    // }
    // else{
    //     System.out.println("invalid input");
    // }



    // Assingment 16:

    // 11. Write a program to check whether a given month has:
    // 31 days (1,3,5,7,8)
    // 30 days (4,6,9,11)
    // 28/29 days (2)

    // System.out.print("Enter month number (1-12): ");
    // int Day = take.nextInt();

    // if(Day == 1 || Day == 3 || Day == 5 || Day == 7 || Day == 8 || Day == 10 || Day == 12){
    //     System.out.println("this month has 31 days");
    // }
    // else if(Day == 4 || Day == 6 || Day == 9 || Day == 11){
    //     System.out.println("this month has 30 days");
    // }
    // else if(Day == 2){
    //     System.out.println("this month has 28 to 29 days");
    // }
    // else{
    //     System.out.println("not a valid number");
    // }



    // Assingment 15:

    // 10. Write a calculator program using else if / elif.
    // Perform:
    // Addition
    // Subtraction
    // Multiplication
    // Division
    // Modulus
    // Take operator as input.

    // System.out.print("first value :");
    // int num1 = take.nextInt();
    // System.out.print("take Operator :");
    // char op = take.next().charAt(0);
    // System.out.print("second value :");
    // int num2 = take.nextInt();

    // if( op == '+'){
    //     int result = num1 + num2;
    //     System.out.println("Ans : "+ result);
    // }
    // else if( op == '-'){
    //     int result = num1 - num2;
    //     System.out.println("Ans : "+result);
    // }
    // else if( op == '*'){
    //     int result = num1 * num2;
    //     System.out.println("Ans : "+result);
    // }
    // else if( op == '/'){
    //     int result = num1 / num2;
    //     System.out.println( "Ans : "+result);
    // }
    // else if( op == '%'){
    //     int result = num1 % num2;
    //     System.out.println("Ans : "+result);
    // }
    // else{
    //     System.out.println("invalid input");
    // }



    // Assingment 14:

    // 9. Write a program to check whether a person is eligible for:
    // School
    // College
    // Job
    // Retirement
    // based on age.

    // int age = take.nextInt();

    // if(age >= 5 && age <= 17){
    //     System.out.println("eligible for school");
    // }
    // else if(age >= 18 && age <= 26 ){
    //     System.out.println("eligible for college");
    // }
    // else if(age >= 27 && age <= 59){
    //     System.out.println("eligible for job");
    // }
    // else if(age <= 4){
    //     System.out.println("not eligible for study");
    // }
    // else{
    //     System.out.println("eligible for retirement");

    // }



    // Assingment 13:

    // 8. Write a program to check whether a number is:
    // Divisible by both 3 and 5
    // Divisible only by 3
    // Divisible only by 5
    // Not divisible by either

    // int Number = take.nextInt();

    // if(Number % 3 == 0 && Number % 5 == 0){
    //     System.out.println("Divisible by both 3 and 5");
    // }
    // else if(Number % 3 == 0){
    //     System.out.println("Divisible only by 3");
    // }
    // else if(Number % 5 == 0){
    //     System.out.println("Divisible only by 5");
    // }
    // else{
    //     System.out.println("Not Divisible by either");
    // }



    // Assingment 12:

    // 7. Write a program to display the day of the week based on a number:
    // 1 = Monday
    // 2 = Tuesday
    // ...
    // 7 = Sunday
    // Otherwise display "Invalid Day".

    // int day = take.nextInt();

    // if(day == 1){
    //     System.out.println("Monday");
    // }
    // else if(day == 2){
    //     System.out.println("Tuesday");
    // }
    // else if(day == 3){
    //     System.out.println("Wednesday");
    // }
    // else if(day == 4){
    //     System.out.println("Thursday");
    // }
    // else if(day == 5){
    //     System.out.println("Friday");
    // }
    // else if(day == 6){
    //     System.out.println("Saturday");
    // }
    // else if(day == 7){
    //     System.out.println("Sunday");
    // }
    // else{
    //     System.out.println("not valid number");
    // }



    // Assingment 11:

    // 6. Write a program to check whether a person is:
    // Child (0-12)
    // Teenager (13-19)
    // Adult (20-59)
    // Senior Citizen (60 and above)

    // int age = take.nextInt();

    // if(age >= 0 && age <= 12){
    //     System.out.println("Child");
    // }
    // else if(age >=13 && age <= 19){
    //     System.out.println("Teenager");
    // }
    // else if(age >= 20 && age <= 59){
    //     System.out.println("Adult");
    // }
    // else{
    //     System.out.println("Senior Citizen");
    // }



    // Assingment 10:

    // 5. Write a program to check whether a character is:
    // Vowel = a,e,i,o,u
    // Consonant = remening 
    // Invalid input (if not an alphabet)

    // char letter = take.next().charAt(0);

    // if((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')){
    
    //  if( letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || 
    //      letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
    //     System.out.println("is a Vowel");
    // }
    // else{
    //     System.out.println("is a Consonant");
    // }
    // }
    // else{
    //     System.out.println("not an Alphabet");
    // } 
    // take.close();



    // Assingment 9:

    // 4. Write a program to calculate a student's grade based on marks:
    // 90-100 : A
    // 80-89  : B
    // 70-79  : C
    // 60-69  : D
    // Below 60 : Fail

    // int marks = take.nextInt();

    // if(marks >= 90 && marks <= 100){
    //     System.out.println("A");
    // }
    // else if(marks >= 80 && marks < 89){
    //     System.out.println("B");
    // }
    // else if(marks >= 70 && marks <= 79){
    //     System.out.println("C");
    // }
    // else if(marks >= 60 & marks <= 69){
    //     System.out.println("D");
    // }
    // else{
    //     System.out.println("Fail");
    // }



    //Assingment 8 :

    // 3. Write a program to check whether a year is:
    // Leap Year
    // Not a Leap Year

    // int year = take.nextInt();

    // if(year % 400 == 0){
    //     System.out.println("Leap Year");
    // }
    // else if(year % 100 == 0){
    //     System.out.println("not Leap Year");
    // }
    // else if(year % 4 == 0){
    //     System.out.println("Leap Year");
    // }
    // else{
    //     System.out.println("not Leap Year");
    // }



    // Assingment 7 :

    // 2. Write a program to find the largest among three numbers using else if / else if.

    // int first = take.nextInt();
    // int second = take.nextInt();
    // int third = take.nextInt();

    // if(first > second && first >third){
    //     System.out.println("Largest Number is: "+ first);
    // }
    // else if(second > first && second > third){
    //     System.out.println("Largest Number is: "+ second);
    // }
    // else{
    //     System.out.println("Largest Number is: "+ third);
    // }



    // Assingment 6 :

    // 1. Write a program to check whether a number is:
    // Positive
    // Negative
    // Zero

    // int num = take.nextInt();

    // if(num > 0){
    //     System.out.println("Positive Number");
    // }
    // else if(num < 0){
    //     System.out.println("Negative Number");
    // }
    // else{
    //     System.out.println("Zero");
    // }



    // Assingment 5

    // int Day = take.nextInt();

    // if(Day == 1){
    //     System.out.println("Monday");
    // }
    // else if(Day == 2){
    //     System.out.println("Tuesday");
    // }
    // else if(Day == 3){
    //     System.out.println("Wednesday");
    // }
    // else if(Day == 4){
    //     System.out.println("Thursday");
    // }
    // else if(Day == 5){
    //     System.out.println("Friday");
    // }
    // else if(Day == 6){
    //     System.out.println("Saturday");
    // }
    // else if(Day == 7){
    //     System.out.println("Sunday");
    // }
    // else{
    //     System.out.println("Not valid Number");
    // }



    // Assingment 4

    // int age = take.nextInt();

    // if(age >= 18){
    //     System.out.println("Eligible for Voting");
    // }
    // else{
    //     System.out.println("Not Eligible for Voting");
    // }


  
    // Assingment 3

    // int N = take.nextInt();
    // System.out.println("take a number :");

    // if(N%2==0){
    //     System.out.println("Even Number");
    // }
    // else{
    //     System.out.println("Odd Number");
    // }



    // Assingment 2

    // int n = take.nextInt();

    // if(n>0){
    //     System.out.println("Positive Number");
    // }
    // else if(n==0){
    //     System.out.println("Zero Number");
    // }
    // else{
    //     System.out.println("Negative Number");
    // }



    // Assingment 1    
    
    // int Buy = take.nextInt();
    // int Sell = take.nextInt();

    // if(Sell > Buy)
    // {
    //     System.out.println("Profit");
    // }
    // else if(Sell == Buy)
    // {
    //     System.out.println("No profit no loss");
    // }
    // else
    // {
    //     System.out.println("Loss");
    // }







      
//   Methods	                             Description

// nextBoolean()	            Reads a boolean value from the user
// nextByte()	                Reads a byte value from the user
// nextDouble()	                Reads a double value from the user
// nextFloat()	                Reads a float value from the user
// nextInt()	                Reads a int value from the user
// nextLine()	                Reads a String value from the user
// nextLong()	                Reads a long value from the user
// nextShort()	                Reads a short value from the user

    //Ex : int = nextInt()
    // int a = V1.nextInt();
    // int b = V1.nextInt();
    // System.out.println(ans+(a*b));


    // //Ex : String = nextLine()
    // System.out.println("take name");
    // String first = V1.nextLine();
    // String last = V1.nextLine();
    // System.out.println(first+" "+ last);
    
    // System.out.println("enter a name :");
    // String Name = V2.nextLine();


    // System.out.println("enter a age");
    // int Age = V2.nextInt();

    // System.out.println("enter a hight");
    // float Hight = V2.nextFloat();

    // System.out.println("Name : " + Name);
    // System.out.println("Age : " + Age);
    // System.out.println("Hight : " + Hight);










    }



}