class Date
 {
   int day;
   int month;
   int year;
     void setDay(int d)
{
    this.day=d;
 } 
  void setMonth(int m)
 {
    this.month=m;
 }
  void setYear(int y)
 {
    this.year=y;
 }
  int getDay()
{
  return this.day;
}
  }
   //Date class ends here
 class DateTest
 {
  public static void main(String[] args)
 {
    Date d1; 
    d1=new Date();
      
    Date d2;
    d2=new Date();

    d1.setDay(2);
    d1.setMonth(11);
    d1.setYear(2025);

    d2.setDay(3);
    d2.setMonth(11);
    d2.setYear(2025);

    System.out.println("Date:"+d1.day+"/"+d1.month+"/"+d1.year);
   
    if(d1.getDay()>d2.getDay())
{
   System.out.println("d1 is younger");
 }
 else
{ 
   System.out.println("d2 is younger");
}
 }
 } //Datetest class ends here




