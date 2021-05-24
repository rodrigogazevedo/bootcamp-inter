package one.digitalinnovation.processamentoAsncParalelo;

public class ThreadExemplo {
    public static void main(String[] args) {
        //BarraDeCarregamanto2 barraDeCarregamento2 = new BarraDeCarregamanto2();

        //BarraDeCarregamanto3 barraDeCarregamento3 = new BarraDeCarregamanto3();

        /*Thread thread = new Thread(new BarraDeCarregamanto2());
        Thread thread2 = new Thread(new BarraDeCarregamanto3());*/

        //barraDeCarregamento2.run();

        //barraDeCarregamento3.run();
        /*thread.start();
        thread2.start();
        System.out.println("Nome da thread : "+thread.getName());
        System.out.println("Nome da thread : "+thread2.getName());*/

        GeradorPDF iniciarGeradorPdf = new GeradorPDF();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGeradorPdf);

        iniciarGeradorPdf.start();
        iniciarBarraDeCarregamento.start();
    }
}

class GeradorPDF extends Thread {
    @Override
    public void run() {
        try{
            System.out.println("Iniciar geração de PDF");
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PDF Gerado");
    }
}

class BarraDeCarregamento extends Thread {
    private Thread iniciarGeradorPdf;

    public BarraDeCarregamento(Thread iniciarGeradorPdf) {
        this.iniciarGeradorPdf = iniciarGeradorPdf;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(500);
                if (!iniciarGeradorPdf.isAlive()) {
                    break;
                }
                System.out.println("Loading ...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class BarraDeCarregamanto2 implements Runnable{
    @Override
    public void run() {

        try {
            Thread.sleep(5000);
            System.out.println("rodei BarraDeCarregamanto2: ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class BarraDeCarregamanto3 implements Runnable{
    @Override
    public void run() {

        try {
            Thread.sleep(10000);
            System.out.println("rodei BarraDeCarregamanto3: ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}