/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iusb;

/**
 *
 * @author carlyshroyer
 */
public class HashtagCounter {
    String tweet;
    //instance variable below
    
    private int countNumberSigns() {        
        
        int count = 0;        
        for (int i = 0; i < tweet.length(); i++) {            
            if (tweet.charAt(i) == '#') {                
                count++;            
            }        
        }        
        return count;    
    }
    
   //instance variable below
 
   private int countHashtags() {        
     
       int count = 0;
       for (int i = 0; i < tweet.length() - 1; i++) {           
            if (tweet.charAt(i) == '#') { // is a number sign 
                if (tweet.charAt(i+1) != ' ') { // nonwhitespace after          
                    if (i == 0) { // first character of String                      
                        count++;                  
                    } else {                       
                        if (tweet.charAt(i-1) == ' ') { // follows a space                
                            count++;            
                        }                 
                    }            
                }          
            }       
       }       
       return count;    
   }
   //constructor below
    public HashtagCounter(String tweetText){
        this.tweet = tweetText;
        System.out.printf("There is(are) %d hashtag(s) and %d number sign(s) in your tweet.\n", countHashtags(), countNumberSigns());  
    }
}
