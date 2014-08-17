package javassist.build;

import javassist.CtClass;

/**
 * A common interface to define class transformers, java (or groovy) 
 * entities that can manipulate classes during build processes, 
 * right after javac compiled them.
 * @author SNI
 */
public interface ClassTransformer {
	void applyTransformations(CtClass ctClass);
	boolean shouldTransform(CtClass ctClass);
}
