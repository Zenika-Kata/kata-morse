public class NotAMorseWord extends RuntimeException {
    public NotAMorseWord(String message) {
        super(message);
    }

    static NotAMorseWord from(MorseLetterDoesNotExist morseLetterDoesNotExist) {
        return new NotAMorseWord(String.format(
                "%s is not a valid letter", morseLetterDoesNotExist.getMessage()
        ));
    }
}
