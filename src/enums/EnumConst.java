
package enums;

/**
 * 
 * @author Alex
 */
public enum EnumConst {
    
    /*
        В скобках - значения , которые передаются аргументам соответствующих конструкторов.
        Фактически эти записи аналогичны записям new EnumConst(v1, ...) и вызывают соответствующий пользовательмкий конструктор. 
        Если писать без скобок, то это фактически равносильно вызову дефолтного внутреннего конструктора для new EnumConst()
    */
    LOW(1), 
    MEDIUM(15), 
    HIGH(40), 
    LEFT(6.5), 
    RIGHT(7.3),
    DOUBLE(5, 45.2); 
    
    // массив значений констант
    private double[] value; 
    /*
    Аргументы конструкторов - значения константы в скобках. Тип аргументов - совместим с типами значений констант
    Конструктор может быть только приватным.
    */
    private EnumConst(double var) {
        this.value = new double[]{var};
    }
    private EnumConst(double var1, double var2) {
        this.value = new double[]{var1, var2};
    }
     
    public double[] getValues(){
        return this.value;
    }

    
    
    //////////////////////////////////////
    public static void main(String[] args) {
    
        for(EnumConst s : EnumConst.values()) {
            
            String name = s.name();         // имя константы
            int ordinal = s.ordinal();      // порядковый номер константы
            double[] val = s.getValues();   // значения констант
            
            int count = s.getValues().length;
            System.out.println(
                "name=" + name +
                ", ordinal=" + ordinal +
                ", count values=" + count
            );
            for(int i = 0; i < count; ++i) {
                System.out.println("value" + (i+1) + "=" + val[i]);
            }
           
        }
        
    }
   
}
