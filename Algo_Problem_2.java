import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Algo_Problem_2{
    public static void main(String[] args) {
        int T,N,R,S,H,Total_Walls;

        try{
            BufferedReader reader = new BufferedReader(new FileReader("Input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"));

            String str;

            str = reader.readLine();
            T = Integer.parseInt(str);

            for(int i=1;i<=T;i++){
                double accent=0,normal=0,Total=0,a=0,b=0,c=0,Total_hours=0,Accent_qty=0,Normal_qty=0;

                str = reader.readLine();
                N = Integer.parseInt(str);

                for(int j=1;j<=N;j++){

                    str = reader.readLine();

                    str = str.substring((str.indexOf(","))+1);
                    R = Integer.parseInt(str.substring(0,str.indexOf(",")));

                    str = str.substring((str.indexOf(","))+1);
                    S = Integer.parseInt(str.substring(0,str.indexOf(",")));

                    str = str.substring((str.indexOf(","))+1);
                    H = Integer.parseInt(str);

                    Total_Walls = (R*3) + (S*4) + (H*6);

                    accent = (Total_Walls)*((double)1/3)*(1.5);
                    normal = (Total_Walls)*((double)2/3)*(2.25);
                    Total = (((accent) * (2.5)) / 1.5) + (((normal) * (3.25)) / 2.25);

                    a = a + accent;
                    b = b + normal;
                    c = c + Total;
                }
                Total_hours = Total_hours + c;
                Accent_qty = Accent_qty + a;
                Normal_qty = Normal_qty + b;

                writer.write("Case#"+i+": "+String.format("%.2f",Total_hours)+", "+String.format("%.2f",Accent_qty)+", "+String.format("%.2f",Normal_qty)+"\n");
            }
            writer.close();
            reader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

