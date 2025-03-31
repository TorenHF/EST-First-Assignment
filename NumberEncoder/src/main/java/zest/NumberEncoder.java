package zest;

public class NumberEncoder {
    /**
     * Encodes a numeric string into a new string based on character mapping.
     * @param number the numeric string to encode.
     * @param mapping the character array where each index corresponds to a digit.
     * @return the encoded string.
     * @throws IllegalArgumentException if non-numeric or negative characters are included.
     * @throws ArrayIndexOutOfBoundsException if mapping array is less than 10 characters.
     */
    public static String encodeNumber(String number, char[] mapping) {
        if (mapping.length < 10) {
            throw new ArrayIndexOutOfBoundsException("Mapping array must contain at least 10 characters.");
        }
        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < number.length()-1; i++) {
            if (!Character.isDigit(number.charAt(i))) {
                throw new IllegalArgumentException("Non-numeric characters are not allowed.");
            }
            int digit = Character.getNumericValue(number.charAt(i));
            encoded.append(mapping[digit]);
        }
        return encoded.toString();
    }
}
