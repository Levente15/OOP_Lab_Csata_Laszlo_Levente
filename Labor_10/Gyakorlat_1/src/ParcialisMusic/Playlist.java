package ParcialisMusic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {
    private final ArrayList<Music> musics;

    public Playlist(String filename){
        this.musics=new ArrayList<>();

        this.readMusicFromFile(filename);
    }
    private ArrayList<String> readFromFile(String fileName) {
        Scanner scanner;

        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }

        ArrayList<String> lines = new ArrayList<>();

        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }

        return lines;
    }
    private void readMusicFromFile(String fileName) {

        ArrayList<String> rows = this.readFromFile(fileName);

        if(rows == null)
            return;

        for(String row : rows) {
            String[] fields = row.split(", ");

            this.musics.add(new Music(
                    fields[0],
                    fields[1],
                    fields[2],
                    Integer.parseInt(fields[3])));

        }
    }
    public void kiir(){
        for(Music m : musics) {
            System.out.println(m);
        }
    }
    public int totalLength(){
        int tmp=0;
        for(Music m : musics)
            tmp+=m.getLength();

        return tmp;
    }

    public void delete(int index){
        musics.remove(index);
    }

    public void albums(){
        for(Music m : musics)
            System.out.println(m.getAlbum());
    }
}
