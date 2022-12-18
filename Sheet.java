public class Sheet extends Music {
  private int photoCopies;
  private int realCopies;
  private String company;

  public Sheet(String title, String composer, String voiceParts, String date, int realCopies, int photoCopies, String company){
    super(title, composer, voiceParts, date);
    this.realCopies = realCopies;
    this.photoCopies = photoCopies;
    this.company = company;
  }

  public Sheet(String title, String composer, String voiceParts, String date, int realCopies, int photoCopies){
    super(title, composer, voiceParts, date);
    this.realCopies = realCopies;
    this.photoCopies = photoCopies;
  }

  public int getRealCopies(){
    return realCopies;
  }

  public void setRealCopies(int realCopies){
    this.realCopies = realCopies;
  }

  public int getPhotoCopies(){
    return photoCopies;
  }

  public void setPhotoCopies(int photoCopies){
    this.photoCopies = photoCopies;
  }

  public String getCompany(){
    return company;
  }

  public void setCompany(String company){
    this.company = company;
  }
  
}
