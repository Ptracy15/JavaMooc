public class Reformatory {

    private int weightsTaken;
    
    public int weight(Person person) {
        // return the weight of the person
        this.weightsTaken++;
        return person.getWeight();
    }

    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }
    
    public int totalWeightsMeasured(){
        return this.weightsTaken;
    }
}
