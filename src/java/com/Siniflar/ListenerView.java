package com.Siniflar;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class ListenerView {
    
    private String text;
    
    public String getText(){
        
        return this.text;
    }
    
    public void setText(String text){
        this.text = text;
    }
    
    public void handleKeyEvent(){
        this.text = this.text.toUpperCase();
    }
}
