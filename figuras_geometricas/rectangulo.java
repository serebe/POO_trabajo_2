
package figuras_geometricas;

public class rectangulo {
//    definimos los atributos
int base; 
int altura; 
//definimos los constructores
rectangulo(int base, int altura) {
this.base = base;
this.altura = altura;
}
//definimos los metodos
double calcularArea() {
return base * altura;
}
double calcularPerímetro() {
return (2 * base) + (2 * altura);
}
} 
