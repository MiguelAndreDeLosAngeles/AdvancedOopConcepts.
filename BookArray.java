public class BookArray {

    public static void main(String[] args) {
        
        //Creating Book array which stores Fiction and Non-Fiction Book Objects
        Book bookArray[]={new Fiction("Homeland Elegies"),
                            new Fiction("Luster"),
                            new Fiction("The Four Winds"),
                            new Fiction("Rule of Wolves"),
                            new Fiction("You Love Me"),
                            new NonFiction("A Promised Land"),
                            new NonFiction("Greenlights"),
                            new NonFiction("The Code Breaker"),
                            new NonFiction("Hidden Valley Road"),
                            new NonFiction("Beautiful Things")};

        //This for loop will displays the Each Fiction and Non-Fiction book details
        for(int i=0;i<bookArray.length;i++)
        {
            //Displaying the information of each book
            System.out.println(bookArray[i].toString());
        }
    }

}
