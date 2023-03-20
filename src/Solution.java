// This implementation first converts the integer N to a binary string representation.
// Then, it iterates through the string, keeping track of the current binary gap
// and the longest binary gap found so far. If a '1' is encountered,
// it updates the longest binary gap if necessary and resets the current binary gap.
// If a '0' is encountered, it increments the current binary gap.
// Finally, it returns the length of the longest binary gap.

class Solution {
    public int solution(int N) {
            // Convert the given integer N to its binary representation
            String binaryRepresentation = Integer.toBinaryString(N);

            // Initialize variables to keep track of the longest binary gap and the current binary gap
            int longestBinaryGap = 0;
            int currentBinaryGap = 0;

            // Iterate through the binary representation
            for (int i = 0; i < binaryRepresentation.length(); i++) {
                char currentCharacter = binaryRepresentation.charAt(i);

                if (currentCharacter == '1') {
                    // If the current character is '1', update the longest binary gap if needed
                    if (currentBinaryGap > longestBinaryGap) {
                        longestBinaryGap = currentBinaryGap;
                    }
                    // Reset the current binary gap
                    currentBinaryGap = 0;
                } else {
                    // If the current character is '0', increment the current binary gap
                    currentBinaryGap++;
                }
            }

            // Return the length of the longest binary gap
            return longestBinaryGap;
    }
}