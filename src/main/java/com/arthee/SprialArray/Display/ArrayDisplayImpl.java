/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arthee.SprialArray.Display;

import com.arthee.SprialArray.Iterator.SpiralIterator;
import java.util.Iterator;

/**
 *
 * @author Arthee
 */
public class ArrayDisplayImpl implements IArrayDisplay{
    
    @Override
	public void print(final char[][] array) {
		final Iterator<String> iterator = new SpiralIterator(array);
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
		}
	}
    
}
