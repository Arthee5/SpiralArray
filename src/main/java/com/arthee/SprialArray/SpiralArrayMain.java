package com.arthee.SprialArray;

import com.arthee.SprialArray.Display.*;
import com.arthee.SprialArray.Controller.SpringArrayController;


public class SpiralArrayMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("#################################");
        System.out.println("###Spiral Array Gradle Project###");
        System.out.println("#################################\n\n");
        
        final char[][] array = {
				{ 'S', 'P', 'I', 'R' },
				{ 'A', 'Y', 'S', 'A' },
				{ 'R', 'R', 'A', 'L' },
		};
		
		final SpringArrayController springArrayController = new SpringArrayController();
		final IArrayDisplay arrayDisplay = springArrayController.create();
		arrayDisplay.print(array);
                
        System.out.println("\n\n\n#################################");
	}
}
