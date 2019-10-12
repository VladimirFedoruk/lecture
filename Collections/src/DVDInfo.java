import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class GenreSort implements Comparator<DVDInfo>{
    public int compare(DVDInfo one, DVDInfo two){
        return one.getGenre().compareTo(two.getGenre());
    }
}

class GenreTitle implements Comparator<DVDInfo>{
    public int compare(DVDInfo one, DVDInfo two){
        return one.getTitle().compareTo(two.getTitle());
    }
}

public class DVDInfo {
    String title;
    String genre;
    String leadActor;

    DVDInfo(String t, String g, String a) {
        title = t;
        genre = g;
        leadActor = a;

    }




    public String getLeadActor() {
        return leadActor;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }


    public void setTitle(String title) {
        this.title = title;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String toString() {
        return title + " " + genre + " " + leadActor + "\n";
    }

    //public int compareTo(DVDInfo d) {
   //     return title.compareTo(d.getGenre()); //#2
    //}


    public static void main(String[] args) {
        ArrayList<DVDInfo> DVD = new ArrayList<>();
        DVD.add(new DVDInfo("Киркоров", "popsa", "kjhlk"));
        DVD.add(new DVDInfo("Алегровав", "popsa", "kjhlk"));
        DVD.add(new DVDInfo("Круг", "шансон", "kjhlk"));
        DVD.add(new DVDInfo("Киркоров", "popsa", "sgddsg"));
        GenreSort g = new GenreSort();
        Collections.sort(DVD,g);

        System.out.println(DVD);
    }
}



