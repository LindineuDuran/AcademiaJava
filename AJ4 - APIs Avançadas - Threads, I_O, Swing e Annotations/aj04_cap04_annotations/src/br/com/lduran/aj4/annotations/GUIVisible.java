package br.com.lduran.aj4.annotations;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface GUIVisible
{
	String nomeCampo() default "Valor default";
}
