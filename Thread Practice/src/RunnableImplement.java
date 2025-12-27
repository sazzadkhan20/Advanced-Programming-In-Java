public class RunnableImplement implements Runnable
{
        int num;
        public RunnableImplement(int num)
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
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
}
