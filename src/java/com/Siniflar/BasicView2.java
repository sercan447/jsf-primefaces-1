package com.Siniflar;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class BasicView2 {
 
    private String text;
    
    public String getText(){
        return this.text;
    }
    
    public void setText(String text){
        
        this.text = text;
    }
    
}
