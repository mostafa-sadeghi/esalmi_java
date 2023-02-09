class MyThread extends Thread{
    private String name;
    MyThread(String name){
        this.name = name;
    }

    public void run(){
        try{
        for(int i = 0;i<5;i++){

        System.out.println(name);
        Thread.sleep(1000);
        }}
        catch(Exception ex){System.out.println(ex);}
    }

    public static void main(String[] args)throws Exception{
        MyThread t1 = new MyThread("t1");
        MyThread t2 = new MyThread("t2");
        MyThread t3 = new MyThread("t3");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();

    }


}