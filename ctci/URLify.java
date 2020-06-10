public class URLify {
	void replaceSpaces(char[] string, int trueLength) {
		int count = counter(string, trueLength, ' ');
		int newIndex = trueLength - 1 + count * 2;

		if(newIndex + 1 < string.length)
			string[newIndex + 1] = '\0';

		for(int oldIndex = trueLength - 1; oldIndex >= 0; oldIndex--) {
			if(string[oldIndex] == ' ') {
				string[newIndex] = '0';
				string[newIndex - 1] = '2';
				string[newIndex - 2] = '%';
				newIndex -= 3;
			} else {
				string[newIndex] = string[oldIndex];
                newIndex--;
			}
		}
	}

	int counter(char[] charArr, int end, char target) {
		int count = 0;
		for(int i = 0; i < end; i++) {
			if(charArr[i] == target)
				count++;
		}
		return count;
	}
}