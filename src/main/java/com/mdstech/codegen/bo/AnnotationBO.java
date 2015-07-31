package com.mdstech.codegen.bo;

import java.util.ArrayList;
import java.util.List;

/**
* This class defines metadata specification for Annotations.
* @author Srini Maddineni
*
*/

public class AnnotationBO {
	private String name;
	private List<AnnotationPropertyBO> annotationProperties;
	private List<AnnotationBO> childAnnotations;
  
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<AnnotationPropertyBO> getAnnotationProperties() {
		if(annotationProperties == null) {
			annotationProperties = new ArrayList<AnnotationPropertyBO>();
		}
		return annotationProperties;
	}

	public List<AnnotationBO> getChildAnnotations() {
		if(childAnnotations == null) {
			childAnnotations = new ArrayList<AnnotationBO>();
		}
		return childAnnotations;
	}
    
}
