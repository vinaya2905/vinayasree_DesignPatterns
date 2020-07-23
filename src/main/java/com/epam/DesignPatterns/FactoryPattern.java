package com.epam.DesignPatterns;

public class FactoryPattern {
	public static Plan getPlan(String planType){  
        if(planType == null){  
         return null;  
        }  
      if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
             return new DomesticPlan();  
           }   
       else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
            return new CommercialPlan();  
        }   
  return null;  
}  
}
