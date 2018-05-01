// Program to test Splash class

public class TestSplash
{
    public static void main(String[] args)
    {
        Splash splash = new Splash();
        splash.setVisible(true);
        try
        {
            for (int i = 1; i <= 100; i++)
            {
                splash.lbl_num.setText(Integer.toString(i) + "%");
                splash.pbar.setValue(i);
                Thread.sleep(40);
                
                // set visible for login screen
                if (i == 100)
                {
                    new Login().setVisible(true);
                    splash.dispose();
                }
            }
        }
        catch (Exception e){
        }
    }
}