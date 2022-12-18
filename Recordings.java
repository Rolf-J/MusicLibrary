public class Recordings extends Music {
  private String group;
  private int runTime;
  private String event;
  private int yearRecorded;

  public Recordings(String title, String composer, String voiceParts, String date, String group, String event, int yearRecorded, int runTime){
    super(title, composer, voiceParts, date);
    this.group = group;
    this.event = event;
    this.yearRecorded =  yearRecorded;
    this.runTime = runTime;
  }

  public Recordings(String title, String composer, String voiceParts, String date, String group, int runTime){
    super(title, composer, voiceParts, date);
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
    return yearRecorded;
  }

  public void setYearRecorded(int yearRecorded){
    this.yearRecorded = yearRecorded;
  }

  public int getRunTime(){
    return runTime;
  }

  public void setRunTime(int runTime){
    this.runTime = runTime;
  }
  
}
