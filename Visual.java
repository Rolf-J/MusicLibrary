public class Visual extends Recordings {
  private boolean dVD;
  private boolean digitalVideo;

  public Visual(String title, String composer, String voiceParts, String date, String group, String event, int yearRecorded, int runTime, boolean dVD, boolean digitalVideo){
    super(title, composer, voiceParts, date, group, event, yearRecorded, runTime);
    this.dVD = dVD;
    this.digitalVideo = digitalVideo;
  }

  public Visual(String title, String composer, String voiceParts, String date, String group, int runTime, boolean dVD, boolean digitalVideo){
    super(title, composer, voiceParts, date, group, runTime);
    this.dVD = dVD;
    this.digitalVideo = digitalVideo;
  }

  public boolean getDVD(){
    return dVD;
  }

  public void setDVD(boolean dVD){
    this.dVD = dVD;
  }

   public boolean getDigitalVideo(){
    return digitalVideo;
  }

  public void setDigitalVideo(boolean digitalVideo){
    this.digitalVideo = digitalVideo;
  }
}
