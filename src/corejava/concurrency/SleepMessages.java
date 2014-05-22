package corejava.concurrency;

public class SleepMessages {
    public static void main(String args[]) throws InterruptedException {
        String importantInfo[] = {
            "Each thread is assoceated with a instace of Thread.",
            "Thread can be created by Runnable object.",
            "Thread can also be created by subclassing the Thead class.",
            "Creating thread using Runnable is more flexible."
        };

        for (int i = 0; i < importantInfo.length;i++) {
            //Pause for 4 seconds
            Thread.sleep(4000);
            //Print a message
            System.out.println(i+1+". "+importantInfo[i]);
        }
    }
}

