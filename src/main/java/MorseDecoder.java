import java.util.Arrays;

public class MorseDecoder {
    public String decode(String morse) {
        var morseWords = morse.split("  ");
        var buffer = new StringBuilder();
        for (String word : morseWords) {
            buffer.append(" ");
            var morseLetters = word.split(" ");
            Arrays.stream(morseLetters)
                    .map(MorseCharacters::fromMorse)
                    .map(MorseCharacters::toString)
                    .forEach(buffer::append);
        }
        return buffer.toString().trim();
    }
}
