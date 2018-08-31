import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmailAddress {
	public static void main(String[] args) {
		boolean result = isValidEmailAddress("bit12#sgopalr@redtape.com");

		if (result)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	private static boolean isValidEmailAddress(String email) {
		// Note
		if (!email.contains("@"))
			return false;

		// Rule 1 & 2
		int length = email.length();
		if (!(length > 14 && length < 36)) 
			return false;
		
		// Rule 3
		String emailPart[] = email.split("@");

		// Rule 4
		if (!emailPart[1].equals("redtape.com")) 
			return false;

		// Rule 5
		String before = emailPart[0];
		boolean isRule5 = isRule5(before);

		if (!isRule5)
			return false;
		
		return true;
	}

	public static boolean isRule5(String str) {
		Pattern p = Pattern.compile("[A-Za-z0-9(#|$)]+");
		Matcher m = p.matcher(str);
		return m.matches();
	}
}
