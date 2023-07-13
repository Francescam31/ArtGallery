import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

//     here
    Customer customer;
    Gallery gallery;
    Artwork peasant;


    @BeforeEach
    public void setUp(){
        customer = new Customer("Francesca");
        gallery = new Gallery("Tate");
        peasant = new Artwork("Potato Eater", "Vincent van Gogh", 20000);
        gallery.addArtwork(peasant);

    }

    @Test
    public void hasName(){
        assertThat(customer.getName()).isEqualTo("Francesca");
    }

    @Test
    public void getWallet(){
        assertThat(customer.getWallet()).isEqualTo(3000);
    }

    @Test
    public void spendWallet(){
        //get price of artwork
//        subtract price from wallet
//        update wallet to new price
//        Artwork.getPrice();
    }
}
