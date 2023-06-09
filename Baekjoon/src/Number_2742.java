import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_2742 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = N ; i > 0 ; i--) {
			if(i != 1) {
				bw.write(String.valueOf(i) + "\n");				
			}else {
				bw.write(String.valueOf(i));	
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
