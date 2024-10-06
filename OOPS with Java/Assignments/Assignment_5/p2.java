package a5;
class Logger {
private String logMessages;
private Logger() {
this.logMessages= " ";
	}
private static Logger instance= null;
public static Logger getInstance() {
if (instance==null) {
instance= new Logger();
		}
return instance;
	}
public void log(String message) {
logMessages= logMessages + message + "\n";
		  
	  }
public String getLog() {
return logMessages.toString();
		  }
public Logger clearLog() {
logMessages= " ";
return this;
	  }
}
public class Program2 {
public static void main(String[] args) {
Logger log= Logger.getInstance();
log.log("First log");
log.log("Second log");
System.out.println(log.getLog());
System.out.println(log.clearLog());
log.log("Third log");
System.out.println(log.getLog());

	}

}
