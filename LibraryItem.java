public class LibraryItem{

    private String title;
    private String author;
    private int year;
    private boolean isBorrowed;
    LibraryItemType itemType;

    public LibraryItem(String t1,String a1,int y1,LibraryItemType i1){
    this.title = t1;
    this.author = a1;
    this.year = y1;
    this.isBorrowed = false;
    this.itemType = i1;

    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

    public boolean isBorrowed(){
        return isBorrowed;
    }

    public LibraryItemType getItemType(){
        return itemType;
    }

    public void setTitle(String t1){
        this.title = t1;
    }

    public void setAuthor(String a1){
        this.author = a1;
    }

    public void setYear(int y1){
        this.year = y1;
    }

    public void setBorrowed(boolean b1){
        this.isBorrowed = b1;
    }

    public void setItemType(LibraryItemType i1){
        this.itemType = i1;
    }

    public boolean equals(LibraryItem lib){
    if(this.title.equalsIgnoreCase(lib.getTitle()) && this.author.equalsIgnoreCase(lib.getAuthor()) && this.year==lib.getYear() && this.isBorrowed==lib.isBorrowed() && this.itemType==lib.getItemType()){
        return true;
    }
    else{
        return false;
    }
    }

    @Override
    public String toString(){
        return String.format("%s %s %d %s %s", title,author,year,isBorrowed,itemType);
    }


}