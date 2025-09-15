public class ChocolateBoiler{
    private boolean empty;
    private boolean resistanceOn;

    private static ChocolateBoiler instance;

    private ChocolateBoiler (){

        this.empty = true;
        this.resistanceOn = false;
    }

    public static ChocolateBoiler getInstance(){
        if(instance == null){
            new ChocolateBoiler();
        }
        return instance;

    }

    public void fill(){
        if(!empty && !resistanceOn){
            empty = false;
            System.out.println("The boiler is full with the mix of chocolate with milk");
        }
        else{
            System.out.println("The boiler can´t be fill. The boiler is already full or the resistance is on");
        }
    }
    
    public void boil(){
        if(!empty && !resistanceOn){
            resistanceOn = true;
            System.out.println("starting the procesing of mixing and heating");
        }
        else{ 
            System.out.println("The boiler can´t be heating. Verify the boil is full and the resistance is off");
        }
    }

    public void drain(){
        if(!empty && !resistanceOn){
            empty = true;
            resistanceOn = false;
            System.out.println("Emptying the boiler. The product is ready");
        }
        else{
            System.out.println("The boiler can´t be empty. Verify the boiler is empty and the resistance is off");
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isResistanceOn(){
        return resistanceOn;
    }

}