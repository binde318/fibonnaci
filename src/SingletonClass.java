 class SingletonClass {
     public static void main(String[] args) {
      Singleton a = SingletonClass1.getInstance();
      Singleton b = SingletonClass1.getInstance();
      Singleton c = SingletonClass1.getInstance();

      a.str =(a.str).toUpperCase();
          System.out.println(" string for a is " + a.str);
          System.out.println(" string for b is " + b.str);
          System.out.println(" string for c is " + c.str);
     }
}
