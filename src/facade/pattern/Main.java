package facade.pattern;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        DvdPlayer dvdPlayer = new DvdPlayer();
        SoundSystem soundSystem = new SoundSystem();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(tv,dvdPlayer,soundSystem);
        homeTheaterFacade.watchMovie("Terminator");
    }
}
