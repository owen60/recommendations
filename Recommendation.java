public class Recommendation
{

  /* Instance variable declarations go here, before constructors */
  // STEP 1 of 4: Add one private instance variable
  private String description;


  /* No Argument Constructor - same name as Class, no return type */
  public Recommendation()
  {
      //  STEP 2 of 4: Set a default value for your instance variable
      description = "This is a defult description";
  }

  /* Method definitions go here, after constructors */
  //  STEP 3 of 4: Add one accessor method (getter) for your instance variable
  public String getDesc() {
    return description;
  }

  //  STEP 4 of 4: Add one mutator method (setter) for your instance variable
  public void setDesc(String _description) {
    description = _description;
  }
  

}
