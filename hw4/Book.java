//Noor Moghul
//NJIT 2019 Spring
//March 21st, 2019

public class Book
{
   private Integer pages;
   private String title;
   
   public Book(int inPages, String inTitle)
   {
      this.pages = inPages;
      this.title = inTitle;
   }
   
   public int getPages()
   {
      return pages;
   }    
   
   public String getTitle()
   {
      return title;
   }
   
   public void setPages(int newPage)
   {
      pages = newPage;
   }
   
   public void setTitle(String newTitle)
   {
      title = newTitle;
   }
   
   public String toString()
   {
      return "The book \"" + title + "\" has " + pages + " pages.";
   }
   
   public boolean equals(Book ob)
   {
      Book boo = (Book)ob;
      return this.title.equals(boo.title) && this.pages.equals(boo.pages);
   }
   
   public int compareTo(Book bookie)
   {
      if(this.pages < bookie.pages)
         return -1;
      else if(this.pages > bookie.pages)
         return 1;
      else 
         return 0; 
   }
}