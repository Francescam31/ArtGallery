import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> stock;

    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<>();
    }

    public String getName(){
    return this.name;}

    public double getTill(){
    return this.till;}

    public ArrayList<Artwork> getArtwork(){
        return this.stock;
    }

//     public double addToTill(Artwork title){
//         till + gallery
//     till+price given piece of art
// this.till += getPrice(nameofArt)
    }








