
//Ad.14 14.	Define a class for describing books. Then, define fields and methods in the class that represent the attributes and behaviors of the book objects. Finally, create two books, assign them attribute values, and call defined methods. 
public class Book
{
    String bookName;
    String author;
    String publisher;
    int page = 0;
    int maxPages; 
    
    void showBookInfo(){
        System.out.println("name: " +bookName+ "\nauthor: " +author+ "\npublisher: "+ "\npages: " + maxPages);
    }
    int showPage(){
        return page;
    }
    void nextPage(){
        page += 1;
    }
    
}
