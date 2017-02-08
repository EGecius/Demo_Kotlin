package c_Classes_and_Objects.f_DataClasses;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;

import c_Classes_and_Objects.f_Data_Classes.ImmutableListWrapper;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * For som reason tests do not run in this class. Is it because I am trying to test Kotlin class in Java?
 */
@RunWith(JUnit4.class)
public final class ImmutableListWrapperTestJava {

	public static final String ORIGINAL_VALUE = "original value";
	ImmutableListWrapper wrapper;
	private ArrayList<String> injectedList;


	@Before
	public void setup() {
		injectedList = new ArrayList<>();
		injectedList.add(ORIGINAL_VALUE);
		wrapper = new ImmutableListWrapper(injectedList);
	}

	@Test
	public void when_then() {
		//WHEN
		String valueFound = injectedList.get(0);
		//THEN
		assertThat(valueFound).isEqualTo(ORIGINAL_VALUE);
	}



}
