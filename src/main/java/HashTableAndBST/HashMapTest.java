package HashTableAndBST;

import org.junit.Assert;
import org.junit.Test;

public class HashMapTest {
	@Test
	public void givenSentence_WhenWordsAreAddedToList_ShouldReturnWordFrequency() {
		String sentence= "To be or not to be";
		HashMaps<String, Integer> hashMaps = new HashMaps<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = hashMaps.get(word);
			if (value == null) value = 1;
			else value = value + 1;
			hashMaps.add(word,value);
		}
		int frequency  = hashMaps.get("to").intValue();
		System.out.println(hashMaps);
		Assert.assertEquals(2, frequency);
	}

}

