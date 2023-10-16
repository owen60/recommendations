public class Recommendation
{

  /* Instance variable declarations go here, before constructors */
  // STEP 1 of 4: Add one private instance variable
  private String description;

  private int likes;

  private String imgLink;

  private int month;
  private int day;
  private int year;
  private String date;


  /* No Argument Constructor - same name as Class, no return type */
  public Recommendation()
  {
      //  STEP 2 of 4: Set a default value for your instance variable.
      //  NOTE: If yr instance var is a String, do NOT set it to null or "". 
      //  NOTE: If yr instance var is an Object, do NOT set it null. Construct that Object.
      description = "This is a defult description";

      likes = 0;

      month = 0;
      day = 0;
      year = 0;
      date = "0/0/0";

      imgLink = "https://fl-1.cdn.flockler.com/embed/no-image.svg";

  }

  /* Method definitions go here, after constructors */
  //  STEP 3 of 4: Add one accessor method (getter) for your instance variable
  public String getDesc() {
    return description;
  }

  public int getLikes(){
    return likes;
  }


  public String getImgLink(){
    return imgLink;
  }

  public void setDate(int _month, int _day, int _year){
    month = _month;
    day = _day;
    year = _year;
    date = month + "/" + day + "/" + year;
  }

  public String getDate(){
    return date;
  }

  //  STEP 4 of 4: Add one mutator method (setter) for your instance variable
  public void setDesc(String _description) {
    description = _description;
  }

  public void changeLikes(int newLikes) {
    likes += newLikes;
  }

  public void setImgLink(String _imgLink){
    imgLink = _imgLink;
  }


}
