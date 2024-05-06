package DesafioControleFluxo.src;

public class ParametrosInvalidosException extends Exception {
  private int numero1;
  private int numero2;


  public ParametrosInvalidosException(int numero1, int numero2) {
    this.numero1 = numero1;
    this.numero2 = numero2;
  }

  @Override
  public String toString() {
    return "O segundo parâmetro (" + numero2 + "), é maior que o primeiro (" + numero1 + ")";
  }
}
