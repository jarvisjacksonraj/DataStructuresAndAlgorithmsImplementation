package DS_ALGO.DataStructures.Strings.Practice;

public class ReverseWords{
    public static void reverseWords(char[] sentence) {
        if (sentence == null || sentence.length == 0) {
            return;
        }
        int start = 0;
        for (int end = 0; end < sentence.length; end++) {
            if (sentence[end] == ' ') {
                strReverse(start, end-1, sentence);
                start = end + 1;
            }
        }
        //using -2 due to space at end
        strReverse(start, sentence.length - 2, sentence);
        strReverse(0, sentence.length - 2, sentence);

    }

    static void strReverse(int startIndex, int endIndex, char[] word) {
        if (word == null || word.length < 2) {
            return;
        }
        while (startIndex < endIndex) {
            char temp = word[startIndex];
            word[startIndex] = word[endIndex];
            word[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}
