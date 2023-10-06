public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String t1,String a1,int y1,int i1){
     super(t1, a1, y1,LibraryItemType.MAGAZINE);
     this.issueNumber = i1;
    }

    public int getIssueNumber(){
        return issueNumber;
    }

    public void setIssueNumber(int p1){
        this.issueNumber = p1;
    }
    
}
