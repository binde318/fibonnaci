 class SingletonClass1 {
     private static Singleton s = null;
    public String str;
    private void Singleton(){
        str = " this is the singleton class";
    }
    public static Singleton getInstance(){
        if (s == null){
            s = new Singleton();
        }
        return s;
    }

}
