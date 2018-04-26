package c_Classes_and_Objects;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import c_Classes_and_Objects.f_Data_Classes.Artist;

public class ArtistTest {

	private static final int ID = 1;
	private static final int NEW_ID = 2;

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
