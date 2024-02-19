public class Q29_SurviveMonkey {
    /* Task->
    There is a lonely monkey in the island
    He needs to eat 4 bananas every day
    there are just 165 bananas in that island
    Create following variables and find how many days
    monkey can survive.
    Use do while loop, increment and decrement and if statements
    int numberOfBananas =165, survivalDays = 1;
    boolean monkeyAlive = true;
    */
    public static void main(String[] args) {
        int numberOfBananas = 165, survivalDays = 1;
        boolean monkeyAlive = true;
        System.out.println("Maymun günde 4 muz yer  : ) ");
        do {
            numberOfBananas-=4;
            System.out.println("Maymunun "+numberOfBananas+" adet muzu kaldi");
            survivalDays++;
            if (numberOfBananas<4){
                monkeyAlive=false;
                System.out.println("Bugun "+survivalDays+".gun maymun oldu");
            }else {
                System.out.println("Bugun "+survivalDays+".gun maymun hala hayatta");
            }
        }while (monkeyAlive);
    }
}

