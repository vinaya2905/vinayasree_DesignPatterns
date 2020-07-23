package com.epam.DesignPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	System.out.println("--CREATIONAL PATTERNS--");
    	System.out.println();
        System.out.println( "->BUILDER PATTERN:-" );
    	BuilderPattern b=new BuilderPattern();
    	System.out.println("show items of cake");
    	b.showItems();
    	
    	
    	System.out.println();
    	
    	
    	System.out.println("->FACTORY PATTERN:-");
    	FactoryPattern f=new FactoryPattern();
    	System.out.print("Enter the name of plan for which the bill will be generated: ");  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
    
        String planName=br.readLine();  
        System.out.print("Enter the number of units for bill will be calculated: ");  
        int units=Integer.parseInt(br.readLine());  
        Plan p=f.getPlan(planName);
        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
        p.getRate();  
        p.calculateBill(units); 
        
        
        System.out.println();
        
        System.out.println("--STRUCTURAL PATTERNS--");
        System.out.println();
        System.out.println("->ADAPTER PATTERN :-");
        AdapterFactory audioPlayer = new AdapterFactory();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
        
        System.out.println();
        System.out.println("->DECORATOR PATTERN:");
        
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
        
        System.out.println("--BEHAVIOURAL PATTERN--");
        System.out.println();
        System.out.println("->ITERATOR PATTERN:");
        Names cmpnyRepository = new Names();  
        
        for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){  
            String name = (String)iter.next();  
            System.out.println("Name : " + name); 
        }
   }
}
