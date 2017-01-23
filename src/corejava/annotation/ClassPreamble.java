package corejava.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassPreamble {
	String author();
	String date();
	float version() default 1;
	String lastModified();
	String by();
	String[] reviewers();	
}
