package com.mdstech.codegen.bo;

import java.util.List;

/**
* This class defines Class level metadata specification information.
* @author Srini Maddineni
*
*/
public class ClazzBO {
  private boolean abstractClazz;
  private String name;
  private String descriptrion;
  private String authorName;
  private List<AnnotationBO> annotations;
  private List<GenericBO> generics;
  private List<InterfaceBO> extendInterfaces;
  private ClassBO extendedClazz;
  private List<PropertyBO> properties;
  private List<MethodBO> methods;
  private List<ConstructBO> constructors;
  
	public boolean isAbstractClazz() {
		return abstractClazz;
	}

	public void setAbstractClazz(boolean abstractClazz) {
		this.abstractClazz = abstractClazz;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescriptrion() {
		return descriptrion;
	}

	public void setDescriptrion(String descriptrion) {
		this.descriptrion = descriptrion;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public List<AnnotationBO> getAnnotations() {
		return annotations;
	}

	public void setAnnotations(List<AnnotationBO> annotations) {
		this.annotations = annotations;
	}

	public List<GenericBO> getGenerics() {
		return generics;
	}

	public void setGenerics(List<GenericBO> generics) {
		this.generics = generics;
	}

	public List<InterfaceBO> getExtendInterfaces() {
		return extendInterfaces;
	}

	public void setExtendInterfaces(List<InterfaceBO> extendInterfaces) {
		this.extendInterfaces = extendInterfaces;
	}

	public ClassBO getExtendedClazz() {
		return extendedClazz;
	}

	public void setExtendedClazz(ClassBO extendedClazz) {
		this.extendedClazz = extendedClazz;
	}

	public List<PropertyBO> getProperties() {
		return properties;
	}

	public void setProperties(List<PropertyBO> properties) {
		this.properties = properties;
	}

	public List<MethodBO> getMethods() {
		return methods;
	}

	public void setMethods(List<MethodBO> methods) {
		this.methods = methods;
	}

	public List<ConstructBO> getConstructors() {
		return constructors;
	}

	public void setConstructors(List<ConstructBO> constructors) {
		this.constructors = constructors;
	}
}
