public class Carro {
  //atributos
  String marca;
  int puertas;

  Carro(String marcaInput, int puertasInput){
    marca = marcaInput;
    puertas = puertasInput;
  }
  //comportamiento
  void diHola(){
    System.out.println("Hola, soy un " + marca);
  }

}
