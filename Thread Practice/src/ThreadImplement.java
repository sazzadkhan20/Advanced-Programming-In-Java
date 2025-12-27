class ThreadImplement extends Thread
{
    int num;
    public ThreadImplement(int num)
    {
        this.num = num;
    }
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println(this.num+" -> "+i);
            try
            {
                // Task 3 MultiThread
                if(num == 1)
                Thread.sleep(300);
                else if(num == 2)
                    Thread.sleep(500);
                else
                    Thread.sleep(700);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}