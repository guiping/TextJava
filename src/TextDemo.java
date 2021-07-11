public class TextDemo {
    public static void main(String[] args) {
//        String id = null;
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                printStr(id);
//            }
//        }).start();
        String[] a= {"8","7","6","5","4","3","2","1"};
        String[] b= {"aaa","bb","cc","dd","ee","ff","gg","h"};
        String[] c =concat(a,b);
       System.out.println(c.toString() +"   " + c.length);
        for (String item:c
             ) {
            System.out.print(item +" ");
        }
    }
    public static void printStr(String id){
        if(null == id) id ="";
        System.out.println(" id = " + id);
    }

    static String[] concat(String[] a, String[] b) {

        String[] c= new String[a.length+b.length];

        System.arraycopy(a, 0, c, 0, a.length);

        System.arraycopy(b, 0, c, a.length, b.length);
        return c;

    }
}
