package bichinhoVirtual;
public class Animal {
    private String nome;
    private String classe;
    private String familia;
    private int idade;
    private boolean vivo;
    private int caloria;
    private int forca;

    public Animal(String nome, String classe, String familia) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = 0;
        this.vivo = true;
        this.caloria = 10;
        this.forca = 10;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void comer() {
        if (!vivo) {
            System.out.println("O animal está morto e não pode comer.");
            return;
        }
        if (caloria >= 100) {
            System.out.println("O animal já está cheio!");
            return;
        }
        caloria += 10;
        forca -= 2;
        System.out.println("O animal comeu e agora sua força é " + forca + " e suas calorias valem " + caloria + ".");
    }

    public void correr() {
        if (!vivo) {
            System.out.println("O animal está morto e não pode correr.");
            return;
        }
        if (caloria == 0) {
            System.out.println("O animal está exausto e não pode correr.");
            return;
        }
        caloria -= 5;
        forca -= 5;
        System.out.println("O animal está correndo!! Agora sua força é de " + forca + " e suas calorias valem " + caloria + ".");
    }

    public void dormir() {
        if (!vivo) {
            System.out.println("O animal está morto e não pode dormir.");
            return;
        }
        forca += 10;
        caloria -= 2;
        System.out.println("O animal está dormindo agora! Sua força aumentou para " + forca + " e suas calorias diminuíram para " + caloria + ".");
    }

    public void morrer() {
        forca = 0;
        vivo = false;
        System.out.println("O animal morreu!");
    }

    public void status() {
        System.out.println("O animal se chama " + nome + ", é da classe " + classe + " da família " + familia + ".");
        System.out.println("Ele possui força " + forca + ", calorias de " + caloria + " e idade " + idade + ".");
    }
}
