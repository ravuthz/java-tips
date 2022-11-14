import java.lang.management.*;

public class CheckRam {
  public static void main(String[] args) {
    int mb = 1024 * 1024;
    MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
    long xmx = memoryBean.getHeapMemoryUsage().getMax() / mb;
    long xms = memoryBean.getHeapMemoryUsage().getInit() / mb;
    System.out.println("Initial Memory (xms) : " + xms + "mb");
    System.out.println("Max Memory (xmx) : " + xmx + "mb");
  }
}
