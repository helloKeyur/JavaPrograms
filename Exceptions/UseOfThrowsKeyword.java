import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

class UseOfThrowsKeyword{

	public static void findFile() throws IOException{
		File newFile = new File("text.txt");
		System.out.println("File obj init");
	}

	public static void fileExistWithResource(){
		String line;
		try(BufferedReader br = new BufferedReader(new FileReader("text.txt"))){
			while((line = br.readLine()) != null){
				System.out.println("Line =>"+line);
			}
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

	public static void fileExist(){
		String line;
		try{
			BufferedReader br = new BufferedReader(new FileReader("text.txt"));
			while((line = br.readLine()) != null){
				System.out.println("Line =>"+line);
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public static void main(String args[]){
		try{
			findFile();
			fileExist();
			fileExistWithResource();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}