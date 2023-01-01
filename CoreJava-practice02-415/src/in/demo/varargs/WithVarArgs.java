package in.demo.varargs;
class WithVarArgs{

    private void test1(int ... args){
        int sum = 0;
        for (int i: args) {
            sum += i;
            System.out.println(sum);
        }
        System.out.println("sum = " + sum);
    }

    private void test2(boolean bo , String ... args){
        System.out.println("args.length = "+ args.length);
          for (String word : args) {
               System.out.println(word);
            }
       // System.out.println("The passed words are = " +word);
    }

    public static void main( String[] args ) {
    	WithVarArgs obj = new WithVarArgs();
        obj.test1(1, 2, 3);
      obj.test2(true, "hello", "world","GM","Namste");
    }
}
