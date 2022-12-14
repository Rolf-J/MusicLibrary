public class Music{
  private String title;
  private String composer;
  private int year;
  private String voiceParts;
  private String date;
  private int rentalPeriod;

  public Music(String title, String composer, String voiceParts, String date){
    this.title = title;
    this.composer = composer;
    this.voiceParts = voiceParts;
    this.date = date;
  }

  public String getTitle(){
    return title;
  }

  public void setTitle(String title){
    this.title = title;
  }

  public String getComposer(){
    return composer;
  }

  public void setComposer(String composer){
    this.composer = composer;
  }

  public int getYear(){
    return year;
  }
  
  public void setYear(int year){
    this.year = year;
  }

  public String getVoiceParts(){
    return voiceParts;
  }

  public void setVoiceParts(String voiceParts){
    this.voiceParts = voiceParts;
  }

  public String getDate(){
    return date;
  }

  public void setDate(String Date){
    this.date = date;
  }

  public int getRentalPeriod(){
    return rentalPeriod;
  }

  public void setRentalPeriod(int rentalPeriod){
    this.rentalPeriod = rentalPeriod;
  }

}