public class APLine
{
  private int a, b, c;
  public APLine(int aval, int bval, int cval){
    a = aval;
    b = bval; 
    c = cval;
  }
  public double getSlope(){
    return (a * -1)/(double)b;
  }
  public boolean isOnline(int x, int y){
    if (a * x + b*y +c == 0){
      return true;
    }
    return false;
  }
}
