public class Audio extends Recordings{
  private boolean cD;
  private boolean digitalAudio;

  public Audio(String title, String composer, String voiceParts, String date, String group, String event, int yearRecorded, int runTime, boolean cD, boolean digitalAudio){
    super(title, composer, voiceParts, date, group, event, yearRecorded, runTime);
    this.cD = cD;
    this.digitalAudio = digitalAudio;
  }

  public Audio(String title, String composer, String voiceParts, String date, String group, int runTime, boolean cD, boolean digitalAudio){
    super(title, composer, voiceParts, date, group, runTime);
    this.cD = cD;
    this.digitalAudio = digitalAudio;
  }

  public boolean getCD(){
    return cD;
  }

  public void setCD(boolean cD){
    this.cD = cD;
  }

   public boolean getDigitalAudio(){
    return digitalAudio;
  }

  public void setDigitalAudio(boolean digitalAudio){
    this.digitalAudio = digitalAudio;
  }
  
}
