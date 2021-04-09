package HashTableAndBST;

import java.util.LinkedHashMap;

import org.junit.Assert;
import org.junit.Test;

public class LinkedHashMapTest {
	@Test
	public void givenSentence_WhenWordAreAddedToList_ShouldReturnParanoidFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid but "
				+ "because they keep putting themselves deliberately into " + "paranoid avoidable situations";
		LinkedHashMap1<String, Integer> linkedHashMap1 = new LinkedHashMap1<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = linkedHashMap1.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			linkedHashMap1.add(word, value);
		}
		int frequency = linkedHashMap1.get("paranoid");
		System.out.println(linkedHashMap1);
		Assert.assertEquals(3, frequency);

	}


@Test

	public void givenSentence_WhenWordAreRemoveToList_ShouldReturnavoidableFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid but "
				+ "because they keep putting themselves deliberately into " + "paranoid avoidable situations";
		LinkedHashMap1<String, Integer> linkedHashMap1 = new LinkedHashMap1<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = linkedHashMap1.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			linkedHashMap1.add(word, value);
		}
		linkedHashMap1.remove("avoidable");
		System.out.println(linkedHashMap1);
		int frequency = linkedHashMap1.getCount("avoidable");
		Assert.assertEquals(0, frequency);

}
}
