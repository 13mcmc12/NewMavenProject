package word123;


	
	
	
	import java.io.FileReader;
	import java.io.BufferedReader;
	import java.util.StringTokenizer;
	 
	public class NumberWords  {
	public static void main(String[] args) throws Exception {
	FileReader fr = new FileReader("test");
	BufferedReader br = new BufferedReader(fr);
	String line = "", str = "";
	int a = 0;
	int b = 0;
	while ((line = br.readLine()) != null) {
	str += line + " ";
	b++;
	}
	System.out.println("Totally " + b + " lines");
	 
	
	 
	StringTokenizer st = new StringTokenizer(str);
	while (st.hasMoreTokens()) {
	String s = st.nextToken();
	a++;
	}
	System.out.println("File has " + a + " words are in the file");
	}
	 
	}


