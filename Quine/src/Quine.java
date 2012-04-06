
public class Quine { public static void main(String[] args) { String cc = new Character((char) 34).toString(); String s = "public class Quine { public static void main(String[] args) { String cc = new Character((char) 34).toString(); String s = ; System.out.print(s.substring(0, 122) + cc + s + cc + s.substring(122, s.length())); } }"; System.out.print(s.substring(0, 122) + cc + s + cc + s.substring(122, s.length())); } }




