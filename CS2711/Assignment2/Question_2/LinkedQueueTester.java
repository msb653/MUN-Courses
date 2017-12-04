import java.io.*;
import java.util.regex.*;
public class LinkedQueueTester{
	public static void main(String[]args){
		//initializing variables
		LinkedQueue queue=new LinkedQueue();
		String line=null;
		String temp;
		//patter to search for {} with regex
		Pattern p = Pattern.compile("\\{(.*?)\\}");
		try{
			int i=1;
			//initializing readers/writers
			FileWriter fileWriter=new FileWriter("output.txt");
			BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
			FileReader fileReader = new FileReader("input.txt");
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			//adding endnotes to queue and writing altered lines to output.txt
			while((line=bufferedReader.readLine())!=null){
				Matcher m = p.matcher(line);
				temp=line;
                while (m.find()) {
                	queue.enqueue(m.group(1));
                	temp=temp.replaceFirst("\\{(.*?)\\}","(End note "+i+")");
                	i++;
                }
                bufferedWriter.write(temp);
                bufferedWriter.newLine();
            }
            //dequeueing all endnotes at end of output.txt
            for(int k=0; k<queue.size(); k++){
        	    bufferedWriter.write("{"+queue.dequeue()+"}");
        	}
        	bufferedWriter.close();
        	bufferedReader.close(); 
        }
        catch(Exception ex){
        		System.out.println(ex);
        }
    }
		
}
		