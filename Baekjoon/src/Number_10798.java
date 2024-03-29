import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_10798 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String[][] strArray = new String[5][15];
		
		for(int i = 0 ; i < 5 ; i++) {
			char[] temp = br.readLine().toCharArray();
			for(int i2 = 0 ; i2 < temp.length ; i2++) {
				strArray[i][i2] = String.valueOf(temp[i2]);
			}
		}
		
		for(int i = 0 ; i < 15 ; i++) {
			for(int i2 = 0 ; i2 < 5 ; i2++) {
				if(strArray[i2][i] != null && !strArray[i2][i].equals("")) {
					String str = strArray[i2][i];
					bw.write(str);
				}
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}

}
