public enum MorseCharacters {
    A(".-"),
    B("-..."),
    C("-.-."),
    D("-.."),
    E("."),
    F("..-."),
    G("--."),
    H("...."),
    I(".."),
    J(".---"),
    K("-.-"),
    L(".-.."),
    M("--"),
    N("-."),
    O("---"),
    P(".--."),
    Q("--.-"),
    R(".-."),
    S("..."),
    T("-"),
    U("..-"),
    V("...-"),
    W(".--"),
    X("-..-"),
    Y("-.--"),
    Z("--..");

    String morseRepresentation;

    MorseCharacters(String morseRepresentation) {
        this.morseRepresentation = morseRepresentation;
    }

    public static MorseCharacters fromMorse(String morse) {
        for (MorseCharacters character: MorseCharacters.values()) {
            if (character.morseRepresentation.equals(morse)) {
                return character;
            }
        }
        throw new MorseLetterDoesNotExist(morse);
    }
}
