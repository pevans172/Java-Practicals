/**
 * The CD class represents a CD object. Information about the 
 * CD is stored and can be retrieved.
 * 
 */
public class CD extends Item
{
    private String artist;
    private int numberOfTracks;
    private int playingTime;

    /**
     * Initialize the CD.
     * @param theTitle The title of the CD.
     * @param theArtist The artist of the CD.
     * @param tracks The number of tracks on the CD.
     * @param time The playing time of the CD.
     */
    public CD(String theTitle, String theArtist, int tracks, int time)
    {
        super(theTitle);
        artist = theArtist;
        numberOfTracks = tracks;
        playingTime = time;
    }

    /**
     * @return The artist for this CD.
     */
    public String getArtist()
    {
        return artist;
    }

    /**
     * @return The number of tracks on this CD.
     */
    public int getNumberOfTracks()
    {
        return numberOfTracks;
    }
    
    /**
     * Print details about this item to the text terminal.
     */
    public void print()
    {
        super.print();
        System.out.println("artist: " + artist );
        System.out.println("tracks: " + numberOfTracks );
        System.out.println("Playing time: " + playingTime );
    }
   
}
