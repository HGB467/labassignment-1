public class Library {
    LibraryItem[] libraryItems = new LibraryItem[50];
    private int indexToUse = 0;


    public void addItem(LibraryItem add1){
        libraryItems[indexToUse++] = add1;

    }

    public void borrowItem(LibraryItem borrow1){
       borrow1.setBorrowed(true);
    }

    public void returnItem(LibraryItem borrow1){
        borrow1.setBorrowed(false);
    }

    public void displayBorrowedItems(){
        for(int i=0;i<indexToUse;i++){
            if(libraryItems[i].isBorrowed()){
                System.out.println(libraryItems[i]);
            }
           
        }
    }

    public void displayAvailableItems(){
        for(int i=0;i<indexToUse;i++){
            if(!libraryItems[i].isBorrowed()){
                System.out.println(libraryItems[i]);
            }
           
        }
    }
    
}
