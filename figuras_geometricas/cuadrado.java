
package figuras_geometricas;

public class cuadrado {
//   definimos atributos
int lado;
//definimos constructor
public cuadrado(int lado) {
this.lado = lado;
}
//definimos los metodos
double calcularArea() {
return lado*lado;
}
double calcularPerímetro() {
return (4*lado);
}
} 
