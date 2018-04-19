import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class demo1 {

 public static void main(String[] args) throws IOException {

  //String command = "powershell.exe  your command";
  //Getting the version
  String command = "powershell.exe  $PSVersionTable.PSVersion";
  // Executing the command
  Process powerShellProcess = Runtime.getRuntime().exec(command);
  command = "powershell.exe cd C:\\Users\\Aarushi_Sinha\\Desktop\\demo";
  Runtime.getRuntime().exec(command);
  command = "powershell.exe git init";
  Runtime.getRuntime().exec(command);
  command = "powershell.exe git add .";
  Runtime.getRuntime().exec(command);
  command = "powershell.exe git commit -m \"First Commit\" ";
  Runtime.getRuntime().exec(command);
  command = "powershell.exe git remote add origin https://github.com/ADITYANALWAYA/haha.git";
  Runtime.getRuntime().exec(command);
  command = "powershell.exe git push -u origin master ";
  Runtime.getRuntime().exec(command);
  // Getting the results
  powerShellProcess.getOutputStream().close();
  String line;
  System.out.println("Standard Output:");
  BufferedReader stdout = new BufferedReader(new InputStreamReader(
    powerShellProcess.getInputStream()));
  while ((line = stdout.readLine()) != null) {
   System.out.println(line);
  }
  stdout.close();
  System.out.println("Standard Error:");
  BufferedReader stderr = new BufferedReader(new InputStreamReader(
    powerShellProcess.getErrorStream()));
  while ((line = stderr.readLine()) != null) {
   System.out.println(line);
  }
  stderr.close();
  System.out.println("Done");

 }

}