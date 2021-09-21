public class MusicSystem {
    private String name;
    private int noOfSpeakers,lcdScreenSize;
    private boolean subWoofers;

    public MusicSystem(String name, int noOfSpeakers, int lcdScreenSize, boolean subWoofers) {
        this.name = name;
        this.noOfSpeakers = noOfSpeakers;
        this.lcdScreenSize = lcdScreenSize;
        this.subWoofers = subWoofers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfSpeakers() {
        return noOfSpeakers;
    }

    public void setNoOfSpeakers(int noOfSpeakers) {
        this.noOfSpeakers = noOfSpeakers;
    }

    public int getLcdScreenSize() {
        return lcdScreenSize;
    }

    public void setLcdScreenSize(int lcdScreenSize) {
        this.lcdScreenSize = lcdScreenSize;
    }

    public boolean isSubWoofers() {
        return subWoofers;
    }

    public void setSubWoofers(boolean subWoofers) {
        this.subWoofers = subWoofers;
    }
}
