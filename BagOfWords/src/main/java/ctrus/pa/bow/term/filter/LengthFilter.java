/*******************************************************************************
 * Copyright (c) 2015, 2016  Naveen Kulkarni
 *
 * This file is part of Bag of Words program. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *     Naveen Kulkarni (naveen.kulkarni@research.iiit.ac.in)
 *     
 *******************************************************************************/

package ctrus.pa.bow.term.filter;

public class LengthFilter extends BaseFilter {

	public static final int MIN_WORD_LENGTH = 3;	
	private int _minLength = MIN_WORD_LENGTH;
	
	public void setMinLength(int minLength) {
		_minLength = minLength;
	}
	
	public boolean filter(String term) {
		return term.length() < _minLength;
	}

}
