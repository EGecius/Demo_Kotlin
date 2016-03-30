package c_Classes_and_Objects.DataClasses;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link ImmutableListWrapper_Usage}
 */
public class ImmutableListWrapper_UsageTest {

	public static final String ORIGINAL_VALUE = "original value";
	ImmutableListWrapper_Usage sample;
	private ArrayList<String> list;

	@Before
	public void setup() {
		list = new ArrayList<>();
		list.add(ORIGINAL_VALUE);
		sample = new ImmutableListWrapper_Usage();
	}

	@Test
	public void when_listRetrieved_then_onlyAddedValuesFound() {
		//WHEN
		ImmutableListWrapper immutable = sample.getImmutableListWrapper(list);
		//THEN
		List<String> list = immutable.getList();

		assertThat(list.size()).isEqualTo(1);
		assertThat(list.get(0)).isEqualTo(ORIGINAL_VALUE);
	}

	/** Shows that Kotlin's data class can be amended */
	@Test
	public void when_listRetrieved_and_amended_then_originalIsAmended() {
		//WHEN
		ImmutableListWrapper immutable = sample.getImmutableListWrapper(list);
		//THEN
		List<String> listRetrieved = immutable.getList();
		assertThat(listRetrieved.size()).isEqualTo(1);
		listRetrieved.clear();

		List<String> listOriginal = immutable.getList();
		//list has been cleared - not immutable!
		assertThat(listOriginal.size()).isEqualTo(0);
	}

}