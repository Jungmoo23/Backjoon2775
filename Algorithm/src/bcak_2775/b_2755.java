package bcak_2775;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

//“a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다” 
//는 계약 조항을 꼭 지키고 들어와야 한다.

// 1 ≤ k, n ≤ 14

public class b_2755 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		final int row = 15;
		final int col=15;
		int[][] arr = new int[row][col];
		
		for(int i=0; i<col; i++) {
			arr[i][0]= 1;
			arr[0][i] = i+1;		
		}
		
		for(int i=1; i<col; i++) {	
			for(int j= 1;j<row; j++) {
				arr[i][j]= arr[i-1][j]+arr[i][j-1];
			}
		}
		for(int i = 0 ; i < T; i++) {
			
			int K = Integer.parseInt(br.readLine()); // 아파트 층 수
			int N = Integer.parseInt(br.readLine()); // 아파트 호 수
			
			bw.write(arr[K][N-1] + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
		
		//arrPirnt(arr);
	
	}
	
  static void arrPirnt(int[][] get_arr) {
	  for(int i=get_arr.length-1; i>= 0 ; i--) {
		  System.out.print(i+"번쨰:	");
		  for(int j=0; j<get_arr.length; j++) {
			  System.out.print(get_arr[i][j]+ "	");
		  }
		  System.out.println();
	  }
  }

}
