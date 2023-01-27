import java.util.Calendar;
import java.util.Random;

/**
 * Just did it for fun. :|
 * 
 * @author amit https://gist.githubusercontent.com/LordAmit/f91471536ca320395420/raw/af462880910730f0c8d7426f88677a64709aef31/NameGenerator.java
 * @author amit
 * @author oliver
 *
 */
public class NameGenerator {
	private static final int diffBetweenAtoZ = 25;
	private static final int charValueOfa = 97;
	private String lastGeneratedName = "";
	private boolean initCap = true;
	int length;

	char[] vowels = {
			'a', 'e', 'i', 'o', 'u'
	};

	public static void main(String[] args) {

	NameGenerator n = new NameGenerator(8);
	n.initCap = false;
	System.out.println(n.getName());

	}


	public NameGenerator(int lengthOfName) {
		if (lengthOfName < 5 || lengthOfName > 10) {
			System.out.println("Setting default length to 7");
			lengthOfName = 7;
		}

		this.length = lengthOfName;
	}

	public String getName() {
		for (;;) {
			Random randomNumberGenerator = new Random(Calendar.getInstance()
					.getTimeInMillis());

			char[] nameInCharArray = new char[length];

			for (int i = 0; i < length; i++) {
				if (positionIsOdd(i)) {
					nameInCharArray[i] = getVowel(randomNumberGenerator);
				} else {
					nameInCharArray[i] = getConsonant(randomNumberGenerator);
				}
			}
			if (initCap) {
				nameInCharArray[0] = (char) Character
					.toUpperCase(nameInCharArray[0]);
			}	
			String currentGeneratedName = new String(nameInCharArray);
			
			if (!currentGeneratedName.equals(lastGeneratedName)) {
				lastGeneratedName = currentGeneratedName;
				return currentGeneratedName;
			}
			
		}

	}

	private boolean positionIsOdd(int i) {
		return i % 2 == 0;
	}

	private char getConsonant(Random randomNumberGenerator) {
		for (;;) {
			char currentCharacter = (char) (randomNumberGenerator
					.nextInt(diffBetweenAtoZ) + charValueOfa);
			if (currentCharacter == 'a' || currentCharacter == 'e'
					|| currentCharacter == 'i' || currentCharacter == 'o'
					|| currentCharacter == 'u')
				continue;
			else
				return currentCharacter;
		}

	}

	private char getVowel(Random randomNumberGenerator) {
		return vowels[randomNumberGenerator.nextInt(vowels.length)];
	}
}
