import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork potatoEaters;

    @BeforeEach
    public void setUp(){
        potatoEaters = new Artwork ("The Potato Eaters", "Vincent van Gogh", 20000000);}

    @Test
    public void hasName(){
    assertThat(potatoEaters.getTitle()).isEqualTo("The Potato Eaters");}

    @Test
    public void hasArtist(){
    assertThat(potatoEaters.getArtist()).isEqualTo("Vincent van Gogh");}
    
    @Test
    public void hasPrice(){
    assertThat(potatoEaters.getPrice()).isEqualTo(20000000);}
}


