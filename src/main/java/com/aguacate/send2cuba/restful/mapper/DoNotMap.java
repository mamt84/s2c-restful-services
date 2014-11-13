/**
 * 
 */
package com.aguacate.send2cuba.restful.mapper;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Martin
 *
 *         Annotation intended to signal that a field shouldn't be mapped
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface DoNotMap {

}
