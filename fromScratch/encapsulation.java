package fromScratch;

class testClass
{
    private int secretNumber;
    public int openNumber;
    
    public int getSecret()
    {
        return this.secretNumber;
    }

    testClass(int secretNumber, int openNumber)
    {
        this.secretNumber = secretNumber;
        this.openNumber = openNumber;
    }
}
    public class encapsulation 
    {
        public static void main(String[] args) 
        {
            testClass obj = new testClass(15, 25);

            System.out.println(obj.getSecret());
        }
    }
