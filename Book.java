public class Book extends LibraryItem {
    private int pageCount;

    public Book(String t1,String a1,int y1,int p1){
     super(t1, a1, y1,LibraryItemType.BOOK);
     this.pageCount = p1;
    }

    public int getPageCount(){
        return pageCount;
    }

    public void setPageCount(int p1){
        this.pageCount = p1;
    }
    
}
