package com.example.datamasking.datamasking;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@JacksonAnnotationsInside // using this, we override jackson behaiviour.
@JsonSerialize(using = ProtectDataSerializer.class) //this is class where we we have written main logic to mask data on which when we apply @MaskData annotation.
@Target(ElementType.FIELD) //where you want to define on top of class or field. (Ex. on class level , on method level etc.)
@Retention(RetentionPolicy.RUNTIME) // when you want to implement this annotation (Ex. at run time, at complie time etc.)
public @interface MaskData {
}
