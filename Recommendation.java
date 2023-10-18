public class Recommendation
{

  /* Instance variable declarations go here, before constructors */
  // STEP 1 of 4: Add one private instance variable
  private int views;
  private String description;
  private String author;
  private int likes;
  private String imgLink;
  private int numOfRecommendations;
  private int month;
  private int day;
  private int year;
  private String date;
  private int dislikes;
  private boolean hasImage;
  
  
  

  /* No Argument Constructor - same name as Class, no return type */
  public Recommendation()
  {
      //  STEP 2 of 4: Set a default value for your instance variable.
      //  NOTE: If yr instance var is a String, do NOT set it to null or "". 
      //  NOTE: If yr instance var is an Object, do NOT set it null. Construct that Object.
      description = "This is a defult description";
      views =0;
      likes = 0;
      month = 0;
      day = 0;
      year = 0;
      date = "0/0/0";
      author = "John Doe";
      imgLink = "https://fl-1.cdn.flockler.com/embed/no-image.svg"
      dislikes = 0;
      hasImage = false;
      numOfRecommendations = 0


  }
  
  /* Method definitions go here, after constructors */
  //  STEP 3 of 4: Add one accessor method (getter) for your instance variable

  public int getViews(){
    return views;
  }
  public String getDesc() {
    return description;
  }

  public int getLikes(){
    return likes;
  }

  public String getImgLink(){
    return imgLink;
  }

  public int getNumOfRecommendations(){
    return numOfRecommendations;
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


  public int getDislikes(){
    return dislikes;
  }

  public boolean getHasImage(){
    return hasImage;
  }
  
  public String getAuthor(){
    return author;
  }
  
  //  STEP 4 of 4: Add one mutator method (setter) for your instance variable
  public void addViews(){
    views =views+1;
  }
  public void setDesc(String _description) {
    description = _description;
  }

  public void changeLikes(int newLikes) {
    likes += newLikes;
  }
  
  public void setAuthor(String _author){
    author = _author;
  }
  
  public void setImgLink(String _imgLink){
    imgLink = _imgLink;
  }

  public void setNumOfRecommendations(int _numOfRecommendations){
    numOfRecommendations = _numOfRecommendations
  }

  public void addDislike() {
    dislikes += 1;
  }
  
  public void setHasImage(boolean _hasImage){
    hasImage = _hasImage;
  }



}
