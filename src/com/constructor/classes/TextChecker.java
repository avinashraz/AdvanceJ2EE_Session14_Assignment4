package com.constructor.classes;

public class TextChecker {
private SpellChecker spellChecker;
	
	public TextChecker(SpellChecker spellChecker) {
	      System.out.println("Inside TextEditor constructor." );
	      this.spellChecker = spellChecker;
	   }
	   public void spellCheck() {
	      spellChecker.checkSpell();
	
	   }
}
