import java.util.Scanner;

public class figuras{ 
    Scanner entrada = new Scanner(System.in);
        
    private int fig, radio, base, altura, ladoa, ladob;
    private double perimetro, area;
    
    public void Figuras(){

        

        System.out.println("Seleccione la figura para calcular su area y perimetros");
        System.out.println("1.- Circulo");
        System.out.println("2.- Rectangulo");
        System.out.println("3.- Cuadrado");
        System.out.println("4.- Triangulo");
        
        fig = entrada.nextInt();
        
        switch(fig){
            case 1:
                Cir();
            break;

            case 2:
                Rec();
            break;
            
            case 3:
                Cuad();
            break;

            case 4:
                Tri();
            break;
        }
    }
    public void Cir(){
        System.out.println("Introduce el radio del circulo");
        
        radio = entrada.nextInt();
        perimetro = (2*3.14)*radio;
        area = 3.14*(radio*radio);
        
        System.out.println("La circunferencia es de " + perimetro);
        System.out.println("El Area es " + area);
    }
    public void Rec(){
        System.out.println("Introduce la base del rectangulo");
        
        base = entrada.nextInt();
        
        System.out.println("Introduce la altura del rectangulo");
        
        altura = entrada.nextInt();
        perimetro = base*altura;
        area = 2*(base+altura);

        System.out.println("El perimetro es de " + perimetro);
        System.out.println("El area es " + area);
    }
    public void Cuad(){
        System.out.println("Introduce el valor de un lado del cuadrado");

        base = entrada.nextInt();
        perimetro = base*4;
        area = base*base;

        System.out.println("El perimetro es de " + perimetro);
        System.out.println("El area es " + area);
    }
    public void Tri(){
        System.out.println("Introduce la base del triangulo");
        
        base = entrada.nextInt();

        System.out.println("Introduce los dos lados del triangulo");
        
        ladoa = entrada.nextInt();
        ladob = entrada.nextInt();

        System.out.println("Introduce la altura del triangulo :3");
        
        altura = entrada.nextInt();
        perimetro = base+ladoa+ladob;
        area = altura*(base/2);

        System.out.println("El perimetro es de " + perimetro);
        System.out.println("El area es " + area);
    }
}