package RagEx_kontrol_uygulaması;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	public static boolean kontrol(String input, String ragex) {
		Pattern pattern = Pattern.compile(ragex);  //metin eşleştirme
		Matcher matcher = pattern.matcher(input);  
		return matcher.matches();  //girdinin düzenli ifade ile tam eşleşip eşleşmediğini kontrol eder (true/false)
		
        

	}

}
