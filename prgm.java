import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
public class prgm{
public static void main (String args[])throws IOException{
int s=3000;
int l,b;
OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
if(s==1500)
{
streamWriter.write("cost=1200INR");
}
if(s>1500 && s<1500)
{
streamWriter.write("cost=1500INR");
}
if(s>1500 && s<2500){
streamWriter.write("cost=1800INR");
}
if(s>1500 && s<5000)
{
streamWriter.write("cost=2500INR");
l=10;
b=20;
streamWriter.write("\narea of house="+(l*b));
}
streamWriter.flush();
}
}