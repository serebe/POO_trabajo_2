
package figuras_geometricas;

public class circulo {
//    definimos los atributos
int radio; 
//definimos los constructores
circulo(int radio) {
this.radio = radio;
}
//definimos los metodos
double calcularArea() {
return Math.PI*Math.pow(radio,2);
}
double calcularPerímetro() {
return 2*Math.PI*radio;
}
}
