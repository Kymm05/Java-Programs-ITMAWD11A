package com.mycompany.itmawd11akymmmm;

import java.util.Scanner;

public class ITMAWD11AKymmmm {
       
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.println("Select Program: (1) GradeConversion (2) MailShape (3) LetterM (4) WhileLoop (5) Diamond (6) Hallow Diamond (7) Odd Even (8) Calculator");
    int choice = input.nextInt();
    
    if(choice == 1){
        GradeConversion();
    }
    else if(choice == 2){
        MailShape();
    }
    else if(choice == 3){
        LetterM();
    }
    else if(choice == 4){
        WhileLoop();
    }
    else if(choice == 5){
        Diamond();
    }
    else if(choice == 6){
        HallowDiamond();
    }
    else if(choice == 7){
        OddEvent();
    }
    else if(choice == 8){
        Calculator();
    }
    
    
    }
    static void GradeConversion(){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Grade: ");
        double grade = input.nextInt();
        
        double average = 100/grade;
        System.out.println(average);
        
        
    }
    static void MailShape(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Rows: ");
    int rows = input.nextInt();
                //Outputting for Box shape
                for (int i=0;i<rows;i++) {
                    for (int j=0;j<rows;j++) {
                        if(i==0 || i==j || i == rows-1 || i ==(rows-1)/1 || i == rows-j-1 || j==0 || j== 0 || j == (rows-1)/1){
                            System.out.print("* ");
                        }else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }

                   for(int i=rows-1; i>0; i--)
                        {  
                for(int j=rows; j>i; j--)  {  
                //prints space          
                System.out.print(" ");  
                }  

        //prints symbol  
        System.out.print("*");  
        for(int j=1; j<(2*i)-2; j++)  
        {  
        //prints space      
        System.out.print(" ");  
        }  
        if(i==0||i==1)  
        {  
        //throws cursor to the next line          
        //System.out.print("*");  
        }  
        else  
        {  
        //prints symbol and throws cursor to the next line       
        System.out.print("*");  
        }
            System.out.println();
        }
    }
    static Void LetterM(){
        
    Scanner z = new Scanner(System.in);
    
    System.out.println("Enter Height:");                                                                                                   
    int height = z.nextInt();

    int i, j, counter = 0;
    for (i = 0; i < height; i++)
    {
        System.out.printf("*");
        for (j = 0; j <= height; j++)
        {
            if (j == height)
                System.out.printf("*");
            else if (j == counter
                    || j == height - counter - 1)
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        if (counter == height / 2)
        {
            counter = -99999;
        }
        else
        counter++;
        System.out.println("");
    }
        return null;
    
    }
    static void WhileLoop(){
        
    Scanner z = new Scanner(System.in);
    System.out.println("Enter Number:");                                                                                                   
    int choice = z.nextInt();

    while(choice<0||choice >= 21)
    {
        System.out.println("Invalid");
    }
    
    }
    static void Diamond(){
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    int no = sc.nextInt();

        int count = 1;
        for (int i = 1; i <= 2 * no - 1; i++) {
            for (int j = count; j <= no; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= count * 2 - 1; k++) {
                System.out.print("* ");
            }
            if (i < no)
                count++;
            else
                count--;
            System.out.println("");
        }
    
    }
    static void HallowDiamond(){
    Scanner z = new Scanner(System.in);
    System.out.println("Enter Number:");                                                                                                   
    int choice = z.nextInt();    

    for(int i=1; i<=choice; i++)  
    {  
    for(int j=1; j<=choice-i+1; j++)  
    {  
    System.out.print("*");  
    }   

    for(int k=1; k<=2*i-2; k++)  
    {  
    System.out.print(" ");  
    }   
    for(int j=1; j<=choice-i+1; j++)  
    {  
    System.out.print("*");  
    }   
    System.out.println();  
    }  

    for(int i=9; i>=1; i--)  
    {  
    for(int j=i; j<=choice; j++)  
    {  
    System.out.print("*");  
    }   

    for(int k=1; k<=(2*i)-2; k++)  
    {  
    System.out.print(" ");  
    }   
    for(int j=i; j<=choice; j++)  
    {  
    System.out.print("*");  
    }   
    System.out.println();  
    }
    }
    static void OddEvent(){
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = reader.nextInt();

    String evenOdd = (num % 2 == 0) ? "even" : "odd";

    System.out.println(num + " is " + evenOdd);

    }
    static void Calculator(/*Calculator*/) {
    
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Enter Num1:");
    int num1 = reader.nextInt();

    System.out.print("Enter Num2:");
    int num2 = reader.nextInt();
    
    System.out.print("Enter Arithmetical operations:");
    char choice = reader.next().charAt(0);
    
    if(choice == '+'){
        System.out.println("The Sum Is:" + (num1 + num2));
    }
    else if(choice == '-'){
       System.out.println("The Difference Is:" + (num1 - num2));
    }
    else if(choice == '*'){
       System.out.println("The Product Is:" + (num1 * num2));
    }
    else if(choice == '/'){
        
       float first = num1;
       float second = num2;
       
       System.out.println("The Quotient Is:" + (first / second));
    }
    
    }
    
}
