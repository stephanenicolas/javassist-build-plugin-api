package javassist.build;

/**
 * A generic build exception when applying a transformer.
 * Wraps the real cause of the (probably javassist) root exception.
 * @author SNI
 */
@SuppressWarnings("serial")
public class JavassistBuildException extends Exception {
	
	public JavassistBuildException() {
		super();
	}

	public JavassistBuildException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public JavassistBuildException(String message) {
		super(message);
	}

	public JavassistBuildException(Throwable throwable) {
		super(throwable);
	}
}
