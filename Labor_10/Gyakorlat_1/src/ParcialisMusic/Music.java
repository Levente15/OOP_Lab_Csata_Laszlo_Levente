package ParcialisMusic;

public class Music {

    private String title;
    private String artist;
    private String album;
    private int length;

    public Music(String title, String artist, String album, int length) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Title: ").append(title).append("\n")
                .append("Artist: ").append(artist).append("\n")
                .append("Album: ").append(album).append("\n");
        int hour = length / 60;
        int minute = length % 60;
        builder.append("Length: ").append(hour).append(":").append(minute);
        return builder.toString();
    }
}
