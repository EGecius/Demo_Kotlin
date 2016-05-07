package c_Classes_and_Objects.f_Data_Classes;

import java.util.List;

/**
 * This is java class that instantiates Kotlin object so that I could write tests for usage of Kotlin in Java
 */
final class ImmutableListWrapper_Usage {

	ImmutableListWrapper getImmutableListWrapper(List<String> list){
		return new ImmutableListWrapper(list);
	}

}
