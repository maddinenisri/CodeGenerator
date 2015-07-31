package com.mdstech.codegen.bo;

/**
* This class defines key value pair of annotation properties.
* @author Srini Maddineni
*
*/

public class AnnotationPropertyBO {
  private String key;
  private String value;
  private boolean quotesRequired;
  
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isQuotesRequired() {
		return quotesRequired;
	}

	public void setQuotesRequired(boolean quotesRequired) {
		this.quotesRequired = quotesRequired;
	}
  
}
