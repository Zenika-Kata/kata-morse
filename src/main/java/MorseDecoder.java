import java.util.Arrays;

public class MorseDecoder {
    public String decode(String morse) {
        var morseWords = morse.split("  ");
        var buffer = new StringBuilder();
        for (String word : morseWords) {
            buffer.append(" ");
            var morseLetters = word.split(" ");
            Arrays.stream(morseLetters)
                    .map(this::getRomanCharacterFromMorse)
                    .forEach(buffer::append);
        }
        return buffer.toString().trim();
    }

    private String getRomanCharacterFromMorse(String morseLetter) {
        try {
            return MorseCharacters.fromMorse(morseLetter).toString();
        } catch (MorseLetterDoesNotExist exception) {
            throw NotAMorseWord.from(exception);
        }
    }
}
