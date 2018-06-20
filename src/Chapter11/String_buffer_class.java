package Chapter11;

public class String_buffer_class {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("Java");
		System.out.println(sb);
		
		sb.append(" programing");
		System.out.println(sb);
		
		sb.replace(0,4,"Web");
		System.out.println(sb);
		
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}
}
