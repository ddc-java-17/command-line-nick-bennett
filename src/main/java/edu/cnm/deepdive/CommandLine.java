package edu.cnm.deepdive;

public class CommandLine {

  public static void main(String[] args) {
    System.out.println(args.length);
    for (int i = 0; i < args.length; i = i + 1) {
      System.out.println(args[i]);
    }
  }

}
