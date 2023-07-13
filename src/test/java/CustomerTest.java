import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    private Customer francesca;

    @BeforeEach
    public void setUp(){
        francesca = new Customer("Francesca");
    }
    
    @Test
    public void hasName(){
        assertThat(francesca.getName()).isEqualTo("Francesca");
    }
    
    @Test
    public void getWallet(){
        assertThat(francesca.getWallet()).isEqualTo(3000);
    }
    
    @Test
    public void spendWallet(){
        //get price of artwork
//        subtract price from wallet
//        update wallet to new price
        Artwork.getPrice()
    }
}
