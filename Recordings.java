public class Recordings extends Music {
  private String group;
  private int runTime;
  private String event;
  private int yearRecorded;

  public Recordings(String title, String composer, String voiceParts, String date, String group, String event, int yearRecorded, int runTime){
    super(String title, String composer, String voiceParts, String date);
    this.group = group;
    this.event = event;
    this.yearRecorded =  yearRecorded;
    this.runTime = runTime;
  }

  public Recordings(String title, String composer, String voiceParts, String date, String group, int runTime){
    super(String title, String composer, String voiceParts, String date);
    this.group = group;
    this.runTime = runTime;
  }

  public String getGroup(){
    return group;
  }

   public void setGroup(String group){
    this.group = group;
  }

   public String getEvent(){
    return event;
  }

   public void setEvent(String event){
    this.event = event;
  }

  public int getYearRecorded(){
    retrun yearRecorded;
  }

  public void setYearRecorded(int yearRecorded){
    this.yearRecorded = yearRecorded;
  }

  public int getRunTime(){
    retrun runTime;
  }

  public void getRunTime(int runTime){
    this.runTime = runTime;
  }
  
}
