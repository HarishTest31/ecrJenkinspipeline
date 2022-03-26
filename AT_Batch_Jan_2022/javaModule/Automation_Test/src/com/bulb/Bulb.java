package com.bulb  ;

public class Bulb {
	
    private Boolean state;
    
    Bulb()
    {
        state = Boolean.FALSE;
    }
    
    void TurnOn()
    {
        this.state = Boolean.TRUE;
        System.out.println("on");
    }
    
    void TurnOff()
    {
        this.state = Boolean.FALSE;
        System.out.println("off"
        		+ "");
    }
    
    Boolean getState()
    {
        return this.state;
    }
}
