public class PizzaWahala {
    
    public int calculateBoxes(String pizzaType, int numberOfPeople) {


        int slicesPerBox = getSlices(pizzaType);
        
        if (numberOfPeople % slicesPerBox == 0) {
            return numberOfPeople / slicesPerBox;
        } else {
            return (numberOfPeople / slicesPerBox) + 1;
        }
    }
    
    private int getSlices(String pizzaType) {
        if (pizzaType.equalsIgnoreCase("Sapa Size")) {
            return 4;
        } else if (pizzaType.equalsIgnoreCase("Small Money")) {
            return 6;
        } else if (pizzaType.equalsIgnoreCase("Big Boys")) {
            return 8;
        } else if (pizzaType.equalsIgnoreCase("Odogwu")) {
            return 12;
        } else {
            return 0;
        }
    }

public int calculateLeftoverSlices(String pizzaType, int numberOfPeople) {


    return 0;

}
}
