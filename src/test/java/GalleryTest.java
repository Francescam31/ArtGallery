import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {
    Gallery gallery;

    @BeforeEach
    public void setUp(){
        gallery = new Gallery("Tate");
        Artwork duchess = new Artwork("The Ugly Duchess", "Quentin Matsys", 2000);
        Artwork peasant = new Artwork("The Potato Eaters", "Vincent van Gogh", 20000000);
        gallery.addArtwork(duchess);
        galllery.addArtwork(peasant);
    }

    @Test
    public void galleryHasName(){
        assertThat(gallery.getName()).isEqualTo("Tate");
    }

    @Test
    public void canGetTill(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }

    @Test
    public void canGetArtwork(){
        assertThat(gallery.getArtwork().size()).isEqualTo(1);
    }

    @Test
    public void canAddToTill(){
        assertThat(gallery.addToTill()).isEqualTo(2000);
    }




}
