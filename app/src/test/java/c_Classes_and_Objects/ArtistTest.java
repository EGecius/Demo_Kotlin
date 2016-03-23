package c_Classes_and_Objects;

import org.junit.Before;
import org.junit.Test;

import c_Classes_and_Objects.DataClasses.Artist;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Shows that {@link Artist} is a mutable class
 */
public class ArtistTest {


	public static final int ID = 1;
	public static final int NEW_ID = 2;
	private Artist artist;

	@Before
	public void setup() {
		artist = new Artist(ID, "name", "url", "mbid");
	}

	@Test
	public void when_instantiated_thenSettersStillWork() {
		//GIVEN
		assertThat(artist.getId()).isEqualTo(ID);
		//WHEN
		artist.setId(NEW_ID);
		//THEN
		assertThat(artist.getId()).isEqualTo(NEW_ID);
	}
}
