package com.minicoding.combination.service.impl;

import java.util.LinkedList;

import org.springframework.stereotype.Service;

import com.minicoding.combination.constant.PhoneDigits;
import com.minicoding.combination.service.LetterOutput;

/**
 * 
 * @author laifuwei
 *
 */
@Service
public class LetterOutputImpl implements LetterOutput {
	
	
	@Override
	public String digitsToLetterCombination(String digits) {
		//receive results
		LinkedList<String> result = new LinkedList<String>();
		if(digits.isEmpty()) return "";
		//initialization
		result.add("");
		for(int i =0; i<digits.length();i++){
			//Get the corresponding digit according to the index
			int digit = Character.getNumericValue(digits.charAt(i));
			/*
			 * Determine if the length of the first element in the list is equal to the index of loops.
			 * The comparison results return false,indicates that the letter has been combined.
			 */
			while(result.getFirst().length() == i){
				/*
				 * Retrieves and removes the head (first element) of this list.
				 * Use this element(t) to concatenate phoneMap-value(the letter).
				 * Use queue first in, first out
				 */
				String t = result.remove();
				for(String s : PhoneDigits.phoneMap.get(digit))
					result.add(t+s);//Use the previous letter combination to rejoin
			}
		}
		return result.toString();
	}
	
}
