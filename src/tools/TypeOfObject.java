package tools;

public class TypeOfObject {
	public static String getType(Object o) {
		return o.getClass().toString();
	}

	public static String getType(int o) {
		return "int";
	}

	public static String getType(byte o) {
		return "byte";
	}

	public static String getType(char o) {
		return "char";
	}

	public static String getType(double o) {
		return "double";
	}

	public static String getType(float o) {
		return "float";
	}

	public static String getType(long o) {
		return "long";
	}

	public static String getType(boolean o) {
		return "boolean";
	}

	public static String getType(short o) {
		return "short";
	}
}
