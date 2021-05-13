package ParcialisMusic;

public class Main {
    public static void main(String[] args) {
            Music music=new Music("Java","Peter","CSAKAJAVA",76);
        System.out.println(music);
        System.out.println("***********************");
        Playlist playlist=new Playlist("music.txt");
        playlist.kiir();
        System.out.println("*********Totallength**************");
        System.out.println("Total: "+playlist.totalLength()/60+":"+playlist.totalLength()%60);
        System.out.println("***********************");
        playlist.delete(2);
        playlist.kiir();
        System.out.println("***********************");
        playlist.albums();
    }
}
