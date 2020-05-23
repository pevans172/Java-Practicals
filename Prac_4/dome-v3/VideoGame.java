public class VideoGame extends Item
{
    private String platform;

    public VideoGame(String theTitle, String platform)
    {
        super(theTitle);
        this.platform = platform;
    }

    public String getPlatform()
    {
        return platform;
    }
    
    /**
     * Print details about this item to the text terminal.
     */
    public void print()
    {
        super.print();
        System.out.println("platform: " + platform );
    }
}
