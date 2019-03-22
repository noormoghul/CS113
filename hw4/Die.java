public class Die
{
   private int faceValue;
   
   //default constructor
   public Die()
   {
      //faceValue=(int)(Math.random()*6)+1;
      roll();
   }
   //constructor with a parameter
   public Die(int num)
   {
      faceValue=num;
   }
   //method roll
   public void roll()
   {
      faceValue=(int)(Math.random()*6)+1;
   }
    
   //this method will return the faceValue -> getter
   public int getFaceValue()
   {
      return faceValue;
   }
   //setter method
   public void setFaceValue(int num)
   {
      faceValue=num;
   }
   
   public String toString()
   {
      return "This die has a face value of "+faceValue;
   }
    
}