package arquivos;

public enum Menu
{
   SALDO_ZERO(1),
   SALDO_POSITIVO(2),
   SALDO_NEGATIVO(3),
   FIM(4);

   private final int value; 

   private Menu(int value)
   {
      this.value = value;
   } 
} 