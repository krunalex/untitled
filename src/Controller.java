public class Controller {

    private List<Fahrzeug> fahrzeugList;
    private Stack<Fahrzeug> fahrzeugStack;
    private Queue<Fahrzeug> fahrzeugQueue;

    public Controller(){
        fahrzeugStack = new Stack<>();
        fahrzeugList = new List<>();
        fahrzeugQueue = new Queue<>();
    }

    public void insertAutos(int n){
        for(int i = 0; i < n; i++){
            Fahrzeug myFahrzeug = new Fahrzeug((int) (Math.random() * (1000 - 1) + 1), (int) (Math.random() * (201 - 30) + 30), (int) (Math.random() * (5 - 2) + 2));
            fahrzeugList.append(myFahrzeug);
            System.out.println("Fahrzeug Nummer: " + myFahrzeug.getNummer() + " hat die PS: " + myFahrzeug.getPs() + " und die Anzahl an Räder von " + myFahrzeug.getAnzahlraeder());
        }
    }

    public void searchNummer(int n){
        int counter = 0;
        fahrzeugList.toFirst();
        while(fahrzeugList.hasAccess()){
            if(fahrzeugList.getContent().getNummer() == n){
                counter++;
            }
            fahrzeugList.next();
        }
        System.out.println("Es befinden sich: " + counter + " Autos mit der Nummer: " + n);
    }

    public void allPS(){
        int allPS = 0;
        fahrzeugList.toFirst();
        while(fahrzeugList.hasAccess()){
            allPS = allPS + fahrzeugList.getContent().getPs();
            fahrzeugList.next();
        }
        System.out.println("Die Gesamte PS sind: " + allPS);
    }

    public void onlyThreeRad(){
        fahrzeugList.toFirst();
        while(fahrzeugList.hasAccess()){
            if(fahrzeugList.getContent().getAnzahlraeder() == 3){
                System.out.println("Die Typ Nummer: " + fahrzeugList.getContent().getNummer() + " hat nur drei Räder");
            }
            fahrzeugList.next();
        }
    }

    public void smallestPS(){
        int smallestNumber = 200;
        fahrzeugList.toFirst();
        while(fahrzeugList.hasAccess()){
            if(fahrzeugList.getContent().getPs() < smallestNumber){
                smallestNumber = fahrzeugList.getContent().getPs();
            }
            fahrzeugList.next();
        }
        fahrzeugList.toFirst();
        while (fahrzeugList.hasAccess()){
            if(fahrzeugList.getContent().getPs() == smallestNumber) {
                System.out.println("Das Auto mit den wenigsten PS ist Nummer: " + fahrzeugList.getContent().getNummer() + " und hat: " + fahrzeugList.getContent().getPs() + " PS");
            }
            fahrzeugList.next();
        }
    }

    public void insertStack(int n){
        for(int i = 0; i < n ; i++){
            Fahrzeug myFahrzeug = new Fahrzeug((int) (Math.random() * (1000 - 1) + 1), (int) (Math.random() * (201 - 30) + 30), (int) (Math.random() * (5 - 2) + 2));
            fahrzeugStack.push(myFahrzeug);
        }
    }

    public void printIfPSSmaller(int n){
        while(fahrzeugStack.top() != null){
            if(fahrzeugStack.top().getPs() < n){
                System.out.println("Die Nummer: " + fahrzeugStack.top().getNummer() + " hat weniger PS als: " + n);
            }
            fahrzeugStack.pop();
        }
    }

    public void printStack(){
        while(fahrzeugStack.top() != null){
            System.out.println("Fahrzeug Nummer: " + fahrzeugStack.top().getNummer() + " hat die PS: " + fahrzeugStack.top().getPs() + " und die Anzahl an Räder von " + fahrzeugStack.top().getAnzahlraeder());
            fahrzeugStack.pop();
        }
    }

    public void new120PSStack(){
        Stack<Fahrzeug> lessPS = new Stack<>();
        Stack<Fahrzeug> morePS = new Stack<>();
        while(fahrzeugStack.top() != null){
            if(fahrzeugStack.top().getPs() < 120){
                lessPS.push(fahrzeugStack.top());
                System.out.println("Fahrzeug Nummer: " + lessPS.top().getNummer() + " hat die PS: " + lessPS.top().getPs() + " und die Anzahl an Räder von " + lessPS.top().getAnzahlraeder());
            }else{
                morePS.push(fahrzeugStack.top());
                System.out.println("Fahrzeug Nummer: " + morePS.top().getNummer() + " hat die PS: " + morePS.top().getPs() + " und die Anzahl an Räder von " + morePS.top().getAnzahlraeder());
            }
            fahrzeugStack.pop();
        }
    }

    public void twoStacks(){
        Stack<Fahrzeug> stackTwo = new Stack<>();
        while(fahrzeugStack.top() != null){
            stackTwo.push(fahrzeugStack.top());
            fahrzeugStack.pop();
            System.out.println("Fahrzeug Nummer: " + stackTwo.top().getNummer() + " hat die PS: " + stackTwo.top().getPs() + " und die Anzahl an Räder von " + stackTwo.top().getAnzahlraeder());
        }
    }

    public void insertQueue(int n){
        for(int i = 0; i < n; i++){
            Fahrzeug myFahrzeug = new Fahrzeug((int) (Math.random() * (1000 - 1) + 1), (int) (Math.random() * (201 - 30) + 30), (int) (Math.random() * (5 - 2) + 2));
            fahrzeugQueue.enqueue(myFahrzeug);
        }
    }

    public void queueSmallerPS(int n){
        while(!fahrzeugQueue.isEmpty()){
            if(fahrzeugQueue.front().getPs() < 120){
                System.out.println(fahrzeugQueue.front().getNummer());
            }
            fahrzeugQueue.dequeue();
        }
    }

    public void printQueue(){
        while(!fahrzeugQueue.isEmpty()){
            System.out.println("Fahrzeug Nummer: " + fahrzeugQueue.front().getNummer() + " hat die PS: " + fahrzeugQueue.front().getPs() + " und die Anzahl an Räder von " + fahrzeugQueue.front().getAnzahlraeder());
            fahrzeugQueue.dequeue();
        }
    }

    public void new120PSQueue(){
        Queue<Fahrzeug> lessPS = new Queue<>();
        Queue<Fahrzeug> morePS = new Queue<>();
        while(!fahrzeugQueue.isEmpty()){
            if(fahrzeugQueue.front().getPs() < 120){
                lessPS.enqueue(fahrzeugQueue.front());
                System.out.println(lessPS.front().getNummer());
            }else{
                morePS.enqueue(fahrzeugQueue.front());
                System.out.println(morePS.front().getNummer());
            }
            fahrzeugQueue.dequeue();
        }
    }

    public void twoQueues(){
        Queue<Fahrzeug> queueTwo = new Queue<>();
        while(!fahrzeugQueue.isEmpty()){
            queueTwo.enqueue(fahrzeugQueue.front());
            fahrzeugQueue.dequeue();
            System.out.println("Fahrzeug Nummer: " + queueTwo.front().getNummer() + " hat die PS: " + queueTwo.front().getPs() + " und die Anzahl an Räder von " + queueTwo.front().getAnzahlraeder());
        }
    }
}