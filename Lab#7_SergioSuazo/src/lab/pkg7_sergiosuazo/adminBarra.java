
package lab.pkg7_sergiosuazo;

import javax.swing.JProgressBar;

public class adminBarra extends Thread{
    private JProgressBar barra;
    private int paradas;

    public adminBarra() {
    }

    public adminBarra(JProgressBar barra, int paradas) {
        this.barra = barra;
        this.paradas = paradas;
    }


    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    @Override
    public void run() {
        int i=0;
        while(i<=paradas)
        {
            barra.setValue(barra.getValue()+1);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                
            }
        }
    }
    
    
}
