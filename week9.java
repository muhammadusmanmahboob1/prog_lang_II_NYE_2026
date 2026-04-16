import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// BOOK Class
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author;
    }
}

class Song {
    String title;
    String artist;
    int durationInSeconds;

    Song(String title, String artist, int durationInSeconds) {
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
    }
}

class Playlist {
    List<Song> songs = new ArrayList<>();

    void addSong(Song s) {
        songs.add(s);
    }

    void removeSong(String title) {
        Iterator<Song> it = songs.iterator();
        while (it.hasNext()) {
            if (it.next().title.equalsIgnoreCase(title)) {
                it.remove();
            }
        }
    }

    String getTotalDuration() {
        int totalSeconds = 0;
        for (Song s : songs) {
            totalSeconds += s.durationInSeconds;
        }
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }

    void swapSongs(int index1, int index2) {
        if (index1 >= 0 && index1 < songs.size() && index2 >= 0 && index2 < songs.size()) {
            Collections.swap(songs, index1, index2);
        }
    }
}

public class week9 {

    public static Book findBookByTitle(List<Book> library, String title) {
        for (Book b : library) {
            if (b.title.equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        // 1st Task
        List<String> students = new ArrayList<>();
        students.add("Usman");
        students.add("Talha");
        students.add("Ahmad");
        students.add("Djo");
        students.add("Eva");

        students.remove(2);

        System.out.println("final size: " + students.size());
        for (String name : students) {
            System.out.println(name);
        }      

        // 2nd Task
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }
        System.out.println("odd numbers: " + numbers);

        // 3rd Task
        List<Book> library = new ArrayList<>();
        library.add(new Book("Kite Runner", "Khaled Hosseini"));
        library.add(new Book("The Alchemist", "P. Coelho"));
        library.add(new Book("The Hobbit", "J.R.R. Tolkien"));

        Book found = findBookByTitle(library, "Clean Code");
        System.out.println("Search result: " + found);

        //4th Task
        Playlist myPlaylist = new Playlist();
        myPlaylist.addSong(new Song("Song A", "Artist 1", 150));
        myPlaylist.addSong(new Song("Song B", "Artist 2", 200));
        
        System.out.println("Total Duration: " + myPlaylist.getTotalDuration());
        myPlaylist.swapSongs(0, 1);
        myPlaylist.removeSong("Song A");
    }
}