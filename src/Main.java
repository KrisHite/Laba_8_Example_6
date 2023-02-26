import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;
        try{
            in = new FileReader("C:\\My\\FileOne.txt");
            out = new FileWriter("C:\\My\\FileTwo.txt", true);
            int oneByte;
            while((oneByte = in.read()) != -1){
                out.append((char)oneByte);
                System.out.print((char)oneByte);
            }
        }catch(IOException e){
            System.out.printf("Ошибка!");
        }
        finally {
            in.close();
            out.close();
        }
    }
}