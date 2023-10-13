public class Recommendation
{

  /* Instance variable declarations go here, before constructors */
  // STEP 1 of 4: Add one private instance variable
  private String description;

  private int likes;

  private String imgLink;

  private boolean hasImage;


  /* No Argument Constructor - same name as Class, no return type */
  public Recommendation()
  {
      //  STEP 2 of 4: Set a default value for your instance variable.
      //  NOTE: If yr instance var is a String, do NOT set it to null or "". 
      //  NOTE: If yr instance var is an Object, do NOT set it null. Construct that Object.
      description = "This is a defult description";

      likes = 0;

      imgLink = "https://fl-1.cdn.flockler.com/embed/no-image.svg"

      hasImage = false;

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

  public boolean getHasImage(){
    return hasImage;
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

  public void setHasImage(boolean _hasImage){
    hasImage = _hasImage;
  }


}
