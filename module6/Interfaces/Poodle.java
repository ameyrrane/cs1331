public class Poodle extends Dog implements Groomable{
    
    private String favoriteShampoo;
    private String favoriteConditioner;

    public Poodle(String name, int size, String favoriteShampoo, String favoriteConditioner) {
        
        super(name, size);
        this.favoriteConditioner = favoriteConditioner;
        this.favoriteShampoo = favoriteShampoo;
    }

    public void groom(){
        System.out.println(favoriteShampoo + " rinse " + favoriteConditioner + " wait 10 mins " + " dry and massage");
    }
}
