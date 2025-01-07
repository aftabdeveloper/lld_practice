package facade.pattern;

public class HomeTheaterFacade {
    private Tv tv;
    private DvdPlayer dvdPlayer;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(Tv tv, DvdPlayer dvdPlayer, SoundSystem soundSystem) {
        this.tv = tv;
        this.dvdPlayer = dvdPlayer;
        this.soundSystem = soundSystem;
    }
    public void watchMovie(String movieName){
        tv.turnOn();
        tv.setChannel(1);
        soundSystem.setVolume(40);
        dvdPlayer.playMovie(movieName);
    }
}
