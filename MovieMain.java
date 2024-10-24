public class MovieMain{
    public static void main(String[] args){
        Movie m = new Movie();
        int s = m.rateAMovie(20, 40, 10);
        System.out.println(s);

        s = m.rateAMovie(100, 60, 20);
        System.out.println(s);

        s = m.rateAMovie(10, 110, 20);
        System.out.println(s);

        s = m.rateAMovie(10, 110, 31);
        System.out.println(s);

        s = m.rateAMovie(0, 50, 8);
        System.out.println(s);
    }
}