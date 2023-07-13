import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> artworks;

    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.artworks = new ArrayList<>();
    }

    public String getName(){
    return this.name;}

    public double getTill(){
    return this.till;}

    public ArrayList<Artwork> getArtworks (){
        return this.artworks;
    }

public void addToTill(Gallery gallery){
    for (Artwork artwork : gallery.getArtworks())
    till = till + artwork.getPrice();
    }

public void addArtwork(Artwork newArtwork){
        this.artworks.add(newArtwork);
}
//     public double addToTill(Artwork title){
//         till + gallery
//     till+price given piece of art
// this.till += getPrice(nameofArt)
    }








