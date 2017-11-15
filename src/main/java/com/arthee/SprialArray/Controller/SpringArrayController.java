/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arthee.SprialArray.Controller;

import com.arthee.SprialArray.Display.*;

/**
 *
 * @author Arthee
 */
public class SpringArrayController {
    
    public IArrayDisplay create(){
        ArrayDisplayImpl arrayDisplayImpl = new ArrayDisplayImpl();
       return arrayDisplayImpl;        
    } 
    
}
