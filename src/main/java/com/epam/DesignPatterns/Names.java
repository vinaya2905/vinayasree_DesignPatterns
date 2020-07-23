package com.epam.DesignPatterns;

public class Names implements Container {
	public String name[]={"Vinaya","Pravallika","Greeshma","Sreelekha"};   
    
	public Iterator getIterator() {  
	        return new CollectionofNamesIterate() ;  
	    }  
	    private class CollectionofNamesIterate implements Iterator{  
	        int i;  
	        public boolean hasNext() {  
	            if (i<name.length){  
	                return true;  
	            }  
	            return false;  
	        }  
	        public Object next() {  
	            if(this.hasNext()){  
	                return name[i++];  
	            }  
	            return null;      
	        }  
	    }  
}  
