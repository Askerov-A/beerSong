public class BeerSong {
	public static void main (String[] args) {
		int beerNum = 99;
        String word = "bottles";
        
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle";
            }
            System.out.println(beerNum + " " + word + " of beer on the wall");
        System.out.println(beerNum + " " + word + " of beer.");
        System.out.println("Take one.");
        System.out.println("Give to friend.");
        beerNum = beerNum - 1;
        if (beerNum > 0) {
            System.out.println(beerNum + " bottles of beer on the wall.");   
        } else {
            System.out.println("No more bottles of beer on the wall.");   
        }
        }   
        int zet = 0;
        String a = "That's all";
        while (zet <= 9) {
            System.out.println(a.charAt(zet));
            zet = zet + 1;
        }
    }
}